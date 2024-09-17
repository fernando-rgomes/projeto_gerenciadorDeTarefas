import javax.swing.*;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorTarefas implements SistemaTarefas{
    private Map<String, Tarefa> tarefas;



    public void GerenciadorTarefas(){
        this.tarefas = new HashMap<>();
    }

    @Override
    public void cadastrarTarefa(String titulo, String descricao, Boolean concluida ) throws TarefaJaExisteException{
        if (!this.tarefas.containsKey(titulo)) {
            Tarefa novaTarefa = new Tarefa(titulo, descricao, concluida);
            this.tarefas.put(titulo, novaTarefa);
        }else {
            throw new TarefaJaExisteException("Tarefa Já existe");
        }
    }

    @Override
    public Tarefa pesquisarTarefa(String titulo) {
        for (Tarefa t: tarefas.values()){
            if (t.getTitulo().equals(titulo)){
                return t;
            }
        }
        return null;
    }

    @Override
    public boolean removerTarefa(String titulo) {
        if (this.tarefas.containsKey(titulo)) {
            this.tarefas.remove(titulo);

            return true;
        }
        return false;
    }

    @Override
    public boolean concluirTarefa(String titulo) {
        if (tarefas.containsKey(titulo)){ // Verifica se o título existe no mapa
            Tarefa tarefa = this.tarefas.get(titulo);
            tarefa.setConcluida(true); // Marca a tarefa como concluída

           return true;
        }
        return false;
    }

    @Override
    public void exibirTarefas() {
    if (tarefas.isEmpty()){
        System.out.println("Nenhuma tarefa cadastrada.");
    }else{
        tarefas.forEach((titulo, tarefa) ->{
            System.out.println("Título: " +titulo);
            System.out.println("Descrição "+ tarefa.getDescricao());
            System.out.println("Concluída: "+ (tarefa.getConcluida() ? "Sim":"Não"));
            System.out.println("--------------------");
        });
    }
    }
}
