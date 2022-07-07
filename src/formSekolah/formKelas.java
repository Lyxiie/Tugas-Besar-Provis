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
public class formKelas extends javax.swing.JInternalFrame {

    DefaultTableModel model_kelas;
    public formKelas() {
        initComponents();
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dm.width/2-this.getSize().width/2, dm.height/2-this.getSize().height/2);
        
        String [] judul ={"Kode_Kelas","Jurusan"};
        model_kelas = new DefaultTableModel(judul,0);
        tabelKelas.setModel(model_kelas);
        tampilkanKelas();      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelKelas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_viewKelas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_tambahKelas = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        panel_bawah = new javax.swing.JPanel();
        panel_viewKelas = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_editKelas = new javax.swing.JButton();
        btn_hapusKelas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelKelas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_cariKelas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pilihKelas = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_prosesKelas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_kodeKelas = new javax.swing.JTextField();
        txt_jurusanKelas = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btn_prosesKelas = new javax.swing.JButton();
        btn_resetKelas = new javax.swing.JButton();

        panelKelas.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        btn_viewKelas.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btn_viewKelas.setForeground(new java.awt.Color(255, 255, 255));
        btn_viewKelas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_viewKelas.setText("VIEW DATA");
        btn_viewKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewKelasMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_search_50px_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(btn_viewKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_viewKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setPreferredSize(new java.awt.Dimension(160, 68));

        btn_tambahKelas.setBackground(new java.awt.Color(102, 102, 102));
        btn_tambahKelas.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btn_tambahKelas.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambahKelas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_tambahKelas.setText("TAMBAH DATA");
        btn_tambahKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahKelasMouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_add_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tambahKelas))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
            .addComponent(btn_tambahKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel75)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
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

        panel_viewKelas.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btn_editKelas.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_editKelas.setText("EDIT");
        btn_editKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editKelasActionPerformed(evt);
            }
        });

        btn_hapusKelas.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_hapusKelas.setText("HAPUS");
        btn_hapusKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusKelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_editKelas)
                .addGap(18, 18, 18)
                .addComponent(btn_hapusKelas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hapusKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabelKelas.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKelasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelKelas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("PENCARIAN DATA  :");

        txt_cariKelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariKelasKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DATA YANG DIPILIH : ");

        txt_pilihKelas.setEditable(false);
        txt_pilihKelas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DATA KELAS");

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

        javax.swing.GroupLayout panel_viewKelasLayout = new javax.swing.GroupLayout(panel_viewKelas);
        panel_viewKelas.setLayout(panel_viewKelasLayout);
        panel_viewKelasLayout.setHorizontalGroup(
            panel_viewKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_viewKelasLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panel_viewKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewKelasLayout.createSequentialGroup()
                        .addGroup(panel_viewKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_viewKelasLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cariKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewKelasLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(panel_viewKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewKelasLayout.createSequentialGroup()
                                .addComponent(txt_pilihKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))))
            .addGroup(panel_viewKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewKelasLayout.createSequentialGroup()
                    .addContainerGap(532, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        panel_viewKelasLayout.setVerticalGroup(
            panel_viewKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_viewKelasLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(panel_viewKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cariKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(panel_viewKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_pilihKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_viewKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_viewKelasLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(441, Short.MAX_VALUE)))
        );

        panel_bawah.add(panel_viewKelas, "card2");

        panel_prosesKelas.setBackground(new java.awt.Color(204, 204, 204));
        panel_prosesKelas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel4.setText("Kode Kelas :");

        jLabel5.setText("Jurusan :");

        txt_jurusanKelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_jurusanKelasKeyTyped(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        btn_prosesKelas.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_prosesKelas.setText("PROSES");
        btn_prosesKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesKelasActionPerformed(evt);
            }
        });

        btn_resetKelas.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_resetKelas.setText("RESET");
        btn_resetKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetKelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_prosesKelas)
                .addGap(18, 18, 18)
                .addComponent(btn_resetKelas)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prosesKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_resetKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_prosesKelasLayout = new javax.swing.GroupLayout(panel_prosesKelas);
        panel_prosesKelas.setLayout(panel_prosesKelasLayout);
        panel_prosesKelasLayout.setHorizontalGroup(
            panel_prosesKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prosesKelasLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(panel_prosesKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_kodeKelas, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txt_jurusanKelas))
                .addContainerGap(341, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_prosesKelasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_prosesKelasLayout.setVerticalGroup(
            panel_prosesKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prosesKelasLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(panel_prosesKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_kodeKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_jurusanKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        panel_bawah.add(panel_prosesKelas, "card3");

        javax.swing.GroupLayout panelKelasLayout = new javax.swing.GroupLayout(panelKelas);
        panelKelas.setLayout(panelKelasLayout);
        panelKelasLayout.setHorizontalGroup(
            panelKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKelasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panel_bawah, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelKelasLayout.setVerticalGroup(
            panelKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKelasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_bawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewKelasMouseClicked
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_viewKelas);
        panel_bawah.repaint();
        panel_bawah.revalidate();
    }//GEN-LAST:event_btn_viewKelasMouseClicked

    private void btn_tambahKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahKelasMouseClicked
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_prosesKelas);
        panel_bawah.repaint();
        panel_bawah.revalidate();
        btn_prosesKelas.setText("TAMBAH");
        btn_resetKelas.setText("RESET");
        txt_kodeKelas.setEditable(true);
        reset();
    }//GEN-LAST:event_btn_tambahKelasMouseClicked

    private void btn_editKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editKelasActionPerformed
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_prosesKelas);
        panel_bawah.repaint();
        panel_bawah.revalidate();
        btn_prosesKelas.setText("UPDATE");
        btn_resetKelas.setText("RESET DATA");
        txt_kodeKelas.setEditable(false);
    }//GEN-LAST:event_btn_editKelasActionPerformed

    private void btn_hapusKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusKelasActionPerformed
        // TODO add your handling code here:
        int jawab ;
        if(txt_pilihKelas.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Data Terlebih Dahulu!", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
        }else
        if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Menghapus Data?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
        try {
            // TODO add your handling code here:
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement().executeUpdate("Delete from kelas where kode_kelas ='"+txt_pilihKelas.getText()+"'");
            tampilkanKelas();
        } catch (SQLException ex) {
             Logger.getLogger(formKelas.class.getName()).log(Level.SEVERE, null, ex);           
        }
        }
    }//GEN-LAST:event_btn_hapusKelasActionPerformed

    private void tabelKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKelasMouseClicked
        // TODO add your handling code here:
       int i = tabelKelas.getSelectedRow();
        if(i>-1){
            txt_pilihKelas.setText(model_kelas.getValueAt(i, 0).toString());
            txt_kodeKelas.setText(model_kelas.getValueAt(i, 0).toString());
            txt_jurusanKelas.setText(model_kelas.getValueAt(i, 1).toString());
        }
    }//GEN-LAST:event_tabelKelasMouseClicked

    private void txt_cariKelasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKelasKeyReleased
        // TODO add your handling code here:
        String key = txt_cariKelas.getText();
        System.out.println(key);
        
        if(key!="") {
            cari_dataKelas(key);
        }
        else {
            tampilkanKelas();
        }
    }//GEN-LAST:event_txt_cariKelasKeyReleased

    private void btn_prosesKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesKelasActionPerformed
        // TODO add your handling code here:
        if (btn_prosesKelas.getText()=="TAMBAH")
        {
            int jawab;
        if(txt_kodeKelas.getText().equals("") || txt_jurusanKelas.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ada Data Yang Belum Diisi", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
         }
        else if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Data Yang Dimasukan Sudah Benar?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
        try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement().executeUpdate("insert into kelas values"+"('"+txt_kodeKelas.getText()+"','"+txt_jurusanKelas.getText()+"')");
            tampilkanKelas();
                    panel_bawah.removeAll();
                    panel_bawah.repaint();
                    panel_bawah.revalidate();

                    panel_bawah.add(panel_viewKelas);
                    panel_bawah.repaint();
                    panel_bawah.revalidate();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Ada yang belim di isi !");
            }
        }
        }
        else if (btn_prosesKelas.getText()=="UPDATE")
        {
            int jawab ;
        if(txt_jurusanKelas.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ada Data Yang Belum Diisi", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
         }
        else if((jawab = JOptionPane.showConfirmDialog(null, "Simpan Perubahan Data?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement().executeUpdate("update kelas set jurusan ='"+txt_jurusanKelas.getText()+"' where kode_kelas ='"+txt_pilihKelas.getText()+"'");
            tampilkanKelas();
            panel_bawah.removeAll();
                    panel_bawah.repaint();
                    panel_bawah.revalidate();

                    panel_bawah.add(panel_viewKelas);
                    panel_bawah.repaint();
                    panel_bawah.revalidate();
        } catch (SQLException ex) {
            Logger.getLogger(formKelas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }//GEN-LAST:event_btn_prosesKelasActionPerformed

    private void btn_resetKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetKelasActionPerformed
        // TODO add your handling code here:
        if (btn_resetKelas.getText()=="RESET")
        {
            reset();
        }
        else if (btn_resetKelas.getText()=="RESET DATA")
        {
            int  i = tabelKelas.getSelectedRow();
            if(i>-1)
            {
                txt_pilihKelas.setText(model_kelas.getValueAt(i, 0).toString());
                txt_kodeKelas.setText(model_kelas.getValueAt(i, 0).toString());
                txt_jurusanKelas.setText(model_kelas.getValueAt(i, 1).toString());
            }
        }
    }//GEN-LAST:event_btn_resetKelasActionPerformed

    private void txt_jurusanKelasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jurusanKelasKeyTyped
        // TODO add your handling code here:
        FilterHuruf(evt);
    }//GEN-LAST:event_txt_jurusanKelasKeyTyped

    private void reset()
    {
        txt_jurusanKelas.setText("");
        txt_cariKelas.setText("");
        txt_kodeKelas.setText("");
        
    }
    
    private void cari_dataKelas(String key)
    {
       try {
            // TODO add your handling code here:
        String [] judul ={"Kode_Kelas","Jurusan"};
        model_kelas = new DefaultTableModel(judul,0);
        tabelKelas.setModel(model_kelas);
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement();
            model_kelas.getDataVector().removeAllElements();
            
            
        ResultSet rs = cn.createStatement().executeQuery ("select * from kelas where kode_kelas LIKE '%"+key+"%' OR jurusan LIKE '%"+key+"%'");
        while (rs.next())
        {
            String data [] = {rs.getString(1),rs.getString(2)};
            model_kelas.addRow(data);
        }  
        } catch (SQLException ex) {
            Logger.getLogger(formKelas.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton btn_editKelas;
    private javax.swing.JButton btn_hapusKelas;
    private javax.swing.JButton btn_prosesKelas;
    private javax.swing.JButton btn_resetKelas;
    private javax.swing.JLabel btn_tambahKelas;
    private javax.swing.JLabel btn_viewKelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelKelas;
    private javax.swing.JPanel panel_bawah;
    private javax.swing.JPanel panel_prosesKelas;
    private javax.swing.JPanel panel_viewKelas;
    private javax.swing.JTable tabelKelas;
    private javax.swing.JTextField txt_cariKelas;
    private javax.swing.JTextField txt_jurusanKelas;
    private javax.swing.JTextField txt_kodeKelas;
    private javax.swing.JTextField txt_pilihKelas;
    // End of variables declaration//GEN-END:variables
    private void tampilkanKelas() {
        int row = tabelKelas.getRowCount();
        for(int a=0; a<row;a++){
            model_kelas.removeRow(0);
        }
        try {
         Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
         ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM kelas");
         while(rs.next()){
             String data []= {rs.getString(1),rs.getString(2)};
             model_kelas.addRow(data);
         }
        } catch (SQLException ex) {
            Logger.getLogger(formKelas.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }

}
