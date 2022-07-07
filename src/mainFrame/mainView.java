package mainFrame;

import formSekolah.formAboutUs;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import formSekolah.formGuru;
import formSekolah.formGuru;
import formSekolah.formJadwal;
import formSekolah.formKelas;
import formSekolah.formMapel;
import formSekolah.formNilai;
import formSekolah.formReport;
import formSekolah.formSiswa;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class mainView extends javax.swing.JFrame {
 
    public static class UIbaru extends Component
    {
        public UIbaru()
        {
            
        }
    }
       
    public mainView() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Gambar/background.jpg"));
        Image image = icon.getImage();
        panelUtama = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        formGuru = new javax.swing.JMenuItem();
        formSiswa = new javax.swing.JMenuItem();
        formKelas = new javax.swing.JMenuItem();
        formMapel = new javax.swing.JMenuItem();
        formJadwal = new javax.swing.JMenuItem();
        formNilai = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        getContentPane().add(panelUtama, "card2");

        jMenu2.setText("Form");

        formGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_id_male_student_50px.png"))); // NOI18N
        formGuru.setText("Form Guru");
        formGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formGuruActionPerformed(evt);
            }
        });
        jMenu2.add(formGuru);

        formSiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_student_male_50px.png"))); // NOI18N
        formSiswa.setText("Form Siswa");
        formSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formSiswaActionPerformed(evt);
            }
        });
        jMenu2.add(formSiswa);

        formKelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_classroom_50px.png"))); // NOI18N
        formKelas.setText("Form Kelas");
        formKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formKelasActionPerformed(evt);
            }
        });
        jMenu2.add(formKelas);

        formMapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_report_card_50px.png"))); // NOI18N
        formMapel.setText("Form Mata Pelajaran");
        formMapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formMapelActionPerformed(evt);
            }
        });
        jMenu2.add(formMapel);

        formJadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_flip_chart_50px.png"))); // NOI18N
        formJadwal.setText("Form Jadwal");
        formJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formJadwalActionPerformed(evt);
            }
        });
        jMenu2.add(formJadwal);

        formNilai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_book_and_pencil_50px.png"))); // NOI18N
        formNilai.setText("Form Nilai");
        formNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formNilaiActionPerformed(evt);
            }
        });
        jMenu2.add(formNilai);

        jMenuBar1.add(jMenu2);

        menuReport.setText("Report");
        menuReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_pdf_50px.png"))); // NOI18N
        jMenuItem1.setText("Report");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuReport.add(jMenuItem1);

        jMenuBar1.add(menuReport);

        jMenu4.setText("About Us");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_about_50px.png"))); // NOI18N
        jMenuItem2.setText("About Us");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formGuruActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.repaint();
        
        
        formGuru guru = new formGuru();
        guru.setVisible(true);
        panelUtama.add(guru);
    }//GEN-LAST:event_formGuruActionPerformed

    private void formSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formSiswaActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.repaint();
        
        
        formSiswa siswa = new formSiswa();
        siswa.setVisible(true);
        panelUtama.add(siswa);
       
    }//GEN-LAST:event_formSiswaActionPerformed

    private void formMapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formMapelActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.repaint();
        
        
        formMapel mapel = new formMapel();
        mapel.setVisible(true);
        panelUtama.add(mapel);
    }//GEN-LAST:event_formMapelActionPerformed

    private void formKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formKelasActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.repaint();
        
        
        formKelas kelas = new formKelas();
        kelas.setVisible(true);
        panelUtama.add(kelas);
    }//GEN-LAST:event_formKelasActionPerformed

    private void formNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formNilaiActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.repaint();
        
        
        formNilai nilai = new formNilai();
        nilai.setVisible(true);
        panelUtama.add(nilai);
    }//GEN-LAST:event_formNilaiActionPerformed

    private void formJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formJadwalActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.repaint();
        
        
        formJadwal jadwal = new formJadwal();
        jadwal.setVisible(true);
        panelUtama.add(jadwal);
    }//GEN-LAST:event_formJadwalActionPerformed

    private void menuReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menuReportActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.repaint();
        
        
        formReport report = new formReport();
        report.setVisible(true);
        panelUtama.add(report);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.repaint();
        
        
        formAboutUs us = new formAboutUs();
        us.setVisible(true);
        panelUtama.add(us);
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem formGuru;
    private javax.swing.JMenuItem formJadwal;
    private javax.swing.JMenuItem formKelas;
    private javax.swing.JMenuItem formMapel;
    private javax.swing.JMenuItem formNilai;
    private javax.swing.JMenuItem formSiswa;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuReport;
    private javax.swing.JDesktopPane panelUtama;
    // End of variables declaration//GEN-END:variables
}
