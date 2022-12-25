# Paint
A simple java paint application, geared towards people who like digital drawing and taking quick notes.

# Stack
- Java
- Apache Netbeans

# Usage
Headover to the distribution folder and there you will find an executable java file to run the program
![Screenshot 2022-12-22 130853](https://user-images.githubusercontent.com/96448477/209226518-4b97726d-9f22-4da0-a0cb-8606dc633ab5.png)
![Screenshot 2022-12-22 130922](https://user-images.githubusercontent.com/96448477/209226541-87713a8a-348a-49f3-b92e-0f8b3ad231a4.png)
![Screenshot 2022-12-22 131006](https://user-images.githubusercontent.com/96448477/209226551-64ef9fc6-fec3-46ba-afd9-f823ec57bd5d.png)

# Build Output Description
When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "Paint.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

Notes:

* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, these files (folders)
are not copied.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest,the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.
