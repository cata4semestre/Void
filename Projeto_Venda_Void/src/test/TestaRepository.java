package test;

import model.Produto;
import repository.ProdutoRep;

public class TestaRepository {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setNomeProduto("Testeaaa");
        ProdutoRep prep = new ProdutoRep();
        
        //prep.adicionar(p);
        
//        prep.listar().forEach(pr ->{
//            System.out.println(pr.getNomeProduto());
//        });
        
        prep.buscarPorNome("Camisa").forEach(pr -> {
            System.out.println(pr.getNomeProduto());
        });
        
        Produto x = prep.buscarPorID(7);
        x.setQtdEstoque(100);
        prep.salvar(x);
        
        prep.excluir(x);
        
    }
}
