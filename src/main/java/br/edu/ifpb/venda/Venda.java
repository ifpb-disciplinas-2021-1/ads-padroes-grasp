package br.edu.ifpb.venda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/06/2021, 10:44:37
 */
// wmc - média 3/2 - 1.5
public class Venda {
    private List<ItemDeVenda> itens = new ArrayList<>();
    private LocalDate criadaEm = LocalDate.now();
    private String cupomDesconto;
    private Pagamento pagamento;
    
    public void adicionar(int quantidade, Produto produto){
        ItemDeVenda item = new ItemDeVenda( 
            quantidade,produto
        );
        if(!itens.contains(item)) 
            itens.add(item);
    }
    
    
    public void adicionar(ItemDeVenda item){ // 2 complexidade ciclomática
        if(!itens.contains(item)) 
            itens.add(item);
    }
    public void remover(ItemDeVenda item){ // 1 complexidade ciclomática
        itens.remove(item);
    }
    double valorTotal() {
        
//        return itens.stream()
//            .mapToDouble(ItemDeVenda::subTotal)
//            .sum();
        
        double soma =0;
        for (ItemDeVenda item : itens) {
//            soma+=item.produto().valor();
            soma +=item.subTotal();
        }
        return soma;    
    }
}
