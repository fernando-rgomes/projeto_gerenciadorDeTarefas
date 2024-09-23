package org.dcx.fernando;

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
}
