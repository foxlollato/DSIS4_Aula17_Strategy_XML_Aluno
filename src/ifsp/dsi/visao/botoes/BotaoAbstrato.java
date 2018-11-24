package ifsp.dsi.visao.botoes;

import ifsp.dsi.xml.leitores.AlgoritimoLeituraXML;

import javax.swing.*;

public abstract class BotaoAbstrato extends JButton {

    public BotaoAbstrato(String titulo){
        super(titulo);
    }

    public abstract AlgoritimoLeituraXML getAlgoritimo();

}
