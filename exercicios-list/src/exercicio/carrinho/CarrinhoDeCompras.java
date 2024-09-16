package exercicio.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Arroz", 18f, 2);
        carrinhoDeCompras.adicionarItem("Feijão", 5.5f, 5);
        carrinhoDeCompras.adicionarItem("Café", 12.4f, 1);
        carrinhoDeCompras.adicionarItem("Arroz", 15.1f, 1);
        carrinhoDeCompras.adicionarItem("Açucar", 3.8f, 2);

        System.err.println("Carrinho antes de alterar itens: ");
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Farinha", 2.1f, 3);

        carrinhoDeCompras.removerItem("Café");

        System.out.println("Carrinho após alterar itens: ");
        carrinhoDeCompras.exibirItens();

        System.out.println("Valor total " + carrinhoDeCompras.calcularValorTotal());

    }

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, quantidade, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("Carrinho de compras está vazio");
        }
    }

    public float calcularValorTotal() {
        float valorTotal = 0f;
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                valorTotal += (i.getPreço() * i.getQuantidade());
            }
        } else {
            System.out.println("Carrinho de compras está vazio");
        }
        return valorTotal;
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                System.out.println(
                        "Item: " + i.getNome() + ", Preço: " + i.getPreço() + ", Quantidade: " + i.getQuantidade());
            }
        } else {
            System.out.println("Carrinho de compras está vazio");
        }
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> carrinhoDeCompras) {
        this.itemList = carrinhoDeCompras;
    }

}
