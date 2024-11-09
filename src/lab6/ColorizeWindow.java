package lab6;

import java.awt.Graphics;

public class ColorizeWindow extends javax.swing.JFrame {
    private Shape shapeToColorize;
    private Graphics canvas;
    private MainWindow mainWindow;
    
    public ColorizeWindow(Shape shapeToColorize, Graphics canvas, MainWindow mainWindow) {
        initComponents();
        setLocationRelativeTo(mainWindow);
        this.shapeToColorize = shapeToColorize;
        this.canvas = canvas;
        this.mainWindow = mainWindow; 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorChooser = new javax.swing.JColorChooser();
        confirmColorize = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Colorize");

        colorChooser.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        confirmColorize.setBackground(new java.awt.Color(0, 0, 0));
        confirmColorize.setForeground(new java.awt.Color(255, 255, 255));
        confirmColorize.setText("confirm");
        confirmColorize.setFocusPainted(false);
        confirmColorize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmColorizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmColorize, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmColorize, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmColorizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmColorizeActionPerformed
        // TODO add your handling code here:
        shapeToColorize.setFillColor(colorChooser.getColor());
        shapeToColorize.setColor(colorChooser.getColor());
        mainWindow.refresh(canvas);
        dispose();
    }//GEN-LAST:event_confirmColorizeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JButton confirmColorize;
    // End of variables declaration//GEN-END:variables
}
