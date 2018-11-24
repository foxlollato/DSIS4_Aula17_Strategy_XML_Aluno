package ifsp.dsi.xml.leitores;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DênisLeonardo
 */
public class LeitorJAXB implements AlgoritimoLeituraXML {
    
    private String arquivo;
    private Class[] classes;

    public void setClasses(Class... classes){
        this.classes  = classes;
    }


    public LeitorJAXB(String arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public Object ler() {
        Object object = null;
        try {
            JAXBContext context = JAXBContext.newInstance(classes);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            object = unmarshaller.unmarshal(new File(arquivo));            
        }
        catch(JAXBException erro) {
            erro.printStackTrace();
        }
        return object;
    }
}
