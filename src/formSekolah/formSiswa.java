package formSekolah;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class formSiswa extends javax.swing.JInternalFrame {

    String tglLahir;
    DefaultTableModel model_siswa;
    public formSiswa() {
        initComponents();
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dm.width/2-this.getSize().width/2, dm.height/2-this.getSize().height/2);
        
        String [] judul ={"NIS","Kode Kelas","Nama Siswa","Jenis Kelamin","Alamat Siswa","Tanggal Lahir","Pekerjaan Orangtua"};
        model_siswa = new DefaultTableModel(judul,0);
        tabelSiswa.setModel(model_siswa);
        tampilkanSiswa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSiswa = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_viewSiswa = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_tambahSiswa = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        panel_bawah = new javax.swing.JPanel();
        panel_viewSiswa = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_editSiswa = new javax.swing.JButton();
        btn_hapusSiswa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelSiswa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_cariSiswa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pilihSiswa = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_prosesSiswa = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb_jkSiswa = new javax.swing.JComboBox<>();
        txt_nisSiswa = new javax.swing.JTextField();
        txt_kodeSiswa = new javax.swing.JTextField();
        txt_namaSiswa = new javax.swing.JTextField();
        txt_alamatSiswa = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btn_prosesSiswa = new javax.swing.JButton();
        btn_resetSiswa = new javax.swing.JButton();
        txt_ttlSiswa = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txt_pekerjaanOrtu = new javax.swing.JTextField();

        panelSiswa.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(160, 68));

        btn_viewSiswa.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btn_viewSiswa.setForeground(new java.awt.Color(255, 255, 255));
        btn_viewSiswa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_viewSiswa.setText("VIEW DATA");
        btn_viewSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewSiswaMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_search_50px_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_viewSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_viewSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setPreferredSize(new java.awt.Dimension(121, 68));

        btn_tambahSiswa.setBackground(new java.awt.Color(102, 102, 102));
        btn_tambahSiswa.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btn_tambahSiswa.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambahSiswa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_tambahSiswa.setText("TAMBAH DATA");
        btn_tambahSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahSiswaMouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_add_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_tambahSiswa))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_tambahSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel75.setBackground(new java.awt.Color(102, 102, 102));
        jLabel75.setForeground(new java.awt.Color(102, 102, 102));
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_school_100px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SMAN 100 BANDUNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel75)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel75)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_bawah.setLayout(new java.awt.CardLayout());

        panel_viewSiswa.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btn_editSiswa.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_editSiswa.setText("EDIT");
        btn_editSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editSiswaActionPerformed(evt);
            }
        });

        btn_hapusSiswa.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_hapusSiswa.setText("HAPUS");
        btn_hapusSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusSiswaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_editSiswa)
                .addGap(18, 18, 18)
                .addComponent(btn_hapusSiswa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hapusSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabelSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelSiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelSiswa);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("PENCARIAN DATA  :");

        txt_cariSiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariSiswaKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DATA YANG DIPILIH : ");

        txt_pilihSiswa.setEditable(false);
        txt_pilihSiswa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DATA SISWA");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_viewSiswaLayout = new javax.swing.GroupLayout(panel_viewSiswa);
        panel_viewSiswa.setLayout(panel_viewSiswaLayout);
        panel_viewSiswaLayout.setHorizontalGroup(
            panel_viewSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_viewSiswaLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panel_viewSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewSiswaLayout.createSequentialGroup()
                        .addGroup(panel_viewSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_viewSiswaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cariSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewSiswaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(panel_viewSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewSiswaLayout.createSequentialGroup()
                                .addComponent(txt_pilihSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))))
            .addGroup(panel_viewSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewSiswaLayout.createSequentialGroup()
                    .addContainerGap(532, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        panel_viewSiswaLayout.setVerticalGroup(
            panel_viewSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_viewSiswaLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(panel_viewSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cariSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(panel_viewSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_pilihSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_viewSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_viewSiswaLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(437, Short.MAX_VALUE)))
        );

        panel_bawah.add(panel_viewSiswa, "card2");

        panel_prosesSiswa.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setText("NIS :");

        jLabel5.setText("Kode Kelas :");

        jLabel6.setText("Nama Siswa :");

        jLabel7.setText("Jenis Kelamin :");

        jLabel8.setText("Alamat :");

        jLabel9.setText("Tanggal Lahir :");

        cb_jkSiswa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));

        txt_nisSiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nisSiswaKeyTyped(evt);
            }
        });

        txt_namaSiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_namaSiswaKeyTyped(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        btn_prosesSiswa.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_prosesSiswa.setText("PROSES");
        btn_prosesSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesSiswaActionPerformed(evt);
            }
        });

        btn_resetSiswa.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_resetSiswa.setText("RESET");
        btn_resetSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetSiswaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_prosesSiswa)
                .addGap(18, 18, 18)
                .addComponent(btn_resetSiswa)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prosesSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_resetSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txt_ttlSiswa.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_ttlSiswaPropertyChange(evt);
            }
        });

        jLabel10.setText("Pekerjaan Orangtua :");

        javax.swing.GroupLayout panel_prosesSiswaLayout = new javax.swing.GroupLayout(panel_prosesSiswa);
        panel_prosesSiswa.setLayout(panel_prosesSiswaLayout);
        panel_prosesSiswaLayout.setHorizontalGroup(
            panel_prosesSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_prosesSiswaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_prosesSiswaLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(panel_prosesSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_jkSiswa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nisSiswa)
                    .addComponent(txt_kodeSiswa)
                    .addComponent(txt_namaSiswa)
                    .addComponent(txt_alamatSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txt_ttlSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pekerjaanOrtu))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        panel_prosesSiswaLayout.setVerticalGroup(
            panel_prosesSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prosesSiswaLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(panel_prosesSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_prosesSiswaLayout.createSequentialGroup()
                        .addGroup(panel_prosesSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_nisSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_prosesSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_kodeSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_prosesSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_namaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_prosesSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cb_jkSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_prosesSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_alamatSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addComponent(txt_ttlSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_prosesSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_pekerjaanOrtu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        panel_bawah.add(panel_prosesSiswa, "card3");

        javax.swing.GroupLayout panelSiswaLayout = new javax.swing.GroupLayout(panelSiswa);
        panelSiswa.setLayout(panelSiswaLayout);
        panelSiswaLayout.setHorizontalGroup(
            panelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panel_bawah, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSiswaLayout.setVerticalGroup(
            panelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_bawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewSiswaMouseClicked
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_viewSiswa);
        panel_bawah.repaint();
        panel_bawah.revalidate();
    }//GEN-LAST:event_btn_viewSiswaMouseClicked

    private void btn_tambahSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahSiswaMouseClicked
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_prosesSiswa);
        panel_bawah.repaint();
        panel_bawah.revalidate();
        
        btn_prosesSiswa.setText("TAMBAH");
        btn_resetSiswa.setText("RESET");
        txt_nisSiswa.setEditable(true);
        reset();
    }//GEN-LAST:event_btn_tambahSiswaMouseClicked

    private void btn_editSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editSiswaActionPerformed
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_prosesSiswa);
        panel_bawah.repaint();
        panel_bawah.revalidate();
        btn_prosesSiswa.setText("UPDATE");
        btn_resetSiswa.setText("RESET DATA");
        txt_nisSiswa.setEditable(false);
    }//GEN-LAST:event_btn_editSiswaActionPerformed

    private void btn_hapusSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusSiswaActionPerformed
        // TODO add your handling code here:
        int jawab ;
        if(txt_pilihSiswa.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Data Terlebih Dahulu!", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
        }else
        if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Menghapus Data?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
         try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement().executeUpdate("Delete from siswa where nis ='"+txt_pilihSiswa.getText()+"'");
            tampilkanSiswa();
        } catch (SQLException ex) {
            Logger.getLogger(formSiswa.class.getName()).log(Level.SEVERE, null, ex);
             
        }
        }
    }//GEN-LAST:event_btn_hapusSiswaActionPerformed

    private void tabelSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelSiswaMouseClicked
        // TODO add your handling code here:

        int  i = tabelSiswa.getSelectedRow();
        if(i>-1)
        {
            txt_pilihSiswa.setText(model_siswa.getValueAt(i, 0).toString());
            txt_nisSiswa.setText(model_siswa.getValueAt(i, 0).toString());
            txt_kodeSiswa.setText(model_siswa.getValueAt(i, 1).toString());
            txt_namaSiswa.setText(model_siswa.getValueAt(i, 2).toString());
            txt_alamatSiswa.setText(model_siswa.getValueAt(i, 4).toString());
            txt_pekerjaanOrtu.setText(model_siswa.getValueAt(i, 6).toString());
        }
    }//GEN-LAST:event_tabelSiswaMouseClicked

    private void txt_cariSiswaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariSiswaKeyReleased
        // TODO add your handling code here:
        String key = txt_cariSiswa.getText();
        System.out.println(key);
        
        if(key!="") {
            cari_dataSiswa(key);
        }
        else {
            tampilkanSiswa();
        }
    }//GEN-LAST:event_txt_cariSiswaKeyReleased

    private void btn_prosesSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesSiswaActionPerformed
        // TODO add your handling code here:
        if (btn_prosesSiswa.getText()=="TAMBAH")
        {
            int jawab ;
        if(txt_alamatSiswa.getText().equals("") 
                || txt_kodeSiswa.getText().equals("") 
                || txt_namaSiswa.getText().equals("") 
                || txt_nisSiswa.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Ada Data Yang Belum Diisi", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
         }
        
        else if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Data Yang Dimasukan Sudah Benar?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
         try{
            String sql="insert into siswa values('"+txt_nisSiswa.getText()+"','"
            +txt_kodeSiswa.getText()+"','"
            +txt_namaSiswa.getText()+"','"
            +cb_jkSiswa.getSelectedItem()+"','"
            +txt_alamatSiswa.getText()+"','"
            +tglLahir+"','"
            +txt_pekerjaanOrtu.getText()+"')";
            java.sql.Connection conn=(java.sql.Connection)mainFrame.koneksi.koneksiDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampilkanSiswa();
                    panel_bawah.removeAll();
                    panel_bawah.repaint();
                    panel_bawah.revalidate();

                    panel_bawah.add(panel_viewSiswa);
                    panel_bawah.repaint();
                    panel_bawah.revalidate();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
            }
        }
        }
        else if (btn_prosesSiswa.getText()=="UPDATE")
        {
            int jawab ;
        if(txt_alamatSiswa.getText().equals("") 
            || txt_kodeSiswa.getText().equals("") 
            || txt_namaSiswa.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ada Data Yang Belum Diisi", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
         }
        else if((jawab = JOptionPane.showConfirmDialog(null, "Simpan Perubahan Data?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
         try{
            java.sql.Connection conn=(java.sql.Connection)mainFrame.koneksi.koneksiDB();
            String sql="update  siswa set kode_kelas='" + txt_kodeSiswa.getText()+
            "', nama_siswa='" + txt_namaSiswa.getText()+
            "', jk_siswa='"+cb_jkSiswa.getSelectedItem()+
            "', alamat_siswa='"+txt_alamatSiswa.getText()+
            "', ttl='"+tglLahir+
            "', pekerjaan_ortu='"+txt_pekerjaanOrtu.getText()+
            "' where nis='"+ txt_nisSiswa.getText()+"'";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data berhasil di Edit");
            tampilkanSiswa();
                    panel_bawah.removeAll();
                    panel_bawah.repaint();
                    panel_bawah.revalidate();

                    panel_bawah.add(panel_viewSiswa);
                    panel_bawah.repaint();
                    panel_bawah.revalidate();

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Proses Edit data Gagal");
            System.out.println(e.getMessage());
            }
        }
        }
    }//GEN-LAST:event_btn_prosesSiswaActionPerformed

    private void btn_resetSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetSiswaActionPerformed
        // TODO add your handling code here:
        if (btn_resetSiswa.getText()=="RESET")
        {
            reset();
        }
        else if (btn_resetSiswa.getText()=="RESET DATA")
        {
             int  i = tabelSiswa.getSelectedRow();
        if(i>-1)
            {
                txt_pilihSiswa.setText(model_siswa.getValueAt(i, 0).toString());
                txt_nisSiswa.setText(model_siswa.getValueAt(i, 0).toString());
                txt_kodeSiswa.setText(model_siswa.getValueAt(i, 1).toString());
                txt_namaSiswa.setText(model_siswa.getValueAt(i, 2).toString());
                txt_alamatSiswa.setText(model_siswa.getValueAt(i, 4).toString());
                txt_pekerjaanOrtu.setText(model_siswa.getValueAt(i, 6).toString());
            }
        }
    }//GEN-LAST:event_btn_resetSiswaActionPerformed

    private void txt_ttlSiswaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_ttlSiswaPropertyChange
        // TODO add your handling code here:
        if (txt_ttlSiswa.getDate()!=null){
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            tglLahir=format.format (txt_ttlSiswa.getDate());
        }
    }//GEN-LAST:event_txt_ttlSiswaPropertyChange

    private void txt_nisSiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nisSiswaKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_txt_nisSiswaKeyTyped

    private void txt_namaSiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_namaSiswaKeyTyped
        // TODO add your handling code here:
        FilterHuruf(evt);
    }//GEN-LAST:event_txt_namaSiswaKeyTyped

    private void reset()
    {
        txt_alamatSiswa.setText("");
        txt_cariSiswa.setText("");
        txt_kodeSiswa.setText("");
        txt_namaSiswa.setText("");
        txt_nisSiswa.setText("");
        txt_pilihSiswa.setText("");
    }
    private void cari_dataSiswa(String key)
    {
       try {
            // TODO add your handling code here:
        String [] judul ={"NIS","Kode Kelas","Nama Siswa","Jenis Kelamin","Alamat Siswa","Tanggal Lahir","Pekerjaan Orangtua"};
        model_siswa = new DefaultTableModel(judul,0);
        tabelSiswa.setModel(model_siswa);
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement();
            model_siswa.getDataVector().removeAllElements();
            
            
        ResultSet rs = cn.createStatement().executeQuery ("select * from siswa where nis LIKE '%"+key+"%' OR nama_siswa LIKE '%"+key+"%'");
        while (rs.next())
        {
            String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)};            
            model_siswa.addRow(data);
        }  
        } catch (SQLException ex) {
            Logger.getLogger(formSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void FilterHuruf(KeyEvent a){
       if(Character.isDigit(a.getKeyChar())){
           a.consume();
           JOptionPane.showMessageDialog(null, "Data Hanya Bisa Berisi Huruf!", "Peringatan!!!", JOptionPane.WARNING_MESSAGE);
       }
   }
    public void FilterAngka(KeyEvent a){
       if(Character.isAlphabetic(a.getKeyChar())){
           a.consume();
           JOptionPane.showMessageDialog(null, "Data Hanya Bisa Berisi Angka!", "Peringatan!!!", JOptionPane.WARNING_MESSAGE);
       }
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editSiswa;
    private javax.swing.JButton btn_hapusSiswa;
    private javax.swing.JButton btn_prosesSiswa;
    private javax.swing.JButton btn_resetSiswa;
    private javax.swing.JLabel btn_tambahSiswa;
    private javax.swing.JLabel btn_viewSiswa;
    private javax.swing.JComboBox<String> cb_jkSiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelSiswa;
    private javax.swing.JPanel panel_bawah;
    private javax.swing.JPanel panel_prosesSiswa;
    private javax.swing.JPanel panel_viewSiswa;
    private javax.swing.JTable tabelSiswa;
    private javax.swing.JTextField txt_alamatSiswa;
    private javax.swing.JTextField txt_cariSiswa;
    private javax.swing.JTextField txt_kodeSiswa;
    private javax.swing.JTextField txt_namaSiswa;
    private javax.swing.JTextField txt_nisSiswa;
    private javax.swing.JTextField txt_pekerjaanOrtu;
    private javax.swing.JTextField txt_pilihSiswa;
    private com.toedter.calendar.JDateChooser txt_ttlSiswa;
    // End of variables declaration//GEN-END:variables
private void tampilkanSiswa() {

        int row = tabelSiswa.getRowCount();
        for (int i=0; i<row;i++)
        {
            model_siswa.removeRow(0);
        }
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            ResultSet rs = cn.createStatement().executeQuery ("Select * from siswa");
        while (rs.next())
        {
            String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)};            
            model_siswa.addRow(data);
        }  
        } catch (SQLException ex) {
            Logger.getLogger(formSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
