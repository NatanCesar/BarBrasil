import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String numeroMesa;
    private ArrayList<Produto> pedidos;
    private double valorConta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public ArrayList<Produto> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Produto> pedidos) {
        this.pedidos = pedidos;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }

    public Cliente(String nome, String numeroMesa){
        this.nome = nome;
        this.numeroMesa = numeroMesa;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Produto produto){
        pedidos.add(produto);
        this.valorConta += produto.getPrecoProduto();
    }

    @Override
    public String toString() {
        return "Cliente: " + this.nome + " Mesa: " + this.numeroMesa + " Pedidos: " + pedidos + " Valor da conta: R$" + this.valorConta;
    }
}
