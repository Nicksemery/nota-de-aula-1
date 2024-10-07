import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();

        System.out.println("\n Insira os detalhes do produto");
        System.out.println("Nome do produto");
        p.setNome(sc.nextLine());
        System.out.println("Código da unidade");
        p.setCodigo(sc.nextInt());
        System.out.println("Cor do produto");
        p.setCor(sc2.nextLine());
        System.out.println("Tamanho do produto em metro");
        p.setTamanho(sc.nextDouble());
        System.out.println("Valor do produto");
        p.setValor(sc.nextDouble());
        System.out.println("Quantidade a colocar em estoque");
        p.setEstoque(sc.nextInt());

        System.out.println("\n um cliente chegou!");
        System.out.println("Qual a quantidade requerida pelo cliente?");
        p.setVenda(sc.nextInt());
        p.quantidade();
        p.vender();
        p.attestoque();
        p.detalhes();


    }
}