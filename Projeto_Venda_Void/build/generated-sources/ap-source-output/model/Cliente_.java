package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Endereco_clientes;
import model.Vendas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-16T19:52:36")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, String> cpf;
    public static volatile ListAttribute<Cliente, Vendas> vendas;
    public static volatile ListAttribute<Cliente, Endereco_clientes> end_cliente;
    public static volatile SingularAttribute<Cliente, String> nomeCliente;

}