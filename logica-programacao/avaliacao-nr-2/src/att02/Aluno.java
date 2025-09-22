package att02;

public class Aluno {
    private String nome;
    private double somaNotasMatematica;
    private int numeroNotasMatematica;
    private double somaNotasHistoria;
    private int numeroNotasHistoria;

    public Aluno(String nome) {
        this.nome = nome;
        somaNotasHistoria = 0.0;
        numeroNotasHistoria = 0;
        somaNotasMatematica = 0.0;
        numeroNotasMatematica = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSomaNotasMatematica() {
        return somaNotasMatematica;
    }

    public void setSomaNotasMatematica(double somaNotasMatematica) {
        this.somaNotasMatematica = somaNotasMatematica;
    }

    public int getNumeroNotasMatematica() {
        return numeroNotasMatematica;
    }

    public void setNumeroNotasMatematica(int numeroNotasMatematica) {
        this.numeroNotasMatematica = numeroNotasMatematica;
    }

    public double getSomaNotasHistoria() {
        return somaNotasHistoria;
    }

    public void setSomaNotasHistoria(double somaNotasHistoria) {
        this.somaNotasHistoria = somaNotasHistoria;
    }

    public int getNumeroNotasHistoria() {
        return numeroNotasHistoria;
    }

    public void setNumeroNotasHistoria(int numeroNotasHistoria) {
        this.numeroNotasHistoria = numeroNotasHistoria;
    }

    public void adicionarNotaMatematica(double nota) {
        somaNotasMatematica += nota;
        numeroNotasMatematica++;
    }

    public void adicionarNotaHistoria(double nota){
        somaNotasHistoria += nota;
        numeroNotasHistoria++;
    }

    public double calcularMediaMatematica(){
        return somaNotasMatematica / numeroNotasMatematica;
    }

    public double calcularMediaHistoria(){
        return somaNotasHistoria / numeroNotasHistoria;
    }
}
