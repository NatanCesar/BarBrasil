public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private String tipoProduto;
    private int numeroProduto;

    public Produto(String nomeProduto, double precoProduto, String tipoProduto, int numeroProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.tipoProduto = tipoProduto;
        this.numeroProduto = numeroProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getNumeroProduto() {
        return numeroProduto;
    }

    public void setNumeroProduto(int numeroProduto) {
        this.numeroProduto = numeroProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    @Override
    public String toString() {
        return this.nomeProduto + " R$" + this.precoProduto + "\n" + this.tipoProduto ;
    }
}
