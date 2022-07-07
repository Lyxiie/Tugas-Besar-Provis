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
public class formMapel extends javax.swing.JInternalFrame {

    DefaultTableModel model;

    public formMapel() {
        initComponents();
        
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dm.width/2-this.getSize().width/2, dm.height/2-this.getSize().height/2);
        
        String [] judul ={"Kode Pelajaran","Nama Pelajaran"};
        model = new DefaultTableModel(judul,0);
        tabelMapel.setModel(model);
        tampilkanMapel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMapel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_viewMapel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_tambahMapel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel_bawah = new javax.swing.JPanel();
        panel_viewMapel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_editMapel = new javax.swing.JButton();
        btn_hapusMapel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelMapel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cari_dataMapel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pilihMapel = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_prosesMapel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_kodeMapel = new javax.swing.JTextField();
        txt_namaMapel = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btn_prosesMapel = new javax.swing.JButton();
        btn_resetMapel = new javax.swing.JButton();

        panelMapel.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        btn_viewMapel.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btn_viewMapel.setForeground(new java.awt.Color(255, 255, 255));
        btn_viewMapel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_viewMapel.setText("VIEW DATA");
        btn_viewMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewMapelMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_search_50px_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_viewMapel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_viewMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setPreferredSize(new java.awt.Dimension(160, 68));

