package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Estoque;
import model.Fornecedor;
import model.Solitacao;
import model.Vendas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-16T18:55:18")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile ListAttribute<Produto, Estoque> estoque;
    public static volatile ListAttribute<Produto, Solitacao> solicitacao;
    public static volatile SingularAttribute<Produto, BigDecimal> precoVenda;
    public static volatile SingularAttribute<Produto, Integer> qtdEstoque;
    public static volatile SingularAttribute<Produto, BigDecimal> precoCusto;
    public static volatile ListAttribute<Produto, Vendas> vendas;
    public static volatile SingularAttribute<Produto, Integer> idproduto;
    public static volatile SingularAttribute<Produto, Fornecedor> fornecedor;
    public static volatile SingularAttribute<Produto, String> nomeProduto;

}