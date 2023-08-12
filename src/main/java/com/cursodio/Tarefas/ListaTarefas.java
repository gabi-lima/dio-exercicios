package com.cursodio.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    private List<Tarefas> tarefaList;

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefas(descricao));
    }

    public void removerTarefa(String decricao) {
        List<Tarefas> tarefasRemover = new ArrayList<>();
        for (Tarefas t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(decricao)) {
                tarefasRemover.add(t);
            }

        }
        tarefaList.removeAll(tarefasRemover);
    }

    public int obterNumeroTarefas() {
        return tarefaList.size();
    }

    public void obterDescricao() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();
        System.out.println("O numero total é: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.obterDescricao();
        System.out.println("O numero total é: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total é: " + listaTarefa.obterNumeroTarefas());

    }
}
