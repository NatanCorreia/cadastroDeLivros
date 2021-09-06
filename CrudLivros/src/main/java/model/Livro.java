/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tan-c
 */
public class Livro {
    String titulo, autor, editora,isbn;
    int publicacao, edicao;

    public Livro(String titulo, String autor, String editora, String isbn, int publicacao, int edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.publicacao = publicacao;
        this.edicao = edicao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublicacao(int publicacao) {
        this.publicacao = publicacao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPublicacao() {
        return publicacao;
    }

    public int getEdicao() {
        return edicao;
    }
}
