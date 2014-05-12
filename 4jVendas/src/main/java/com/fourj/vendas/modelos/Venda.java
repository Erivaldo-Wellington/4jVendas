package com.fourj.vendas.modelos;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

/**
 *
 * @author E.Wellington
 */
@Entity
@Table(name = "TB_Venda")
public class Venda implements Identificavel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "data_venda")
    @Past
    @Temporal(TemporalType.DATE)
    private GregorianCalendar dataVenda;

    @Column(name = "numero_venda")
    @Min(value = 0)
    private long numeroVenda;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_venda")
    private Cliente clienteVenda;
    
    @OneToMany (mappedBy = "vendaItemVenda", targetEntity = ItemVenda.class)
    private ArrayList<ItemVenda> listaItensVendas;

    public Venda() {
        
        listaItensVendas = new ArrayList<ItemVenda>();
    }

    
    
    public ArrayList<ItemVenda> getListaItensVendas() {
        return listaItensVendas;
    }

    public void setListaItensVendas(ArrayList<ItemVenda> listaItensVendas) {
        this.listaItensVendas = listaItensVendas;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public GregorianCalendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(GregorianCalendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    public long getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda(long numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public Cliente getClienteVenda() {
        return clienteVenda;
    }

    public void setClienteVenda(Cliente clienteVenda) {
        this.clienteVenda = clienteVenda;
    }
    
    
}
