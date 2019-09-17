package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Produto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-16T19:52:36")
@StaticMetamodel(Estoque.class)
public class Estoque_ { 

    public static volatile SingularAttribute<Estoque, Integer> qtd_estoque;
    public static volatile SingularAttribute<Estoque, Produto> produto;
    public static volatile SingularAttribute<Estoque, Integer> idestoque;

}