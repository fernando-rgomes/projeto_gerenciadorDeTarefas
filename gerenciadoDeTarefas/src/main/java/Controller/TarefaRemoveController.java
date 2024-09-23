package Controller;

import org.dcx.fernando.GerenciadorTarefas;
import org.dcx.fernando.TarefaNaoExisteException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TarefaRemoveController implements ActionListener {
    private GerenciadorTarefas tarefa;
    private JFrame janelaPrincipal;

    public TarefaRemoveController(GerenciadorTarefas tarefa, JFrame janela) {
        this.tarefa = tarefa;
        this.janelaPrincipal = janela;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String titulo = JOptionPane.showInputDialog(janelaPrincipal, "Qual o nome da Tarefa a remover? ");

        try {
            tarefa.removerTarefa(titulo);
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Tarefa removida com sucesso");
        }catch (TarefaNaoExisteException a){
            JOptionPane.showMessageDialog(janelaPrincipal, "Tarefa não foi encontrada. "+" Operação não realizada");
        }

        }
    }

