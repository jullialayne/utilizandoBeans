package utilizandobeans.demo;

public class Autor implements AutorLivro{
    private String nome;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public void exibirAutor(){
        System.out.println("Autor "+this.nome);
    }

}