package com.cursodio.Livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();

    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        livroList.add(new Livro(titulo, autor, ano));

    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> livrosAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosAutor.add(l);
                }
            }

        }
        return livrosAutor;
    }

    public List<Livro> intervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                    livroAnos.add(l);
                }
            }
        }
        return livroAnos;
    }

    public Livro pesquisarTitulo(String titulo) {
        Livro livroTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroTitulo = l;
                    break;
                }
            }
        }
        return livroTitulo;

    }

    public static void main(String[] args) {
        CatalogoLivros livreto = new CatalogoLivros();
        livreto.adicionarLivro("Olá Mundo", "Jhonson", 2020);
        livreto.adicionarLivro("Olá Mundo", "Jensen", 2019);
        livreto.adicionarLivro("Olá Tios", "Jhonson", 2020);
        livreto.adicionarLivro("Olá Primos", "Jhonson", 2020);
        livreto.adicionarLivro("Olá Senhores", "Jhonson", 2021);
        livreto.adicionarLivro("Olá Senhoras", "Jhonson", 2022);
        livreto.adicionarLivro("Olá Pessoas", "Jhonson", 2023);
        System.out.println(livreto.livroList);
        System.out.println("Achei este livro do autor Jensen: " + livreto.pesquisarAutor("Jensen"));
        System.out.println("Achei este livro do autor Jensen: " + livreto.pesquisarAutor("Jhonson"));
        System.out.println("Achei estes livros entre 2020 e 2021: " + livreto.intervaloAnos(2020, 2021));
        System.out.println("Achei estes livros entre 2021 e 2023: " + livreto.intervaloAnos(2021, 2021));

    }
}
