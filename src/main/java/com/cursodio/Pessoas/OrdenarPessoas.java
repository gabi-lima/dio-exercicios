package com.cursodio.Pessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenarPessoas {
    List<Pessoas> pessoasLista = new ArrayList<>();

    public void adicionarPessoas(String nome, int idade, double altura) {
        pessoasLista.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordenarAsc() {
        List<Pessoas> pessoasIdade = new ArrayList<>(pessoasLista);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }

    public List<Pessoas> ordenarDesc() {
        List<Pessoas> pessoasIdade = new ArrayList<>(pessoasLista);
        Collections.sort(pessoasIdade, Collections.reverseOrder());
        return pessoasIdade;
    }

    public static void main(String[] args) {
        OrdenarPessoas p = new OrdenarPessoas();
        p.adicionarPessoas("José", 10, 1.50);
        p.adicionarPessoas("Maria", 4, 1.30);
        p.adicionarPessoas("Marcio", 5, 1.40);
        p.ordenarDesc();
        System.out.println(p.ordenarDesc());

    }

}
