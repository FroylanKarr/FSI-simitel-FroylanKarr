import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FProcedimientos extends javax.swing.JFrame {

    Conexion2 cnx;
    String todo = "SELECT * FROM medicos";
    ImageIcon foto;
    String archivoFoto;

    public FProcedimientos() {
        initComponents();
        setLocationRelativeTo(this);
        TConsultas.setRowHeight(80);

        cnx = new Conexion2();
        if (cnx.conectar("localhost", "simitel", "root", "") == 1) {
            cnx.entablar(todo, TConsultas);
        } else {
            JOptionPane.showMessageDialog(this, "Sin conexion a la BD");
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        BProcedimiento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TCedula = new javax.swing.JTextField();
        TNombre = new javax.swing.JTextField();
        TEspecialidad = new javax.swing.JTextField();
        CBSexo = new javax.swing.JComboBox<>();
        TFechaNac = new javax.swing.JTextField();
        CBEstado = new javax.swing.JComboBox<>();
        LFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE MEDICOS - Procedimientos Almacenados (Simitel)");
        setBackground(new java.awt.Color(0, 0, 0));

        jToolBar1.setRollover(true);

        BProcedimiento.setText("INSERTAR");
        BProcedimiento.setFocusable(false);
        BProcedimiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BProcedimiento.setMaximumSize(new java.awt.Dimension(130, 70));
        BProcedimiento.setMinimumSize(new java.awt.Dimension(130, 70));
        BProcedimiento.setPreferredSize(new java.awt.Dimension(130, 70));
        BProcedimiento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BProcedimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProcedimientoActionPerformed(evt);
            }
        });
        jToolBar1.add(BProcedimiento);

        TConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEDULA", "NOMBRE", "ESPECIALIDAD", "SEXO", "FECHA_NAC", "ESTADO", "FOTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TConsultasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultas);

        jLabel2.setText("CEDULA:");

        jLabel3.setText("NOMBRE:");

        jLabel4.setText("ESPECIALIDAD:");

        jLabel5.setText("SEXO:");

        jLabel6.setText("FECHA NAC:");

        jLabel7.setText("ESTADO:");

        CBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "masculino", "femenino", "otro" }));

        TFechaNac.setText("1990-01-01");

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));

        LFoto.setBackground(new java.awt.Color(51, 102, 0));
        LFoto.setForeground(new java.awt.Color(255, 255, 255));
        LFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFoto.setText("Click para foto");
        LFoto.setOpaque(true);
        LFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LFotoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(TEspecialidad)
                            .addComponent(CBSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addComponent(LFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TConsultasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultasMousePressed
        int fila = TConsultas.getSelectedRow();
        if (fila != -1) {
            TCedula.setText(String.valueOf(TConsultas.getValueAt(fila, 0)));
            TNombre.setText(String.valueOf(TConsultas.getValueAt(fila, 1)));
            TEspecialidad.setText(String.valueOf(TConsultas.getValueAt(fila, 2)));
            CBSexo.setSelectedItem(String.valueOf(TConsultas.getValueAt(fila, 3)));
            TFechaNac.setText(String.valueOf(TConsultas.getValueAt(fila, 4)));
            CBEstado.setSelectedItem(String.valueOf(TConsultas.getValueAt(fila, 5)));
            Object valFoto = TConsultas.getValueAt(fila, 6);
            if (valFoto instanceof ImageIcon) {
                foto = (ImageIcon) valFoto;
                LFoto.setText("");
                LFoto.setIcon(new ImageIcon(Conexion2.escalarImagen(foto.getImage(), LFoto.getWidth(), LFoto.getHeight())));
            } else {
                LFoto.setIcon(null);
                LFoto.setText("Click para foto");
            }
            archivoFoto = null;
        }
    }//GEN-LAST:event_TConsultasMousePressed

    private void BProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BProcedimientoActionPerformed
        try {
            byte[] bytesFoto = (archivoFoto != null && !archivoFoto.isEmpty())
                    ? Files.readAllBytes(Path.of(archivoFoto))
                    : new byte[0];

            Object[] res = cnx.ejecutarCRUD(
                    "gestionar_medico",
                    new Object[]{
                        "INSERT",
                        TCedula.getText().trim(),
                        TNombre.getText().trim(),
                        TEspecialidad.getText().trim(),
                        CBSexo.getSelectedItem().toString(),
                        LocalDate.parse(TFechaNac.getText().trim()),
                        CBEstado.getSelectedItem().toString(),
                        bytesFoto
                    }
            );
            JOptionPane.showMessageDialog(this, "Estado: " + res[0] + "\nMensaje: " + res[1]);
            if (Integer.parseInt(res[0].toString()) == 1) {
                cnx.entablar(todo, TConsultas);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error en los datos (verifica fecha AAAA-MM-DD): " + ex.getMessage());
        }
    }//GEN-LAST:event_BProcedimientoActionPerformed

    private void LFotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LFotoMousePressed
        JFileChooser fc = new JFileChooser(System.getProperty("user.dir") + "/imagenes/");
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            archivoFoto = fc.getSelectedFile().getPath();
            foto = new ImageIcon(archivoFoto);
            LFoto.setText("");
            LFoto.setIcon(new ImageIcon(Conexion2.escalarImagen(foto.getImage(), LFoto.getWidth(), LFoto.getHeight())));
        }
    }//GEN-LAST:event_LFotoMousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FProcedimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FProcedimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BProcedimiento;
    private javax.swing.JComboBox<String> CBEstado;
    private javax.swing.JComboBox<String> CBSexo;
    private javax.swing.JLabel LFoto;
    private javax.swing.JTextField TCedula;
    private javax.swing.JTable TConsultas;
    private javax.swing.JTextField TEspecialidad;
    private javax.swing.JTextField TFechaNac;
    private javax.swing.JTextField TNombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
