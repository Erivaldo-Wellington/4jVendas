package com.fourj.vendas.modelos;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

/**
 *
 * @author E.Wellington
 */
@Entity
@Table(name = "TB_produto")
public class Produto implements Identificavel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "codigo_barra_produto")
    private String codigoBarraProduto;

    @Column(name = "descricao_produto")
    private String descricaoProduto;

    @Column(name = "preco_compra_produto")
    @Min(value = 0)
    private BigDecimal preco_compra_produto;

    @Column(name = "preco_venda_produto")
    @Min(value = 0)
    private BigDecimal preco_venda_produto;
    
    @Column(name = "quantidade_produto")
    private int quantidadeProduto;
    
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return this.id;
    }

}
