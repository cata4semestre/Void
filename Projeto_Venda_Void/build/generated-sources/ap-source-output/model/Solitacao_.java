package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Produto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-16T19:52:36")
@StaticMetamodel(Solitacao.class)
public class Solitacao_ { 

    public static volatile SingularAttribute<Solitacao, Integer> idsolicacao;
    public static volatile SingularAttribute<Solitacao, Produto> produto;
    public static volatile SingularAttribute<Solitacao, Integer> qtd_solicitar;
    public static volatile SingularAttribute<Solitacao, String> status;

}