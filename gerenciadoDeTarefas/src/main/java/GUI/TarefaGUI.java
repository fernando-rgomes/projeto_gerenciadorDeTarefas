package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;




public class TarefaGUI extends JFrame {




    public TarefaGUI(){
        setTitle("Gerenciador de Tarefas ");
        setSize(900,700);
        setLocation(150, 150);

        setResizable(false);

        getContentPane().setBackground(Color.DARK_GRAY);

    }

    public static void main(String[] args) {
        TarefaGUI janela = new TarefaGUI();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
        public void windowClosing(WindowEvent e){

            System.exit(0);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);
    }
}
