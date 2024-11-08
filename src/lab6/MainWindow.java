package lab6;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainWindow extends javax.swing.JFrame implements DrawingEngine{

//    private Shape[] shapes;
    private ArrayList<Shape> shapes;

    @Override
    public Shape[] getShapes() {
        return (Shape[])shapes.toArray();
    }

    @Override
    public void addShape(Shape shape) {
        shapes.add(shape);
        shapesList.addItem(shape.toString() + shapes.indexOf(shape));
    }

    @Override
    public void removeShape(Shape shape) {
        shapes.remove(shape);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vector Drawing Application");

        canvas1.setBackground(new java.awt.Color(255, 255, 255));

        drawLineButton.setText("LineSegment");
        drawLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawLineButtonActionPerformed(evt);
            }
        });

        drawRectangleButton.setText("Rectangle");
        drawRectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawRectangleButtonActionPerformed(evt);
            }
        });

        drawSquareButton.setText("Square");
        drawSquareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawSquareButtonActionPerformed(evt);
            }
        });

        drawCircleButton.setText("Circle");
        drawCircleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawCircleButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Shape");

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        colorizeButton.setText("colorize");
        colorizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorizeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(drawCircleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(drawLineButton)
                .addGap(81, 81, 81)
                .addComponent(drawSquareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(drawRectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(shapesList, javax.swing.GroupLayout.Alignment.LEADING, 0, 220, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(colorizeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drawLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drawRectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drawSquareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drawCircleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shapesList, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeButton)
                            .addComponent(colorizeButton)))
                    .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        refresh(canvas1.getGraphics());
    }//GEN-LAST:event_drawLineButtonActionPerformed

    private void drawRectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawRectangleButtonActionPerformed
        // Draw rectangle
    }//GEN-LAST:event_drawRectangleButtonActionPerformed

    private void drawCircleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawCircleButtonActionPerformed
        // Draw circle
    }//GEN-LAST:event_drawCircleButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        try {
            removeShape(shapes.get(shapesList.getSelectedIndex()));
            shapesList.removeItemAt(shapesList.getSelectedIndex());
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton colorizeButton;
    private javax.swing.JButton drawCircleButton;
    private javax.swing.JButton drawLineButton;
    private javax.swing.JButton drawRectangleButton;
    private javax.swing.JButton drawSquareButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton removeButton;
    private javax.swing.JComboBox<String> shapesList;
    // End of variables declaration//GEN-END:variables
}
