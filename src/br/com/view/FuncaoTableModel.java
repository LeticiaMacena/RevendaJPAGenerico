package br.com.view;

import br.com.model.negocio.Funcionario;
import br.com.model.negocio.Funcao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rosicléia Frasson
 */
public class FuncaoTableModel extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;

    private List<Funcao> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "nome"};

    //Cria uma FuncaoTableModel sem nenhuma linha
    public FuncaoTableModel() {
        linhas = new ArrayList<Funcao>();
    }

    //Cria uma FuncaoTableModel contendo a lista recebida por parâmetro.
    public FuncaoTableModel(List<Funcao> funcoes) {
        this.linhas = new ArrayList<Funcao>(funcoes);
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
            return Integer.class;
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
         Funcao m = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return m.getId();
        } else if (column == COL_NOME) {
            return m.getNome();
        } 
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Funcao u = linhas.get(row);
        if (column == COL_ID) {
            u.setId((Integer) aValue);
        } else if (column == COL_NOME) {
            u.setNome((String) aValue);

        }
    }

    // Retorna a marca referente a linha especificada
    public Funcao getFuncao(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

// Adiciona a marca especificada ao automovel
    public void addFuncao(Funcao funcao) {
        // Adiciona o registro.
        linhas.add(funcao);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
        ordenarNome();

    }

    public void updateFuncao(int indiceLinha, Funcao funcao) {
        linhas.set(indiceLinha, funcao);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        ordenarNome();
    }

    //Remove o sócio da linha especificada.
    public void removeFuncao(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
        ordenarNome();
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }

    public void ordenarNome() {
        //ordena pelo nome
        Collections.sort(linhas, new Comparator<Funcao>() {
            public int compare(Funcao o1,Funcao o2) {
                return o1.getNome().compareTo(o2.getNome());
                
                
            }
        });

        //avisa que a tabela foi alterada
        fireTableDataChanged();
    }
}
