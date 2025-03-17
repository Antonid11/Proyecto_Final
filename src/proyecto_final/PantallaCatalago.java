/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_final;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

/**
 *
 * @author mayel
 */
public class PantallaCatalago extends javax.swing.JFrame {

    private String nombre;
    private Catalogo catalogo;
    private Carrito carrito;
    private ArrayList<Producto> Frutas_Verduras = new ArrayList<Producto>();
    private ArrayList<Producto> Lacteos = new ArrayList<Producto>();
    private ArrayList<Producto> Abarrotes = new ArrayList<Producto>();
    private ArrayList<Producto> Bebidas = new ArrayList<Producto>();
    private static Catalogo cat = new Catalogo();

    /**
     * Creates new form PantallaCatalago
     */
    public PantallaCatalago(String nombre) {
        initComponents();
        inicializarArrayList();
        this.nombre = nombre;
        this.catalogo = new Catalogo();
        this.carrito = new Carrito();
        setLocationRelativeTo(null);
        setTitle("Supermercado en línea - Catálogo");
        jLabelBienvenida.setText("Bienvenido/a " + nombre + "! Selecciona tus Productos:");

    }

    public void inicializarArrayList() {
        Producto[][] Temporal = new Producto[4][5];
        Temporal = cat.getProductos();

        for (int i = 0; i < Temporal.length; i++) {
            for (int j = 0; j < Temporal[i].length; j++) {
                if (i == 0) {
                    Frutas_Verduras.add(Temporal[i][j]);
                } else if (i == 1) {
                    Lacteos.add(Temporal[i][j]);
                } else if (i == 2) {
                    Abarrotes.add(Temporal[i][j]);
                } else if (i == 3) {
                    Bebidas.add(Temporal[i][j]);
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCategorias = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanelCarrito = new javax.swing.JPanel();
        jLabelCarrito = new javax.swing.JLabel();
        jPanelCentralCarrito = new javax.swing.JPanel();
        JPanelProductosCarrito = new javax.swing.JScrollPane();
        JListProductosCarrito = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jPanelCategorias = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabelCategorias = new javax.swing.JLabel();
        JPanelProductos = new javax.swing.JScrollPane();
        JListProductos = new javax.swing.JList<>();
        jPanelBienvenida = new javax.swing.JPanel();
        jLabelBienvenida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelButtons = new javax.swing.JPanel();
        VerCarrito = new javax.swing.JButton();
        AgregarAlCarrito = new javax.swing.JButton();

        jDialog1.setMinimumSize(new java.awt.Dimension(725, 372));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanelCarrito.setBackground(new java.awt.Color(102, 102, 255));

        jLabelCarrito.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabelCarrito.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCarrito.setText("Carrito");

        javax.swing.GroupLayout jPanelCarritoLayout = new javax.swing.GroupLayout(jPanelCarrito);
        jPanelCarrito.setLayout(jPanelCarritoLayout);
        jPanelCarritoLayout.setHorizontalGroup(
            jPanelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarritoLayout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabelCarrito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCarritoLayout.setVerticalGroup(
            jPanelCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanelCentralCarrito.setBackground(new java.awt.Color(255, 255, 255));

        JPanelProductosCarrito.setBackground(new java.awt.Color(255, 255, 255));
        JPanelProductosCarrito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        JListProductosCarrito.setBackground(new java.awt.Color(255, 255, 255));
        JListProductosCarrito.setForeground(new java.awt.Color(0, 0, 0));
        JPanelProductosCarrito.setViewportView(JListProductosCarrito);

        javax.swing.GroupLayout jPanelCentralCarritoLayout = new javax.swing.GroupLayout(jPanelCentralCarrito);
        jPanelCentralCarrito.setLayout(jPanelCentralCarritoLayout);
        jPanelCentralCarritoLayout.setHorizontalGroup(
            jPanelCentralCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralCarritoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(JPanelProductosCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelCentralCarritoLayout.setVerticalGroup(
            jPanelCentralCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralCarritoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JPanelProductosCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCentralCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanelCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCentralCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanelCentral.setBackground(new java.awt.Color(255, 255, 255));

        jPanelCategorias.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCategorias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        grupoCategorias.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Frutas y Verduras");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        grupoCategorias.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Lacteos");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        grupoCategorias.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setText("Abarrotes");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        grupoCategorias.add(jRadioButton4);
        jRadioButton4.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton4.setText("Bebidas");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabelCategorias.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCategorias.setText("Categorias: ");

        javax.swing.GroupLayout jPanelCategoriasLayout = new javax.swing.GroupLayout(jPanelCategorias);
        jPanelCategorias.setLayout(jPanelCategoriasLayout);
        jPanelCategoriasLayout.setHorizontalGroup(
            jPanelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(35, 35, 35)
                .addComponent(jRadioButton2)
                .addGap(44, 44, 44)
                .addComponent(jRadioButton3)
                .addGap(49, 49, 49)
                .addComponent(jRadioButton4)
                .addGap(19, 19, 19))
        );
        jPanelCategoriasLayout.setVerticalGroup(
            jPanelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jLabelCategorias))
                .addContainerGap())
        );

        JPanelProductos.setBackground(new java.awt.Color(255, 255, 255));
        JPanelProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        JListProductos.setBackground(new java.awt.Color(255, 255, 255));
        JListProductos.setForeground(new java.awt.Color(0, 0, 0));
        JPanelProductos.setViewportView(JListProductos);

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPanelProductos)
                    .addComponent(jPanelCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPanelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanelBienvenida.setBackground(new java.awt.Color(102, 102, 255));

        jLabelBienvenida.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabelBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBienvenida.setText("Bienvenido ! Selecciona tus Productos:");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Productos :");

        javax.swing.GroupLayout jPanelBienvenidaLayout = new javax.swing.GroupLayout(jPanelBienvenida);
        jPanelBienvenida.setLayout(jPanelBienvenidaLayout);
        jPanelBienvenidaLayout.setHorizontalGroup(
            jPanelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBienvenidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );
        jPanelBienvenidaLayout.setVerticalGroup(
            jPanelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanelButtons.setBackground(new java.awt.Color(204, 204, 255));

        VerCarrito.setBackground(new java.awt.Color(102, 102, 255));
        VerCarrito.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        VerCarrito.setForeground(new java.awt.Color(255, 255, 255));
        VerCarrito.setText("Ver Carrito");
        VerCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCarritoActionPerformed(evt);
            }
        });

        AgregarAlCarrito.setBackground(new java.awt.Color(0, 153, 0));
        AgregarAlCarrito.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        AgregarAlCarrito.setForeground(new java.awt.Color(255, 255, 255));
        AgregarAlCarrito.setText("Agregar al Carrito");
        AgregarAlCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAlCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(VerCarrito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(AgregarAlCarrito))
        );
        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerCarrito)
                    .addComponent(AgregarAlCarrito))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanelBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

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

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            DefaultListModel ModeloLista = new DefaultListModel();

            for (int i = 0; i < Frutas_Verduras.size(); i++) {
                ModeloLista.addElement(Frutas_Verduras.get(i));
            }

            JListProductos.setModel(ModeloLista);

        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton2.isShowing()) {
            DefaultListModel ModeloLista = new DefaultListModel();
            for (int i = 0; i < Lacteos.size(); i++) {
                ModeloLista.addElement(Lacteos.get(i));
            }
            JListProductos.setModel(ModeloLista);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void VerCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCarritoActionPerformed
        // TODO add your handling code here:
        jDialog1.setVisible(true);
    }//GEN-LAST:event_VerCarritoActionPerformed

    private void AgregarAlCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAlCarritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarAlCarritoActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton3.isSelected()) {
            DefaultListModel ModeloLista = new DefaultListModel();
            for (int i = 0; i < Abarrotes.size(); i++) {
                ModeloLista.addElement(Abarrotes.get(i));

            }
            JListProductos.setModel(ModeloLista);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton4.isSelected()) {
            DefaultListModel ModeloLista = new DefaultListModel();
            for (int i = 0; i < Bebidas.size(); i++) {
                ModeloLista.addElement(Bebidas.get(i));
            }
            JListProductos.setModel(ModeloLista);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PantallaCatalago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCatalago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCatalago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCatalago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCatalago("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarAlCarrito;
    private javax.swing.JList<String> JListProductos;
    private javax.swing.JList<String> JListProductosCarrito;
    private javax.swing.JScrollPane JPanelProductos;
    private javax.swing.JScrollPane JPanelProductosCarrito;
    private javax.swing.JButton VerCarrito;
    private javax.swing.ButtonGroup grupoCategorias;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBienvenida;
    private javax.swing.JLabel jLabelCarrito;
    private javax.swing.JLabel jLabelCategorias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBienvenida;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelCarrito;
    private javax.swing.JPanel jPanelCategorias;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelCentralCarrito;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
