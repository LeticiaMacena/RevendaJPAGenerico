package br.com.view;


import br.com.controller.FuncionarioController;
import br.com.model.negocio.Funcao;
import br.com.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosicléia Frasson
 */
public class FuncionarioGui extends javax.swing.JFrame {

    private FuncionarioTableModel model;

    public FuncionarioGui() {
        initComponents();
        List<Funcionario> lista = new ArrayList<Funcionario>();
        FuncionarioController a = new FuncionarioController();
        lista = a.listarFuncionario();

        //cria o modelo de Produto      
        model = new FuncionarioTableModel(lista);

        //atribui o modelo à tabela
        tabela.setModel(model);
        
        


    }//

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        campoPesquisa = new javax.swing.JTextField();
        botaoPesquisa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        rodapePainel = new javax.swing.JPanel();
        btRemover = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        cabecalhoPainel = new javax.swing.JPanel();
        usuarioTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 500));

        painel.setBackground(new java.awt.Color(255, 255, 255));
        painel.setLayout(null);

        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyPressed(evt);
            }
        });
        painel.add(campoPesquisa);
        campoPesquisa.setBounds(70, 170, 500, 27);

        botaoPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        botaoPesquisa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoPesquisa.setForeground(new java.awt.Color(153, 0, 255));
        botaoPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/pequisar.png"))); // NOI18N
        botaoPesquisa.setText("Pesquisar");
        botaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });
        painel.add(botaoPesquisa);
        botaoPesquisa.setBounds(600, 170, 140, 40);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome ", "Cpf", "Telefone", "Email", "Data de Nacimento", "Função", "Login", "Permisao", "Sexo", "Senha"
            }
        ));
        tabela.setPreferredSize(new java.awt.Dimension(800, 80));
        jScrollPane2.setViewportView(tabela);
        tabela.getColumnModel().getColumn(0).setMinWidth(10);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(0).setMaxWidth(10);

        painel.add(jScrollPane2);
        jScrollPane2.setBounds(70, 230, 1040, 190);

        rodapePainel.setBackground(new java.awt.Color(204, 153, 255));

        btRemover.setBackground(new java.awt.Color(255, 255, 255));
        btRemover.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btRemover.setForeground(new java.awt.Color(153, 0, 255));
        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/remove_user-26.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btInserir.setBackground(new java.awt.Color(255, 255, 255));
        btInserir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btInserir.setForeground(new java.awt.Color(153, 0, 255));
        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/add_user-26.png"))); // NOI18N
        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(255, 255, 255));
        btEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEditar.setForeground(new java.awt.Color(153, 0, 255));
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/edit_user-26.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout rodapePainelLayout = new org.jdesktop.layout.GroupLayout(rodapePainel);
        rodapePainel.setLayout(rodapePainelLayout);
        rodapePainelLayout.setHorizontalGroup(
            rodapePainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(rodapePainelLayout.createSequentialGroup()
                .add(411, 411, 411)
                .add(btRemover, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(31, 31, 31)
                .add(btInserir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(30, 30, 30)
                .add(btEditar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        rodapePainelLayout.setVerticalGroup(
            rodapePainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(rodapePainelLayout.createSequentialGroup()
                .add(rodapePainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btRemover, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btInserir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btEditar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 72, Short.MAX_VALUE))
        );

        painel.add(rodapePainel);
        rodapePainel.setBounds(0, 536, 1230, 110);

        cabecalhoPainel.setBackground(new java.awt.Color(204, 153, 255));

        usuarioTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/user-64.png"))); // NOI18N
        usuarioTxt.setText("Usuarios");

        org.jdesktop.layout.GroupLayout cabecalhoPainelLayout = new org.jdesktop.layout.GroupLayout(cabecalhoPainel);
        cabecalhoPainel.setLayout(cabecalhoPainelLayout);
        cabecalhoPainelLayout.setHorizontalGroup(
            cabecalhoPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, cabecalhoPainelLayout.createSequentialGroup()
                .addContainerGap(595, Short.MAX_VALUE)
                .add(usuarioTxt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 199, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(446, 446, 446))
        );
        cabecalhoPainelLayout.setVerticalGroup(
            cabecalhoPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cabecalhoPainelLayout.createSequentialGroup()
                .addContainerGap()
                .add(usuarioTxt)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        painel.add(cabecalhoPainel);
        cabecalhoPainel.setBounds(-10, 0, 1240, 92);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        InserirFuncionarioGui im = new InserirFuncionarioGui(model);
        im.setVisible(true);

    }//GEN-LAST:event_btInserirActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int selecionado = -1;
        selecionado = tabela.getSelectedRow();

        if (selecionado >= 0) {
            Integer i = (Integer) model.getValueAt(selecionado, 0);
            FuncionarioController mc = new FuncionarioController();
            if (mc.excluir(i)){
            model.removeModelo(selecionado);
            }
        } else {
            JOptionPane.showMessageDialog(null, "É necesário selecionar uma tabela");
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int selecionado = -1;
        selecionado = tabela.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdModelo = (Integer) model.getValueAt(selecionado, 0);
            AtualizarFuncionarioGuii am = new AtualizarFuncionarioGuii(selecionado, cdModelo, model);
            am.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaActionPerformed
        efetuaPesquisa();


    }//GEN-LAST:event_botaoPesquisaActionPerformed

    private void campoPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyPressed
    
        efetuaPesquisa();
       
    }//GEN-LAST:event_campoPesquisaKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPesquisa;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btRemover;
    private javax.swing.JPanel cabecalhoPainel;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel rodapePainel;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel usuarioTxt;
    // End of variables declaration//GEN-END:variables

    private void efetuaPesquisa() {
        String nome = campoPesquisa.getText();
        List<Funcionario> lista = new ArrayList<Funcionario>();
        FuncionarioController a = new FuncionarioController();
        lista = a.listarFuncionarioByNome(nome);
        model.limpar();

        //cria o modelo de Produto      
        model = new FuncionarioTableModel(lista);

        //atribui o modelo à tabela
        tabela.setModel(model);
    }
}
