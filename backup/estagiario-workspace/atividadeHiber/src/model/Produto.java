package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({	
	@NamedQuery(name="Produto.listar", query="SELECT produto FROM Produto produto"),
	@NamedQuery(name="Produto.buscarProduto", query="SELECT produto FROM Produto produto WHERE produto.id = :id")		
})
public class Produto {
	
   @Id
   @GeneratedValue
   private Long id;
   
   @Column
   private String nome;
   
   @Column
   private String descricao;
   
   @Column
   private String categoria;
   
   @Column
   private Double valor;
   
    public Long getId() {
        return id;
	}
	
	public void setId(long id) {
		this.id = (long) id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria
				+ ", valor=" + valor + "]";
	}
		
		

}
