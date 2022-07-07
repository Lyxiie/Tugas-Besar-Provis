package formSekolah;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class formReport extends javax.swing.JInternalFrame {

    public formReport() {
        initComponents();
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dm.width/2-this.getSize().width/2, dm.height/2-this.getSize().height/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        rbGuru = new javax.swing.JRadioButton();
        rbSiswa = new javax.swing.JRadioButton();
        rbKelas = new javax.swing.JRadioButton();
        rbMapel = new javax.swing.JRadioButton();
        rbNilai = new javax.swing.JRadioButton();
        rbJadwal = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(966, 566));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "DATA LAPORAN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rbGuru.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rbGuru);
        rbGuru.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        rbGuru.setForeground(new java.awt.Color(255, 255, 255));
        rbGuru.setText("GURU");

        rbSiswa.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rbSiswa);
        rbSiswa.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        rbSiswa.setForeground(new java.awt.Color(255, 255, 255));
        rbSiswa.setText("SISWA");

        rbKelas.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rbKelas);
        rbKelas.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        rbKelas.setForeground(new java.awt.Color(255, 255, 255));
        rbKelas.setText("KELAS");

        rbMapel.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rbMapel);
        rbMapel.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        rbMapel.setForeground(new java.awt.Color(255, 255, 255));
        rbMapel.setText("MATA PELAJARAN");

        rbNilai.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rbNilai);
        rbNilai.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        rbNilai.setForeground(new java.awt.Color(255, 255, 255));
        rbNilai.setText("NILAI");

        rbJadwal.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rbJadwal);
        rbJadwal.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        rbJadwal.setForeground(new java.awt.Color(255, 255, 255));
        rbJadwal.setText("JADWAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbGuru)
                        .addGap(18, 18, 18)
                        .addComponent(rbKelas)
                        .addGap(18, 18, 18)
                        .addComponent(rbNilai))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbSiswa)
                        .addGap(18, 18, 18)
                        .addComponent(rbMapel)
                        .addGap(18, 18, 18)
                        .addComponent(rbJadwal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {rbGuru, rbJadwal, rbKelas, rbMapel, rbNilai, rbSiswa});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbGuru)
                    .addComponent(rbKelas)
                    .addComponent(rbNilai))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSiswa)
                    .addComponent(rbMapel)
                    .addComponent(rbJadwal))
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (rbMapel.isSelected())
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");

                HashMap hm = new HashMap();

                File file = new File("C:\\Users\\Lyxiie\\OneDrive\\Documents\\NetBeansProjects\\Kelompok4_Sekolah_PROVIS-6\\src\\Report\\laporanMapel.jasper");

                JasperReport jr = (JasperReport)JRLoader.loadObject(file);
                JasperPrint jp = JasperFillManager.fillReport(jr, hm,koneksi);
                JasperViewer.viewReport(jp, false);
                JasperViewer.setDefaultLookAndFeelDecorated(true);

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if (rbKelas.isSelected())
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");

                HashMap hm = new HashMap();

                File file = new File("C:\\Users\\Lyxiie\\OneDrive\\Documents\\NetBeansProjects\\Kelompok4_Sekolah_PROVIS-6\\src\\Report\\laporanKelas.jasper");

                JasperReport jr = (JasperReport)JRLoader.loadObject(file);
                JasperPrint jp = JasperFillManager.fillReport(jr, hm,koneksi);
                JasperViewer.viewReport(jp, false);
                JasperViewer.setDefaultLookAndFeelDecorated(true);

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if (rbGuru.isSelected())
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");

                HashMap hm = new HashMap();

                File file = new File("C:\\Users\\Lyxiie\\OneDrive\\Documents\\NetBeansProjects\\Kelompok4_Sekolah_PROVIS-6\\src\\Report\\laporanGuru.jasper");

                JasperReport jr = (JasperReport)JRLoader.loadObject(file);
                JasperPrint jp = JasperFillManager.fillReport(jr, hm,koneksi);
                JasperViewer.viewReport(jp, false);
                JasperViewer.setDefaultLookAndFeelDecorated(true);

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if (rbSiswa.isSelected())
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");

                HashMap hm = new HashMap();

                File file = new File("C:\\Users\\Lyxiie\\OneDrive\\Documents\\NetBeansProjects\\Kelompok4_Sekolah_PROVIS-6\\src\\Report\\laporanSiswa.jasper");

                JasperReport jr = (JasperReport)JRLoader.loadObject(file);
                JasperPrint jp = JasperFillManager.fillReport(jr, hm,koneksi);
                JasperViewer.viewReport(jp, false);
                JasperViewer.setDefaultLookAndFeelDecorated(true);

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if (rbNilai.isSelected())
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");

                HashMap hm = new HashMap();

                File file = new File("C:\\Users\\Lyxiie\\OneDrive\\Documents\\NetBeansProjects\\Kelompok4_Sekolah_PROVIS-6\\src\\Report\\laporanNilai.jasper");

                JasperReport jr = (JasperReport)JRLoader.loadObject(file);
                JasperPrint jp = JasperFillManager.fillReport(jr, hm,koneksi);
                JasperViewer.viewReport(jp, false);
                JasperViewer.setDefaultLookAndFeelDecorated(true);

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if (rbJadwal.isSelected())
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");

                HashMap hm = new HashMap();

                File file = new File("C:\\Users\\Lyxiie\\OneDrive\\Documents\\NetBeansProjects\\Kelompok4_Sekolah_PROVIS-6\\src\\Report\\laporanJadwal.jasper");

                JasperReport jr = (JasperReport)JRLoader.loadObject(file);
                JasperPrint jp = JasperFillManager.fillReport(jr, hm,koneksi);
                JasperViewer.viewReport(jp, false);
                JasperViewer.setDefaultLookAndFeelDecorated(true);

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbGuru;
    private javax.swing.JRadioButton rbJadwal;
    private javax.swing.JRadioButton rbKelas;
    private javax.swing.JRadioButton rbMapel;
    private javax.swing.JRadioButton rbNilai;
    private javax.swing.JRadioButton rbSiswa;
    // End of variables declaration//GEN-END:variables
}
