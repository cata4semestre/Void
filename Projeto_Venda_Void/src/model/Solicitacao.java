package model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Solicitacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idsolicitacao;
    @Column
    private Integer qtd_solicitar;
    @Column(length = 15)
    private String status;
    @ManyToOne
    private Produto produto;

    public Integer getIdsolicitacao() {
        return idsolicitacao;
    }

    public void setIdsolicitacao(Integer idsolicitacao) {
        this.idsolicitacao = idsolicitacao;
    }

    public Integer getQtd_solicitar() {
        return qtd_solicitar;
    }

    public void setQtd_solicitar(Integer qtd_solicitar) {
        this.qtd_solicitar = qtd_solicitar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idsolicitacao);
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
        final Solicitacao other = (Solicitacao) obj;
        if (!Objects.equals(this.idsolicitacao, other.idsolicitacao)) {
            return false;
        }
        return true;
    }

}
