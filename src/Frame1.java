
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author intel
 */
public class Frame1 extends javax.swing.JFrame {

    String temp="";
    Double ti,bt,h1;
    public Frame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Tinggi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Bb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BbIdeal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Saran = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();
        L = new javax.swing.JRadioButton();
        P = new javax.swing.JRadioButton();
        Keluar = new javax.swing.JButton();
        Hitung = new javax.swing.JButton();
        CL = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 300, 50);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 90, 20);
        getContentPane().add(Nama);
        Nama.setBounds(140, 70, 170, 30);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("kg");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 290, 20, 20);
        getContentPane().add(Tinggi);
        Tinggi.setBounds(140, 110, 50, 30);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Berat Badan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 150, 90, 20);
        getContentPane().add(Bb);
        Bb.setBounds(140, 150, 50, 30);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Berat Badan Ideal Anda Adalah");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 290, 210, 30);
        getContentPane().add(BbIdeal);
        BbIdeal.setBounds(260, 290, 60, 30);

        jLabel6.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel6.setText("HASIL DIAGNOSA KESEHATAN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 340, 440, 30);
        getContentPane().add(Saran);
        Saran.setBounds(20, 420, 480, 30);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("Jenis Kelamin");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 200, 90, 20);
        getContentPane().add(Hasil);
        Hasil.setBounds(20, 380, 480, 30);

        buttonGroup1.add(L);
        L.setText("Laki Laki");
        getContentPane().add(L);
        L.setBounds(290, 193, 100, 30);

        buttonGroup1.add(P);
        P.setText("Perempuan");
        getContentPane().add(P);
        P.setBounds(140, 193, 110, 30);

        Keluar.setBackground(new java.awt.Color(0, 102, 204));
        Keluar.setForeground(new java.awt.Color(255, 255, 255));
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar);
        Keluar.setBounds(320, 230, 110, 30);

        Hitung.setBackground(new java.awt.Color(0, 204, 255));
        Hitung.setForeground(new java.awt.Color(255, 255, 255));
        Hitung.setText("HITUNG");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });
        getContentPane().add(Hitung);
        Hitung.setBounds(30, 230, 110, 30);

        CL.setBackground(new java.awt.Color(0, 153, 204));
        CL.setForeground(new java.awt.Color(255, 255, 255));
        CL.setText("Coba Lagi");
        CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLActionPerformed(evt);
            }
        });
        getContentPane().add(CL);
        CL.setBounds(170, 230, 110, 30);

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setText("Tinggi");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 110, 90, 20);

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText("cm");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 110, 30, 20);

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setText("kg");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 150, 20, 20);

        setBounds(0, 0, 626, 524);
    }// </editor-fold>//GEN-END:initComponents

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        // TODO add your handling code here:
        
        if(Nama.getText().equals("")|| Bb.getText().equals("") || Tinggi.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Kotak isian Harus Diisi Semua");
        }
        else if(P.isSelected()|| L.isSelected())
        {
            try{
                Proses();
            }catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Masukkan Anda Salah");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Anda Harus Memilih Jenis Kelamin");
        }
        
    }//GEN-LAST:event_HitungActionPerformed

    private void CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLActionPerformed
        // TODO add your handling code here:
        Nama.setText("");
        Tinggi.setText("");
        Bb.setText("");
        buttonGroup1.clearSelection();
        BbIdeal.setText("");
        Hasil.setText("");
        Saran.setText("");
    }//GEN-LAST:event_CLActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
      dispose();
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bb;
    private javax.swing.JTextField BbIdeal;
    private javax.swing.JButton CL;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton Hitung;
    private javax.swing.JButton Keluar;
    private javax.swing.JRadioButton L;
    private javax.swing.JTextField Nama;
    private javax.swing.JRadioButton P;
    private javax.swing.JTextField Saran;
    private javax.swing.JTextField Tinggi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables

    private void Proses() 
    {
        ti = Double.valueOf(Tinggi.getText());
        bt = Double.valueOf(Bb.getText());
        
        if(P.isSelected())
        {
            h1 = (ti-100) * 1;
        }
        else if(L.isSelected())
        {
            h1 = (ti-104) *1;
        }
        temp = Double.toString(h1.intValue());
        
        if(h1<bt)
        {
            BbIdeal.setText(temp);
            Hasil.setText("Maaf " + Nama.getText() + " Sepertinya Anda Overweight");
            Saran.setText("Perbanyak Olahraga dan hindari makanan berkolestrol");
        }
        else if(h1>bt)
        {
            BbIdeal.setText(temp);
            Hasil.setText("Maaf " + Nama.getText() + " Sepertinya Anda underweight");
            Saran.setText("Perbanyak makanan berkarbohidrat");
        }
        else
        {
            BbIdeal.setText(temp);
            Hasil.setText("Hallooooo " + Nama.getText() + " Berat Badan kamu sudah ideal");
            Saran.setText("Lanjutkan pola makan dan gaya hidup sehat kamu yaa :)");
        }
    } 
}