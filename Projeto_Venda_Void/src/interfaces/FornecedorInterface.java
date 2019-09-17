package interfaces;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import repository.FornecedorRep;
import model.Fornecedor;

public class FornecedorInterface extends AbstractTableModel {

    FornecedorRep forn = new FornecedorRep();
    List<Fornecedor> fornecedor;

    public FornecedorInterface() {
        fornecedor = forn.listar();
    }

    public FornecedorInterface(List<Fornecedor> fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public int getRowCount() {
        return fornecedor.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return fornecedor.get(rowIndex).getIdFornecedor();
            case 1:
                return fornecedor.get(rowIndex).getNomeFornecedor();
            case 2:
                return fornecedor.get(rowIndex).getCnpj();
            case 3:
                return fornecedor.get(rowIndex).getTelefone_a();
            case 4:
                return fornecedor.get(rowIndex).getTelefone_b();

        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Código Fornecedor";
            case 1:
                return "Nome ";
            case 2:
                return "CNPJ";
            case 3:
                return "Telefone 1";
            case 4:
                return "Telefone 2";

        }
        return null;
    }
}
