package Vista;

import Control.EstablecerControladores;

public class SistemaVista extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SistemaVista.class.getName());

    public SistemaVista() {
        initComponents();
        setSize(1208,680);
        setResizable(false);
        setTitle("Panel de Administracion");
        setLocationRelativeTo(null);
        EstablecerControladores setting=new EstablecerControladores(this);
        
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuSistema = new javax.swing.JPanel();
        jPanelInicio = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        jPanelMisRecetas = new javax.swing.JPanel();
        jLabelMisRecetas = new javax.swing.JLabel();
        jPanelMedicamentos = new javax.swing.JPanel();
        jLabelMedicamentos = new javax.swing.JLabel();
        jPanelPedidos = new javax.swing.JPanel();
        jLabelPedidos = new javax.swing.JLabel();
        jPanelPromociones = new javax.swing.JPanel();
        jLabelPromociones = new javax.swing.JLabel();
        jPanelRecordatorios = new javax.swing.JPanel();
        jLabelRecordatorios = new javax.swing.JLabel();
        jPanelMiPerfil = new javax.swing.JPanel();
        jLabelMiPerfil = new javax.swing.JLabel();
        jPanelAyuda = new javax.swing.JPanel();
        jLabelAyuda = new javax.swing.JLabel();
        jPanelCerrarSesion = new javax.swing.JPanel();
        jLabelCerrarSesion = new javax.swing.JLabel();
        Logo = new javax.swing.JPanel();
        ICONO = new javax.swing.JLabel();
        Cabezera = new javax.swing.JPanel();
        btn_Foto = new javax.swing.JButton();
        btn_SalirSesion = new javax.swing.JButton();
        IconoSana_sana = new javax.swing.JLabel();
        FondoCabezera = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        IconoFondoMuestra = new javax.swing.JLabel();
        FondoMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuSistema.setBackground(new java.awt.Color(18, 45, 61));
        MenuSistema.setForeground(new java.awt.Color(0, 0, 0));
        MenuSistema.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInicio.setBackground(new java.awt.Color(18, 45, 61));
        jPanelInicio.setForeground(new java.awt.Color(18, 45, 61));

        jLabelInicio.setBackground(new java.awt.Color(18, 45, 61));
        jLabelInicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(0, 0, 0));
        jLabelInicio.setText("   INICIO");

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 30));

        jPanelMisRecetas.setBackground(new java.awt.Color(18, 45, 61));
        jPanelMisRecetas.setForeground(new java.awt.Color(18, 45, 61));

        jLabelMisRecetas.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMisRecetas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMisRecetas.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMisRecetas.setText("   MIS RECETAS");

        javax.swing.GroupLayout jPanelMisRecetasLayout = new javax.swing.GroupLayout(jPanelMisRecetas);
        jPanelMisRecetas.setLayout(jPanelMisRecetasLayout);
        jPanelMisRecetasLayout.setHorizontalGroup(
            jPanelMisRecetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMisRecetas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelMisRecetasLayout.setVerticalGroup(
            jPanelMisRecetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMisRecetas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelMisRecetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 35));

        jPanelMedicamentos.setBackground(new java.awt.Color(18, 45, 61));
        jPanelMedicamentos.setForeground(new java.awt.Color(18, 45, 61));

        jLabelMedicamentos.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMedicamentos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMedicamentos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMedicamentos.setText("   MIS MEDICAMENTOS");

        javax.swing.GroupLayout jPanelMedicamentosLayout = new javax.swing.GroupLayout(jPanelMedicamentos);
        jPanelMedicamentos.setLayout(jPanelMedicamentosLayout);
        jPanelMedicamentosLayout.setHorizontalGroup(
            jPanelMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMedicamentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelMedicamentosLayout.setVerticalGroup(
            jPanelMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMedicamentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 35));

        jPanelPedidos.setBackground(new java.awt.Color(18, 45, 61));
        jPanelPedidos.setForeground(new java.awt.Color(18, 45, 61));

        jLabelPedidos.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPedidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPedidos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPedidos.setText("   PEDIDOS");

        javax.swing.GroupLayout jPanelPedidosLayout = new javax.swing.GroupLayout(jPanelPedidos);
        jPanelPedidos.setLayout(jPanelPedidosLayout);
        jPanelPedidosLayout.setHorizontalGroup(
            jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelPedidosLayout.setVerticalGroup(
            jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 35));

        jPanelPromociones.setBackground(new java.awt.Color(18, 45, 61));
        jPanelPromociones.setForeground(new java.awt.Color(18, 45, 61));

        jLabelPromociones.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPromociones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPromociones.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPromociones.setText("   PROMOCIONES");

        javax.swing.GroupLayout jPanelPromocionesLayout = new javax.swing.GroupLayout(jPanelPromociones);
        jPanelPromociones.setLayout(jPanelPromocionesLayout);
        jPanelPromocionesLayout.setHorizontalGroup(
            jPanelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPromociones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelPromocionesLayout.setVerticalGroup(
            jPanelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPromociones, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelPromociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 35));

        jPanelRecordatorios.setBackground(new java.awt.Color(18, 45, 61));
        jPanelRecordatorios.setForeground(new java.awt.Color(18, 45, 61));

        jLabelRecordatorios.setBackground(new java.awt.Color(0, 0, 0));
        jLabelRecordatorios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRecordatorios.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRecordatorios.setText("   RECORDATORIOS");

        javax.swing.GroupLayout jPanelRecordatoriosLayout = new javax.swing.GroupLayout(jPanelRecordatorios);
        jPanelRecordatorios.setLayout(jPanelRecordatoriosLayout);
        jPanelRecordatoriosLayout.setHorizontalGroup(
            jPanelRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRecordatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelRecordatoriosLayout.setVerticalGroup(
            jPanelRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRecordatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelRecordatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 35));

        jPanelMiPerfil.setBackground(new java.awt.Color(18, 45, 61));
        jPanelMiPerfil.setForeground(new java.awt.Color(18, 45, 61));

        jLabelMiPerfil.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMiPerfil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMiPerfil.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMiPerfil.setText("   MI PERFIL");

        javax.swing.GroupLayout jPanelMiPerfilLayout = new javax.swing.GroupLayout(jPanelMiPerfil);
        jPanelMiPerfil.setLayout(jPanelMiPerfilLayout);
        jPanelMiPerfilLayout.setHorizontalGroup(
            jPanelMiPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMiPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelMiPerfilLayout.setVerticalGroup(
            jPanelMiPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMiPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelMiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 35));

        jPanelAyuda.setBackground(new java.awt.Color(18, 45, 61));
        jPanelAyuda.setForeground(new java.awt.Color(18, 45, 61));

        jLabelAyuda.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAyuda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAyuda.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAyuda.setText("   AYUDA");

        javax.swing.GroupLayout jPanelAyudaLayout = new javax.swing.GroupLayout(jPanelAyuda);
        jPanelAyuda.setLayout(jPanelAyudaLayout);
        jPanelAyudaLayout.setHorizontalGroup(
            jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelAyudaLayout.setVerticalGroup(
            jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 35));

        jPanelCerrarSesion.setBackground(new java.awt.Color(18, 45, 61));
        jPanelCerrarSesion.setForeground(new java.awt.Color(18, 45, 61));

        jLabelCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCerrarSesion.setText("   CERRAR SESION");

        javax.swing.GroupLayout jPanelCerrarSesionLayout = new javax.swing.GroupLayout(jPanelCerrarSesion);
        jPanelCerrarSesion.setLayout(jPanelCerrarSesionLayout);
        jPanelCerrarSesionLayout.setHorizontalGroup(
            jPanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelCerrarSesionLayout.setVerticalGroup(
            jPanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 455, 200, 30));

        getContentPane().add(MenuSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 580));

        Logo.setBackground(new java.awt.Color(18, 45, 61));
        Logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ICONO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N
        Logo.add(ICONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-660, -230, 1150, 600));

        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        Cabezera.setBackground(new java.awt.Color(0, 255, 153));
        Cabezera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Foto.setBackground(new java.awt.Color(255, 255, 255));
        btn_Foto.setForeground(new java.awt.Color(0, 0, 0));
        btn_Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FotoPerfil.png"))); // NOI18N
        btn_Foto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cabezera.add(btn_Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 70, 70));

        btn_SalirSesion.setBackground(new java.awt.Color(0, 102, 102));
        btn_SalirSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_SalirSesion.setForeground(new java.awt.Color(204, 255, 255));
        btn_SalirSesion.setText("SALIR");
        btn_SalirSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cabezera.add(btn_SalirSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 100, 30));

        IconoSana_sana.setBackground(new java.awt.Color(255, 255, 255));
        IconoSana_sana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoSana_sana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cabezera Sana_sana.png"))); // NOI18N
        Cabezera.add(IconoSana_sana, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 390, 170));

        FondoCabezera.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FondoCabezera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Farmacia Sana_sana.png"))); // NOI18N
        FondoCabezera.setToolTipText("");
        FondoCabezera.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        FondoCabezera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cabezera.add(FondoCabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 100));

        getContentPane().add(Cabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1010, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("INICIO", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("MIS RECETAS", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("PEDIDOS", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("MIS MEDICAMENTOS", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("PROMOCIONES", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("RECORDATORIOS", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("MI PERFIL", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("AYUDA", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CERRAR SESION", jPanel9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1010, 580));

        IconoFondoMuestra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoFondoMuestra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logomuestra.png"))); // NOI18N
        getContentPane().add(IconoFondoMuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 700, 560));

        FondoMuestra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Farmacia Sana_sana.png"))); // NOI18N
        FondoMuestra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(FondoMuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1010, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new SistemaVista().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabezera;
    private javax.swing.JLabel FondoCabezera;
    private javax.swing.JLabel FondoMuestra;
    private javax.swing.JLabel ICONO;
    private javax.swing.JLabel IconoFondoMuestra;
    private javax.swing.JLabel IconoSana_sana;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel MenuSistema;
    private javax.swing.JButton btn_Foto;
    private javax.swing.JButton btn_SalirSesion;
    public javax.swing.JLabel jLabelAyuda;
    public javax.swing.JLabel jLabelCerrarSesion;
    public javax.swing.JLabel jLabelInicio;
    public javax.swing.JLabel jLabelMedicamentos;
    public javax.swing.JLabel jLabelMiPerfil;
    public javax.swing.JLabel jLabelMisRecetas;
    public javax.swing.JLabel jLabelPedidos;
    public javax.swing.JLabel jLabelPromociones;
    public javax.swing.JLabel jLabelRecordatorios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JPanel jPanelAyuda;
    public javax.swing.JPanel jPanelCerrarSesion;
    public javax.swing.JPanel jPanelInicio;
    public javax.swing.JPanel jPanelMedicamentos;
    public javax.swing.JPanel jPanelMiPerfil;
    public javax.swing.JPanel jPanelMisRecetas;
    public javax.swing.JPanel jPanelPedidos;
    public javax.swing.JPanel jPanelPromociones;
    public javax.swing.JPanel jPanelRecordatorios;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
