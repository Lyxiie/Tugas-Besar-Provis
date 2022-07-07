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
public class formNilai extends javax.swing.JInternalFrame {

    DefaultTableModel model_nilai;
    public formNilai() {
        initComponents();
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dm.width/2-this.getSize().width/2, dm.height/2-this.getSize().height/2);
        
        String [] judul ={"ID Nilai","NIS","Kode_Pelajaran","Tugas","UTS","UAS"};
        model_nilai = new DefaultTableModel(judul,0);
        tabelNilai.setModel(model_nilai);
        tampilkanNilai();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNilai = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_viewNilai = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_tambahNilai = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        panel_bawah = new javax.swing.JPanel();
        panel_viewNilai = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_editNilai = new javax.swing.JButton();
        btn_hapusNilai = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelNilai = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_cariNilai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pilihNilai = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_prosesNilai = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tugas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_idNilai = new javax.swing.JTextField();
        txt_nisNilai = new javax.swing.JTextField();
        txt_kodeNilai = new javax.swing.JTextField();
        txt_utsNilai = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btn_prosesNilai = new javax.swing.JButton();
        btn_resetNilai = new javax.swing.JButton();
        txt_tugasNilai = new javax.swing.JTextField();
        txt_uasNilai = new javax.swing.JTextField();

