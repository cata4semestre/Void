
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
public class Endereco_clientes implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column
   private int idendereco_cliente;
   @Column(length = 30)
   private String rua;
   @Column(length = 15)
   private String bairro;
   @Column(length = 20)
   private String cidade;
   @Column(length = 25)
   private String estado;
   @Column(length = 15)
   private String pais;
   @ManyToOne
   private Cliente cliente;

    public int getIdendereco_cliente() {
        return idendereco_cliente;
    }

    public void setIdendereco_cliente(int idendereco_cliente) {
        this.idendereco_cliente = idendereco_cliente;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idendereco_cliente;
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
        final Endereco_clientes other = (Endereco_clientes) obj;
        if (this.idendereco_cliente != other.idendereco_cliente) {
            return false;
        }
        return true;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
}
