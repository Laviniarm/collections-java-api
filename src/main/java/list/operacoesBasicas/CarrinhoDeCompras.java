package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }
    public void adicionarItem(String nomeItem, double valor, int quantidade){
        carrinho.add(new Item(nomeItem, valor, quantidade));
    }
    public void removerItem(String nomeItem){
        List<Item> itemParaRemover = new ArrayList<>();
        if(!carrinho.isEmpty()){
            for(Item i: carrinho){
                if(i.getNomeItem().equalsIgnoreCase(nomeItem)){
                    itemParaRemover.add(i);
                }
            }
            carrinho.removeAll(itemParaRemover);
        } else{
            System.out.println("O carrinho está vazio!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        if(!carrinho.isEmpty()){
            for(Item i: carrinho){
                double valorItem = i.getValor() * i.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            System.out.println("O carrinho está vazio!");
            return 0;
        }
    }

    public void exibirItens(){
        if (!carrinho.isEmpty()) {
            System.out.println(this.carrinho);
        } else {
            System.out.println("O carrinho está vazio!");
        }

    }

}
