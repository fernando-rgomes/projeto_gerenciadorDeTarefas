package org.dcx.fernando;

import java.util.Objects;

public class Tarefa {
    private String titulo;
    private  String descricao;
    private boolean concluida;

    public Tarefa(String titulo, String descricao, boolean concluida){
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
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
        return
                "Tarefa: "+ "[ Título = '" + titulo + '\'' +
                ", Descricao ='" + descricao + '\'' +
                ", Concluida =" + concluida + "]"
                ;
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
