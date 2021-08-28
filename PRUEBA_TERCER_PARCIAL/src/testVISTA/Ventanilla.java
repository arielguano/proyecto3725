
package testVISTA;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import Dominio.caja;
import javax.swing.ButtonGroup;

public class Ventanilla extends javax.swing.JFrame {
//DELARACION DEL METODO QUE VAMOS A USAR
    DefaultTableModel model;
    caja caja;
    //CREAMOS UNA LISTA QUE CONTENDRA LOS VALORES DE caja
    ArrayList<caja> productos = new ArrayList<>();
    ButtonGroup grupo = new ButtonGroup();
   //--------------------------------------------------------------------------
    public Ventanilla() {
        initComponents();
         model = new DefaultTableModel();
        //COLOCAMOS MANUALMENTE LOS ENCABEZADOS DE LAS COLUMNAS 
        model.addColumn("CODIGO");
        model.addColumn("NOMBRES");
        model.addColumn("SALDO");
        
                   this.jTable1.setModel(model);
        //----------------------------------------------------------------------
        //LOS ELEMENTOS SE AÑADIRAN
        grupo.add(Rb_DEPOSITO);
        grupo.add(Rb_Retiro);
        grupo.add(Rb_Eliminar);
        //----------------------------------------------------------------------
          Rb_DEPOSITO.setEnabled(true);
          Rb_Retiro.setEnabled(true);
          Rb_Eliminar.setEnabled(true);
        //ACEMOS EL LLAMDA DE LA FUNCION PARA BLOQUEAR LOS BOTONES
       TeclaBLOCK();
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        COD = new javax.swing.JTextField();
        NOMBRES = new javax.swing.JTextField();
        SALDOINICIO = new javax.swing.JTextField();
        BOTON_INSERTAR = new javax.swing.JButton();
        TABLA_UNO = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Rb_DEPOSITO = new javax.swing.JRadioButton();
        Rb_Retiro = new javax.swing.JRadioButton();
        Rb_Eliminar = new javax.swing.JRadioButton();
        Lb_VALOR = new javax.swing.JLabel();
        TXT_VALORES = new javax.swing.JTextField();
        button_Procesar = new javax.swing.JButton();
        Lb_BANCO = new javax.swing.JLabel();
        TXT_BANCO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        Lb_SALDOS = new javax.swing.JLabel();
        TXT_SALDO_FINAL = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CAJA AHORRO ESPE");

        jLabel2.setText("CODIGO");

        jLabel3.setText("NOMBRES");

        jLabel4.setText("SALDO INICIAL");

        COD.setSelectedTextColor(new java.awt.Color(51, 102, 0));

        NOMBRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBRESActionPerformed(evt);
            }
        });

        SALDOINICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALDOINICIOActionPerformed(evt);
            }
        });

        BOTON_INSERTAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BOTON_INSERTAR.setText("INSERTAR");
        BOTON_INSERTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_INSERTARActionPerformed(evt);
            }
        });

        TABLA_UNO.setForeground(new java.awt.Color(204, 0, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        TABLA_UNO.setViewportView(jTable1);

        Rb_DEPOSITO.setText("DEPOSITAR");
        Rb_DEPOSITO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb_DEPOSITOActionPerformed(evt);
            }
        });

        Rb_Retiro.setText("RETIRAR");
        Rb_Retiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb_RetiroActionPerformed(evt);
            }
        });

        Rb_Eliminar.setText("ELIMINAR");
        Rb_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb_EliminarActionPerformed(evt);
            }
        });

        Lb_VALOR.setText("VALOR");

        TXT_VALORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_VALORESActionPerformed(evt);
            }
        });

        button_Procesar.setText("PROCESAR");
        button_Procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ProcesarActionPerformed(evt);
            }
        });

        Lb_BANCO.setText("TOT: BANCO");

        jLabel7.setText("Nombre: ");

        Lb_SALDOS.setText("SALDO:");

        jTextPane1.setText("Para Eliminar aga clik en el  la fila que desea eliminar y luego  aplaste el boton \"ELIMINAR\"");
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(244, 244, 244))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Rb_DEPOSITO)
                                .addGap(39, 39, 39)
                                .addComponent(Lb_VALOR))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Rb_Retiro)
                                    .addComponent(Rb_Eliminar))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button_Procesar)
                                    .addComponent(TXT_VALORES, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_BANCO)
                            .addComponent(TXT_BANCO, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(COD, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NOMBRES, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SALDOINICIO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(BOTON_INSERTAR)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lb_SALDOS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(TXT_SALDO_FINAL, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TABLA_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(COD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOMBRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SALDOINICIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BOTON_INSERTAR)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(TABLA_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_SALDO_FINAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_SALDOS)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rb_DEPOSITO)
                    .addComponent(Lb_VALOR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rb_Retiro)
                    .addComponent(TXT_VALORES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_BANCO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button_Procesar)
                        .addComponent(TXT_BANCO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Rb_Eliminar))
                .addGap(18, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTON_INSERTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_INSERTARActionPerformed
        // TODO add your handling code here:
         double Saldo = Double.parseDouble(SALDOINICIO.getText());
        //______________________________________________________________________
         caja= new caja(NOMBRES.getText(),Saldo);
        productos.add(caja);
         //INICIALISACION ------------------------------------------------------
        String kase = String.valueOf(caja.getCuenta());
          String kase12 = String.valueOf(caja.getCuenta() + 1);
               String[] pro= new String[3];
        //----------------------------------------------------------------------
        //+++++++++++++++++ARREGLOS CON INICIO DE VARIABLES+++++++++++++++++++++
        pro[0] = kase;
           //                                                                  - 
               pro[1] = NOMBRES.getText();//                                   -
            //                                                                 -
                         pro[2] = SALDOINICIO.getText();//                     -
        model.addRow(pro);//                                                   -
        //______________________________________________________________________
        NOMBRES.setText("");
        SALDOINICIO.setText("");
        COD.setText(kase12);
        //----------------------------------------------------------------------
        
    }//GEN-LAST:event_BOTON_INSERTARActionPerformed

    private void NOMBRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBRESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBRESActionPerformed

    private void SALDOINICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALDOINICIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SALDOINICIOActionPerformed
private void nombresKeyTyped(java.awt.event.KeyEvent evt) {                                 
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
        JOptionPane.showMessageDialog(rootPane,"");
        }
    } 
    
    private void Rb_DEPOSITOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb_DEPOSITOActionPerformed
        // TODO add your handling code here:
         button_Procesar.setEnabled(true);
         //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
         //especificaremos cuando aparesca el boton con esta funcion
         TXT_VALORES.setEnabled(true);
    }//GEN-LAST:event_Rb_DEPOSITOActionPerformed

    private void Rb_RetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb_RetiroActionPerformed
        // TODO add your handling code here:
        TXT_VALORES.setEnabled(true);
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        button_Procesar.setEnabled(true);
         
      
    }//GEN-LAST:event_Rb_RetiroActionPerformed

    private void Rb_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb_EliminarActionPerformed
        // TODO add your handling code here:
          int fila = jTable1.getSelectedRow();
        if(fila>=0){
            model.removeRow(fila);
        }
    }//GEN-LAST:event_Rb_EliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        Rb_DEPOSITO.setEnabled(true);
        Rb_Retiro.setEnabled(true);
        Rb_Eliminar.setEnabled(true);
        int seleccionar = jTable1.rowAtPoint(evt.getPoint());
        
         txtNombre.setText(String.valueOf(jTable1.getValueAt(seleccionar, 1)));
         TXT_SALDO_FINAL.setText(String.valueOf(jTable1.getValueAt(seleccionar, 2)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void TXT_VALORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_VALORESActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TXT_VALORESActionPerformed
void TeclaBLOCK(){
        //ESTA FUNCION LA LLAMAREMOS EN EL Principal
            Rb_DEPOSITO.setEnabled(false);
            Rb_Retiro.setEnabled(false);
            Rb_Eliminar.setEnabled(false);
            //****************************************************************************************
//            Descripción. El comando OBJECT setEnabled  utilizado para activar o desactivar el objeto
//            o grupo de objetos especificado por objeto en el formulario actual. 
//            Un objeto activo reacciona a los clics y atajos de teclado. 
//            Si pasa el parámetro opcional *, indica que el parámetro 
//            objeto es un nombre de objeto (cadena).
              //***************************************************************************************
            button_Procesar.setEnabled(false);
            TXT_VALORES.setEnabled(false);
            COD.setEnabled(false);
    }
    private void button_ProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ProcesarActionPerformed
        // TODO add your handling code here:
         int saldo = Integer.parseInt(TXT_SALDO_FINAL.getText());
       int valor1 = Integer.parseInt(TXT_VALORES.getText());
       //-----------------------------------------------------------------------
       if(Rb_DEPOSITO.isEnabled()){
           int operacion = saldo+valor1;
           TXT_BANCO.setText(String.valueOf(operacion));
       }else{
           int operacion = saldo +valor1;
           TXT_BANCO.setText(String.valueOf(operacion));
       }
    }//GEN-LAST:event_button_ProcesarActionPerformed
    private void valorKeyTyped(java.awt.event.KeyEvent evt) {                               
     char validar = evt.getKeyChar();
           if (Character.isLetter(validar)) {
                   JOptionPane.showMessageDialog(rootPane, "");
        }
    }
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
            java.util.logging.Logger.getLogger(Ventanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanilla().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTON_INSERTAR;
    private javax.swing.JTextField COD;
    private javax.swing.JLabel Lb_BANCO;
    private javax.swing.JLabel Lb_SALDOS;
    private javax.swing.JLabel Lb_VALOR;
    private javax.swing.JTextField NOMBRES;
    private javax.swing.JRadioButton Rb_DEPOSITO;
    private javax.swing.JRadioButton Rb_Eliminar;
    private javax.swing.JRadioButton Rb_Retiro;
    private javax.swing.JTextField SALDOINICIO;
    private javax.swing.JScrollPane TABLA_UNO;
    private javax.swing.JTextField TXT_BANCO;
    private javax.swing.JTextField TXT_SALDO_FINAL;
    private javax.swing.JTextField TXT_VALORES;
    private javax.swing.JButton button_Procesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
