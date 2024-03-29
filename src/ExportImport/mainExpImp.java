/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExportImport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author lnegreiros
 */
public class mainExpImp extends javax.swing.JFrame {

    /**
     * Creates new form mainExpImp
     */
    public mainExpImp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableExport = new javax.swing.JTable();
        jButtonExportTable = new javax.swing.JButton();
        jButtonExportText = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneImport = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTableExport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Pedro", "25", "Castanho", "Matar a velhinha"},
                {"Amanda", "86", "Branco", "Continuar viva"}
            },
            new String [] {
                "Nome", "Idade", "Tipo", "Objetivo"
            }
        ));
        jScrollPane1.setViewportView(jTableExport);
        if (jTableExport.getColumnModel().getColumnCount() > 0) {
            jTableExport.getColumnModel().getColumn(0).setResizable(false);
            jTableExport.getColumnModel().getColumn(1).setResizable(false);
            jTableExport.getColumnModel().getColumn(2).setResizable(false);
            jTableExport.getColumnModel().getColumn(3).setResizable(false);
        }

        jButtonExportTable.setText("Export Tabela");
        jButtonExportTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportTableActionPerformed(evt);
            }
        });

        jButtonExportText.setText("Exportar Texto");
        jButtonExportText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportTextActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTextPaneImport);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jButtonExportTable, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonExportText, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExportTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExportText)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExportTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportTableActionPerformed
        // TODO add your handling code here:
        final JFileChooser fc = new JFileChooser();
        int response = fc.showSaveDialog(this);
        try {
        if (response == JFileChooser.APPROVE_OPTION){
            FileWriter fw = new FileWriter(fc.getSelectedFile().toString());            
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i=0; i<jTableExport.getRowCount() ;i++){
                for(int j=0; j<jTableExport.getColumnCount() ;j++){
                    bw.write(jTableExport.getValueAt(i, j).toString()+" ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
                    
        }
        } catch(IOException e){
            
        }
        
    }//GEN-LAST:event_jButtonExportTableActionPerformed

    private void jButtonExportTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExportTextActionPerformed

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
            
            UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainExpImp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainExpImp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainExpImp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainExpImp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainExpImp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExportTable;
    private javax.swing.JButton jButtonExportText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableExport;
    private javax.swing.JTextPane jTextPaneImport;
    // End of variables declaration//GEN-END:variables
}
