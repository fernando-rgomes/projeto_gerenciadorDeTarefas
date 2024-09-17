public interface SistemaTarefas {
    public void cadastrarTarefa(String titulo, String descricao, Boolean concluida) throws TarefaJaExisteException;
    public Tarefa pesquisarTarefa(String titulo);
    public boolean removerTarefa(String titulo) throws TarefaNaoExisteException;
    public boolean concluirTarefa(String titulo);
    public void exibirTarefas();
}
