
package com.fourj.vendas.modelos;

import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

/**
 *
 * @author E.Wellington
 */
@Entity
@Table (name = "TB_item_venda")
public class ItemVenda implements Identificavel{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "quantidade_item_venda")
    @Min(value = 1)
    private int quantidadeItemVenda;
    
    @Column (name = "preco_item_venda")
    @Min (value = 0)
    private BigDecimal precoItemVenda;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="produto_id")
    private Produto produtoItemVenda;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_venda")
    private Venda vendaItemVenda;
    
    
    public int getQuantidadeItemVenda() {
        return quantidadeItemVenda;
    }

    public void setQuantidadeItemVenda(int quantidadeItemVenda) {
        this.quantidadeItemVenda = quantidadeItemVenda;
    }

    public BigDecimal getPrecoItemVenda() {
        return precoItemVenda;
    }

    public void setPrecoItemVenda(BigDecimal precoItemVenda) {
        this.precoItemVenda = precoItemVenda;
    }

    public Produto getProdutoItemVenda() {
        return produtoItemVenda;
    }

    public void setProdutoItemVenda(Produto produtoItemVenda) {
        this.produtoItemVenda = produtoItemVenda;
    }

    public Venda getVendaItemVenda() {
        return vendaItemVenda;
    }

    public void setVendaItemVenda(Venda vendaItemVenda) {
        this.vendaItemVenda = vendaItemVenda;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    

    
    
}

