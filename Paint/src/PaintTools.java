import java.awt.Color;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

public class PaintTools extends javax.swing.JFrame {

    Canvas canvas;
    Color canvasColor = Color.white;
   
    public PaintTools(Canvas canvas) {
        try {
            Image i = ImageIO.read(getClass().getResource("/Images/icon.png"));
            setIconImage(i);
        } catch (Exception e) {}
        initComponents();
        this.canvas = canvas;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        opacitySlider = new javax.swing.JSlider();
        buttonCustomColor = new javax.swing.JButton();
        buttonRed = new javax.swing.JButton();
        buttonOrange = new javax.swing.JButton();
        buttonYellow = new javax.swing.JButton();
        buttonGreen = new javax.swing.JButton();
        buttonBlue = new javax.swing.JButton();
        buttonPurple = new javax.swing.JButton();
        buttonMarker = new javax.swing.JButton();
        buttonEyeDropTool = new javax.swing.JButton();
        buttonEraser1 = new javax.swing.JButton();
        buttonPaintBucket = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonBlue1 = new javax.swing.JButton();
        buttonPurple1 = new javax.swing.JButton();
        buttonGreen1 = new javax.swing.JButton();
        buttonYellow1 = new javax.swing.JButton();
        buttonOrange1 = new javax.swing.JButton();
        buttonRed1 = new javax.swing.JButton();
        buttonBlue2 = new javax.swing.JButton();
        buttonOrange2 = new javax.swing.JButton();
        buttonPurple2 = new javax.swing.JButton();
        buttonRed2 = new javax.swing.JButton();
        buttonGreen2 = new javax.swing.JButton();
        buttonYellow2 = new javax.swing.JButton();
        buttonWaterBrush = new javax.swing.JButton();
        drawSizeSlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        buttonLoad = new javax.swing.JButton();
        boxFileType = new javax.swing.JComboBox<>();
        buttonNew = new javax.swing.JButton();
        textWidth = new javax.swing.JTextField();
        textHeight = new javax.swing.JTextField();
        buttonColor = new javax.swing.JButton();
        buttonUndo = new javax.swing.JButton();
        buttonRedo = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(320, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(320, 700));

        opacitySlider.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        opacitySlider.setMajorTickSpacing(1);
        opacitySlider.setMaximum(255);
        opacitySlider.setMinimum(5);
        opacitySlider.setMinorTickSpacing(1);
        opacitySlider.setToolTipText("");
        opacitySlider.setValue(255);
        opacitySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opacitySliderStateChanged(evt);
            }
        });

        buttonCustomColor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonCustomColor.setText("Custom Color");
        buttonCustomColor.setToolTipText("");
        buttonCustomColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustomColorActionPerformed(evt);
            }
        });

        buttonRed.setBackground(new java.awt.Color(255, 255, 255));
        buttonRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRedActionPerformed(evt);
            }
        });

        buttonOrange.setBackground(new java.awt.Color(200, 200, 200));
        buttonOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrangeActionPerformed(evt);
            }
        });

        buttonYellow.setBackground(new java.awt.Color(100, 100, 100));
        buttonYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonYellowActionPerformed(evt);
            }
        });

        buttonGreen.setBackground(new java.awt.Color(0, 0, 0));
        buttonGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGreenActionPerformed(evt);
            }
        });

        buttonBlue.setBackground(new java.awt.Color(136, 0, 27));
        buttonBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBlueActionPerformed(evt);
            }
        });

        buttonPurple.setBackground(new java.awt.Color(255, 0, 0));
        buttonPurple.setBorder(null);
        buttonPurple.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonPurple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPurpleActionPerformed(evt);
            }
        });

        buttonMarker.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonMarker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Marker Icon.png"))); // NOI18N
        buttonMarker.setToolTipText("");
        buttonMarker.setMaximumSize(new java.awt.Dimension(40, 40));
        buttonMarker.setMinimumSize(new java.awt.Dimension(40, 40));
        buttonMarker.setPreferredSize(new java.awt.Dimension(40, 40));
        buttonMarker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMarkerActionPerformed(evt);
            }
        });

        buttonEyeDropTool.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEyeDropTool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Eye Dropper Icon.png"))); // NOI18N
        buttonEyeDropTool.setToolTipText("");
        buttonEyeDropTool.setMaximumSize(new java.awt.Dimension(40, 40));
        buttonEyeDropTool.setMinimumSize(new java.awt.Dimension(40, 40));
        buttonEyeDropTool.setPreferredSize(new java.awt.Dimension(40, 40));
        buttonEyeDropTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEyeDropToolActionPerformed(evt);
            }
        });

        buttonEraser1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEraser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Eraser Icon.png"))); // NOI18N
        buttonEraser1.setToolTipText("");
        buttonEraser1.setMaximumSize(new java.awt.Dimension(40, 40));
        buttonEraser1.setMinimumSize(new java.awt.Dimension(40, 40));
        buttonEraser1.setPreferredSize(new java.awt.Dimension(40, 40));
        buttonEraser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEraser1ActionPerformed(evt);
            }
        });

        buttonPaintBucket.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPaintBucket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bucket Icon.png"))); // NOI18N
        buttonPaintBucket.setToolTipText("");
        buttonPaintBucket.setMaximumSize(new java.awt.Dimension(40, 40));
        buttonPaintBucket.setMinimumSize(new java.awt.Dimension(40, 40));
        buttonPaintBucket.setPreferredSize(new java.awt.Dimension(40, 40));
        buttonPaintBucket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPaintBucketActionPerformed(evt);
            }
        });

        buttonClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/x.png"))); // NOI18N
        buttonClear.setToolTipText("");
        buttonClear.setMaximumSize(new java.awt.Dimension(40, 40));
        buttonClear.setMinimumSize(new java.awt.Dimension(40, 40));
        buttonClear.setPreferredSize(new java.awt.Dimension(40, 40));
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonBlue1.setBackground(new java.awt.Color(196, 255, 14));
        buttonBlue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBlue1ActionPerformed(evt);
            }
        });

        buttonPurple1.setBackground(new java.awt.Color(14, 209, 69));
        buttonPurple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPurple1ActionPerformed(evt);
            }
        });

        buttonGreen1.setBackground(new java.awt.Color(255, 242, 0));
        buttonGreen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGreen1ActionPerformed(evt);
            }
        });

        buttonYellow1.setBackground(new java.awt.Color(253, 236, 166));
        buttonYellow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonYellow1ActionPerformed(evt);
            }
        });

        buttonOrange1.setBackground(new java.awt.Color(255, 204, 24));
        buttonOrange1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrange1ActionPerformed(evt);
            }
        });

        buttonRed1.setBackground(new java.awt.Color(225, 127, 39));
        buttonRed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRed1ActionPerformed(evt);
            }
        });

        buttonBlue2.setBackground(new java.awt.Color(255, 174, 200));
        buttonBlue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBlue2ActionPerformed(evt);
            }
        });

        buttonOrange2.setBackground(new java.awt.Color(0, 168, 243));
        buttonOrange2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrange2ActionPerformed(evt);
            }
        });

        buttonPurple2.setBackground(new java.awt.Color(185, 122, 86));
        buttonPurple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPurple2ActionPerformed(evt);
            }
        });

        buttonRed2.setBackground(new java.awt.Color(140, 255, 251));
        buttonRed2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRed2ActionPerformed(evt);
            }
        });

        buttonGreen2.setBackground(new java.awt.Color(184, 61, 186));
        buttonGreen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGreen2ActionPerformed(evt);
            }
        });

        buttonYellow2.setBackground(new java.awt.Color(63, 72, 204));
        buttonYellow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonYellow2ActionPerformed(evt);
            }
        });

        buttonWaterBrush.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonWaterBrush.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Brush Icon.png"))); // NOI18N
        buttonWaterBrush.setToolTipText("");
        buttonWaterBrush.setMaximumSize(new java.awt.Dimension(40, 40));
        buttonWaterBrush.setMinimumSize(new java.awt.Dimension(40, 40));
        buttonWaterBrush.setPreferredSize(new java.awt.Dimension(40, 40));
        buttonWaterBrush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWaterBrushActionPerformed(evt);
            }
        });

        drawSizeSlider.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        drawSizeSlider.setMajorTickSpacing(1);
        drawSizeSlider.setMinimum(5);
        drawSizeSlider.setMinorTickSpacing(1);
        drawSizeSlider.setToolTipText("");
        drawSizeSlider.setValue(10);
        drawSizeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                drawSizeSliderStateChanged(evt);
            }
        });

        jLabel1.setText("Size");

        jLabel2.setText("Opacity");

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonLoad.setText("Load");
        buttonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoadActionPerformed(evt);
            }
        });

        boxFileType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "png", "jpeg" }));
        boxFileType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxFileTypeActionPerformed(evt);
            }
        });

        buttonNew.setText("New");
        buttonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewActionPerformed(evt);
            }
        });

        textWidth.setText("Width");

        textHeight.setText("Height");

        buttonColor.setText("Color");
        buttonColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorActionPerformed(evt);
            }
        });

        buttonUndo.setText("Undo");
        buttonUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUndoActionPerformed(evt);
            }
        });

        buttonRedo.setText("Redo");
        buttonRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRedoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonRed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(buttonOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(buttonYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(buttonGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(buttonBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(buttonPurple, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buttonCustomColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonRed1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonOrange1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonYellow1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonGreen1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonBlue1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonPurple1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonRed2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonOrange2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonYellow2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonGreen2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonBlue2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonPurple2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxFileType, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(drawSizeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opacitySlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonColor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(buttonWaterBrush, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(buttonEraser1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonMarker, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEyeDropTool, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPaintBucket, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRedo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonUndo)
                    .addComponent(buttonRedo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonColor))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSave)
                    .addComponent(boxFileType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLoad)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonEraser1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMarker, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEyeDropTool, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPaintBucket, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonWaterBrush, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawSizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opacitySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonRed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPurple, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonRed1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGreen1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBlue1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPurple1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonYellow1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonOrange1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonRed2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGreen2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBlue2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPurple2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonYellow2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonOrange2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCustomColor)
                .addGap(51, 51, 51))
        );

        setBounds(0, 0, 336, 708);
    }// </editor-fold>//GEN-END:initComponents

    private void opacitySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opacitySliderStateChanged
        canvas.setOpacity(opacitySlider.getValue());
    }//GEN-LAST:event_opacitySliderStateChanged

    private void buttonCustomColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustomColorActionPerformed
        JColorChooser colorchooser = new JColorChooser();
        Color color = JColorChooser.showDialog(null, "Custom Color", Color.black);
        if (color!=null) {
            canvas.setPenColor(color);
        }
    }//GEN-LAST:event_buttonCustomColorActionPerformed

    private void buttonRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRedActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonRedActionPerformed

    private void buttonOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrangeActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonOrangeActionPerformed

    private void buttonYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonYellowActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonYellowActionPerformed

    private void buttonGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGreenActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonGreenActionPerformed

    private void buttonBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBlueActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonBlueActionPerformed

    private void buttonPurpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPurpleActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonPurpleActionPerformed

    private void buttonMarkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMarkerActionPerformed
        canvas.setPenState(PenStates.MARKER);
        canvas.setOpacity(255);
        opacitySlider.setValue(255);
    }//GEN-LAST:event_buttonMarkerActionPerformed

    private void buttonEyeDropToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEyeDropToolActionPerformed
        canvas.setPenState(PenStates.EYEDROPTOOL); 
    }//GEN-LAST:event_buttonEyeDropToolActionPerformed

    private void buttonEraser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEraser1ActionPerformed
        canvas.setPenState(PenStates.ERASER);  
    }//GEN-LAST:event_buttonEraser1ActionPerformed

    private void buttonPaintBucketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPaintBucketActionPerformed
        canvas.setPenState(PenStates.PAINTBUCKET);
    }//GEN-LAST:event_buttonPaintBucketActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        canvas.clear();  
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonBlue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBlue1ActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonBlue1ActionPerformed

    private void buttonPurple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPurple1ActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonPurple1ActionPerformed

    private void buttonGreen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGreen1ActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonGreen1ActionPerformed

    private void buttonYellow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonYellow1ActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonYellow1ActionPerformed

    private void buttonOrange1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrange1ActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonOrange1ActionPerformed

    private void buttonRed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRed1ActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonRed1ActionPerformed

    private void buttonBlue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBlue2ActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonBlue2ActionPerformed

    private void buttonOrange2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrange2ActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonOrange2ActionPerformed

    private void buttonPurple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPurple2ActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonPurple2ActionPerformed

    private void buttonRed2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRed2ActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonRed2ActionPerformed

    private void buttonGreen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGreen2ActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonGreen2ActionPerformed

    private void buttonYellow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonYellow2ActionPerformed
        Color color = ((javax.swing.JButton)evt.getSource()).getBackground();
        canvas.setPenColor(color);
    }//GEN-LAST:event_buttonYellow2ActionPerformed

    private void buttonWaterBrushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWaterBrushActionPerformed
        canvas.setOpacity(30);
        opacitySlider.setValue(30);
    }//GEN-LAST:event_buttonWaterBrushActionPerformed

    private void drawSizeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_drawSizeSliderStateChanged
        canvas.setDrawSize(drawSizeSlider.getValue());
    }//GEN-LAST:event_drawSizeSliderStateChanged

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Save File");
        chooser.setAcceptAllFileFilterUsed(false);
        
        try {
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            canvas.saveImage(chooser.getSelectedFile(), boxFileType.getSelectedItem().toString());
            } else {
                System.out.println("No Selection ");
            }
        }   catch(Exception e) { 
            System.out.println("Image could not be written");
            System.out.println("Exception:"+e);
            System.exit(1);
        } 
        
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Choose File");
        chooser.setAcceptAllFileFilterUsed(false);
        
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            canvas.loadImage(chooser.getSelectedFile());
        } else {
            System.out.println("No Selection ");
        }
    }//GEN-LAST:event_buttonLoadActionPerformed

    private void buttonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewActionPerformed
         try {
            int width = Integer.parseInt(textWidth.getText());
            int height = Integer.parseInt(textHeight.getText());
            if (width<=1000 && height<=1000) {
                canvas.newCanvas(width, height, canvasColor);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_buttonNewActionPerformed

    private void buttonColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColorActionPerformed
        JColorChooser colorchooser = new JColorChooser();
        canvasColor = JColorChooser.showDialog(null, "Canvas Color", Color.black);
    }//GEN-LAST:event_buttonColorActionPerformed

    private void buttonUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUndoActionPerformed
        canvas.undo();
    }//GEN-LAST:event_buttonUndoActionPerformed

    private void boxFileTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxFileTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxFileTypeActionPerformed

    private void buttonRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRedoActionPerformed
        canvas.redo();
    }//GEN-LAST:event_buttonRedoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaintTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaintTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaintTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaintTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaintTools(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxFileType;
    private javax.swing.JButton buttonBlue;
    private javax.swing.JButton buttonBlue1;
    private javax.swing.JButton buttonBlue2;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonColor;
    private javax.swing.JButton buttonCustomColor;
    private javax.swing.JButton buttonEraser1;
    private javax.swing.JButton buttonEyeDropTool;
    private javax.swing.JButton buttonGreen;
    private javax.swing.JButton buttonGreen1;
    private javax.swing.JButton buttonGreen2;
    private javax.swing.JButton buttonLoad;
    private javax.swing.JButton buttonMarker;
    private javax.swing.JButton buttonNew;
    private javax.swing.JButton buttonOrange;
    private javax.swing.JButton buttonOrange1;
    private javax.swing.JButton buttonOrange2;
    private javax.swing.JButton buttonPaintBucket;
    private javax.swing.JButton buttonPurple;
    private javax.swing.JButton buttonPurple1;
    private javax.swing.JButton buttonPurple2;
    private javax.swing.JButton buttonRed;
    private javax.swing.JButton buttonRed1;
    private javax.swing.JButton buttonRed2;
    private javax.swing.JButton buttonRedo;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonUndo;
    private javax.swing.JButton buttonWaterBrush;
    private javax.swing.JButton buttonYellow;
    private javax.swing.JButton buttonYellow1;
    private javax.swing.JButton buttonYellow2;
    private javax.swing.JSlider drawSizeSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JSlider opacitySlider;
    private javax.swing.JTextField textHeight;
    private javax.swing.JTextField textWidth;
    // End of variables declaration//GEN-END:variables
}
