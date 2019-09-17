package repository;


import java.util.List;
import model.Solicitacao;
import util.ConexaoBD;

public class SolicitacaoRep extends Solicitacao {
    
    
    
    public void salva(Solicitacao solicitacao) {
        
        if (solicitacao.getIdsolicitacao()!= null) {
            ConexaoBD.getEm().merge(solicitacao);
        } else {
            ConexaoBD.getEm().persist(solicitacao);
        }
        
        ConexaoBD.getEm().getTransaction().begin();
        ConexaoBD.getEm().getTransaction().commit();
    }
    
    public void excluir(Solicitacao solicitacao) {
       
    }
    
    public List<Solicitacao> listar() {
        List<Solicitacao> solicitacao = ConexaoBD.getEm().createQuery("select p from Solicitacao p").getResultList();
        return solicitacao;
    }
}
