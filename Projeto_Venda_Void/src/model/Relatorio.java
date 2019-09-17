
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.OneToOne;

@Entity
public class Relatorio implements Serializable {
  
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idrelatorio;
    @Column
    private Double valor_total;
    @OneToOne
    private Vendas venda;
    
    public int getIdrelatorio() {
        return idrelatorio;
    }

    public void setIdrelatorio(int idrelatorio) {
        this.idrelatorio = idrelatorio;
    }

    public Double getValor_total() {
        return valor_total;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.idrelatorio;
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
        final Relatorio other = (Relatorio) obj;
        return this.idrelatorio == other.idrelatorio;
    }

    public Vendas getVenda() {
        return venda;
    }

    public void setVenda(Vendas venda) {
        this.venda = venda;
    }
  
}
