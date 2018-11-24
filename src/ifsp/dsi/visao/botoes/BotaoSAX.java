package ifsp.dsi.visao.botoes;

import ifsp.dsi.xml.leitores.AlgoritimoLeituraXML;
import ifsp.dsi.xml.leitores.LeitorSAX;

public class BotaoSAX extends BotaoAbstrato{

    public BotaoSAX(String titulo) {
        super(titulo);
    }

    @Override
    public AlgoritimoLeituraXML getAlgoritimo() {
        LeitorSAX leitor = new LeitorSAX("arquivo");
        return leitor;
    }
}
