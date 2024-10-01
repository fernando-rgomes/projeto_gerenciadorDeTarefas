package org.dcx.fernando;

import java.util.Objects;

public class Tarefa {
    private String titulo;
    private  String descricao;
    private boolean concluida;

    public Tarefa(String titulo, String descricao, boolean concluida){
        titulo = this.titulo;
        descricao = this.descricao;
        concluida = this.concluida;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "org.dcx.fernando.Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return concluida == tarefa.concluida && Objects.equals(titulo, tarefa.titulo) && Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, concluida);
    }
}
