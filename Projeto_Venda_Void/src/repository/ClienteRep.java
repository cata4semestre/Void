package repository;

import java.util.List;
import model.Cliente;
import util.ConexaoBD;

public class ClienteRep extends Cliente{
    
    public void adicionar(Cliente clientes) {
      ConexaoBD.getEm().getTransaction().begin();
        ConexaoBD.getEm().persist(clientes);
        ConexaoBD.getEm().getTransaction().commit();
    }
    public void salvar(Cliente clientes) {
      if (clientes.getIdCliente() != null) {
            ConexaoBD.getEm().merge(clientes);
        } else {
            ConexaoBD.getEm().persist(clientes);
        }
        
        ConexaoBD.getEm().getTransaction().begin();
        ConexaoBD.getEm().getTransaction().commit();
    }
    public void excluir(Cliente clientes) {
        ConexaoBD.getEm().getTransaction().begin();
        ConexaoBD.getEm().remove(ConexaoBD.getEm().merge(clientes));
        ConexaoBD.getEm().getTransaction().commit();
    }

     public List<Cliente> buscarPorNome(String nome) {
        List<Cliente> clientes = ConexaoBD.getEm().createQuery("select c from Cliente c where c.nomeCliente = :nome").setParameter("nome", nome).getResultList();
        return clientes;
    }
     public Cliente buscarPorID(int id) {
        return ConexaoBD.getEm().find(Cliente.class, id);
    }
     
    public List<Cliente> listar() {
        List<Cliente> cliente = ConexaoBD.getEm().createQuery("select p from Cliente p").getResultList();
        return cliente;
    }
}