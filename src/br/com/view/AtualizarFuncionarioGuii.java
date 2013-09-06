package br.com.view;


import br.com.controller.FuncaoController;
import br.com.controller.FuncionarioController;
import br.com.model.negocio.Funcao;
import br.com.model.negocio.Funcionario;
import br.com.validators.Validadores;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosicléia Frasson
 */
public class AtualizarFuncionarioGuii extends javax.swing.JFrame {
    
    int linhaSelecionada;
    int codigoMarca;
    FuncionarioTableModel model;

    /**
     * Creates new form InserirMarcaGui
     */
    public AtualizarFuncionarioGuii(int selecionado, int cdModelo, FuncionarioTableModel mtb) {
        initComponents();
        campoId.setEditable(false);
        linhaSelecionada = selecionado;
        cdModelo = cdModelo;
        model = mtb;
        


        FuncionarioController mc = new FuncionarioController();
        Funcionario  u = new Funcionario();
        u = mc.listarFuncionarioById(cdModelo);

        campoId.setText(Integer.toString(u.getId()));
        campoNome.setText(u.getNome());
        campoEmail.setText(u.getEmail());
        campoCpf.setText(u.getCpf());
        campoLogin.setText(u.getLogin());
        campoSenha.setText(u.getSenha());
        campoTelefone.setText(u.getTelefone());
        checkPermisao.setSelected(u.getPermisao());
           SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
            String data = formataData.format(u.getDataNacimento());
        campoNacimento.setText(data);
        
       if (u.getSexo().equals("Feminino")){
            radioFemino.setSelected(true);
        }else{
           radioMasc.setSelected(true);
        }
         carregarCombo(u.getFuncao().getId()); 
         

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaogrupo = new javax.swing.ButtonGroup();
        painelCentro = new javax.swing.JPanel();
        nomeTxt = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        funcaoTxt = new javax.swing.JLabel();
        comboFuncao = new javax.swing.JComboBox();
        radioFemino = new javax.swing.JRadioButton();
        radioMasc = new javax.swing.JRadioButton();
        sexoTxt = new javax.swing.JLabel();
        dataTxt = new javax.swing.JLabel();
        checkPermisao = new javax.swing.JCheckBox();
        emailTxt = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        telefoneTxt = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JLabel();
        painelCabecalho = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelRodape = new javax.swing.JPanel();
        botaoSalvar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        loginTxt = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        senhaTxt = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        idTxt = new javax.swing.JLabel();
        campoNacimento = new javax.swing.JFormattedTextField();
        campoCpf = new javax.swing.JFormattedTextField();
        campoTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Marca");

        painelCentro.setBackground(new java.awt.Color(255, 255, 255));
        painelCentro.setLayout(null);

        nomeTxt.setText("Nome Completo:");
        painelCentro.add(nomeTxt);
        nomeTxt.setBounds(50, 130, 140, 14);
        painelCentro.add(campoNome);
        campoNome.setBounds(160, 130, 580, 20);

        funcaoTxt.setText("Função:");
        painelCentro.add(funcaoTxt);
        funcaoTxt.setBounds(440, 250, 70, 14);

        painelCentro.add(comboFuncao);
        comboFuncao.setBounds(500, 250, 240, 20);

        radioFemino.setBackground(new java.awt.Color(255, 255, 255));
        botaogrupo.add(radioFemino);
        radioFemino.setText("Femenino");
        painelCentro.add(radioFemino);
        radioFemino.setBounds(160, 330, 100, 23);

        radioMasc.setBackground(new java.awt.Color(255, 255, 255));
        botaogrupo.add(radioMasc);
        radioMasc.setText("Masculino");
        painelCentro.add(radioMasc);
        radioMasc.setBounds(290, 330, 110, 23);

        sexoTxt.setText("Sexo:");
        painelCentro.add(sexoTxt);
        sexoTxt.setBounds(110, 330, 50, 14);

        dataTxt.setText("Data de Nacimento:");
        painelCentro.add(dataTxt);
        dataTxt.setBounds(40, 210, 140, 14);

        checkPermisao.setBackground(new java.awt.Color(255, 255, 255));
        checkPermisao.setText("Permisão em alterar todos os dados do sistema");
        painelCentro.add(checkPermisao);
        checkPermisao.setBounds(490, 330, 350, 23);

        emailTxt.setText("E-mail:");
        painelCentro.add(emailTxt);
        emailTxt.setBounds(100, 170, 80, 14);
        painelCentro.add(campoEmail);
        campoEmail.setBounds(160, 170, 580, 20);

        telefoneTxt.setText("Telefone:");
        painelCentro.add(telefoneTxt);
        telefoneTxt.setBounds(430, 290, 70, 14);

        cpfTxt.setText("Cpf:");
        painelCentro.add(cpfTxt);
        cpfTxt.setBounds(450, 210, 50, 14);

        painelCabecalho.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/edit_user-64.png"))); // NOI18N
        jLabel1.setText("Atualizar Funcionario");

        javax.swing.GroupLayout painelCabecalhoLayout = new javax.swing.GroupLayout(painelCabecalho);
        painelCabecalho.setLayout(painelCabecalhoLayout);
        painelCabecalhoLayout.setHorizontalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );
        painelCabecalhoLayout.setVerticalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        painelCentro.add(painelCabecalho);
        painelCabecalho.setBounds(-40, 0, 910, 80);

