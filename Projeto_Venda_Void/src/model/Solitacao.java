
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Solitacao implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idsolicacao;
    @Column
    private int qtd_solicitar;
    @Column(length = 15)
    private String status;
    @ManyToOne
    private Produto produto;

    public int getIdsolicacao() {
        return idsolicacao;
    }

    public void setIdsolicacao(int idsolicacao) {
        this.idsolicacao = idsolicacao;
    }

    public int getQtd_solicitar() {
        return qtd_solicitar;
    }

    public void setQtd_solicitar(int qtd_solicitar) {
        this.qtd_solicitar = qtd_solicitar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.idsolicacao;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Solitacao other = (Solitacao) obj;
        if (this.idsolicacao != other.idsolicacao) {
            return false;
        }
        return true;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
    
    
}
