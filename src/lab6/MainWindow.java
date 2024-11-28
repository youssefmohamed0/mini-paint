package lab6;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MainWindow extends javax.swing.JFrame implements DrawingEngine{

//    private Shape[] shapes;
    private ArrayList<Shape> shapes;
    private static int counter = 0;

    @Override
    public Shape[] getShapes() {
        return shapes.toArray(new Shape[0]);
    }

    @Override
    public void addShape(Shape shape) {
        shapes.add(shape);
        shapesList.addItem(shape.toString() + Integer.toString(counter));
        counter++;
    }

    @Override
    public void removeShape(Shape shape) {
        shapes.remove(shape);
        shapesList.removeItemAt(shapesList.getSelectedIndex());
        counter--;
    }

    @Override
    public void refresh(Graphics canvas) {
        canvas.setColor(Color.white);
        canvas.fillRect(0, 0, canvas1.getSize().width, canvas1.getSize().height);
        
        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).draw(canvas);
        }
    }

    public MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
        this.shapes = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        drawLineButton = new javax.swing.JButton();
        drawRectangleButton = new javax.swing.JButton();
        drawSquareButton = new javax.swing.JButton();
        drawCircleButton = new javax.swing.JButton();
        shapesList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        colorizeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        moveButton = new javax.swing.JButton();
        resizeButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vector Drawing Application");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
        });

        canvas1.setBackground(new java.awt.Color(255, 255, 255));
        canvas1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        drawLineButton.setBackground(new java.awt.Color(0, 0, 0));
        drawLineButton.setForeground(new java.awt.Color(255, 255, 255));
        drawLineButton.setText("LineSegment");
        drawLineButton.setFocusPainted(false);
        drawLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawLineButtonActionPerformed(evt);
            }
        });

        drawRectangleButton.setBackground(new java.awt.Color(0, 0, 0));
        drawRectangleButton.setForeground(new java.awt.Color(255, 255, 255));
        drawRectangleButton.setText("Rectangle");
        drawRectangleButton.setFocusPainted(false);
        drawRectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawRectangleButtonActionPerformed(evt);
            }
        });

        drawSquareButton.setBackground(new java.awt.Color(0, 0, 0));
        drawSquareButton.setForeground(new java.awt.Color(255, 255, 255));
        drawSquareButton.setText("Square");
        drawSquareButton.setFocusPainted(false);
        drawSquareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawSquareButtonActionPerformed(evt);
            }
        });

        drawCircleButton.setBackground(new java.awt.Color(0, 0, 0));
        drawCircleButton.setForeground(new java.awt.Color(255, 255, 255));
        drawCircleButton.setText("Circle");
        drawCircleButton.setFocusPainted(false);
        drawCircleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawCircleButtonActionPerformed(evt);
            }
        });

        shapesList.setBackground(new java.awt.Color(0, 0, 0));
        shapesList.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Canvas Size: 720 x 720");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel1.setOpaque(true);

        removeButton.setBackground(new java.awt.Color(0, 0, 0));
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Remove");
        removeButton.setFocusPainted(false);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        colorizeButton.setBackground(new java.awt.Color(0, 0, 0));
        colorizeButton.setForeground(new java.awt.Color(255, 255, 255));
        colorizeButton.setText("colorize");
        colorizeButton.setFocusPainted(false);
        colorizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorizeButtonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Select Shape");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel2.setOpaque(true);

        moveButton.setBackground(new java.awt.Color(0, 0, 0));
        moveButton.setForeground(new java.awt.Color(255, 255, 255));
        moveButton.setText("Move");
        moveButton.setFocusPainted(false);
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        resizeButton.setBackground(new java.awt.Color(0, 0, 0));
        resizeButton.setForeground(new java.awt.Color(255, 255, 255));
        resizeButton.setText("Resize");
        resizeButton.setFocusPainted(false);
        resizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(0, 0, 0));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.setFocusPainted(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        loadButton.setBackground(new java.awt.Color(0, 0, 0));
        loadButton.setForeground(new java.awt.Color(255, 255, 255));
        loadButton.setText("Load");
        loadButton.setFocusPainted(false);
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(drawCircleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(drawLineButton)
                        .addGap(81, 81, 81)
                        .addComponent(drawSquareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(drawRectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(shapesList, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(colorizeButton)
                                            .addComponent(resizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(66, 66, 66)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(moveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(21, 21, 21)))
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drawLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drawRectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drawSquareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drawCircleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(shapesList, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawSquareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawSquareButtonActionPerformed
        // Draw square
        DrawSquareWindow drawSquareWindow = new DrawSquareWindow(canvas1.getGraphics(),this);
        drawSquareWindow.setVisible(true);
    }//GEN-LAST:event_drawSquareButtonActionPerformed

    private void drawLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawLineButtonActionPerformed
        // Draw line
        DrawLineSegmentWindow drawLineSegmentWindow = new DrawLineSegmentWindow(canvas1.getGraphics(), this);
        drawLineSegmentWindow.setVisible(true);
    }//GEN-LAST:event_drawLineButtonActionPerformed

    private void drawRectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawRectangleButtonActionPerformed
        // Draw rectangle
        DrawRectangleWindow drawRectangleWindow = new DrawRectangleWindow(canvas1.getGraphics(), this);
        drawRectangleWindow.setVisible(true);
    }//GEN-LAST:event_drawRectangleButtonActionPerformed

    private void drawCircleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawCircleButtonActionPerformed
        // Draw circle
        DrawCircleWindow drawCircleWindow = new DrawCircleWindow(canvas1.getGraphics(), this);
        drawCircleWindow.setVisible(true);
    }//GEN-LAST:event_drawCircleButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        try {
            removeShape(shapes.get(shapesList.getSelectedIndex()));
//            shapesList.removeItemAt(shapesList.getSelectedIndex());
            refresh(canvas1.getGraphics());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No shapes to remove","Error",2);
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void colorizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorizeButtonActionPerformed
        // TODO add your handling code here:
        try {
            Shape shapeToColorize = shapes.get(shapesList.getSelectedIndex());
            ColorizeWindow colorizeWindow = new ColorizeWindow(shapeToColorize, canvas1.getGraphics(), this);
            colorizeWindow.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No shapes to colorize","Error",2);
        }
    }//GEN-LAST:event_colorizeButtonActionPerformed

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed
        // TODO add your handling code here:
        try {
            Shape shapeToMove = shapes.get(shapesList.getSelectedIndex());
            MoveShapeWindow moveShapeWindow = new MoveShapeWindow(shapeToMove, canvas1.getGraphics(), this);
            moveShapeWindow.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No shapes to move","Error",2);
        }
    }//GEN-LAST:event_moveButtonActionPerformed

    private void resizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeButtonActionPerformed
        // TODO add your handling code here:
        try {
            Shape shapeToResize = shapes.get(shapesList.getSelectedIndex());
            if (shapeToResize instanceof Circle) {
                ResizeCircleWindow resizeCircleWindow = new ResizeCircleWindow(shapeToResize, canvas1.getGraphics(), this);
                resizeCircleWindow.setVisible(true);
            }
            else if (shapeToResize instanceof Rectangle) {
                ResizeRectangleWindow resizeRectangleWindow = new ResizeRectangleWindow(shapeToResize, canvas1.getGraphics(), this);
                resizeRectangleWindow.setVisible(true);
            }
            else if (shapeToResize instanceof Square) {
                ResizeSquareWindow resizeSquareWindow = new ResizeSquareWindow(shapeToResize, canvas1.getGraphics(), this);
                resizeSquareWindow.setVisible(true);
            }
            else if (shapeToResize instanceof LineSegment) {
                ResizeLineSegmentWindow resizeLineSegmentWindow = new ResizeLineSegmentWindow(shapeToResize, canvas1.getGraphics(), this);
                resizeLineSegmentWindow.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No shapes to resize","Error",2);
        }
    }//GEN-LAST:event_resizeButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser("C:\\_minipaint");
        int r = chooser.showSaveDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            FileManager.saveToFile(f, this);
            refresh(canvas1.getGraphics());
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser("C:\\_minipaint");
        int r = chooser.showDialog(null,"Load");
        if (r == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            FileManager.readFromFile(f, this);
            refresh(canvas1.getGraphics());
        }
    }//GEN-LAST:event_loadButtonActionPerformed

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
        refresh(canvas1.getGraphics());
    }//GEN-LAST:event_formComponentMoved

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        refresh(canvas1.getGraphics());
    }//GEN-LAST:event_formComponentResized

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
        // TODO add your handling code here:
        refresh(canvas1.getGraphics());
    }//GEN-LAST:event_formWindowDeiconified

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton colorizeButton;
    private javax.swing.JButton drawCircleButton;
    private javax.swing.JButton drawLineButton;
    private javax.swing.JButton drawRectangleButton;
    private javax.swing.JButton drawSquareButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton moveButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton resizeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> shapesList;
    // End of variables declaration//GEN-END:variables
}
