package GUI;

import Controller.TarefaAddController;
import Controller.TarefaRemoveController;
import Controller.TarefaSearchController;
import org.dcx.fernando.GerenciadorTarefas;
import org.dcx.fernando.Tarefa;

import javax.swing.*;
import java.awt.*;

public class TarefaGUIV3 extends JFrame {
    JLabel linha1, linha2;
    ImageIcon tarefaImg = new ImageIcon("./gerenciadoDeTarefas/src/imgs/gerenciadorImg.jpg");
    ImageIcon addImg = new ImageIcon("./gerenciadoDeTarefas/src/imgs/icons/addIcon.png");
    ImageIcon pesqImg = new ImageIcon("./gerenciadoDeTarefas/src/imgs/icons/searchImg.png");
    ImageIcon removerImg = new ImageIcon("./gerenciadoDeTarefas/src/imgs/icons/removeImg.png");

    JButton botaoAdicionar, botaoPesquisar, botaoRemover;
    GerenciadorTarefas tarefa = new GerenciadorTarefas();

    public TarefaGUIV3() {
        setTitle("Gerenciador de Tarefas");
        setSize(800, 600); //tamanho da janela
        setLocation(150, 150);
        setResizable(true);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel("Meu Gerenciador de Tarefas", JLabel.CENTER);
        linha1.setForeground(Color.black);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(tarefaImg, JLabel.CENTER);
        botaoAdicionar = new JButton("Adicionar", addImg);
        botaoAdicionar.addActionListener(new TarefaAddController(tarefa, this));
        botaoPesquisar = new JButton("Pesquisar", pesqImg);
        botaoPesquisar.addActionListener(new TarefaSearchController(tarefa, this));
        botaoRemover = new JButton("Remover", removerImg);
        botaoRemover.addActionListener(new TarefaRemoveController(tarefa, this));

        getContentPane().setLayout(new GridLayout(3, 2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(linha2);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }
    public static void main(String [] args){
        JFrame janela = new TarefaGUIV3();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

