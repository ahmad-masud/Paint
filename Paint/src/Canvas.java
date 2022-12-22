import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import javax.swing.JComponent;

public class Canvas extends JComponent {

    private Image image;
    private BufferedImage bufferedImage;
    private Graphics2D g2;
    private int currentX, currentY, oldX, oldY;
    private int height, width, xOffset, yOffset;
    private int drawSize = 10;
    private int opacity = 255;
    private int staticOpacity = 255;
    private Color penColor = new Color(63, 72, 204, opacity);
    private boolean drawing = false;
    private int penState = PenStates.MARKER;
    private Color canvasColor = Color.WHITE;
    private int newColor, oldColor;
    private Frame frame;
    private ArrayList<BufferedImage> imageMemory = new ArrayList<BufferedImage>();
    private int currentImageMemory = -1;
    private Boolean undid = false;

    public Canvas(int height, int width, int xOffset, int yOffset, Frame frame) {
        this.height = height;
        this.width = width;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.frame = frame;
        setDoubleBuffered(true);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                // save coord x,y when mouse is pressed
                oldX = e.getX() - xOffset;
                oldY = e.getY() - yOffset;
            }
            
            public void mouseReleased(MouseEvent e) {
                addImageMemory();
            }

            public void mouseClicked(MouseEvent e) {
                if (isValid(e.getX(), e.getY())) {
                    if (penState == PenStates.MARKER) {
                        Color color = new Color(penColor.getRed(), penColor.getGreen(), penColor.getBlue(), staticOpacity);
                        g2.setPaint(color);       
                        g2.fillRoundRect(e.getX() - drawSize / 2 - xOffset, e.getY() - drawSize / 2 - yOffset, drawSize, drawSize, drawSize, drawSize);
                    } else if (penState == PenStates.ERASER) {
                        g2.setPaint(canvasColor);
                        g2.fillRoundRect(e.getX() - drawSize / 2 - xOffset, e.getY() - drawSize / 2 - yOffset, drawSize, drawSize, drawSize, drawSize);
                    } else if (penState == PenStates.EYEDROPTOOL) {
                        penColor = new Color(toBufferedImage(image).getRGB(e.getX() - xOffset, e.getY() - yOffset));
                        penState = PenStates.MARKER;
                    } else if (penState == PenStates.PAINTBUCKET) {
                        fill(e.getX() - xOffset, e.getY() - yOffset);
                        penColor = new Color(toBufferedImage(image).getRGB(e.getX() - xOffset, e.getY() - yOffset));
                    }
                    addImageMemory();
                    repaint();
                }
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (penState != PenStates.EYEDROPTOOL && penState != PenStates.PAINTBUCKET) {
                    currentX = e.getX() - xOffset;
                    currentY = e.getY() - yOffset;
                    
                    if (penState == PenStates.MARKER) {
                        g2.setPaint(penColor);
                    } else if (penState == PenStates.ERASER) {
                        g2.setPaint(canvasColor);
                    }
                    //First Method
                    g2.setStroke(new BasicStroke(drawSize, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
                    g2.drawLine(oldX, oldY, currentX, currentY);
                    
                    //Second Method
                    /*int dx = currentX - oldX;
                    int dy = currentY - oldY;
                    double d;
                    if (Math.abs(dx) > Math.abs(dy)) {
                        d = Math.abs(dx);
                    } else {
                        d = Math.abs(dy);
                    }

                    double cx = dx / d;
                    double cy = dy / d;
                    for (int k = 0; k < d; k++) {
                        g2.fillRoundRect((int) (oldX + k * cx) - drawSize / 2, (int) (oldY + k * cy) - drawSize / 2, drawSize, drawSize, drawSize, drawSize);
                    }*/
                    oldX = currentX;
                    oldY = currentY;

                    repaint();
                }
            }
        });
    }
    
    protected Boolean isValid(int x, int y) {
        if (x<width+xOffset && x>xOffset && y<height+yOffset && y>yOffset) {
            return true;
        }
        return false;
    }

    protected void paintComponent(Graphics g) {
        if (image == null) {
            // image to draw null ==> we create
            image = createImage(width, height);
            g2 = (Graphics2D) image.getGraphics();
            // enable antialiasing
            //g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            // clear draw area
            imageMemory.clear();
            clear();
        }

        g.drawImage(image, xOffset, yOffset, null);
    }

    // now we create exposed methods
    public void clear() {
        g2.setPaint(canvasColor);
        //draw white on entire draw area to clear
        g2.fillRect(0, 0, width, height);
        g2.setPaint(penColor);
        repaint();
        addImageMemory();
    }

    public void setDrawSize(int drawSize) {
        this.drawSize = drawSize;
    }

    public void setPenColor(Color penColor) {
        this.penColor = new Color(penColor.getRed(), penColor.getGreen(), penColor.getBlue(), opacity);
    }

    public Color getPenColor() {
        return penColor;
    }

    public static BufferedImage toBufferedImage(Image img) {

        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        // Return the buffered image
        return bimage;
    }

    public void setPenState(int penState) {
        this.penState = penState;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
        penColor = new Color(penColor.getRed(), penColor.getGreen(), penColor.getBlue(), opacity);
        if ((opacity + 100) > 255) {
            staticOpacity = 255;
        } else {
            staticOpacity = opacity + 100;
        }
    }

    public void fill(int x, int y) {
        bufferedImage = toBufferedImage(image);
        oldColor = bufferedImage.getRGB(x, y);
        flood(x, y);
        addImageMemory();
        repaint();
    }

    public void flood(int x, int y) {

        LinkedList<Point> list = new LinkedList<Point>();
        list.add(new Point(x, y));

        while (!list.isEmpty()) {
            Point p = list.remove();

            if ((p.x >= 0) && (p.x < bufferedImage.getWidth() && (p.y >= 0) && (p.y < bufferedImage.getHeight()))) {
                if (bufferedImage.getRGB(p.x, p.y) == oldColor) {
                    Color color = new Color(penColor.getRed(), penColor.getGreen(), penColor.getBlue(), staticOpacity);
                    g2.setPaint(color);
                    g2.fillRect(p.x, p.y, 1, 1);

                    list.add(new Point(p.x + 1, p.y));
                    list.add(new Point(p.x - 1, p.y));
                    list.add(new Point(p.x, p.y + 1));
                    list.add(new Point(p.x, p.y - 1));
                    
                }
            }
        }
    }

    public void colorRandomSquares(int amount) {
        bufferedImage = toBufferedImage(image);
        if (amount > 500 || amount < 1) {
            return;
        }
        for (int i = 0; i < amount; i++) {
            int x = (int) (Math.random() * width);
            int y = (int) (Math.random() * height);
            bufferedImage.setRGB(x, y, penColor.getRGB());
        }
        repaint();
    }

    public void saveImage(File path, String fileType) throws IOException {
        bufferedImage = toBufferedImage(image);
        if (fileType.equals("png") || fileType.equals("jpeg")) {
            try {
                ImageIO.write(bufferedImage, fileType, new File(path + "." + fileType));
            } catch (IOException e) {
                System.out.println("Image could not be written");
                System.out.println("Exception:" + e);
                System.exit(1);
            }
        }
    }

    public void loadImage(File file) {
        try {
            if (ImageIO.read(file).getWidth() <= 1000 && ImageIO.read(file).getHeight() <= 1000) {
                image = ImageIO.read(file);
                width = ImageIO.read(file).getWidth();
                height = ImageIO.read(file).getHeight();
            } else {
                System.out.println("Exception: Image is too large");
            }
        } catch (IOException e) {
            System.out.println("Image could not be read");
            System.out.println("Exception:" + e);
            System.exit(1);
        }
        frame.setSize(width + (xOffset * 2), height + (yOffset * 2));
        repaint();
        g2 = (Graphics2D) image.getGraphics();
        imageMemory.clear();
        addImageMemory();
    }

    public void newCanvas(int width, int height, Color canvasColor) {
        this.width = width;
        this.height = height;
        this.canvasColor = canvasColor;
        frame.setSize(width + (xOffset * 2), height + (yOffset * 2));
        image = null;
        repaint();
    }

    protected void addImageMemory() {
        /*if (currentImageMemory != imageMemory.size() - 1 && currentImageMemory != -1) {
            for (int i = currentImageMemory-1; i < imageMemory.size(); i++) {
                imageMemory.remove(i);
            }
        }*/
        if (undid == true) {
            imageMemory.clear();
            undid = false;
        }
        if (imageMemory.size() == 20) {
            imageMemory.remove(0);
            BufferedImage copyOfImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics g = copyOfImage.createGraphics();
            g.drawImage(image, 0, 0, null);
            imageMemory.add(copyOfImage);
        } else {
            BufferedImage copyOfImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics g = copyOfImage.createGraphics();
            g.drawImage(image, 0, 0, null);
            imageMemory.add(copyOfImage);
        }
        currentImageMemory = imageMemory.size() - 1;
    }

    public void undo() {
        if (currentImageMemory > 0) {
            currentImageMemory--;
            image = imageMemory.get(currentImageMemory);
            g2 = (Graphics2D) image.getGraphics();
            repaint();
            undid = true;
        }
    }

    public void redo() {
        if (currentImageMemory != imageMemory.size()-1) {
            currentImageMemory++;
            image = imageMemory.get(currentImageMemory);
            g2 = (Graphics2D) image.getGraphics();
            repaint();
            undid = true;
        }
    }

}
