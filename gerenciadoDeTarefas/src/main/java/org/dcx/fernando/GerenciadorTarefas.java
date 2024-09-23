package org.dcx.fernando;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorTarefas implements SistemaTarefas {
    private Map<String, Tarefa> tarefas;



    public GerenciadorTarefas(){
        this.tarefas = new HashMap<>();
    }

    @Override
    public void cadastrarTarefa(String titulo, String descricao, Boolean concluida ) throws TarefaJaExisteException {
        if (!this.tarefas.containsKey(titulo)) {
            Tarefa novaTarefa = new Tarefa(titulo, descricao, concluida);
            this.tarefas.put(titulo, novaTarefa);
        }else {
            throw new TarefaJaExisteException("Tarefa Já existe");
        }
    }

    @Override
    public Collection<Tarefa> pesquisarTarefa(String titulo, String descricao) {
        Collection<Tarefa> tarefasPesquisadas = new ArrayList<>();
        for(Tarefa c: this.tarefas.values()){
            if (c.getTitulo().equals(titulo) && c.getDescricao().equals(descricao)){
                tarefasPesquisadas.add(c);
            }
        }
        return tarefasPesquisadas;
    }

    @Override
    public boolean removerTarefa(String titulo) throws TarefaNaoExisteException{
        if (this.tarefas.containsKey(titulo)) {
            this.tarefas.remove(titulo);

            return true;
        }
        throw new TarefaNaoExisteException("Tarefa removida com sucesso!");
    }
}
