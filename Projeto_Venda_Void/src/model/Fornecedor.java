package model;

import java.io.Serializable;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Fornecedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFornecedor;
    @Column(length = 20)
    private String nomeFornecedor;
    @Column(length = 12)
    private String telefone_a;
    @Column(length = 15)
    private String telefone_b;
    @Column(length = 14)
    private String cnpj;
    @OneToMany(mappedBy = "fornecedor" )
    private List<Produto> produtos = new ArrayList();

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }



    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idFornecedor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if (!Objects.equals(this.idFornecedor, other.idFornecedor)) {
            return false;
        }
        return true;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getTelefone_a() {
        return telefone_a;
    }

    public void setTelefone_a(String telefone_a) {
        this.telefone_a = telefone_a;
    }

    public String getTelefone_b() {
        return telefone_b;
    }

    public void setTelefone_b(String telefone_b) {
        this.telefone_b = telefone_b;
    }
    
    
}
