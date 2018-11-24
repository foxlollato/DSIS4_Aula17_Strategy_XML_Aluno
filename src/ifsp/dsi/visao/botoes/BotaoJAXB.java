package ifsp.dsi.visao.botoes;

import ifsp.dsi.entidades.ListaPessoa;
import ifsp.dsi.xml.leitores.AlgoritimoLeituraXML;
import ifsp.dsi.xml.leitores.LeitorJAXB;

public class BotaoJAXB extends BotaoAbstrato {

    public BotaoJAXB(String titulo) {
        super(titulo);
    }

    @Override
    public AlgoritimoLeituraXML getAlgoritimo() {
        LeitorJAXB leitor = new LeitorJAXB("pessoas.xml");
        leitor.setClasses(ListaPessoa.class);
        return leitor;
    }
}
