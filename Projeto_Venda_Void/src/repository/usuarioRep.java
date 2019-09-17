package repository;

import java.util.List;
import model.Usuario;
import util.ConexaoBD;

public class usuarioRep extends Usuario {

    public void salva(Usuario usuarios) {
        ConexaoBD.getEm().getTransaction().begin();
        ConexaoBD.getEm().persist(usuarios);
        ConexaoBD.getEm().getTransaction().commit();
    }

    public void excluir(Usuario usuarios) {
        ConexaoBD.getEm().getTransaction().begin();
        ConexaoBD.getEm().remove(ConexaoBD.getEm().merge(usuarios));
        ConexaoBD.getEm().getTransaction().commit();
    }

    public List<Usuario> listar() {
        List<Usuario> usuarios = ConexaoBD.getEm().createQuery("select p from Usuario p").getResultList();
        return usuarios;
    }
}
