package logica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({	
	@NamedQuery(name="Usuario.existeUsuario", 
	query="SELECT usuario FROM Usuario usuario WHERE usuario.login = :login and usuario.senha = :senha")		
})
public class Usuario {
     
	 @Id
	 @GeneratedValue
	 private Long id;
	 
	 @Column
	 private String login;
	 
	 @Column
	 private String senha;
	 
	 public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
