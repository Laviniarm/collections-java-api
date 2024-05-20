package main.java.list.operacoesBasicas;

public class Item {
    private String nomeItem;
    private double valor;
    private int quantidade;

    public Item(String nomeItem, double valor, int quantidade){
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNomeItem(){
        return nomeItem;
    }
    public double getValor(){
        return valor;
    }
    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nomeItem='" + nomeItem + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
