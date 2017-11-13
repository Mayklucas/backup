package logica;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({	
	@NamedQuery(name="Tarefas.listar", query="SELECT tarefas FROM Tarefas tarefas"),
	@NamedQuery(name="Tarefas.buscarProduto", query="SELECT tarefas FROM Tarefas tarefas WHERE tarefas.id = :id")		
})
public class Tarefas {
	
    @Id
	@GeneratedValue
	private Long id;
    
    @Column
    @NotNull(message="A descrição deve ser preenchida")
    @Size(min=5, message="Descrição deve ter pelo menos 5 carateres")
	private String descricao;
	
    @Column
	private boolean finalizado;
	
    @Column
	private Calendar dataFinalizacao;
    @Transient
	private String dataFormatada;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
	
	public void setDataFormatada(String data){
		Calendar date = new GregorianCalendar();
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date.setTime(sd.parse(data));
		} catch (Exception e) {
			e.printStackTrace();
		}
		setDataFinalizacao(date);
		this.dataFormatada = data;
	}
	public String getDataFormatada(){
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.dataFormatada = s.format(dataFinalizacao.getTime());
		}catch(Exception e){
			e.printStackTrace();
		}	
		return dataFormatada;
	}
	
}
