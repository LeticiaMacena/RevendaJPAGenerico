/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public class JanelaPrincipalGUI extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipalGUI
     */
    public JanelaPrincipalGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        btMarca = new javax.swing.JButton();
        btAutomóvel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btMarca.setBackground(new java.awt.Color(255, 255, 255));
        btMarca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btMarca.setForeground(new java.awt.Color(153, 0, 255));
        btMarca.setText("Usuario");
        btMarca.setToolTipText("Marca");
        btMarca.setBorderPainted(false);
        btMarca.setOpaque(false);
        btMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(btMarca);
        btMarca.setBounds(380, 210, 120, 50);

        btAutomóvel.setBackground(new java.awt.Color(255, 255, 255));
        btAutomóvel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAutomóvel.setForeground(new java.awt.Color(153, 0, 255));
        btAutomóvel.setText("Funcao");
        btAutomóvel.setBorderPainted(false);
        btAutomóvel.setFocusable(false);
        btAutomóvel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutomóvelActionPerformed(evt);
            }
        });
        jPanel1.add(btAutomóvel);
        btAutomóvel.setBounds(220, 210, 120, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMarcaActionPerformed
        FuncionarioGui ma = new FuncionarioGui();
        ma.setLocationRelativeTo(null);
        ma.setVisible(true);
    }//GEN-LAST:event_btMarcaActionPerformed

    private void btAutomóvelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutomóvelActionPerformed
        FuncaoGui au = new FuncaoGui();
        au.setLocationRelativeTo(null);
        au.setVisible(true);
    }//GEN-LAST:event_btAutomóvelActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAutomóvel;
    private javax.swing.JButton btMarca;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
