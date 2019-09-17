package repository;

import java.util.List;
import model.Fornecedor;
import util.ConexaoBD;

public class FornecedorRep extends Fornecedor {

   
    public void adicionar(Fornecedor fornecedor) {
        
        ConexaoBD.getEm().getTransaction().begin();
        ConexaoBD.getEm().persist(fornecedor);
        ConexaoBD.getEm().getTransaction().commit();
    }
    public void salvar(Fornecedor fornecedor) {
      if (fornecedor.getIdFornecedor() != null) {
            ConexaoBD.getEm().merge(fornecedor);
        } else {
            ConexaoBD.getEm().persist(fornecedor);
        }
        
        ConexaoBD.getEm().getTransaction().begin();
        ConexaoBD.getEm().getTransaction().commit();
    }

    public void excluir(Fornecedor fornecedor) {
        ConexaoBD.getEm().getTransaction().begin();
        ConexaoBD.getEm().remove(ConexaoBD.getEm().merge(fornecedor));
        ConexaoBD.getEm().getTransaction().commit();
    }

    public List<Fornecedor> listar() {
        List<Fornecedor> fornecedor = ConexaoBD.getEm().createQuery("select f from Fornecedor f").getResultList();
        return fornecedor;
    }
    public Fornecedor buscarPorID(int id) {
        return ConexaoBD.getEm().find(Fornecedor.class, id);
    }
    
/*clica no botao produtos
select * from tbl_produtos where id_fornecedor = this.id_fornecedor*/
}
