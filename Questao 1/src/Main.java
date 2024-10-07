import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Nome do aluno?");
        a.setNome(sc.nextLine());

        System.out.println("Primeira nota?");
        a.setNota1(sc.nextInt());

        System.out.println("Segunda nota?");
        a.setNota2(sc.nextInt());

        System.out.println("Terceira nota?");
        a.setNota3(sc.nextInt());
        a.media();
        a.situacao();
        a.detalhes();

    }
}