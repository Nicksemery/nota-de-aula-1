public class Aluno {

    private String nome;
    private int nota1, nota2, nota3;
    int media;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNota1(int nota1){
        this.nota1 = nota1;
    }
    public int getNota1(){
        return nota1;
    }
    public void setNota2(int nota2){
        this.nota2 = nota2;
    }
    public int getNota2(){
        return nota2;
    }
    public void setNota3(int nota3){
        this.nota3 = nota3;
    }
    public int getNota3(){
        return nota3;
    }
    public int media(){
        media = (nota1 + nota2 + nota3)/3;
        return media;
    }
    public String situacao() {
        if (media >= 70) {
            return("Aprovado!");
        } else if (media() < 70 && media() > 40) {
            return("Prova final pendente!");
        } else {
            return ("Reprovado!");
        }
    }
    public void detalhes(){
        System.out.println("\n Detalhes gerais:");
        System.out.println("Nome: "+ getNome());
        System.out.println("Notas: "+ getNota1() +" / "+ getNota2()+" / " + getNota3());
        System.out.println("Media de notas: "+ media);
        System.out.println("Situação: "+ situacao());
    }
}

