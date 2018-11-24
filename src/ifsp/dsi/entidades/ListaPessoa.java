/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.dsi.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author denis
 */

@XmlRootElement(name = "pessoas")

@XmlAccessorType(XmlAccessType.FIELD)

public class ListaPessoa {
    
    @XmlElement(name = "pessoa")
    private List<Pessoa> pessoas;
    
    public ListaPessoa() {
        pessoas = new ArrayList<>();
    }
    
    public boolean addPessoa(Pessoa pessoa) {
        return pessoas.add(pessoa);
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        pessoas.forEach(p -> {
            builder.append(p);
            builder.append("\n");
        });
        return builder.toString();
    }
}
