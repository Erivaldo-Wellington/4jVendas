package com.fourj.vendas.modelos;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author E.Wellington
 */
@Entity
@Table(name = "TB_cliente")
public class Cliente extends Pessoa{
    
    @OneToMany (mappedBy = "clienteVenda", targetEntity = Venda.class)
    private ArrayList<Venda> listaVendas;
    
    public Cliente() {
        listaVendas = new ArrayList<Venda>();
    }

    public ArrayList<Venda> getListaVendas() {
        return listaVendas;
    }

    public void setListaVendas(ArrayList<Venda> listaVendas) {
        this.listaVendas = listaVendas;
    }
    
    
}
