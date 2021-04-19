package prueba;
import com.sourceforge.snap7.moka7.S7;
import java.util.logging.Level;
import java.util.logging.Logger;
import static prueba.Inicio.Buffer;
import static prueba.Inicio.Client;

public class Menu extends javax.swing.JFrame {
public Thread Consultar;
public Thread mandar;
public Thread mandarA;
///flush DNS
//echo /flushdns
//ejecutar cmd es eco
//libreria para usar echo

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        VDM.setVisible(false);
        VDM2.setVisible(false);
        VDM3.setVisible(false);
        VDM4.setVisible(false);
        VDM5.setVisible(false);
        VDM6.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BTNControl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPControl = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Apagar = new javax.swing.JLabel();
        Prender = new javax.swing.JLabel();
        Verificar = new javax.swing.JLabel();
        estadomotor = new javax.swing.JLabel();
        VDM = new javax.swing.JTextField();
        Refrescar = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Verificar6 = new javax.swing.JLabel();
        estadomotorB = new javax.swing.JLabel();
        VDM2 = new javax.swing.JTextField();
        ApagarB = new javax.swing.JLabel();
        RefrescarB = new javax.swing.JLabel();
        PrenderB = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Verificar10 = new javax.swing.JLabel();
        estadomotor10 = new javax.swing.JLabel();
        VDM3 = new javax.swing.JTextField();
        ApagarC = new javax.swing.JLabel();
        PrenderC = new javax.swing.JLabel();
        RefrescarC = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        Verificar13 = new javax.swing.JLabel();
        estadomotor13 = new javax.swing.JLabel();
        VDM4 = new javax.swing.JTextField();
        ApagarD = new javax.swing.JLabel();
        PrenderD = new javax.swing.JLabel();
        RefrescarD = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        Verificar11 = new javax.swing.JLabel();
        estadomotor11 = new javax.swing.JLabel();
        VDM5 = new javax.swing.JTextField();
        ApagarE = new javax.swing.JLabel();
        RefrescarE = new javax.swing.JLabel();
        PrenderE = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        Verificar12 = new javax.swing.JLabel();
        estadomotor12 = new javax.swing.JLabel();
        VDM6 = new javax.swing.JTextField();
        PrenderF = new javax.swing.JLabel();
        RefrescarF = new javax.swing.JLabel();
        ApagarF = new javax.swing.JLabel();
        jPIncio = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPGraficas = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(54, 134, 172));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1230, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 50));

        jLabel3.setBackground(new java.awt.Color(37, 42, 54));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/configuraciones.png"))); // NOI18N
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 60, 50));

        BTNControl.setBackground(new java.awt.Color(37, 42, 54));
        BTNControl.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BTNControl.setForeground(new java.awt.Color(255, 255, 255));
        BTNControl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BTNControl.setText("CONTROL");
        BTNControl.setOpaque(true);
        BTNControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNControlMouseClicked(evt);
            }
        });
        jPanel1.add(BTNControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 180, 50));

        jLabel4.setBackground(new java.awt.Color(37, 42, 54));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GRAFICAS");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, 50));

        jLabel5.setBackground(new java.awt.Color(37, 42, 54));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/grafico.png"))); // NOI18N
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 60, 50));

        jPControl.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(27, 161, 226));
        jPanel3.setPreferredSize(new java.awt.Dimension(268, 268));

        Apagar.setBackground(new java.awt.Color(162, 0, 37));
        Apagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/apagar.png"))); // NOI18N
        Apagar.setOpaque(true);
        Apagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApagarMouseClicked(evt);
            }
        });

        Prender.setBackground(new java.awt.Color(109, 135, 100));
        Prender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Prender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/apagar.png"))); // NOI18N
        Prender.setOpaque(true);
        Prender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrenderMouseClicked(evt);
            }
        });

        Verificar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Verificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Verificar.setText("Motores");
        Verificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerificarMouseClicked(evt);
            }
        });

        estadomotor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        estadomotor.setForeground(new java.awt.Color(240, 163, 10));
        estadomotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadomotor.setText("ESTADO");

        VDM.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        VDM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VDM.setToolTipText("");

        Refrescar.setBackground(new java.awt.Color(118, 96, 138));
        Refrescar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Refrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/actualizar.png"))); // NOI18N
        Refrescar.setToolTipText("");
        Refrescar.setOpaque(true);
        Refrescar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefrescarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Verificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Prender, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Refrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(estadomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(VDM, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(estadomotor)
                .addGap(18, 18, 18)
                .addComponent(VDM, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Prender, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(Apagar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(Refrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setForeground(new java.awt.Color(27, 161, 226));
        jPanel9.setPreferredSize(new java.awt.Dimension(268, 268));

        Verificar6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Verificar6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Verificar6.setText("Motores");
        Verificar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Verificar6MouseClicked(evt);
            }
        });

        estadomotorB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        estadomotorB.setForeground(new java.awt.Color(240, 163, 10));
        estadomotorB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadomotorB.setText("ESTADO");

        VDM2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        VDM2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VDM2.setToolTipText("");

        ApagarB.setBackground(new java.awt.Color(162, 0, 37));
        ApagarB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApagarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/apagar.png"))); // NOI18N
        ApagarB.setOpaque(true);
        ApagarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApagarBMouseClicked(evt);
            }
        });

        RefrescarB.setBackground(new java.awt.Color(118, 96, 138));
        RefrescarB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RefrescarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/actualizar.png"))); // NOI18N
        RefrescarB.setToolTipText("");
        RefrescarB.setOpaque(true);
        RefrescarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefrescarBMouseClicked(evt);
            }
        });

        PrenderB.setBackground(new java.awt.Color(109, 135, 100));
        PrenderB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrenderB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/apagar.png"))); // NOI18N
        PrenderB.setOpaque(true);
        PrenderB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrenderBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Verificar6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(estadomotorB, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VDM2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(PrenderB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApagarB, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RefrescarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(Verificar6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(estadomotorB)
                .addGap(18, 18, 18)
                .addComponent(VDM2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrenderB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ApagarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RefrescarB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setForeground(new java.awt.Color(27, 161, 226));
        jPanel13.setPreferredSize(new java.awt.Dimension(268, 268));

        Verificar10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Verificar10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Verificar10.setText("Motores");
        Verificar10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Verificar10MouseClicked(evt);
            }
        });

        estadomotor10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        estadomotor10.setForeground(new java.awt.Color(240, 163, 10));
        estadomotor10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadomotor10.setText("ESTADO");

        VDM3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        VDM3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VDM3.setToolTipText("");

        ApagarC.setBackground(new java.awt.Color(162, 0, 37));
        ApagarC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApagarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/apagar.png"))); // NOI18N
        ApagarC.setOpaque(true);
        ApagarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApagarCMouseClicked(evt);
            }
        });

        PrenderC.setBackground(new java.awt.Color(109, 135, 100));
        PrenderC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrenderC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/apagar.png"))); // NOI18N
        PrenderC.setOpaque(true);
        PrenderC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrenderCMouseClicked(evt);
            }
        });

        RefrescarC.setBackground(new java.awt.Color(118, 96, 138));
        RefrescarC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RefrescarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/actualizar.png"))); // NOI18N
        RefrescarC.setToolTipText("");
        RefrescarC.setOpaque(true);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Verificar10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(estadomotor10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VDM3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(PrenderC, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApagarC, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RefrescarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(Verificar10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(estadomotor10)
                .addGap(18, 18, 18)
                .addComponent(VDM3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrenderC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ApagarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RefrescarC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setForeground(new java.awt.Color(27, 161, 226));
        jPanel16.setPreferredSize(new java.awt.Dimension(268, 268));

        Verificar13.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Verificar13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Verificar13.setText("Motores");
        Verificar13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Verificar13MouseClicked(evt);
            }
        });

        estadomotor13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        estadomotor13.setForeground(new java.awt.Color(240, 163, 10));
        estadomotor13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadomotor13.setText("ESTADO");

        VDM4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        VDM4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VDM4.setToolTipText("");

        ApagarD.setBackground(new java.awt.Color(162, 0, 37));
        ApagarD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApagarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/apagar.png"))); // NOI18N
        ApagarD.setOpaque(true);
        ApagarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApagarDMouseClicked(evt);
            }
        });

        PrenderD.setBackground(new java.awt.Color(109, 135, 100));
        PrenderD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrenderD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/apagar.png"))); // NOI18N
        PrenderD.setOpaque(true);
        PrenderD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrenderDMouseClicked(evt);
            }
        });

        RefrescarD.setBackground(new java.awt.Color(118, 96, 138));
        RefrescarD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RefrescarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/actualizar.png"))); // NOI18N
        RefrescarD.setToolTipText("");
        RefrescarD.setOpaque(true);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Verificar13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(estadomotor13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(VDM4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(PrenderD, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApagarD, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RefrescarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addComponent(Verificar13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(estadomotor13)
                .addGap(18, 18, 18)
                .addComponent(VDM4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrenderD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ApagarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RefrescarD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setForeground(new java.awt.Color(27, 161, 226));
        jPanel14.setPreferredSize(new java.awt.Dimension(268, 268));

        Verificar11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Verificar11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Verificar11.setText("Motores");
        Verificar11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Verificar11MouseClicked(evt);
            }
        });

        estadomotor11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        estadomotor11.setForeground(new java.awt.Color(240, 163, 10));
        estadomotor11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadomotor11.setText("ESTADO");

        VDM5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        VDM5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VDM5.setToolTipText("");

        ApagarE.setBackground(new java.awt.Color(162, 0, 37));
        ApagarE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApagarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/apagar.png"))); // NOI18N
        ApagarE.setOpaque(true);
        ApagarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApagarEMouseClicked(evt);
            }
        });

        RefrescarE.setBackground(new java.awt.Color(118, 96, 138));
        RefrescarE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RefrescarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/actualizar.png"))); // NOI18N
        RefrescarE.setToolTipText("");
        RefrescarE.setOpaque(true);

        PrenderE.setBackground(new java.awt.Color(109, 135, 100));
        PrenderE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrenderE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/apagar.png"))); // NOI18N
        PrenderE.setOpaque(true);
        PrenderE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrenderEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Verificar11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(estadomotor11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VDM5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(PrenderE, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApagarE, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RefrescarE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(Verificar11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(estadomotor11)
                .addGap(18, 18, 18)
                .addComponent(VDM5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrenderE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ApagarE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RefrescarE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setForeground(new java.awt.Color(27, 161, 226));
        jPanel15.setPreferredSize(new java.awt.Dimension(268, 268));

        Verificar12.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Verificar12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Verificar12.setText("Motores");
        Verificar12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Verificar12MouseClicked(evt);
            }
        });

        estadomotor12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        estadomotor12.setForeground(new java.awt.Color(240, 163, 10));
        estadomotor12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadomotor12.setText("ESTADO");

        VDM6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        VDM6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VDM6.setToolTipText("");

        PrenderF.setBackground(new java.awt.Color(109, 135, 100));
        PrenderF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrenderF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/apagar.png"))); // NOI18N
        PrenderF.setOpaque(true);
        PrenderF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrenderFMouseClicked(evt);
            }
        });

        RefrescarF.setBackground(new java.awt.Color(118, 96, 138));
        RefrescarF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RefrescarF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/actualizar.png"))); // NOI18N
        RefrescarF.setToolTipText("");
        RefrescarF.setOpaque(true);

        ApagarF.setBackground(new java.awt.Color(162, 0, 37));
        ApagarF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApagarF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/apagar.png"))); // NOI18N
        ApagarF.setOpaque(true);
        ApagarF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApagarFMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Verificar12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(estadomotor12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VDM6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(PrenderF, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApagarF, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RefrescarF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(Verificar12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(estadomotor12)
                .addGap(18, 18, 18)
                .addComponent(VDM6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrenderF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ApagarF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RefrescarF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPControlLayout = new javax.swing.GroupLayout(jPControl);
        jPControl.setLayout(jPControlLayout);
        jPControlLayout.setHorizontalGroup(
            jPControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPControlLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPControlLayout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPControlLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPControlLayout.setVerticalGroup(
            jPControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPControlLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPIncio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setText("Hecho por AnjelConJ");

        javax.swing.GroupLayout jPIncioLayout = new javax.swing.GroupLayout(jPIncio);
        jPIncio.setLayout(jPIncioLayout);
        jPIncioLayout.setHorizontalGroup(
            jPIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPIncioLayout.createSequentialGroup()
                .addContainerGap(706, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPIncioLayout.setVerticalGroup(
            jPIncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPIncioLayout.createSequentialGroup()
                .addContainerGap(596, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPGraficas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPGraficasLayout = new javax.swing.GroupLayout(jPGraficas);
        jPGraficas.setLayout(jPGraficasLayout);
        jPGraficasLayout.setHorizontalGroup(
            jPGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        jPGraficasLayout.setVerticalGroup(
            jPGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(jPControl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPIncio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPGraficas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPIncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPGraficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPIncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPGraficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 990, 670));

        jPanel17.setBackground(new java.awt.Color(37, 42, 54));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNControlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNControlMouseClicked

        jPControl.setVisible(true);
        jPIncio.setVisible(false);
        jPGraficas.setVisible(false);
        VDM.setVisible(true);
        VDM2.setVisible(true);
        VDM3.setVisible(true);
        VDM4.setVisible(true);
        VDM5.setVisible(true);
        VDM6.setVisible(true);
    }//GEN-LAST:event_BTNControlMouseClicked

///Vamos a verificar si lee datos de la base de datos
    private void VerificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerificarMouseClicked

        if (Client.Connected) {
            Client.ReadArea(S7.S7AreaDB,1,0,84, Buffer);
           int readdata = S7.GetDIntAt(Buffer, (Integer.parseInt(VDM.getText())));
           estadomotor.setText(Integer.toString(readdata));
        } 
    }//GEN-LAST:event_VerificarMouseClicked

    private void PrenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenderMouseClicked
       mandar = new Thread(new Runnable(){

           public void run() {
            if (Client.Connected) {
           Client.WriteArea(S7.S7AreaDB, 1, 0, 84, Buffer);
           S7.SetDIntAt(Buffer, Integer.parseInt(VDM.getText()), 1);    
        }   
           }
       });
       Consultar = new Thread(new Runnable(){
           public void run() {
                if (Client.Connected) {
                Client.ReadArea(S7.S7AreaDB,1,0,84, Buffer);
                int readdata = S7.GetDIntAt(Buffer, (Integer.parseInt(VDM.getText())));
                estadomotor.setText(Integer.toString(readdata));
                }       
           }
       });
       mandar.start();
       Consultar.start();
    }//GEN-LAST:event_PrenderMouseClicked

    private void ApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarMouseClicked
    mandarA = new Thread(new Runnable(){

           public void run() {
            if (Client.Connected) {
           Client.WriteArea(S7.S7AreaDB, 1, 0, 84, Buffer);
           S7.SetDIntAt(Buffer, Integer.parseInt(VDM.getText()), 0);    
        }   
           }
       });
    Consultar = new Thread(new Runnable(){
           public void run() {
               
                if (Client.Connected) {
                Client.ReadArea(S7.S7AreaDB,1,0,84, Buffer);
                int readdata = S7.GetDIntAt(Buffer, (Integer.parseInt(VDM.getText())));
                estadomotor.setText(Integer.toString(readdata));
                }    
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                   }
   
           }
       });
       Consultar.start();
       mandarA.start();
    }//GEN-LAST:event_ApagarMouseClicked

    private void Verificar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Verificar6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Verificar6MouseClicked

    private void Verificar10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Verificar10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Verificar10MouseClicked

    private void Verificar11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Verificar11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Verificar11MouseClicked

    private void Verificar12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Verificar12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Verificar12MouseClicked

    private void Verificar13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Verificar13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Verificar13MouseClicked

    private void PrenderBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenderBMouseClicked
        if (Client.Connected) {
           Client.WriteArea(S7.S7AreaDB, 1, 0, 84, Buffer);
           S7.SetDIntAt(Buffer, Integer.parseInt(VDM2.getText()), 1);    
        }
    }//GEN-LAST:event_PrenderBMouseClicked

    private void ApagarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarBMouseClicked
        if (Client.Connected) {
            Client.WriteArea(S7.S7AreaDB, 1, 0, 84, Buffer);
           S7.SetDIntAt(Buffer, Integer.parseInt(VDM2.getText()), 0);  
        }
    }//GEN-LAST:event_ApagarBMouseClicked

    private void PrenderCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenderCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenderCMouseClicked

    private void ApagarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ApagarCMouseClicked

    private void PrenderDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenderDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenderDMouseClicked

    private void ApagarDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ApagarDMouseClicked

    private void PrenderEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenderEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenderEMouseClicked

    private void ApagarEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ApagarEMouseClicked

    private void PrenderFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenderFMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenderFMouseClicked

    private void ApagarFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarFMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ApagarFMouseClicked

    private void RefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefrescarMouseClicked
       Consultar = new Thread(new Runnable(){
           public void run() {
               
                if (Client.Connected) {
                Client.ReadArea(S7.S7AreaDB,1,0,84, Buffer);
                int readdata = S7.GetDIntAt(Buffer, (Integer.parseInt(VDM.getText())));
                estadomotor.setText(Integer.toString(readdata));
                }    
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                   }
               
                  
           }
       });
       Consultar.start();
             }//GEN-LAST:event_RefrescarMouseClicked

    private void RefrescarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefrescarBMouseClicked
        if (Client.Connected) {
            Client.ReadArea(S7.S7AreaDB,1,0,84, Buffer);
            int readdata = S7.GetDIntAt(Buffer, (Integer.parseInt(VDM2.getText())));
            estadomotorB.setText(Integer.toString(readdata));
        }
    }//GEN-LAST:event_RefrescarBMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apagar;
    private javax.swing.JLabel ApagarB;
    private javax.swing.JLabel ApagarC;
    private javax.swing.JLabel ApagarD;
    private javax.swing.JLabel ApagarE;
    private javax.swing.JLabel ApagarF;
    private javax.swing.JLabel BTNControl;
    private javax.swing.JLabel Prender;
    private javax.swing.JLabel PrenderB;
    private javax.swing.JLabel PrenderC;
    private javax.swing.JLabel PrenderD;
    private javax.swing.JLabel PrenderE;
    private javax.swing.JLabel PrenderF;
    private javax.swing.JLabel Refrescar;
    private javax.swing.JLabel RefrescarB;
    private javax.swing.JLabel RefrescarC;
    private javax.swing.JLabel RefrescarD;
    private javax.swing.JLabel RefrescarE;
    private javax.swing.JLabel RefrescarF;
    private javax.swing.JTextField VDM;
    private javax.swing.JTextField VDM2;
    private javax.swing.JTextField VDM3;
    private javax.swing.JTextField VDM4;
    private javax.swing.JTextField VDM5;
    private javax.swing.JTextField VDM6;
    private javax.swing.JLabel Verificar;
    private javax.swing.JLabel Verificar10;
    private javax.swing.JLabel Verificar11;
    private javax.swing.JLabel Verificar12;
    private javax.swing.JLabel Verificar13;
    private javax.swing.JLabel Verificar6;
    private javax.swing.JLabel estadomotor;
    private javax.swing.JLabel estadomotor10;
    private javax.swing.JLabel estadomotor11;
    private javax.swing.JLabel estadomotor12;
    private javax.swing.JLabel estadomotor13;
    private javax.swing.JLabel estadomotorB;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPControl;
    private javax.swing.JPanel jPGraficas;
    private javax.swing.JPanel jPIncio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
