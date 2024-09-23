package org.dcx.fernando;

import java.util.Collection;

public interface SistemaTarefas {
    public void cadastrarTarefa(String titulo, String descricao, Boolean concluida) throws TarefaJaExisteException;
    public Collection<Tarefa> pesquisarTarefa(String titulo, String descricao);
    public boolean removerTarefa(String titulo) throws TarefaNaoExisteException;
}
