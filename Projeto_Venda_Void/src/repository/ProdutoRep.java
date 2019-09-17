package repository;

import java.util.List;
import model.Produto;
import util.ConexaoBD;

public class ProdutoRep extends Produto {

    public void adicionar(Produto produtos) {
        ConexaoBD.getEm().getTransaction().begin();
        ConexaoBD.getEm().persist(produtos);
        ConexaoBD.getEm().getTransaction().commit();
    }

    public List<Produto> buscarPorNome(String nome) {
        List<Produto> produtos = ConexaoBD.getEm().createQuery("select p from Produto p where p.nomeProduto = :nome").setParameter("nome", nome).getResultList();
        return produtos;
    }

    public void salvar(Produto produtos) {
        
        if (produtos.getIdproduto() != null) {
            ConexaoBD.getEm().merge(produtos);
        } else {
            ConexaoBD.getEm().persist(produtos);
        }
        
        ConexaoBD.getEm().getTransaction().begin();
        ConexaoBD.getEm().getTransaction().commit();
    }
    public void excluir(Produto produtos) {
        ConexaoBD.getEm().getTransaction().begin();
        ConexaoBD.getEm().remove(ConexaoBD.getEm().merge(produtos));
        ConexaoBD.getEm().getTransaction().commit();
    }

    public List<Produto> listar() {
        List<Produto> produtos = ConexaoBD.getEm().createQuery("select p from Produto p").getResultList();
        return produtos;
    }
  
    
    
    public Produto buscarPorID(int id) {
        return ConexaoBD.getEm().find(Produto.class, id);
    }
}
