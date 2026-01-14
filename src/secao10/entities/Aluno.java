package secao10.entities;

public class Aluno {
    private String nome;
    private double primeiraNota;
    private double segundaNota;
    
    public Aluno(String nome, double primeiraNota, double segundaNota) {
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return (primeiraNota + segundaNota) / 2.0;
    }


    
}


