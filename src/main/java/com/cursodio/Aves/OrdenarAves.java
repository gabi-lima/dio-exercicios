package com.cursodio.Aves;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenarAves {
    List<Aves> pessoasLista = new ArrayList<>();

    public void adicionarPessoas(String nome, int idade, double altura) {
        pessoasLista.add(new Aves(nome, idade, altura));
    }

    public List<Aves> ordenarAsc() {
        List<Aves> pessoasIdade = new ArrayList<>(pessoasLista);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }

    public List<Aves> ordenarDesc() {
        List<Aves> pessoasIdade = new ArrayList<>(pessoasLista);
        Collections.sort(pessoasIdade, Collections.reverseOrder());
        return pessoasIdade;
    }

    public static void main(String[] args) {
        OrdenarAves p = new OrdenarAves();
        p.adicionarPessoas("José", 10, 1.50);
        p.adicionarPessoas("Maria", 4, 1.30);
        p.adicionarPessoas("Marcio", 5, 1.40);
        p.ordenarDesc();
        System.out.println(p.ordenarDesc());

    }

}
