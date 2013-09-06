package br.com.view;

import br.com.model.negocio.Funcao;
import br.com.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rosicléia Frasson
 */
public class FuncionarioTableModel extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_CPF = 2;
    private static final int COL_TELEFONE = 3;
    private static final int COL_EMAIL = 4;
    private static final int COL_DATANACIMENTO = 5;
    private static final int COL_FUNCAO = 6;
    private static final int COL_LOGIN = 7;
    private static final int COL_PERMISAO = 8;
    private static final int COL_SEXO = 9;
    private static final int COL_SENHA = 10;
    private List<Funcionario> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Nome Completo","Cpf ","Telefone","Email ", "Data de nacimento","Função","Login","Permisao","Sexo","Senha"};

    //Cria uma FuncionarioTableModel sem nenhuma linha
    public FuncionarioTableModel() {
        linhas = new ArrayList<Funcionario>();
    }

    //Cria uma FuncionarioTableModel contendo a lista recebida por parâmetro.
    public FuncionarioTableModel(List<Funcionario> usuarios) {
        this.linhas = new ArrayList<Funcionario>(usuarios);
    }

    public int getRowCount() {
        return linhas.size();
    }

    /*
     * Retorna a quantidade de colunas
     * 2 colunas: uma para id e a outra para nome.
     */
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    public Class getColumnClass(int columnIndex) {
        //Qual a classe das nossas colunas? A coluna 1 é inteira, as outras string.  
        if (columnIndex == COL_ID) {
            return Integer.class;
        } else if (columnIndex == COL_NOME) {
            return String.class;
        } else if (columnIndex == COL_CPF) {
            return String.class;
        } else if (columnIndex == COL_TELEFONE) {
            return String.class;
        } else if (columnIndex == COL_EMAIL) {
            return String.class;

        } else if (columnIndex == COL_DATANACIMENTO) {
            return String.class;

        } else if (columnIndex == COL_FUNCAO) {
            return Funcao.class;

        } else if (columnIndex == COL_LOGIN) {
            return String.class;
        }
        else if (columnIndex == COL_PERMISAO){            
            return Boolean.class;            
        }else if (columnIndex == COL_SEXO){            
            return String.class;            
        
        }else if (columnIndex == COL_SENHA){            
            return String.class;            
        }
        return null;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega a marca da linha
        Funcionario m = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return m.getId();
        } else if (column == COL_NOME) {
            return m.getNome();
        } else if (column == COL_CPF) {
            return m.getCpf();
        } else if (column == COL_TELEFONE) {
            return m.getTelefone();
        }
         else if (column == COL_EMAIL) {
            return m.getEmail();
        }
         else if (column == COL_DATANACIMENTO) {
            return m.getDataNacimento();
        }
         else if (column == COL_FUNCAO) {
            return m.getFuncao();
        }
         else if (column == COL_LOGIN) {
            return m.getLogin();
        }
         else if (column == COL_PERMISAO) {
            return m.getPermisao();
        }
         else if (column == COL_SEXO) {
            return m.getSexo();
        }
         else if (column == COL_SENHA) {
            return m.getSenha();
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Funcionario u = linhas.get(row);
        if (column == COL_ID) {
            u.setId((Integer) aValue);
        } else if (column == COL_NOME) {
            u.setNome(aValue.toString());
        } else if (column == COL_CPF) {
            u.setCpf(aValue.toString());
        } else if (column == COL_TELEFONE) {
            u.setTelefone(aValue.toString());
        } else if (column == COL_EMAIL) {
            u.setEmail(aValue.toString());
        } else if (column == COL_DATANACIMENTO) {
            u.setDataNacimento((Date) aValue);
        } else if (column == COL_FUNCAO) {
            u.setFuncao((Funcao) aValue);
        } else if (column == COL_LOGIN) {
            u.setLogin(aValue.toString());
        } else if (column == COL_PERMISAO) {
            u.setPermisao(aValue.equals(aValue));
        } else if (column == COL_SEXO) {
            u.setSexo(aValue.toString());
        } else if (column == COL_SENHA) {
            u.setSenha(aValue.toString());

        }
    }

    // Retorna a marca referente a linha especificada
    public Funcionario getUsuario(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

// Adiciona a marca especificada ao modelo
    public void addModelo(Funcionario Funcao) {
        // Adiciona o registro.
        linhas.add(Funcao);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
        ordenarPorNome();

    }

    public void updateModelo(int indiceLinha, Funcionario Funcao) {
        linhas.set(indiceLinha, Funcao);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        ordenarPorNome();
    }

    //Remove o sócio da linha especificada.
    public void removeModelo(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
        ordenarPorNome();
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }

    public void ordenarPorNome() {
        //ordena pelo nome
        Collections.sort(linhas, new Comparator<Funcionario>() {
            public int compare(Funcionario o1, Funcionario o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        //avisa que a tabela foi alterada
        fireTableDataChanged();
    }
}
