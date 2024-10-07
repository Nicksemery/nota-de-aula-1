public class Produto {

    private String nome, cor;
    private double tamanho, valor;
    private int estoque, codigo, venda;
    int x;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }

    public String quantidade(){
        if (estoque >= venda){
            return ("temos essa quantidade em estoque!");
        }else{
            return ("Não temos essa quantidade!");
        }
    }
    public void attestoque(){
        x = venda - estoque;
    }
    public void vender(){
        System.out.println("O total fica: "+ (venda * valor));
    }

    public void detalhes(){
        System.out.println("O produto: "+ getNome());
        System.out.println("Foi vendido: "+ getVenda()+" vezes." );
        System.out.println("Total restante em estoque: "+ x);
    }
}
