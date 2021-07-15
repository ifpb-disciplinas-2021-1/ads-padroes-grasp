package br.edu.ifpb.venda;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/06/2021, 10:57:59
 */
public class Main {
    public static void main(String[] args) {
        Produto arroz = new Produto(
            "arroz", 2.65
        );
        Produto leite = new Produto(
            "leite", 6.89
        );
        
        Venda venda =new Venda();
//        venda.adicionar(
//            new ItemDeVenda(3,arroz) //0,10
//        );
//        venda.adicionar(
//            new ItemDeVenda(leite,2)
//        );
        venda.adicionar(3, arroz);
        venda.adicionar(2, leite);
            
        double valorTotal = venda.valorTotal(); // "PADROESMASSA" -> 10%
        System.out.println("valorTotal = " + valorTotal);
    }
}
