package ifsp.dsi.visao;

import ifsp.dsi.visao.botoes.BotaoAbstrato;
import ifsp.dsi.visao.botoes.BotaoJAXB;
import ifsp.dsi.visao.botoes.BotaoSAX;
import ifsp.dsi.xml.leitores.AlgoritimoLeituraXML;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DênisLeonardo
 */
public class JanelaPrincipal extends JFrame implements ActionListener {
    
    private JPanel panel;
    private BotaoAbstrato buttonSAX;
    private BotaoAbstrato buttonJAXB;

    private AlgoritimoLeituraXML algoritimo;

    public JanelaPrincipal() {
        super("Padrão Strategy");
        criarComponentes();
        ajustarPropriedadesJanela();
    }
    
    private void criarComponentes() {
        panel = new JPanel();
        
        buttonSAX = new BotaoSAX("SAX");
        buttonSAX.addActionListener(this);
        
        buttonJAXB = new BotaoJAXB("JAXB");
        buttonJAXB.addActionListener(this);

        adicionarComponentes();
    }
    
    private void adicionarComponentes() {
        panel.add(buttonSAX);
        panel.add(buttonJAXB);
        add(panel);
    }
    
    private void ajustarPropriedadesJanela() {
        setVisible(true);
        //pack();
        setSize(400,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        BotaoAbstrato botao = (BotaoAbstrato) e.getSource();
        algoritimo = botao.getAlgoritimo();
        System.out.println(algoritimo.ler());
    }
}
