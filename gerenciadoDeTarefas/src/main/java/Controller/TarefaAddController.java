package Controller;

import org.dcx.fernando.GerenciadorTarefas;
import org.dcx.fernando.TarefaJaExisteException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TarefaAddController implements ActionListener {
    private GerenciadorTarefas tarefa;
    private JFrame janelaPrincipal;

    public TarefaAddController(GerenciadorTarefas tarefa, JFrame janela){
        this.tarefa = tarefa;
        this.janelaPrincipal = janela;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String titulo = JOptionPane.showInputDialog(janelaPrincipal,"Qual o título da tarefa? ");

        String descricao = JOptionPane.showInputDialog(janelaPrincipal, "Informe a descrição da tarefa(ex: Estudar, Comprar pão");
        // Cria um JComboBox com opções "Sim" e "Não"
        String[] opcoes = {"Sim", "Não"};
        // Captura se a tarefa está concluída ou não usando um JOptionPane com opções
        int resposta = JOptionPane.showConfirmDialog(janelaPrincipal, "A tarefa está concluída?", "Status da Tarefa", JOptionPane.YES_NO_OPTION);
        boolean concluida = (resposta == JOptionPane.YES_OPTION);

        try {
            tarefa.cadastrarTarefa(titulo, descricao, concluida);
        } catch (TarefaJaExisteException ex) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro: " + ex.getMessage());
        }


    }
}
