package projetovendas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Projetovendas {

    static EntityManagerFactory emf
            = Persistence.createEntityManagerFactory("projetovendasPU");
    static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
        
    }

}
