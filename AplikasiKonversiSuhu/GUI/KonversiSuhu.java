// Annisa Dwi Irvianda
// 11200930000009

package GUI;

public class KonversiSuhu extends javax.swing.JFrame {
     double Celcius;
     double Fahrenhait;
     double Kelvin;
     double Reamur;
    
    public KonversiSuhu() {
        initComponents();
    }

    
    private void Celcius(){
        Celcius = Double.parseDouble(txtSuhu.getText());
        Fahrenhait = Celcius * 1.8 + 32;
        Kelvin = Celcius + 273.15;
        Reamur = Celcius * 0.8;
       lblCelcius.setText(Celcius+"Celcius");
       lblFahrenhait.setText(Fahrenhait+"Fahrenhait");
       lblKelvin.setText(Kelvin+"Kelvin");
       lblReamur.setText(Reamur+"Reamur");
    }
    private void Fahrenhait(){
        Fahrenhait = Double.parseDouble(txtSuhu.getText());
        Celcius = (Fahrenhait - 32) / 1.8;
        Reamur = (Fahrenhait - 32) / 2.25;
        Kelvin = (Fahrenhait + 459.67) / 1.8;
       lblCelcius.setText(Celcius+"Celcius");
       lblFahrenhait.setText(Fahrenhait+"Fahrenhait");
       lblKelvin.setText(Kelvin+"Kelvin");
       lblReamur.setText(Reamur+"Reamur");
    }
    private void Kelvin (){
        Kelvin = Double.parseDouble(txtSuhu.getText());
        Fahrenhait = Kelvin * 1.8 - 459.67;
        Celcius = Kelvin - 273.15;
        Reamur = (Kelvin - 273.15)* 0.8;
       lblCelcius.setText(Celcius+"Celcius");
       lblFahrenhait.setText(Fahrenhait+"Fahrenhait");
       lblKelvin.setText(Kelvin+"Kelvin");
       lblReamur.setText(Reamur+"Reamur");
    }
    private void Reamur(){
        Reamur = Double.parseDouble(txtSuhu.getText());
        Fahrenhait = (Reamur * 2.25)+ 32;
        Kelvin = (Reamur / 0.8) + 273.15;
        Celcius = (Reamur / 0.8);
       lblCelcius.setText(Celcius+"Celcius");
       lblFahrenhait.setText(Fahrenhait+"Fahrenhait");
       lblKelvin.setText(Kelvin+"Kelvin");
       lblReamur.setText(Reamur+"Reamur");    
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSuhu = new javax.swing.JTextField();
        rbCelcius = new javax.swing.JRadioButton();
        rbFahrenhait = new javax.swing.JRadioButton();
        rbReamur = new javax.swing.JRadioButton();
        btnKonversi = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblCelcius = new javax.swing.JLabel();
        lblFahrenhait = new javax.swing.JLabel();
        lblKelvin = new javax.swing.JLabel();
        lblReamur = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbKelvin = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APLIKASI KONVERSI SUHU");

        rbCelcius.setText("Celcius");

        rbFahrenhait.setText("Fahrenhait");

        rbReamur.setText("Reamur");

        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Hasil Konversi :");

        lblCelcius.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCelcius.setForeground(new java.awt.Color(255, 255, 255));
        lblCelcius.setText("Celcius");

        lblFahrenhait.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFahrenhait.setForeground(new java.awt.Color(255, 255, 255));
        lblFahrenhait.setText("Fahrenhait");

        lblKelvin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblKelvin.setForeground(new java.awt.Color(255, 255, 255));
        lblKelvin.setText("Kelvin");

        lblReamur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblReamur.setForeground(new java.awt.Color(255, 255, 255));
        lblReamur.setText("Reamur");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Masukkan Suhu :");

        rbKelvin.setText("Kelvin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnKonversi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset))
                    .addComponent(jLabel2)
                    .addComponent(lblCelcius)
                    .addComponent(lblFahrenhait)
                    .addComponent(lblKelvin)
                    .addComponent(lblReamur)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCelcius)
                        .addGap(10, 10, 10)
                        .addComponent(rbFahrenhait)
                        .addGap(16, 16, 16)
                        .addComponent(rbKelvin)
                        .addGap(18, 18, 18)
                        .addComponent(rbReamur)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbCelcius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbFahrenhait)
                        .addComponent(rbReamur)
                        .addComponent(rbKelvin))
                    .addComponent(txtSuhu, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKonversi)
                    .addComponent(btnReset))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCelcius)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFahrenhait)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKelvin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReamur)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
       if (rbCelcius.isSelected()){
            Celcius();
        }else if (rbFahrenhait.isSelected()){
            Fahrenhait();
        }else if (rbKelvin.isSelected()){
            Kelvin();
        }else if (rbReamur.isSelected()){
            Reamur();
        }
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtSuhu.setText("");
        lblCelcius.setText("Celcius");
        lblFahrenhait.setText("Fahrenhait");
        lblKelvin.setText("Kelvin");
        lblReamur.setText("Reamur");
        rbCelcius.setSelected(false);
        rbFahrenhait.setSelected(false);
        rbKelvin.setSelected(false);
        rbReamur.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKonversi;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCelcius;
    private javax.swing.JLabel lblFahrenhait;
    private javax.swing.JLabel lblKelvin;
    private javax.swing.JLabel lblReamur;
    private javax.swing.JRadioButton rbCelcius;
    private javax.swing.JRadioButton rbFahrenhait;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbReamur;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}
