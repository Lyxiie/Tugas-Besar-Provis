package formSekolah;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class formGuru extends javax.swing.JInternalFrame {

    DefaultTableModel tabModel;
    public formGuru() {
        initComponents();
        
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dm.width/2-this.getSize().width/2, dm.height/2-this.getSize().height/2);
        
        Object[] judul = {"NIP", "Kode Pelajaran", "Nama Guru", "Jenis Kelamin", "Alamat Guru","Status"};        
        tabModel = new DefaultTableModel(judul, 0);
        tableGuru.setModel(tabModel);
        tampilkanGuru();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGuru = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_viewGuru = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_tambahGuru = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel_bawah = new javax.swing.JPanel();
        panel_viewGuru = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_editGuru = new javax.swing.JButton();
        btn_hapusGuru = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGuru = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_cariGuru = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pilihGuru = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_prosesGuru = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb_jkGuru = new javax.swing.JComboBox<>();
        cb_statusGuru = new javax.swing.JComboBox<>();
        txt_nipGuru = new javax.swing.JTextField();
        txt_kodeGuru = new javax.swing.JTextField();
        txt_namaGuru = new javax.swing.JTextField();
        txt_alamatGuru = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btn_prosesGuru = new javax.swing.JButton();
        btn_resetGuru = new javax.swing.JButton();

        panelGuru.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(160, 68));

        btn_viewGuru.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btn_viewGuru.setForeground(new java.awt.Color(255, 255, 255));
        btn_viewGuru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_viewGuru.setText("VIEW DATA");
        btn_viewGuru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewGuruMouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_search_50px_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(btn_viewGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_viewGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setPreferredSize(new java.awt.Dimension(121, 68));

        btn_tambahGuru.setBackground(new java.awt.Color(102, 102, 102));
        btn_tambahGuru.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btn_tambahGuru.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambahGuru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_tambahGuru.setText("TAMBAH DATA");
        btn_tambahGuru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahGuruMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_add_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tambahGuru))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_tambahGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jLabel75.setBackground(new java.awt.Color(102, 102, 102));
        jLabel75.setForeground(new java.awt.Color(102, 102, 102));
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_school_100px.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SMAN 100 BANDUNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel75)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel75)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_bawah.setLayout(new java.awt.CardLayout());

        panel_viewGuru.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btn_editGuru.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_editGuru.setText("EDIT");
        btn_editGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editGuruActionPerformed(evt);
            }
        });

        btn_hapusGuru.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_hapusGuru.setText("HAPUS");
        btn_hapusGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusGuruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_editGuru)
                .addGap(18, 18, 18)
                .addComponent(btn_hapusGuru)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hapusGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tableGuru.setModel(new javax.swing.table.DefaultTableModel(
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
        tableGuru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGuruMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableGuru);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("PENCARIAN DATA  :");

        txt_cariGuru.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariGuruKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DATA YANG DIPILIH : ");

        txt_pilihGuru.setEditable(false);
        txt_pilihGuru.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DATA GURU");

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

        javax.swing.GroupLayout panel_viewGuruLayout = new javax.swing.GroupLayout(panel_viewGuru);
        panel_viewGuru.setLayout(panel_viewGuruLayout);
        panel_viewGuruLayout.setHorizontalGroup(
            panel_viewGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_viewGuruLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panel_viewGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewGuruLayout.createSequentialGroup()
                        .addGroup(panel_viewGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_viewGuruLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cariGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewGuruLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(panel_viewGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewGuruLayout.createSequentialGroup()
                                .addComponent(txt_pilihGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))))
            .addGroup(panel_viewGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewGuruLayout.createSequentialGroup()
                    .addContainerGap(532, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        panel_viewGuruLayout.setVerticalGroup(
            panel_viewGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_viewGuruLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(panel_viewGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cariGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(panel_viewGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_pilihGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(panel_viewGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_viewGuruLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(453, Short.MAX_VALUE)))
        );

        panel_bawah.add(panel_viewGuru, "card2");

        panel_prosesGuru.setBackground(new java.awt.Color(204, 204, 204));
        panel_prosesGuru.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel4.setText("NIP :");

        jLabel5.setText("Kode Pelajaran :");

        jLabel6.setText("Nama Guru :");

        jLabel7.setText("Jenis Kelamin :");

        jLabel8.setText("Alamat :");

        jLabel9.setText("Status :");

        cb_jkGuru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));

        cb_statusGuru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PNS", "Honorer" }));

        txt_nipGuru.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nipGuruKeyTyped(evt);
            }
        });

        txt_namaGuru.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_namaGuruKeyTyped(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        btn_prosesGuru.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_prosesGuru.setText("PROSES");
        btn_prosesGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesGuruActionPerformed(evt);
            }
        });

        btn_resetGuru.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_resetGuru.setText("RESET");
        btn_resetGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetGuruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_prosesGuru)
                .addGap(18, 18, 18)
                .addComponent(btn_resetGuru)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prosesGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_resetGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_prosesGuruLayout = new javax.swing.GroupLayout(panel_prosesGuru);
        panel_prosesGuru.setLayout(panel_prosesGuruLayout);
        panel_prosesGuruLayout.setHorizontalGroup(
            panel_prosesGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prosesGuruLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(panel_prosesGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_jkGuru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_statusGuru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nipGuru)
                    .addComponent(txt_kodeGuru)
                    .addComponent(txt_namaGuru)
                    .addComponent(txt_alamatGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_prosesGuruLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_prosesGuruLayout.setVerticalGroup(
            panel_prosesGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prosesGuruLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(panel_prosesGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nipGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_kodeGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_namaGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_jkGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_alamatGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_statusGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        panel_bawah.add(panel_prosesGuru, "card3");

        javax.swing.GroupLayout panelGuruLayout = new javax.swing.GroupLayout(panelGuru);
        panelGuru.setLayout(panelGuruLayout);
        panelGuruLayout.setHorizontalGroup(
            panelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panel_bawah, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelGuruLayout.setVerticalGroup(
            panelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuruLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_bawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewGuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewGuruMouseClicked
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_viewGuru);
        panel_bawah.repaint();
        panel_bawah.revalidate();
    }//GEN-LAST:event_btn_viewGuruMouseClicked

    private void btn_tambahGuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahGuruMouseClicked
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_prosesGuru);
        panel_bawah.repaint();
        panel_bawah.revalidate();
        btn_prosesGuru.setText("TAMBAH");
        btn_resetGuru.setText("RESET");
        txt_nipGuru.setEditable(true);
        reset();
    }//GEN-LAST:event_btn_tambahGuruMouseClicked

    private void btn_editGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editGuruActionPerformed
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_prosesGuru);
        panel_bawah.repaint();
        panel_bawah.revalidate();
        btn_prosesGuru.setText("UPDATE");
        btn_resetGuru.setText("RESET DATA");
        txt_nipGuru.setEditable(false);
    }//GEN-LAST:event_btn_editGuruActionPerformed

    private void btn_hapusGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusGuruActionPerformed
        // TODO add your handling code here:
        int jawab ;
        if(txt_pilihGuru.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Data Terlebih Dahulu!", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }else
        if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Menghapus Data?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
            try {
                // TODO add your handling code here:
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
                cn.createStatement().executeUpdate("Delete from guru where nip ='"+txt_pilihGuru.getText()+"'");
                tampilkanGuru();
            } catch (SQLException ex) {
                Logger.getLogger(formGuru.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_hapusGuruActionPerformed

    private void tableGuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGuruMouseClicked
        // TODO add your handling code here:
        
        txt_pilihGuru.setText(tableGuru.getValueAt(tableGuru.getSelectedRow(), 0).toString());
        txt_nipGuru.setText(tableGuru.getValueAt(tableGuru.getSelectedRow(), 0).toString());
        txt_kodeGuru.setText(tableGuru.getValueAt(tableGuru.getSelectedRow(), 1).toString());
        txt_namaGuru.setText(tableGuru.getValueAt(tableGuru.getSelectedRow(), 2).toString());
        cb_jkGuru.setSelectedItem(tableGuru.getValueAt(tableGuru.getSelectedRow(), 3).toString());
        txt_alamatGuru.setText(tableGuru.getValueAt(tableGuru.getSelectedRow(), 4).toString());
        cb_statusGuru.setSelectedItem(tableGuru.getValueAt(tableGuru.getSelectedRow(), 5).toString());
        
    }//GEN-LAST:event_tableGuruMouseClicked

    private void btn_prosesGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesGuruActionPerformed
        // TODO add your handling code here:
        if (btn_prosesGuru.getText()=="TAMBAH")
        {
            int jawab ;
            if(txt_alamatGuru.getText().equals("")
                || txt_kodeGuru.getText().equals("")
                || txt_namaGuru.getText().equals("")
                || txt_nipGuru.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ada Data Yang Belum Diisi", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            }
            else if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Data Yang Dimasukan Sudah Benar?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
                try{
                    String sql="INSERT INTO guru VALUES('"+txt_nipGuru.getText()+"','"
                    +txt_kodeGuru.getText()+"','"
                    +txt_namaGuru.getText()+"','"
                    +cb_jkGuru.getSelectedItem()+"','"
                    +txt_alamatGuru.getText()+"','"
                    +cb_statusGuru.getSelectedItem()+"')";

                    java.sql.Connection conn=(java.sql.Connection)mainFrame.koneksi.koneksiDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Berhasil disimpan");
                    tampilkanGuru();
                    panel_bawah.removeAll();
                    panel_bawah.repaint();
                    panel_bawah.revalidate();

                    panel_bawah.add(panel_viewGuru);
                    panel_bawah.repaint();
                    panel_bawah.revalidate();

                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Gagal disimpan");
                    System.out.println(e.getMessage());
                }
            }
        }
        else if (btn_prosesGuru.getText()=="UPDATE")
        {
            int jawab ;
            if(txt_alamatGuru.getText().equals("")
                || txt_kodeGuru.getText().equals("")
                || txt_namaGuru.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ada Data Yang Belum Diisi", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            }
            else if((jawab = JOptionPane.showConfirmDialog(null, "Simpan Perubahan Data?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
                try{
                    java.sql.Connection conn=(java.sql.Connection)mainFrame.koneksi.koneksiDB();
                    String sql="UPDATE guru SET "
                    +"kode_pelajaran='"+txt_kodeGuru.getText()+"',"
                    +"nama_guru='"+txt_namaGuru.getText()+"',"
                    +"jk_guru='"+cb_jkGuru.getSelectedItem()+"',"
                    +"alamat_guru='"+txt_alamatGuru.getText()+"',"
                    +"status='" +cb_statusGuru.getSelectedItem()+"' WHERE nip='"
                    + txt_nipGuru.getText()+"'";
                    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Data berhasil di Edit");
                    tampilkanGuru();
                    panel_bawah.removeAll();
                    panel_bawah.repaint();
                    panel_bawah.revalidate();

                    panel_bawah.add(panel_viewGuru);
                    panel_bawah.repaint();
                    panel_bawah.revalidate();

                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Proses Edit data Gagal");
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btn_prosesGuruActionPerformed

    private void btn_resetGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetGuruActionPerformed
        // TODO add your handling code here:
        if (btn_resetGuru.getText()=="RESET")
        {
            reset();
        }
        else if (btn_resetGuru.getText()=="RESET DATA")
        {
            txt_pilihGuru.setText(tableGuru.getValueAt(tableGuru.getSelectedRow(), 0).toString());
            txt_nipGuru.setText(tableGuru.getValueAt(tableGuru.getSelectedRow(), 0).toString());
            txt_kodeGuru.setText(tableGuru.getValueAt(tableGuru.getSelectedRow(), 1).toString());
            txt_namaGuru.setText(tableGuru.getValueAt(tableGuru.getSelectedRow(), 2).toString());
            cb_jkGuru.setSelectedItem(tableGuru.getValueAt(tableGuru.getSelectedRow(), 3).toString());
            txt_alamatGuru.setText(tableGuru.getValueAt(tableGuru.getSelectedRow(), 4).toString());
            cb_statusGuru.setSelectedItem(tableGuru.getValueAt(tableGuru.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_btn_resetGuruActionPerformed

    private void txt_cariGuruKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariGuruKeyReleased
        // TODO add your handling code here:
        String key = txt_cariGuru.getText();
        System.out.println(key);
        
        if(key!="") {
            cari_dataGuru(key);
        }
        else {
            tampilkanGuru();
        }
    }//GEN-LAST:event_txt_cariGuruKeyReleased

    private void txt_nipGuruKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nipGuruKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_txt_nipGuruKeyTyped

    private void txt_namaGuruKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_namaGuruKeyTyped
        // TODO add your handling code here:
        FilterHuruf(evt);
    }//GEN-LAST:event_txt_namaGuruKeyTyped

    private void reset()
    {
        txt_nipGuru.setText("");
        txt_alamatGuru.setText("");
        txt_kodeGuru.setText("");
        txt_namaGuru.setText("");
    }

    private void cari_dataGuru(String key)
    {
       try {
            // TODO add your handling code here:
        Object[] judul = {"nip", "kode pelajaran", "nama guru", "jenis kelamin", "alamat guru","status"};        
        tabModel = new DefaultTableModel(judul,0);
        tableGuru.setModel(tabModel);
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement();
            tabModel.getDataVector().removeAllElements();
            
            
        ResultSet rs = cn.createStatement().executeQuery ("select * from guru where nip LIKE '%"+key+"%' OR nama_guru LIKE '%"+key+"%'");
        while (rs.next())
        {
            Object[] data = {
                    rs.getString("nip"),
                    rs.getString("kode_pelajaran"),
                    rs.getString("nama_guru"),
                    rs.getString("jk_guru"),
                    rs.getString("alamat_guru"),
                    rs.getString("status"),
                };            
            tabModel.addRow(data);
        }  
        } catch (SQLException ex) {
            Logger.getLogger(formGuru.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton btn_editGuru;
    private javax.swing.JButton btn_hapusGuru;
    private javax.swing.JButton btn_prosesGuru;
    private javax.swing.JButton btn_resetGuru;
    private javax.swing.JLabel btn_tambahGuru;
    private javax.swing.JLabel btn_viewGuru;
    private javax.swing.JComboBox<String> cb_jkGuru;
    private javax.swing.JComboBox<String> cb_statusGuru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel panelGuru;
    private javax.swing.JPanel panel_bawah;
    private javax.swing.JPanel panel_prosesGuru;
    private javax.swing.JPanel panel_viewGuru;
    private javax.swing.JTable tableGuru;
    private javax.swing.JTextField txt_alamatGuru;
    private javax.swing.JTextField txt_cariGuru;
    private javax.swing.JTextField txt_kodeGuru;
    private javax.swing.JTextField txt_namaGuru;
    private javax.swing.JTextField txt_nipGuru;
    private javax.swing.JTextField txt_pilihGuru;
    // End of variables declaration//GEN-END:variables
private void tampilkanGuru() {
        int row = tableGuru.getRowCount();
        for (int i=0; i<row;i++)
        {
            tabModel.removeRow(0);
        }
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            ResultSet rs = cn.createStatement().executeQuery ("Select * from guru");
        while (rs.next())
        {
                Object[] data = {
                    rs.getString("nip"),
                    rs.getString("kode_pelajaran"),
                    rs.getString("nama_guru"),
                    rs.getString("jk_guru"),
                    rs.getString("alamat_guru"),
                    rs.getString("status"),
                };            
                tabModel.addRow(data);
        }  
        } catch (SQLException ex) {
            Logger.getLogger(formGuru.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

