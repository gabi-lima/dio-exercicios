package com.cursodio.Tarefas;

public class Tarefas {
    // atributo
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public Tarefas(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefas [descricao=" + descricao + "]";
    }

}
