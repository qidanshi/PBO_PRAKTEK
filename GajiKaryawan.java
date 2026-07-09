package package25062026;

import javax.swing.JOptionPane;

public class GajiKaryawan extends javax.swing.JFrame {

    public GajiKaryawan() {
        initComponents();
        txtTUpah.setEditable(false);
        txtTGaji.setEditable(false);
        txtGBersih.setEditable(false);
        txtPajak.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // kode auto-generated NetBeans tetap sama
    }

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {
            if (cbGol.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Golongan Belum Dipilih");
            } else {
                int gol = Integer.parseInt(cbGol.getSelectedItem().toString());
                int jam = Integer.parseInt(txtJam.getText());
                double upah, totalU, totalG, pajak, gajiB;

                switch (gol) {
                    case 1 -> {
                        upah = 20000;
                        totalU = upah * jam;
                        totalG = 2000000 + totalU;
                    }
                    case 2 -> {
                        upah = 30000;
                        totalU = upah * jam;
                        totalG = 3000000 + totalU;
                    }
                    case 3 -> {
                        upah = 40000;
                        totalU = upah * jam;
                        totalG = 2750000 + totalU;
                    }
                    case 4 -> {
                        upah = 50000;
                        totalU = upah * jam;
                        totalG = 4500000 + totalU;
                    }
                    default -> throw new IllegalStateException("Golongan tidak valid");
                }

                pajak = totalG * 0.025;
                gajiB = totalG - pajak;

                txtTUpah.setText(Double.toString(totalU));
                txtTGaji.setText(Double.toString(totalG));
                txtGBersih.setText(Double.toString(gajiB));
                txtPajak.setText(Double.toString(pajak));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Jam kerja harus berupa angka!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Masukan dengan benar!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        }
    }                                         

    private void txtJamActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // optional: bisa dikosongkan
    }                                      

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(GajiKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new GajiKaryawan().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> cbGol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblGBersih;
    private javax.swing.JLabel lblGol;
    private javax.swing.JLabel lblJam;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNik;
    private javax.swing.JLabel lblPajak;
    private javax.swing.JLabel lblTGaji;
    private javax.swing.JLabel lblTUpah;
    private javax.swing.JTextField txtGBersih;
    private javax.swing.JTextField txtJam;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNik;
    private javax.swing.JTextField txtPajak;
    private javax.swing.JTextField txtTGaji;
    private javax.swing.JTextField txtTUpah;
    // End of variables declaration                   
}
