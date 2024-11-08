package lab6;

import java.awt.Graphics;

public class ColorizeWindow extends javax.swing.JFrame {
    private Shape shapeToColorize;
    private Graphics canvas;
    private MainWindow mainWindow;
    
    public ColorizeWindow(Shape shapeToColorize, Graphics canvas, MainWindow mainWindow) {
        initComponents();
        this.shapeToColorize = shapeToColorize;
        this.canvas = canvas;
        this.mainWindow = mainWindow; 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorChooser = new javax.swing.JColorChooser();
        confirmColorize = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        confirmColorize.setText("confirm");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(confirmColorize)))
                .addContainerGap(632, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(confirmColorize)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmColorizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmColorizeActionPerformed
        // TODO add your handling code here:
        shapeToColorize.setFillColor(colorChooser.getColor());
        mainWindow.refresh(canvas);
        dispose();
    }//GEN-LAST:event_confirmColorizeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JButton confirmColorize;
    // End of variables declaration//GEN-END:variables
}
