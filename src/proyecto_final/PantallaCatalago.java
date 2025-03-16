/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_final;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

/**
 *
 * @author mayel
 */
public class PantallaCatalago extends javax.swing.JFrame {

    private String nombre;
    private Catalogo catalogo;
    private Carrito carrito;
    private ArrayList<Producto> listaProducto;

    /**
     * Creates new form PantallaCatalago
     */
    public PantallaCatalago(String nombre) {
        initComponents();
        this.nombre = nombre;
        this.catalogo = new Catalogo();
        this.carrito = new Carrito();
        this.listaProducto = new ArrayList<Producto>();
        setLocationRelativeTo(null);
        setTitle("Supermercado en línea - Catálogo");
        jLabelBienvenida.setText("Bienvenido/a " + nombre + "! Selecciona tus Productos:");
        jPanelCategorias.add(jLabelCategorias);
        javax.swing.JPanel radioPanel = new javax.swing.JPanel();
        javax.swing.ButtonGroup grupoCategorias = new javax.swing.ButtonGroup();
        String[] categorias = {"Frutas y Verduras", "Lácteos", "Abarrotes", "Bebidas"};
    }

    public JLabel getjLabel1() {
        return jLabelBienvenida;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabelBienvenida = jLabel1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public ButtonGroup getGrupoCategorias() {
        return grupoCategorias;
    }

    public void setGrupoCategorias(ButtonGroup grupoCategorias) {
        this.grupoCategorias = grupoCategorias;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JLabel getjLabelBienvenida() {
        return jLabelBienvenida;
    }

    public void setjLabelBienvenida(JLabel jLabelBienvenida) {
        this.jLabelBienvenida = jLabelBienvenida;
    }

    public JLabel getjLabelCategorias() {
        return jLabelCategorias;
    }

    public void setjLabelCategorias(JLabel jLabelCategorias) {
        this.jLabelCategorias = jLabelCategorias;
    }

    public JList<String> getjList1() {
        return jList1;
    }

    public void setjList1(JList<String> jList1) {
        this.jList1 = jList1;
    }

    public JPanel getjPanelBienvenida() {
        return jPanelBienvenida;
    }

    public void setjPanelBienvenida(JPanel jPanelBienvenida) {
        this.jPanelBienvenida = jPanelBienvenida;
    }

    public JPanel getjPanelButtons() {
        return jPanelButtons;
    }

    public void setjPanelButtons(JPanel jPanelButtons) {
        this.jPanelButtons = jPanelButtons;
    }

    public JPanel getjPanelCategorias() {
        return jPanelCategorias;
    }

    public void setjPanelCategorias(JPanel jPanelCategorias) {
        this.jPanelCategorias = jPanelCategorias;
    }

    public JPanel getjPanelCentral() {
        return jPanelCentral;
    }

    public void setjPanelCentral(JPanel jPanelCentral) {
        this.jPanelCentral = jPanelCentral;
    }

    public JRadioButton getjRadioButton1() {
        return jRadioButton1;
    }

    public void setjRadioButton1(JRadioButton jRadioButton1) {
        this.jRadioButton1 = jRadioButton1;
    }

    public JRadioButton getjRadioButton2() {
        return jRadioButton2;
    }

    public void setjRadioButton2(JRadioButton jRadioButton2) {
        this.jRadioButton2 = jRadioButton2;
    }

    public JRadioButton getjRadioButton3() {
        return jRadioButton3;
    }

    public void setjRadioButton3(JRadioButton jRadioButton3) {
        this.jRadioButton3 = jRadioButton3;
    }

    public JRadioButton getjRadioButton4() {
        return jRadioButton4;
    }

    public void setjRadioButton4(JRadioButton jRadioButton4) {
        this.jRadioButton4 = jRadioButton4;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
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
        jPanel1 = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jPanelCategorias = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabelCategorias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanelBienvenida = new javax.swing.JPanel();
        jLabelBienvenida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelButtons = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        grupoCategorias.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Lacteos");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        grupoCategorias.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setText("Abarrotes");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        grupoCategorias.add(jRadioButton4);
        jRadioButton4.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton4.setText("Bebidas");

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

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jList1.setBackground(new java.awt.Color(255, 255, 255));
        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanelCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ver Carrito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Agregar al Carrito");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

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
    private javax.swing.ButtonGroup grupoCategorias;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBienvenida;
    private javax.swing.JLabel jLabelCategorias;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBienvenida;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelCategorias;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}