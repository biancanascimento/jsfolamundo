package jsfolamundo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contato")
public class Contato {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private String apelido;
	
	@Column(nullable=false)
	private String whattsApp;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getWhattsApp() {
		return whattsApp;
	}

	public void setWhattsApp(String whattsApp) {
		this.whattsApp = whattsApp;
	}
}
