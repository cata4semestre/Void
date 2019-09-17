
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoBD {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetovendasPU");
    private static EntityManager em = emf.createEntityManager();

    public static EntityManager getEm() {
        return em;
    }
}
