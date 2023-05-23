import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Produto> cardapio = new ArrayList<>();


       int resposta = 100;
        while (resposta != 0) {
            resposta = Integer.parseInt(JOptionPane.showInputDialog("""
                1 - Cadastrar Cliente;
                2 - Cadastrar Produto;
                3 - Cadastrar Pedido;
                4 - Ver Cardápio;
                5 - Ver Clientes.
                
                0 - SAIR
               
                O que deseja fazer?
                """));

            switch (resposta) {
                case 1 -> {
                    String nome = JOptionPane.showInputDialog("Nome do Cliente: ");
                    String numMesa = JOptionPane.showInputDialog("Número da mesa: ");
                    Cliente c = new Cliente(nome, numMesa);
                    clientes.add(c);
                }
                case 2 -> {
                    String produto = JOptionPane.showInputDialog("Nome produto: ");
                    double preco = Integer.parseInt(JOptionPane.showInputDialog("Preço: "));
                    String tipo = JOptionPane.showInputDialog("Tipo de produto: ");
                    int numeroProduto = Integer.parseInt(JOptionPane.showInputDialog("Numéro do produto: "));
                    Produto p = new Produto(produto, preco, tipo, numeroProduto);
                    cardapio.add(p);
                }
                case 3 -> {
                    String mesa = JOptionPane.showInputDialog("Número da mesa do pedido: ");
                    int numProduto = Integer.parseInt(JOptionPane.showInputDialog(null, cardapio.toString() + "Qual o número do pedido? "));
                    for (Cliente cliente : clientes) {
                        if (cliente.getNumeroMesa().equals(mesa)) {
                            cliente.adicionarPedido(cardapio.get(numProduto));
                        }
                    }
                }
                case 4 -> JOptionPane.showMessageDialog(null, cardapio.toString());

                case 5 -> {
                        JOptionPane.showMessageDialog(null, clientes.toString());

                    }
                }
            }
        }
    }