        painelRodape.setBackground(new java.awt.Color(204, 153, 255));

        botaoSalvar.setBackground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(153, 0, 255));
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/salvar.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoLimpar.setBackground(new java.awt.Color(255, 255, 255));
        botaoLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoLimpar.setForeground(new java.awt.Color(153, 0, 255));
        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/limpar.png"))); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelRodapeLayout = new javax.swing.GroupLayout(painelRodape);
        painelRodape.setLayout(painelRodapeLayout);
        painelRodapeLayout.setHorizontalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRodapeLayout.createSequentialGroup()
                .addContainerGap(390, Short.MAX_VALUE)
                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        painelRodapeLayout.setVerticalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRodapeLayout.createSequentialGroup()
                .addGroup(painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoLimpar))
                .addGap(0, 79, Short.MAX_VALUE))
        );

        painelCentro.add(painelRodape);
        painelRodape.setBounds(0, 420, 870, 120);

        loginTxt.setText("Login:");
        painelCentro.add(loginTxt);
        loginTxt.setBounds(110, 290, 50, 14);
        painelCentro.add(campoLogin);
        campoLogin.setBounds(160, 290, 240, 20);
        painelCentro.add(campoSenha);
        campoSenha.setBounds(160, 250, 240, 20);

        senhaTxt.setText("Senha:");
        painelCentro.add(senhaTxt);
        senhaTxt.setBounds(100, 250, 70, 14);

        campoId.setEditable(false);
        painelCentro.add(campoId);
        campoId.setBounds(160, 90, 100, 30);

        idTxt.setText("ID");
        painelCentro.add(idTxt);
        idTxt.setBounds(100, 100, 11, 14);

        try {
            campoNacimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        painelCentro.add(campoNacimento);
        campoNacimento.setBounds(160, 210, 240, 20);
        painelCentro.add(campoCpf);
        campoCpf.setBounds(500, 210, 240, 20);
        painelCentro.add(campoTelefone);
        campoTelefone.setBounds(500, 290, 240, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCentro, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Funcionario m = new Funcionario();
        
           m.setId(Integer.parseInt(campoId.getText()));
           m.setNome(campoNome.getText());
           m.setEmail(campoEmail.getText());
           m.setSenha(campoSenha.getText());
           m.setLogin(campoLogin.getText());
           m.setTelefone(campoTelefone.getText());
           m.setFuncao((Funcao)comboFuncao.getSelectedItem());
           m.setCpf(campoCpf.getText());
             try{
                 
            m.setDataNacimento(new SimpleDateFormat("dd/mm/yyyy").parse(campoNacimento.getText()));
            
        } catch (ParseException ex){
            System.out.println("Erro na conversão de datas" + ex.getMessage());
        }
           if (radioFemino.isSelected()){
            m.setSexo("Feminino");
             }else{
            m.setSexo("Masculino");
        } 
                      
           if (checkPermisao.isSelected()){
               m.setPermisao(true);
       
              
           }else{
               m.setPermisao(false);
           }
    
               
               
           FuncionarioController mc = new FuncionarioController();
            if(mc.salvar(m)){
            model.updateModelo(linhaSelecionada,pesquisar(m.getNome(), m.getTelefone()));
            }
            dispose();
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoNome.setText("");
        campoEmail.setText(" ");
        campoNacimento.setText("");
        campoSenha.setText("");
        campoLogin.setText("");
        campoCpf.setText(" ");
        campoTelefone.setText("");
        comboFuncao.setSelectedIndex(0);
        radioFemino.setSelected(false);
        checkPermisao.setSelected(false);
        radioMasc.setSelected(false);
    }//GEN-LAST:event_botaoLimparActionPerformed

    private Funcionario pesquisar (String nome, String telefone){
        FuncionarioController mc = new FuncionarioController();
        return mc.listaFuncionarioByNomeTelefone(nome, telefone);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup botaogrupo;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JFormattedTextField campoNacimento;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JCheckBox checkPermisao;
    private javax.swing.JComboBox comboFuncao;
    private javax.swing.JLabel cpfTxt;
    private javax.swing.JLabel dataTxt;
    private javax.swing.JLabel emailTxt;
    private javax.swing.JLabel funcaoTxt;
    private javax.swing.JLabel idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loginTxt;
    private javax.swing.JLabel nomeTxt;
    private javax.swing.JPanel painelCabecalho;
    private javax.swing.JPanel painelCentro;
    private javax.swing.JPanel painelRodape;
    private javax.swing.JRadioButton radioFemino;
    private javax.swing.JRadioButton radioMasc;
    private javax.swing.JLabel senhaTxt;
    private javax.swing.JLabel sexoTxt;
    private javax.swing.JLabel telefoneTxt;
    // End of variables declaration//GEN-END:variables

    private void carregarCombo(int cdFuncao) {
         //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) comboFuncao.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();
        //cria a lista: java.util.List
        List<Funcao> funcoes = new ArrayList<Funcao>();
        FuncaoController a = new FuncaoController();
        funcoes = a.listarFuncao();
        
     
        for (int linha = 0; linha <funcoes.size(); linha++) {
            //pegando a categoria da lista
            Funcao funcao = funcoes.get(linha);
            //adicionando a categoria no combo
            comboModel.addElement(funcao);
        }
    }
}
