package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-16T19:52:36")
@StaticMetamodel(Endereco_clientes.class)
public class Endereco_clientes_ { 

    public static volatile SingularAttribute<Endereco_clientes, Cliente> cliente;
    public static volatile SingularAttribute<Endereco_clientes, Integer> idendereco_cliente;
    public static volatile SingularAttribute<Endereco_clientes, String> cidade;
    public static volatile SingularAttribute<Endereco_clientes, String> estado;
    public static volatile SingularAttribute<Endereco_clientes, String> bairro;
    public static volatile SingularAttribute<Endereco_clientes, String> rua;
    public static volatile SingularAttribute<Endereco_clientes, String> pais;

}