package projetovendas;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Produto;

public class Projetovendas {

    static EntityManagerFactory emf
            = Persistence.createEntityManagerFactory("projetovendasPU");
    static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
        
    }

}
