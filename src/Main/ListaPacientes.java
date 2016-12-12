/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DaoImp.PacientesDaoImp;
import POJO.Pacientes;
import java.awt.Frame;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Util.RandomConnection;

/**
 *
 * @author Reymundo Tenorio
 */
public class ListaPacientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaPacientes
     */
    public ListaPacientes() {
        initComponents();
        btnbuscar.setToolTipText("Buscar Paciente");
        btnclean.setToolTipText("Limpiar Tabla Con Pacientes");
        btnmost.setToolTipText("Mostrar Todos Los Pacientes");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnmost = new javax.swing.JButton();
        btnclean = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Pacientes");
        setAutoscrolls(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        btnmost.setText("Mostrar Todos");
        btnmost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostActionPerformed(evt);
            }
        });
        jPanel2.add(btnmost);

        btnclean.setText("Limpiar Tabla");
        btnclean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncleanActionPerformed(evt);
            }
        });
        jPanel2.add(btnclean);

        btnbuscar.setText("Buscar Paciente");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnbuscar);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        setBounds(0, 0, 750, 468);
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel model = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    };

//table.setModel(tableModel);
//    DefaultTableModel tableModel = new DefaultTableModel() {
//
//   @Override
//   public boolean isCellEditable(int row, int column) {
//       //Only the third column
//       return column == 3;
//   }
//};
//
//table.setModel(tableModel);
    public void TablaBuscar(Pacientes e) {
//         try {
//            new RandomConnection(("Pacientes.dat")).Conectar();
//        } catch (FileNotFoundException ex) {
//            System.out.println("Archivo No Encontrado");
//        } catch (IOException ex) {
//            System.out.println("Error al Conectar");
//        }
//        
//         PacientesDaoImp cdi = new PacientesDaoImp();
//        
//         List<CursosINATEC> cursos = null;
//        try {
//            cursos = cdi.EncontrarTodos();
//        } catch (IOException ex) {
//            System.out.println("No Se Pudo Leer Todos");
//        }

        //  DefaultTableModel model = new DefaultTableModel();
        String header[] = {"Paciente No", "Cedula", "Nombres", "Apellidos", "Edad", "Ocupacion", "Direccion", "Telefono", "Expediente"};

        model.setColumnIdentifiers(header);

        String Datos[] = new String[9];
        model.setNumRows(0);
        jTable1.setModel(model);

        //   for ( Pacientes e : cursos  ){
        Datos[0] = String.valueOf(e.getId());
        Datos[1] = e.getCedula();
        Datos[2] = e.getNombres();
        Datos[3] = e.getApellidos();
        Datos[4] = String.valueOf(e.getEdad());
        Datos[5] = e.getOcupacion();
        Datos[6] = e.getDireccion();
        Datos[7] = e.getTelefonos();
        Datos[8] = e.getExpediente();

        model.addRow(Datos);

        //  }       
        // TODO add your handling code here:
    }

    public void MostrarTodos() {

        try {
            new RandomConnection(("Pacientes.dat")).Conectar();
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo No Encontrado");
        } catch (IOException ex) {
            System.out.println("Error al Conectar");
        }

        PacientesDaoImp cdi = new PacientesDaoImp();

        List<Pacientes> cursos = null;
        try {
            cursos = cdi.EncontrarTodos();
        } catch (IOException ex) {
            System.out.println("No Se Pudo Leer Todos");
        }

        //DefaultTableModel model = new DefaultTableModel();
        String header[] = {"Paciente No", "Cedula", "Nombres", "Apellidos", "Edad", "Ocupacion", "Direccion", "Telefono", "Expediente"};

        model.setColumnIdentifiers(header);

        String Datos[] = new String[9];
        model.setNumRows(0);
        jTable1.setModel(model);

        for (Pacientes e : cursos) {

            Datos[0] = String.valueOf(e.getId());
            Datos[1] = e.getCedula();
            Datos[2] = e.getNombres();
            Datos[3] = e.getApellidos();
            Datos[4] = String.valueOf(e.getEdad());
            Datos[5] = e.getOcupacion();
            Datos[6] = e.getDireccion();
            Datos[7] = e.getTelefonos();
            Datos[8] = e.getExpediente();

            model.addRow(Datos);

        }
    }

    private void btnmostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostActionPerformed

        MostrarTodos();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnmostActionPerformed

    private void btncleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncleanActionPerformed
        jTable1.setModel(new DefaultTableModel());       // TODO add your handling code here:
    }//GEN-LAST:event_btncleanActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        Frame f = JOptionPane.getFrameForComponent(this);
        BuscarPaciente bn = new BuscarPaciente(f, true);
        bn.setVisible(true);

        jTable1.setModel(bn.model);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount() == 2 && evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {

            int fila = jTable1.rowAtPoint(evt.getPoint());
            int columna = jTable1.columnAtPoint(evt.getPoint());

            String obtn = null;
            if ((fila > -1) && (columna > -1)) // System.out.println(model.getValueAt(fila,columna));
            {
                obtn = (String) this.jTable1.getModel().getValueAt(fila, 8);
            }
            //  System.out.println("sddfd "+obtn);

            VerExpedientes te = new VerExpedientes();

            //   this.jDesktopPane1 = this.getDesktopPane();
//jDesktopPane1.add(te);
            te.setVisible(true);

            this.getDesktopPane().add(te);

            setCentrarJInternalFrame(te);

            te.toFront();

            te.AbrirExpendiente(obtn);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        MostrarTodos();        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    //  private javax.swing.JDesktopPane jDesktopPane1;
    private void setCentrarJInternalFrame(JInternalFrame jifrm) {
        jifrm.setLocation(jifrm.getParent().getWidth() / 2 - jifrm.getWidth() / 2, jifrm.getParent().getHeight() / 2 - jifrm.getHeight() / 2 - 20);
    }

//    public void setjTable1(JTable jTable1) {
//        this.jTable1 = jTable1;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnclean;
    private javax.swing.JButton btnmost;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
