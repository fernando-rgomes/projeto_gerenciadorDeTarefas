package Controller;

import org.dcx.fernando.GerenciadorTarefas;
import org.dcx.fernando.Tarefa;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class TarefaSearchController implements ActionListener {
    private GerenciadorTarefas tarefas;
    private JFrame janelaPrincipal;

    public TarefaSearchController(GerenciadorTarefas tarefa, JFrame janelaPrincipal){
        this.tarefas = tarefa;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String titulo = JOptionPane.showInputDialog(janelaPrincipal, "Qual o título da Traefa?");
        String descricao = JOptionPane.showInputDialog(janelaPrincipal, "Qual a descrição da Tarefa? ");
        Collection<Tarefa> tarefaSearch = tarefas.pesquisarTarefa(titulo, descricao);
        if (tarefaSearch.size()>0){
            JOptionPane.showMessageDialog(janelaPrincipal,"Tarefas Encontradas");

            for (Tarefa t: tarefaSearch){
                JOptionPane.showMessageDialog(janelaPrincipal, t.toString());
            }
        }else {
            JOptionPane.showMessageDialog(janelaPrincipal, "Não foi encontrado nenhuma tarefa.");
        }
    }
}
