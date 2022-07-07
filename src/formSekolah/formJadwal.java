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
public class formJadwal extends javax.swing.JInternalFrame {

    DefaultTableModel model_jadwal;
    public formJadwal() {
        initComponents();
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dm.width/2-this.getSize().width/2, dm.height/2-this.getSize().height/2);
        
        String [] judul ={"Kode_Jadwal","Nip","Kode_Kelas","Jam","Hari"};
        model_jadwal = new DefaultTableModel(judul,0);
        tabelJadwal.setModel(model_jadwal);
        tampilkanJadwal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJadwal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_viewJadwal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_tambahJadwal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        panel_bawah = new javax.swing.JPanel();
        panel_viewJadwal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_editJadwal = new javax.swing.JButton();
        btn_hapusJadwal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelJadwal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_cariJadwal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pilihJadwal = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_prosesJadwal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_kodeJadwal = new javax.swing.JTextField();
        txt_nipJadwal = new javax.swing.JTextField();
        txt_kodeKelasJadwal = new javax.swing.JTextField();
        txt_jamJadwal = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btn_prosesJadwal = new javax.swing.JButton();
        btn_resetJadwal = new javax.swing.JButton();
        txt_hariJadwal = new javax.swing.JTextField();

        panelJadwal.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(160, 68));

        btn_viewJadwal.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btn_viewJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btn_viewJadwal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_viewJadwal.setText("VIEW DATA");
        btn_viewJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewJadwalMouseClicked(evt);
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
                .addComponent(btn_viewJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_viewJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setPreferredSize(new java.awt.Dimension(121, 68));

        btn_tambahJadwal.setBackground(new java.awt.Color(102, 102, 102));
        btn_tambahJadwal.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btn_tambahJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambahJadwal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_tambahJadwal.setText("TAMBAH DATA");
        btn_tambahJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahJadwalMouseClicked(evt);
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
                .addComponent(btn_tambahJadwal))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_tambahJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel75))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
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

        panel_viewJadwal.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btn_editJadwal.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_editJadwal.setText("EDIT");
        btn_editJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editJadwalActionPerformed(evt);
            }
        });

        btn_hapusJadwal.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_hapusJadwal.setText("HAPUS");
        btn_hapusJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusJadwalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_editJadwal)
                .addGap(18, 18, 18)
                .addComponent(btn_hapusJadwal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hapusJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabelJadwal.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelJadwalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelJadwal);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("PENCARIAN DATA  :");

        txt_cariJadwal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariJadwalKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DATA YANG DIPILIH : ");

        txt_pilihJadwal.setEditable(false);
        txt_pilihJadwal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DATA JADWAL");

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

        javax.swing.GroupLayout panel_viewJadwalLayout = new javax.swing.GroupLayout(panel_viewJadwal);
        panel_viewJadwal.setLayout(panel_viewJadwalLayout);
        panel_viewJadwalLayout.setHorizontalGroup(
            panel_viewJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_viewJadwalLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panel_viewJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewJadwalLayout.createSequentialGroup()
                        .addGroup(panel_viewJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_viewJadwalLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cariJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewJadwalLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(panel_viewJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewJadwalLayout.createSequentialGroup()
                                .addComponent(txt_pilihJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))))
            .addGroup(panel_viewJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_viewJadwalLayout.createSequentialGroup()
                    .addContainerGap(532, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        panel_viewJadwalLayout.setVerticalGroup(
            panel_viewJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_viewJadwalLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(panel_viewJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cariJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(panel_viewJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_pilihJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_viewJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_viewJadwalLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(437, Short.MAX_VALUE)))
        );

        panel_bawah.add(panel_viewJadwal, "card2");

        panel_prosesJadwal.setBackground(new java.awt.Color(204, 204, 204));
        panel_prosesJadwal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel4.setText("Kode Jadwal :");

        jLabel5.setText("NIP :");

        jLabel6.setText("Kode Kelas :");

        jLabel8.setText("Jam :");

        jLabel9.setText("Hari :");

        txt_kodeJadwal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_kodeJadwalKeyTyped(evt);
            }
        });

        txt_nipJadwal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nipJadwalKeyTyped(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        btn_prosesJadwal.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_prosesJadwal.setText("PROSES");
        btn_prosesJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesJadwalActionPerformed(evt);
            }
        });

        btn_resetJadwal.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_resetJadwal.setText("RESET");
        btn_resetJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetJadwalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_prosesJadwal)
                .addGap(18, 18, 18)
                .addComponent(btn_resetJadwal)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prosesJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_resetJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_prosesJadwalLayout = new javax.swing.GroupLayout(panel_prosesJadwal);
        panel_prosesJadwal.setLayout(panel_prosesJadwalLayout);
        panel_prosesJadwalLayout.setHorizontalGroup(
            panel_prosesJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prosesJadwalLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(panel_prosesJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_kodeJadwal)
                    .addComponent(txt_nipJadwal)
                    .addComponent(txt_kodeKelasJadwal)
                    .addComponent(txt_jamJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txt_hariJadwal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_prosesJadwalLayout.createSequentialGroup()
                .addGap(0, 344, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_prosesJadwalLayout.setVerticalGroup(
            panel_prosesJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prosesJadwalLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(panel_prosesJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_kodeJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_nipJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_kodeKelasJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_jamJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prosesJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_hariJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        panel_bawah.add(panel_prosesJadwal, "card3");

        javax.swing.GroupLayout panelJadwalLayout = new javax.swing.GroupLayout(panelJadwal);
        panelJadwal.setLayout(panelJadwalLayout);
        panelJadwalLayout.setHorizontalGroup(
            panelJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panel_bawah, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelJadwalLayout.setVerticalGroup(
            panelJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_bawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewJadwalMouseClicked
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_viewJadwal);
        panel_bawah.repaint();
        panel_bawah.revalidate();
    }//GEN-LAST:event_btn_viewJadwalMouseClicked

    private void btn_tambahJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahJadwalMouseClicked
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_prosesJadwal);
        panel_bawah.repaint();
        panel_bawah.revalidate();
        btn_prosesJadwal.setText("TAMBAH");
        btn_resetJadwal.setText("RESET");
        txt_kodeJadwal.setEditable(true);
        reset();
    }//GEN-LAST:event_btn_tambahJadwalMouseClicked

    private void btn_editJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editJadwalActionPerformed
        // TODO add your handling code here:
        panel_bawah.removeAll();
        panel_bawah.repaint();
        panel_bawah.revalidate();

        panel_bawah.add(panel_prosesJadwal);
        panel_bawah.repaint();
        panel_bawah.revalidate();
        btn_prosesJadwal.setText("UPDATE");
        btn_resetJadwal.setText("RESET DATA");
        txt_kodeJadwal.setEditable(false);
    }//GEN-LAST:event_btn_editJadwalActionPerformed

    private void btn_hapusJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusJadwalActionPerformed
        // TODO add your handling code here:
         int jawab ;
        if(txt_pilihJadwal.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Data Terlebih Dahulu!", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
        }else
        if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Menghapus Data?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
        try {
            // TODO add your handling code here:
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement().executeUpdate("Delete from mengajar where kode_jadwal ='"+txt_pilihJadwal.getText()+"'");
            tampilkanJadwal();
        } catch (SQLException ex) {
             Logger.getLogger(formJadwal.class.getName()).log(Level.SEVERE, null, ex);           
        }
        }
    }//GEN-LAST:event_btn_hapusJadwalActionPerformed

    private void tabelJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelJadwalMouseClicked
        // TODO add your handling code here:

       int i = tabelJadwal.getSelectedRow();
        if(i>-1){
            txt_pilihJadwal.setText(model_jadwal.getValueAt(i, 0).toString());
            txt_kodeJadwal.setText(model_jadwal.getValueAt(i, 0).toString());
            txt_nipJadwal.setText(model_jadwal.getValueAt(i, 1).toString());
            txt_kodeKelasJadwal.setText(model_jadwal.getValueAt(i, 2).toString());
            txt_jamJadwal.setText(model_jadwal.getValueAt(i, 3).toString());
            txt_hariJadwal.setText(model_jadwal.getValueAt(i, 4).toString());
        }
    }//GEN-LAST:event_tabelJadwalMouseClicked

    private void txt_cariJadwalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariJadwalKeyReleased
        // TODO add your handling code here:
         String key = txt_cariJadwal.getText();
        System.out.println(key);
        
        if(key!="") {
            cari_dataJadwal(key);
        }
        else {
            tampilkanJadwal();
        }
    }//GEN-LAST:event_txt_cariJadwalKeyReleased

    private void btn_resetJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetJadwalActionPerformed
        // TODO add your handling code here:
        if (btn_resetJadwal.getText()=="RESET")
        {
            reset();
        }
        else if (btn_resetJadwal.getText()=="RESET DATA")
        {
        int i = tabelJadwal.getSelectedRow();
        if(i>-1){
            txt_pilihJadwal.setText(model_jadwal.getValueAt(i, 0).toString());
            txt_kodeJadwal.setText(model_jadwal.getValueAt(i, 0).toString());
            txt_nipJadwal.setText(model_jadwal.getValueAt(i, 1).toString());
            txt_kodeKelasJadwal.setText(model_jadwal.getValueAt(i, 2).toString());
            txt_jamJadwal.setText(model_jadwal.getValueAt(i, 3).toString());
            txt_hariJadwal.setText(model_jadwal.getValueAt(i, 4).toString());
        }
    }//GEN-LAST:event_btn_resetJadwalActionPerformed
    }
    private void btn_prosesJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesJadwalActionPerformed
        // TODO add your handling code here:
        if (btn_prosesJadwal.getText()=="TAMBAH")
        {
        int jawab ;
        if(txt_hariJadwal.getText().equals("") 
                || txt_jamJadwal.getText().equals("") 
                || txt_kodeJadwal.getText().equals("")
                || txt_nipJadwal.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ada Data Yang Belum Diisi", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
         }
        else if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Data Yang Dimasukan Sudah Benar?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
        try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement().executeUpdate("insert into mengajar values"+"('"+txt_kodeJadwal.getText()+"','"+txt_nipJadwal.getText()+"','"+txt_kodeKelasJadwal.getText()+"','"+txt_jamJadwal.getText()+"','"+txt_hariJadwal.getText()+"')");
            tampilkanJadwal();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Ada yang belim di isi !");
            }
        }
        }
        else if (btn_prosesJadwal.getText()=="UPDATE")
        {
            int jawab ;
        if(txt_hariJadwal.getText().equals("") 
                || txt_jamJadwal.getText().equals("")
                || txt_nipJadwal.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ada Data Yang Belum Diisi", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
         }
        else if((jawab = JOptionPane.showConfirmDialog(null, "Simpan Perubahan Data?", "konfirmasi", JOptionPane.YES_NO_OPTION))==0){
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement().executeUpdate("update mengajar set nip ='"+txt_nipJadwal.getText()+"',kode_kelas ='"+txt_kodeKelasJadwal.getText()+"',jam ='"+txt_jamJadwal.getText()+"',hari ='"+txt_hariJadwal.getText()+"',nip ='"+txt_nipJadwal.getText()+"' where kode_jadwal ='"+txt_pilihJadwal.getText()+"'");
            tampilkanJadwal();
        } catch (SQLException ex) {
            Logger.getLogger(formJadwal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }//GEN-LAST:event_btn_prosesJadwalActionPerformed

    private void txt_nipJadwalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nipJadwalKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_txt_nipJadwalKeyTyped

    private void txt_kodeJadwalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kodeJadwalKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_txt_kodeJadwalKeyTyped

    private void reset()
    {
        txt_cariJadwal.setText("");
        txt_hariJadwal.setText("");
        txt_jamJadwal.setText("");
        txt_kodeJadwal.setText("");
        txt_nipJadwal.setText("");
        txt_pilihJadwal.setText("");
    }
    
    private void cari_dataJadwal(String key)
    {
       try {
            // TODO add your handling code here:
        String [] judul ={"Kode_Jadwal","Nip","Kode_Kelas","Jam","Hari"};
        model_jadwal = new DefaultTableModel(judul,0);
        tabelJadwal.setModel(model_jadwal);
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
            cn.createStatement();
            model_jadwal.getDataVector().removeAllElements();
            
            
        ResultSet rs = cn.createStatement().executeQuery ("select * from mengajar where kode_jadwal LIKE '%"+key+"%' OR nip LIKE '%"+key+"%'");
        while (rs.next())
        {
            String data []= {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
            model_jadwal.addRow(data);
        }  
        } catch (SQLException ex) {
            Logger.getLogger(formJadwal.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton btn_editJadwal;
    private javax.swing.JButton btn_hapusJadwal;
    private javax.swing.JButton btn_prosesJadwal;
    private javax.swing.JButton btn_resetJadwal;
    private javax.swing.JLabel btn_tambahJadwal;
    private javax.swing.JLabel btn_viewJadwal;
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
    private javax.swing.JPanel panelJadwal;
    private javax.swing.JPanel panel_bawah;
    private javax.swing.JPanel panel_prosesJadwal;
    private javax.swing.JPanel panel_viewJadwal;
    private javax.swing.JTable tabelJadwal;
    private javax.swing.JTextField txt_cariJadwal;
    private javax.swing.JTextField txt_hariJadwal;
    private javax.swing.JTextField txt_jamJadwal;
    private javax.swing.JTextField txt_kodeJadwal;
    private javax.swing.JTextField txt_kodeKelasJadwal;
    private javax.swing.JTextField txt_nipJadwal;
    private javax.swing.JTextField txt_pilihJadwal;
    // End of variables declaration//GEN-END:variables

private void tampilkanJadwal() {
        int row = tabelJadwal.getRowCount();
        for(int a=0; a<row;a++){
            model_jadwal.removeRow(0);
        }
        try {
         Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db10119251sekolah","root","");
         ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM mengajar");
         while(rs.next()){
             String data []= {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
             model_jadwal.addRow(data);
         }
        } catch (SQLException ex) {
            Logger.getLogger(formJadwal.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}