        btn_tambahMapel.setBackground(new java.awt.Color(102, 102, 102));
        btn_tambahMapel.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btn_tambahMapel.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambahMapel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_tambahMapel.setText("TAMBAH DATA");
        btn_tambahMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahMapelMouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8_add_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(btn_tambahMapel))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
            .addComponent(btn_tambahMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel75)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
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

        panel_viewMapel.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btn_editMapel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_editMapel.setText("EDIT");
        btn_editMapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editMapelActionPerformed(evt);
            }
        });

        btn_hapusMapel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_hapusMapel.setText("HAPUS");
        btn_hapusMapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusMapelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_editMapel)
                .addGap(18, 18, 18)
                .addComponent(btn_hapusMapel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hapusMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabelMapel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMapelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelMapel);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("PENCARIAN DATA  :");

        cari_dataMapel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cari_dataMapelKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DATA YANG DIPILIH : ");

        txt_pilihMapel.setEditable(false);
        txt_pilihMapel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DATA MAPEL");

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

        javax.swing.GroupLayout panel_viewMapelLayout = new javax.swing.GroupLayout(panel_viewMapel);
        panel_viewMapel.setLayout(panel_viewMapelLayout);
        panel_viewMapelLayout.setHorizontalGroup(
            panel_viewMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_viewMapelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panel_viewMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewMapelLayout.createSequentialGroup()
                        .addGroup(panel_viewMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_viewMapelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cari_dataMapel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewMapelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(panel_viewMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewMapelLayout.createSequentialGroup()
                                .addComponent(txt_pilihMapel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))))
            .addGroup(panel_viewMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewMapelLayout.createSequentialGroup()
                    .addContainerGap(532, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        panel_viewMapelLayout.setVerticalGroup(
            panel_viewMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_viewMapelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(panel_viewMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cari_dataMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(panel_viewMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_pilihMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_viewMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_viewMapelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(437, Short.MAX_VALUE)))
        );

        panel_bawah.add(panel_viewMapel, "card2");

        panel_prosesMapel.setBackground(new java.awt.Color(204, 204, 204));
        panel_prosesMapel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel4.setText("Kode Pelajaran :");

        jLabel5.setText("Nama Pelajaran :");

        txt_kodeMapel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_kodeMapelKeyTyped(evt);
            }
        });

        txt_namaMapel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_namaMapelKeyTyped(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        btn_prosesMapel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_prosesMapel.setText("PROSES");
        btn_prosesMapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesMapelActionPerformed(evt);
            }
        });

        btn_resetMapel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_resetMapel.setText("RESET");
        btn_resetMapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetMapelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_prosesMapel)
                .addGap(18, 18, 18)
                .addComponent(btn_resetMapel)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prosesMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_resetMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_prosesMapelLayout = new javax.swing.GroupLayout(panel_prosesMapel);
        panel_prosesMapel.setLayout(panel_prosesMapelLayout);
        panel_prosesMapelLayout.setHorizontalGroup(
            panel_prosesMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prosesMapelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(panel_prosesMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_kodeMapel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txt_namaMapel))
                .addContainerGap(312, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_prosesMapelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_prosesMapelLayout.setVerticalGroup(
            panel_prosesMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prosesMapelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(panel_prosesMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_kodeMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_namaMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        panel_bawah.add(panel_prosesMapel, "card3");

        javax.swing.GroupLayout panelMapelLayout = new javax.swing.GroupLayout(panelMapel);
        panelMapel.setLayout(panelMapelLayout);
        panelMapelLayout.setHorizontalGroup(
            panelMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panel_bawah, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMapelLayout.setVerticalGroup(
            panelMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_bawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewMapelMouseClicked
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_viewMapel);
        panel_bawah.repaint();
        panel_bawah.revalidate();
    }//GEN-LAST:event_btn_viewMapelMouseClicked

    private void btn_tambahMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMapelMouseClicked
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_prosesMapel);
        panel_bawah.repaint();
        panel_bawah.revalidate();
        btn_prosesMapel.setText("TAMBAH");
        btn_resetMapel.setText("RESET");
        txt_kodeMapel.setEditable(true);
        reset();
    }//GEN-LAST:event_btn_tambahMapelMouseClicked

    private void btn_editMapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editMapelActionPerformed
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_prosesMapel);
        panel_bawah.repaint();
        panel_bawah.revalidate();
        btn_prosesMapel.setText("UPDATE");
        btn_resetMapel.setText("RESET DATA");
        txt_kodeMapel.setEditable(false);
    }//GEN-LAST:event_btn_editMapelActionPerformed

    private void btn_hapusMapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusMapelActionPerformed
        // TODO add your handling code here:
        int jawab ;
        if(txt_pilihMapel.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Data Terlebih Dahulu!", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
        }else
        if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Menghapus Data?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
                  try {

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement().executeUpdate("Delete from mapel where kode_pelajaran ='"+txt_pilihMapel.getText()+"'");
            tampilkanMapel();
        } catch (SQLException ex) {
            Logger.getLogger(formMapel.class.getName()).log(Level.SEVERE, null, ex);
        }     
        }
    }//GEN-LAST:event_btn_hapusMapelActionPerformed

    private void tabelMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMapelMouseClicked
        // TODO add your handling code here:
        int  i = tabelMapel.getSelectedRow();
        if(i>-1)
        {
            txt_pilihMapel.setText(model.getValueAt(i, 0).toString());
            txt_kodeMapel.setText(model.getValueAt(i, 0).toString());
            txt_namaMapel.setText(model.getValueAt(i, 1).toString());
        }
    }//GEN-LAST:event_tabelMapelMouseClicked

    private void btn_prosesMapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesMapelActionPerformed
        // TODO add your handling code here:
        if (btn_prosesMapel.getText()=="TAMBAH")
        {
             int jawab ;
         if(txt_kodeMapel.getText().equals("") || txt_namaMapel.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ada Data Yang Belum Diisi", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
         }      
         else if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Data Yang Dimasukan Sudah Benar?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
         try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement().executeUpdate("insert into mapel values"+"('"+txt_kodeMapel.getText()+"','"+txt_namaMapel.getText()+"')");
            tampilkanMapel();
                    panel_bawah.removeAll();
                    panel_bawah.repaint();
                    panel_bawah.revalidate();

                    panel_bawah.add(panel_viewMapel);
                    panel_bawah.repaint();
                    panel_bawah.revalidate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ada data yang belum diisi");
             
                }            
            }
        }
        else if (btn_prosesMapel.getText()=="UPDATE")
        {
            int jawab ;
        if(txt_kodeMapel.getText().equals("") || txt_namaMapel.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ada Data Yang Belum Diisi", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
         }
        else if((jawab = JOptionPane.showConfirmDialog(null, "Simpan Perubahan Data?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement().executeUpdate("update mapel set nama_pelajaran ='"+txt_namaMapel.getText()+"'where kode_pelajaran ='"+txt_kodeMapel.getText()+"'");
            tampilkanMapel();
                    panel_bawah.removeAll();
                    panel_bawah.repaint();
                    panel_bawah.revalidate();

                    panel_bawah.add(panel_viewMapel);
                    panel_bawah.repaint();
                    panel_bawah.revalidate();
        } catch (SQLException ex) {
            Logger.getLogger(formMapel.class.getName()).log(Level.SEVERE, null, ex);
             
            }
        }
        }
    }//GEN-LAST:event_btn_prosesMapelActionPerformed

    private void btn_resetMapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetMapelActionPerformed
        // TODO add your handling code here:
        if (btn_resetMapel.getText()=="RESET")
        {
            reset();
        }
        else if (btn_resetMapel.getText()=="RESET DATA")
        {
            int  i = tabelMapel.getSelectedRow();
            if(i>-1)
            {
                txt_pilihMapel.setText(model.getValueAt(i, 0).toString());
                txt_kodeMapel.setText(model.getValueAt(i, 0).toString());
                txt_namaMapel.setText(model.getValueAt(i, 1).toString());
            }
        }
    }//GEN-LAST:event_btn_resetMapelActionPerformed

    private void cari_dataMapelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cari_dataMapelKeyReleased
        // TODO add your handling code here:
        String key = cari_dataMapel.getText();
        System.out.println(key);
        
        if(key!="") {
            cari_dataMapel(key);
        }
        else {
            tampilkanMapel();
        }
    }//GEN-LAST:event_cari_dataMapelKeyReleased

    private void txt_kodeMapelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kodeMapelKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_txt_kodeMapelKeyTyped

    private void txt_namaMapelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_namaMapelKeyTyped
        // TODO add your handling code here:
        FilterHuruf(evt);
    }//GEN-LAST:event_txt_namaMapelKeyTyped

    private void reset()
    {
        txt_kodeMapel.setText("");
        txt_pilihMapel.setText("");
        txt_namaMapel.setText("");
    }
