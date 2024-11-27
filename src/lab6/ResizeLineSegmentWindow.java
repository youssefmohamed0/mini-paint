package lab6;

import java.awt.Graphics;
import java.util.Map;
import javax.swing.JOptionPane;

public class ResizeLineSegmentWindow extends javax.swing.JDialog implements Validation {
    private Shape shapeToResize;
    private Graphics canvas;
    private MainWindow mainWindow;
    public ResizeLineSegmentWindow(Shape shapeToResize, Graphics canvas, MainWindow mainWindow) {
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
        jLabel3 = new javax.swing.JLabel();
        newLineY = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        newLineX = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resize Line Segment");

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
        jLabel3.setText("X2");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Y2");
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(resizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(newLineX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(newLineY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newLineX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newLineY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resizeButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeButtonActionPerformed
        // TODO add your handling code here:
        if (validateFields()) {
            Map lineSegmentNewProperties = shapeToResize.getProperties();
            lineSegmentNewProperties.put("x2", Double.valueOf(newLineX.getText()));
            lineSegmentNewProperties.put("y2", Double.valueOf(newLineY.getText()));
            shapeToResize.setProperties(lineSegmentNewProperties);
            mainWindow.refresh(canvas);
            dispose();
        }
    }//GEN-LAST:event_resizeButtonActionPerformed
    public boolean validateFields() {
        if (newLineX.getText().isBlank() || newLineY.getText().isBlank()) {
            JOptionPane.showMessageDialog(this,"Please fill all fields","Error", 2);
            return false;
        }
        if (!Validation.isNumeric(newLineX.getText()) || !Validation.isWithinRange(newLineX.getText())) {
            JOptionPane.showMessageDialog(this,"Please Enter valid X position","Error", 2);
            return false;
        }
        if (!Validation.isNumeric(newLineY.getText()) || !Validation.isWithinRange(newLineY.getText())) {
            JOptionPane.showMessageDialog(this,"Please Enter valid Y postion","Error", 2);
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField newLineX;
    private javax.swing.JTextField newLineY;
    private javax.swing.JButton resizeButton;
    // End of variables declaration//GEN-END:variables
}
