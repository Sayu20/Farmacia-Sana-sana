package Vista;

public class LoginVista extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginVista.class.getName());

    public LoginVista() {
        initComponents();
        setSize(930,420);
        setResizable(false);
        setTitle("Ingresar al Sistema");
        setLocationRelativeTo(null);
        this.repaint(); 
   btn_Ingresar.addActionListener(e -> {
        RegistroVista registro = new RegistroVista();
        registro.setVisible(true);
        this.dispose(); 
    });
     btn_Ingresar.addActionListener(e -> {
            SistemaVista sistema = new SistemaVista();
            sistema.setVisible(true);
            sistema.dispose(); 
             });
             }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Ingresar = new javax.swing.JButton();
        txt_Contraseña = new javax.swing.JPasswordField();
        txt_Usuario = new javax.swing.JTextField();
        fondoIniciarSesion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Texto = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIAR SESION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, 60));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 90, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        btn_Ingresar.setBackground(new java.awt.Color(0, 102, 102));
        btn_Ingresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ingresar.setText("INGRESAR");
        btn_Ingresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Ingresar.addActionListener(this::btn_IngresarActionPerformed);
        jPanel1.add(btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 210, -1));

        txt_Contraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, 35));

        txt_Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 210, 35));

        fondoIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Farmacia Sana_sana.png"))); // NOI18N
        jPanel1.add(fondoIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 490, 420));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/txt de la Farmacia Sana_sana.png"))); // NOI18N
        jPanel2.add(Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 400, 290));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image (1).png"))); // NOI18N
        Logo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -40, 530, 610));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Farmacia Sana_sana.png"))); // NOI18N
        jPanel2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 420));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        
    }//GEN-LAST:event_btn_IngresarActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new LoginVista().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Texto;
    public javax.swing.JButton btn_Ingresar;
    private javax.swing.JLabel fondoIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPasswordField txt_Contraseña;
    public javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
