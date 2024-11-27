package lab6;

import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {
//    private static String fileContentString = "";
//    private static String fileName;
//    private static MainWindow mainWindow;
    
    private static Shape getShapeFromString(String lineRepresentation) {
        String[] stringMembers = lineRepresentation.split(",");
        String name = stringMembers[0];
        Color color = new Color(Integer.parseInt(stringMembers[1]), Integer.parseInt(stringMembers[2]), Integer.parseInt(stringMembers[3]));
        Color fillColor = new Color(Integer.parseInt(stringMembers[4]), Integer.parseInt(stringMembers[5]), Integer.parseInt(stringMembers[6]));
        Point position = new Point(Integer.parseInt(stringMembers[7]), Integer.parseInt(stringMembers[8]));
        if (name.charAt(0) == 'c') {
            double circleRadius = Double.parseDouble(stringMembers[9]);
            Map properties = new HashMap<>();
            properties.put("radius", circleRadius);
            return new Circle(color, fillColor, position, properties);
        }
            /// do same for other shapes
        return null;
    }
    public static void readFromFile(File f, MainWindow mainWindow) {
        for (int i = 0; i < mainWindow.getShapes().length; i++) {
            mainWindow.removeShape(mainWindow.getShapes()[i]);
        }
        try {
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()) {
                String nextLine = scan.nextLine();
                if (!nextLine.trim().isEmpty()) {
                    mainWindow.addShape(getShapeFromString(nextLine));
                }
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void saveToFile(File f, MainWindow mainWindow) {
        FileWriter writer = null;
        Shape[] shapes = (Shape[])mainWindow.getShapes();
        System.out.println(shapes.length);
        try {
            writer = new FileWriter(f);
            for (int i = 0; i < mainWindow.getShapes().length; i++) {
                writer.write(mainWindow.getShapes()[i].getLineRepresentation());
            }
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
