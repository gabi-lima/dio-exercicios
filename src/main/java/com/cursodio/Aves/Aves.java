package com.cursodio.Aves;

public class Aves implements Comparable<Aves> {
    @Override
    public String toString() {
        return "Pessoas [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }

    private String nome;
    private int idade;
    private double altura;

    public Aves(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Aves p) {
        return Integer.compare(idade, p.getIdade());
    }

}
