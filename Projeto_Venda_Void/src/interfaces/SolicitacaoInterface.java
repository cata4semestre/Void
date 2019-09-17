
package interfaces;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import repository.SolicitacaoRep;
import model.Solicitacao;

public class SolicitacaoInterface extends AbstractTableModel{
    
    SolicitacaoRep solic = new SolicitacaoRep();
     List<Solicitacao> solicitacao;

    public SolicitacaoInterface() {
        solicitacao = solic.listar();
    }
    
    public SolicitacaoInterface(List<Solicitacao> solicitacao) {
        this.solicitacao = solicitacao;
    }

    @Override
    public int getRowCount() {
        return solicitacao.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
        
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
             case 0:
                return solicitacao.get(rowIndex).getIdsolicitacao();
            case 1:
                return solicitacao.get(rowIndex).getQtd_solicitar();
            case 2:
                return solicitacao.get(rowIndex).getStatus();
        }
        return null;
        }
    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "Código Solicitacção";
            case 1:
                return "Quantidade"; 
            case 2:
                return "Status"; 
        }
        return null;
    }
}
