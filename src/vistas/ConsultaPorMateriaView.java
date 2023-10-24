package vistas;

import accesoADatos.AlumnoData;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ConsultaPorMateriaView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private InscripcionData inscData;
    private MateriaData mData;
    private ArrayList<Materia> listaM;

    public ConsultaPorMateriaView() {

        initComponents();

        this.setTitle("Consulta de alumnos por Materia");
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        mData = new MateriaData();
        listaM = (ArrayList<Materia>) mData.listarMaterias();

        cargarMaterias();
        armarCabeceraTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBSelecMat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLisMat = new javax.swing.JTable();
        jSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 153));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Listado de alumnos por materia");

        jLabel2.setText("Selecciona una materia:");

        jCBSelecMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSelecMatActionPerformed(evt);
            }
        });

        jtLisMat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(jtLisMat);

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSalir)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(56, 56, 56)
                                    .addComponent(jCBSelecMat, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jCBSelecMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jSalir)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBSelecMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSelecMatActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        
        Materia selec = (Materia) jCBSelecMat.getSelectedItem();
        int id = selec.getIdMateria();
        List<Alumno> aa = inscData.obtenerAlumnosXMateria(id);

        for (Alumno i : aa) {
            modelo.addRow(new Object[]{i.getIdAlumno(), i.getDni(), i.getApellido(), i.getNombre()});
        }
    }//GEN-LAST:event_jCBSelecMatActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void cargarMaterias() {
        for (Materia item : listaM) {
            jCBSelecMat.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("DNI");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtLisMat.setModel(modelo);
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> jCBSelecMat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtLisMat;
    // End of variables declaration//GEN-END:variables
}