private void cari_dataMapel(String key)
    {
       try {
            // TODO add your handling code here:
        String [] judul ={"Kode Pelajaran","Nama Pelajaran"};
        model = new DefaultTableModel(judul,0);
        tabelMapel.setModel(model);
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement(); //.executeQuery("select * from mapel where kode_pelajaran LIKE '%"+key+"%' OR nama_pelajaran LIKE '%"+key+"%'");
            model.getDataVector().removeAllElements();
            
            
        ResultSet rs = cn.createStatement().executeQuery ("select * from mapel where kode_pelajaran LIKE '%"+key+"%' OR nama_pelajaran LIKE '%"+key+"%'");
        while (rs.next())
        {
            String data [] = {rs.getString(1),rs.getString(2)};
            model.addRow(data);
        }  
        } catch (SQLException ex) {
            Logger.getLogger(formMapel.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton btn_editMapel;
    private javax.swing.JButton btn_hapusMapel;
    private javax.swing.JButton btn_prosesMapel;
    private javax.swing.JButton btn_resetMapel;
    private javax.swing.JLabel btn_tambahMapel;
    private javax.swing.JLabel btn_viewMapel;
    private javax.swing.JTextField cari_dataMapel;
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
    private javax.swing.JPanel panelMapel;
    private javax.swing.JPanel panel_bawah;
    private javax.swing.JPanel panel_prosesMapel;
    private javax.swing.JPanel panel_viewMapel;
    private javax.swing.JTable tabelMapel;
    private javax.swing.JTextField txt_kodeMapel;
    private javax.swing.JTextField txt_namaMapel;
    private javax.swing.JTextField txt_pilihMapel;
    // End of variables declaration//GEN-END:variables
private void tampilkanMapel() {

        int row = tabelMapel.getRowCount();
        for (int i=0; i<row;i++)
        {
            model.removeRow(0);
        }
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            ResultSet rs = cn.createStatement().executeQuery ("Select * from mapel");
        while (rs.next())
        {
            String data [] = {rs.getString(1),rs.getString(2)};
            model.addRow(data);
        }  
        } catch (SQLException ex) {
            Logger.getLogger(formMapel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
