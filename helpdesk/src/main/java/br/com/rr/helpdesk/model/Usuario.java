package br.com.rr.helpdesk.model;


import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConstructorBinding;

@Entity
@Table(name = "usuario", schema = "helpdesk")
@Getter
@Setter
@EqualsAndHashCode
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long id;

	@Column(name = "nome_usuario")
	private String nome;

	@Column(name = "login_usuario")
	private String usuario;

	@Column(name = "senha_usuario")
	private String senha;

	@Column(name = "email_usuario")
	private String email;

	@OneToMany
	@JoinColumn(name = "requerentes_id")
	private Set<Chamado> chamadosRequerente;

	@ManyToOne
	@JoinColumn(name = "setor_id")
	private Setor setor;
	@Deprecated
	public Usuario() {
	}

	public Usuario(String nome, String usuario, String senha, String email) {
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.email = email;
	}
}