        panelNilai.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(154, 68));

        btn_viewNilai.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btn_viewNilai.setForeground(new java.awt.Color(255, 255, 255));
        btn_viewNilai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_viewNilai.setText("VIEW DATA");
        btn_viewNilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewNilaiMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_search_50px_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_viewNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_viewNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setPreferredSize(new java.awt.Dimension(157, 68));

        btn_tambahNilai.setBackground(new java.awt.Color(102, 102, 102));
        btn_tambahNilai.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btn_tambahNilai.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambahNilai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_tambahNilai.setText("TAMBAH DATA");
        btn_tambahNilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahNilaiMouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_add_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_tambahNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_tambahNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
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
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel75)
                        .addGap(27, 27, 27))))
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        panel_viewNilai.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btn_editNilai.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_editNilai.setText("EDIT");
        btn_editNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editNilaiActionPerformed(evt);
            }
        });

        btn_hapusNilai.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_hapusNilai.setText("HAPUS");
        btn_hapusNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusNilaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_editNilai)
                .addGap(18, 18, 18)
                .addComponent(btn_hapusNilai)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hapusNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabelNilai.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelNilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelNilaiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelNilai);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("PENCARIAN DATA  :");

        txt_cariNilai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariNilaiKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DATA YANG DIPILIH : ");

        txt_pilihNilai.setEditable(false);
        txt_pilihNilai.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DATA NILAI");

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

        javax.swing.GroupLayout panel_viewNilaiLayout = new javax.swing.GroupLayout(panel_viewNilai);
        panel_viewNilai.setLayout(panel_viewNilaiLayout);
        panel_viewNilaiLayout.setHorizontalGroup(
            panel_viewNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_viewNilaiLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panel_viewNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewNilaiLayout.createSequentialGroup()
                        .addGroup(panel_viewNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_viewNilaiLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cariNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewNilaiLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(panel_viewNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewNilaiLayout.createSequentialGroup()
                                .addComponent(txt_pilihNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))))
            .addGroup(panel_viewNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewNilaiLayout.createSequentialGroup()
                    .addContainerGap(532, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        panel_viewNilaiLayout.setVerticalGroup(
            panel_viewNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_viewNilaiLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(panel_viewNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cariNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(panel_viewNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_pilihNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_viewNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_viewNilaiLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(437, Short.MAX_VALUE)))
        );

        panel_bawah.add(panel_viewNilai, "card2");

        panel_prosesNilai.setBackground(new java.awt.Color(204, 204, 204));
        panel_prosesNilai.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel4.setText("ID Nilai :");

        jLabel5.setText("NIS :");

        jLabel6.setText("Kode Pelajaran :");

        Tugas.setText("Tugas :");

        jLabel8.setText("UTS :");

        jLabel9.setText("UAS :");

        txt_idNilai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idNilaiKeyTyped(evt);
            }
        });

        txt_nisNilai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nisNilaiKeyTyped(evt);
            }
        });

        txt_kodeNilai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_kodeNilaiKeyTyped(evt);
            }
        });

        txt_utsNilai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_utsNilaiKeyTyped(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        btn_prosesNilai.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_prosesNilai.setText("PROSES");
        btn_prosesNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesNilaiActionPerformed(evt);
            }
        });

        btn_resetNilai.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_resetNilai.setText("RESET");
        btn_resetNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetNilaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_prosesNilai)
                .addGap(18, 18, 18)
                .addComponent(btn_resetNilai)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prosesNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_resetNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txt_tugasNilai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tugasNilaiKeyTyped(evt);
            }
        });

        txt_uasNilai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_uasNilaiKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel_prosesNilaiLayout = new javax.swing.GroupLayout(panel_prosesNilai);
        panel_prosesNilai.setLayout(panel_prosesNilaiLayout);
        panel_prosesNilaiLayout.setHorizontalGroup(
            panel_prosesNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prosesNilaiLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(panel_prosesNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(Tugas)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_idNilai)
                    .addComponent(txt_nisNilai)
                    .addComponent(txt_kodeNilai)
                    .addComponent(txt_utsNilai, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txt_tugasNilai)
                    .addComponent(txt_uasNilai))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_prosesNilaiLayout.createSequentialGroup()
                .addGap(0, 344, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_prosesNilaiLayout.setVerticalGroup(
            panel_prosesNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prosesNilaiLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(panel_prosesNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_idNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_nisNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_kodeNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tugas)
                    .addComponent(txt_tugasNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_utsNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_uasNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        panel_bawah.add(panel_prosesNilai, "card3");

        javax.swing.GroupLayout panelNilaiLayout = new javax.swing.GroupLayout(panelNilai);
        panelNilai.setLayout(panelNilaiLayout);
        panelNilaiLayout.setHorizontalGroup(
            panelNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNilaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panel_bawah, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelNilaiLayout.setVerticalGroup(
            panelNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNilaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_bawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewNilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewNilaiMouseClicked
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_viewNilai);
        panel_bawah.repaint();
        panel_bawah.revalidate();
    }//GEN-LAST:event_btn_viewNilaiMouseClicked

    private void btn_tambahNilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahNilaiMouseClicked
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_prosesNilai);
        panel_bawah.repaint();
        panel_bawah.revalidate();
        btn_prosesNilai.setText("TAMBAH");
        btn_resetNilai.setText("RESET");
        txt_idNilai.setEditable(true);
        reset();
    }//GEN-LAST:event_btn_tambahNilaiMouseClicked

    private void btn_editNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editNilaiActionPerformed
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_prosesNilai);
        panel_bawah.repaint();
        panel_bawah.revalidate();
        btn_prosesNilai.setText("UPDATE");
        btn_resetNilai.setText("RESET DATA");
        txt_idNilai.setEditable(false);
    }//GEN-LAST:event_btn_editNilaiActionPerformed

    private void btn_hapusNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusNilaiActionPerformed
        // TODO add your handling code here:
       int jawab ;
        if(txt_pilihNilai.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Data Terlebih Dahulu!", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
        }else
        if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Menghapus Data?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
         try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement().executeUpdate("Delete from nilai where id_nilai ='"+txt_pilihNilai.getText()+"'");
            tampilkanNilai();
        } catch (SQLException ex) {
            Logger.getLogger(formNilai.class.getName()).log(Level.SEVERE, null, ex);
             
            }
        }
        reset();
    }//GEN-LAST:event_btn_hapusNilaiActionPerformed

    private void tabelNilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelNilaiMouseClicked
       int  i = tabelNilai.getSelectedRow();
        if(i>-1)
        {
            txt_pilihNilai.setText(model_nilai.getValueAt(i, 0).toString());
            txt_idNilai.setText(model_nilai.getValueAt(i, 0).toString());
            txt_nisNilai.setText(model_nilai.getValueAt(i, 1).toString());
            txt_kodeNilai.setText(model_nilai.getValueAt(i, 2).toString());
            txt_tugasNilai.setText(model_nilai.getValueAt(i, 3).toString());
            txt_utsNilai.setText(model_nilai.getValueAt(i, 4).toString());
            txt_uasNilai.setText(model_nilai.getValueAt(i, 5).toString());
        }
    }//GEN-LAST:event_tabelNilaiMouseClicked

    private void txt_cariNilaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariNilaiKeyReleased
        // TODO add your handling code here:
        String key = txt_cariNilai.getText();
        System.out.println(key);

        if(key!="") {
            cari_dataNilai(key);
        }
        else {
            tampilkanNilai();
        }
    }//GEN-LAST:event_txt_cariNilaiKeyReleased

    private void btn_prosesNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesNilaiActionPerformed
        // TODO add your handling code here:
        if (btn_prosesNilai.getText()=="TAMBAH")
        {
            int jawab ;
            if(txt_idNilai.getText().equals("") || txt_nisNilai.getText().equals("") 
                                                || txt_kodeNilai.getText().equals("") 
                                                || txt_tugasNilai.getText().equals("") 
                                                || txt_utsNilai.getText().equals("") 
                                                || txt_uasNilai.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ada Data Yang Belum Diisi", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
             }
            else if (Double.valueOf(txt_tugasNilai.getText()) < 0.0 || Double.valueOf(txt_tugasNilai.getText()) > 100.0 
                                                                    || Double.valueOf(txt_utsNilai.getText()) < 0.0 
                                                                    || Double.valueOf(txt_utsNilai.getText()) > 100.0 
                                                                    || Double.valueOf(txt_uasNilai.getText()) < 0.0 
                                                                    || Double.valueOf(txt_uasNilai.getText()) > 100.0) 
            {
                JOptionPane.showMessageDialog(null, "Nilai Yang Dimasukan Tidak Valid", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            }       
            else if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Data Yang Dimasukan Sudah Benar?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
            try {
                // TODO add your handling code here:
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
                cn.createStatement().executeUpdate("insert into nilai values"+"('"+Double.valueOf(txt_idNilai.getText())+"','"+txt_nisNilai.getText()+"','"+txt_kodeNilai.getText()+"','"+Double.valueOf(txt_tugasNilai.getText())+"','"+Double.valueOf(txt_utsNilai.getText())+"','"+Double.valueOf(txt_uasNilai.getText())+"')");
                tampilkanNilai();
                        panel_bawah.removeAll();
                        panel_bawah.repaint();
                        panel_bawah.revalidate();

                        panel_bawah.add(panel_viewNilai);
                        panel_bawah.repaint();
                        panel_bawah.revalidate();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ada data yang belum diisi");

                }
            }
            }
        else if (btn_prosesNilai.getText()=="UPDATE")
        {
        int jawab ;
        if(txt_idNilai.getText().equals("") || txt_nisNilai.getText().equals("") 
                                            || txt_kodeNilai.getText().equals("") 
                                            || txt_tugasNilai.getText().equals("") 
                                            || txt_utsNilai.getText().equals("") 
                                            || txt_uasNilai.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ada Data Yang Belum Diisi", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
         }
        else if (Double.valueOf(txt_tugasNilai.getText()) < 0.0 || Double.valueOf(txt_tugasNilai.getText()) > 100.0 
                                                                || Double.valueOf(txt_utsNilai.getText()) < 0.0 
                                                                || Double.valueOf(txt_utsNilai.getText()) > 100.0 
                                                                || Double.valueOf(txt_uasNilai.getText()) < 0.0 
                                                                || Double.valueOf(txt_uasNilai.getText()) > 100.0) 
        {
            JOptionPane.showMessageDialog(null, "Nilai Yang Dimasukan Tidak Valid", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }
        else if((jawab = JOptionPane.showConfirmDialog(null, "Simpan Perubahan Data?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0)
        {
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement().executeUpdate("update nilai set nis='"+txt_nisNilai.getText()
                    +"', kode_pelajaran='"+txt_kodeNilai.getText()+"', tugas='"
                    + Double.valueOf(txt_tugasNilai.getText())+"', uts='"
                    + Double.valueOf(txt_utsNilai.getText())+"', uas='"
                    + Double.valueOf(txt_uasNilai.getText())+"'where id_nilai ='"
                    +txt_idNilai.getText()+"'");
            tampilkanNilai();
                    panel_bawah.removeAll();
                    panel_bawah.repaint();
                    panel_bawah.revalidate();

                    panel_bawah.add(panel_viewNilai);
                    panel_bawah.repaint();
                    panel_bawah.revalidate();
        } catch (SQLException ex) {
            Logger.getLogger(formNilai.class.getName()).log(Level.SEVERE, null, ex);
             
            }
        }
    }//GEN-LAST:event_btn_prosesNilaiActionPerformed
}
    private void btn_resetNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetNilaiActionPerformed
        // TODO add your handling code here:
        if (btn_resetNilai.getText()=="RESET")
        {
            reset();
        }
        else if (btn_resetNilai.getText()=="RESET DATA")
        {
            int  i = tabelNilai.getSelectedRow();
        if(i>-1)
        {
            txt_pilihNilai.setText(model_nilai.getValueAt(i, 0).toString());
            txt_idNilai.setText(model_nilai.getValueAt(i, 0).toString());
            txt_nisNilai.setText(model_nilai.getValueAt(i, 1).toString());
            txt_kodeNilai.setText(model_nilai.getValueAt(i, 2).toString());
            txt_tugasNilai.setText(model_nilai.getValueAt(i, 3).toString());
            txt_utsNilai.setText(model_nilai.getValueAt(i, 4).toString());
            txt_uasNilai.setText(model_nilai.getValueAt(i, 5).toString());
        }
        }
    }//GEN-LAST:event_btn_resetNilaiActionPerformed

    private void txt_idNilaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idNilaiKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_txt_idNilaiKeyTyped

    private void txt_nisNilaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nisNilaiKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_txt_nisNilaiKeyTyped

    private void txt_kodeNilaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kodeNilaiKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_txt_kodeNilaiKeyTyped

    private void txt_tugasNilaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tugasNilaiKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_txt_tugasNilaiKeyTyped

    private void txt_utsNilaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_utsNilaiKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_txt_utsNilaiKeyTyped

    private void txt_uasNilaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_uasNilaiKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_txt_uasNilaiKeyTyped

    private void reset()
    {
        txt_cariNilai.setText("");
        txt_idNilai.setText("");
        txt_kodeNilai.setText("");
        txt_nisNilai.setText("");
        txt_pilihNilai.setText("");
        txt_tugasNilai.setText("");
        txt_uasNilai.setText("");
        txt_utsNilai.setText("");
        
    }
private void cari_dataNilai(String key)
    {
       try {
            // TODO add your handling code here:
        String [] judul ={"ID Nilai","NIS","Kode_Pelajaran","Tugas","UTS","UAS"};
        model_nilai = new DefaultTableModel(judul,0);
        tabelNilai.setModel(model_nilai);
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement();
            model_nilai.getDataVector().removeAllElements();
            
            
        ResultSet rs = cn.createStatement().executeQuery ("select * from nilai where id_nilai LIKE '%"+key+"%' OR nis LIKE '%"+key+"%'");
        while (rs.next())
        {
            String data [] = {String.valueOf(rs.getInt(1)),rs.getString(2),rs.getString(3),String.valueOf(rs.getInt(4)),String.valueOf(rs.getInt(5)),String.valueOf(rs.getInt(6))};
            model_nilai.addRow(data);
        }  
        } catch (SQLException ex) {
            Logger.getLogger(formNilai.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel Tugas;
    private javax.swing.JButton btn_editNilai;
    private javax.swing.JButton btn_hapusNilai;
    private javax.swing.JButton btn_prosesNilai;
    private javax.swing.JButton btn_resetNilai;
    private javax.swing.JLabel btn_tambahNilai;
    private javax.swing.JLabel btn_viewNilai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel panelNilai;
    private javax.swing.JPanel panel_bawah;
    private javax.swing.JPanel panel_prosesNilai;
    private javax.swing.JPanel panel_viewNilai;
    private javax.swing.JTable tabelNilai;
    private javax.swing.JTextField txt_cariNilai;
    private javax.swing.JTextField txt_idNilai;
    private javax.swing.JTextField txt_kodeNilai;
    private javax.swing.JTextField txt_nisNilai;
    private javax.swing.JTextField txt_pilihNilai;
    private javax.swing.JTextField txt_tugasNilai;
    private javax.swing.JTextField txt_uasNilai;
    private javax.swing.JTextField txt_utsNilai;
    // End of variables declaration//GEN-END:variables

private void tampilkanNilai() {

        int row = tabelNilai.getRowCount();
        for (int i=0; i<row;i++)
        {
            model_nilai.removeRow(0);
        }
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            ResultSet rs = cn.createStatement().executeQuery ("Select * from nilai");
        while (rs.next())
        {
            String data [] = {String.valueOf(rs.getInt(1)),rs.getString(2),rs.getString(3),String.valueOf(rs.getInt(4)),String.valueOf(rs.getInt(5)),String.valueOf(rs.getInt(6))};
            model_nilai.addRow(data);
        }  
        } catch (SQLException ex) {
            Logger.getLogger(formNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
