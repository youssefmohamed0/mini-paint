package lab6;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ResizeCircleWindow extends javax.swing.JDialog implements Validation {
    private Shape shapeToResize;
    private Graphics canvas;
    private MainWindow mainWindow;
    public ResizeCircleWindow(Shape shapeToResize, Graphics canvas, MainWindow mainWindow) {
        initComponents();
        setModal(true);
        setLocationRelativeTo(mainWindow);
        this.shapeToResize = shapeToResize;
        this.canvas = canvas;
        this.mainWindow = mainWindow; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resizeButton = new javax.swing.JButton();
        newCircleRadius = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        resizeButton.setBackground(new java.awt.Color(0, 0, 0));
        resizeButton.setForeground(new java.awt.Color(255, 255, 255));
        resizeButton.setText("Resize");
        resizeButton.setFocusPainted(false);
        resizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeButtonActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Radius");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newCircleRadius, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(resizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCircleRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resizeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeButtonActionPerformed
        // TODO add your handling code here:
        if (validateFields()) {
            Map circleNewProperties = shapeToResize.getProperties();
            circleNewProperties.put("radius", Double.valueOf(newCircleRadius.getText()));
            shapeToResize.setProperties(circleNewProperties);
            mainWindow.refresh(canvas);
            dispose();
        }
    }//GEN-LAST:event_resizeButtonActionPerformed
@Override
    public boolean validateFields() {
        if (newCircleRadius.getText().isBlank()) {
            JOptionPane.showMessageDialog(this,"Please fill all fields","Error", 2);
            return false;
        }
        if (!Validation.isNumeric(newCircleRadius.getText())) {
            JOptionPane.showMessageDialog(this,"Please Enter valid Radius","Error", 2);
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField newCircleRadius;
    private javax.swing.JButton resizeButton;
    // End of variables declaration//GEN-END:variables
}
