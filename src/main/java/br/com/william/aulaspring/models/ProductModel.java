package br.com.william.aulaspring.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.*;

@Entity
@Table(name="produtos")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduto;

    private String nome;
    
    private BigDecimal valor;

    public UUID getIdProduto () {
        return idProduto;
    }
    public void setIdProduto (UUID idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome () {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor () {
        return valor;
    }
    public void setValor (BigDecimal valor) {
        this.valor = valor;
    }
}
