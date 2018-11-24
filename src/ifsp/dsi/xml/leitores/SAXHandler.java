package ifsp.dsi.xml.leitores;

import ifsp.dsi.entidades.ListaPessoa;
import ifsp.dsi.entidades.Pessoa;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DênisLeonardo
 */
public class SAXHandler extends DefaultHandler {
    
    private ListaPessoa lista;
    private Pessoa pessoa;
    private String valor;
       
    public ListaPessoa getLista() {
        return lista;
    }
    
    @Override
    public void startDocument() throws SAXException {
        System.out.println("Início do parsing...");
        lista = new ListaPessoa();
    }
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equals("pessoa")) {
            pessoa = new Pessoa();
            lista.addPessoa(pessoa);
        }
    }
    
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        valor = String.valueOf(ch, start, length);
    }
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("nome")) {
            pessoa.setNome(valor);
        }
        else if(qName.equals("idade")) {
            pessoa.setIdade(Integer.parseInt(valor));
        }
    }
    
    @Override
    public void endDocument() throws SAXException {
        System.out.println("Fim do parsing...");
    }
}
