package GUI;

import javax.swing.*;
import java.awt.*;

public class TarefaGUIV2 extends JFrame {

    JLabel linha1, linha2;
    ImageIcon tarefaImg = new ImageIcon("./gerenciadoDeTarefas/src/imgs/gerenciadorImg.jpg");
    public TarefaGUIV2(){
        setTitle("Gerenciador de Tarefas");
        setSize(900,500);
        setLocation(0,0);
        setResizable(true);
        getContentPane().setBackground(Color.DARK_GRAY);
        linha1 = new JLabel("Meu Gerenciador de Tarefas", JLabel.CENTER);
        linha1.setForeground(Color.LIGHT_GRAY);
        linha1.setFont(new Font("Serif", Font.CENTER_BASELINE, 24));
        linha2 = new JLabel(tarefaImg, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3,2));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
    }

    public static void main(String[] args) {
        JFrame janela = new TarefaGUIV2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
