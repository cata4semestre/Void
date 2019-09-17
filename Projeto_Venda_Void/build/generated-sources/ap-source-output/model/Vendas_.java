package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;
import model.Produto;
import model.Relatorio;
import model.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-16T18:55:18")
@StaticMetamodel(Vendas.class)
public class Vendas_ { 

    public static volatile SingularAttribute<Vendas, Cliente> cliente;
    public static volatile SingularAttribute<Vendas, Integer> desconto;
    public static volatile SingularAttribute<Vendas, Produto> produto;
    public static volatile SingularAttribute<Vendas, Integer> qtd_avender;
    public static volatile SingularAttribute<Vendas, Usuario> usuario;
    public static volatile SingularAttribute<Vendas, Integer> idvendas;
    public static volatile SingularAttribute<Vendas, Relatorio> relatorio;

}