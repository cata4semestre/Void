package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Produto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-16T18:55:18")
@StaticMetamodel(Fornecedor.class)
public class Fornecedor_ { 

    public static volatile SingularAttribute<Fornecedor, Integer> idFornecedor;
    public static volatile SingularAttribute<Fornecedor, String> nomeFornecedor;
    public static volatile SingularAttribute<Fornecedor, String> telefone_b;
    public static volatile SingularAttribute<Fornecedor, String> telefone_a;
    public static volatile ListAttribute<Fornecedor, Produto> produtos;
    public static volatile SingularAttribute<Fornecedor, String> cnpj;

}