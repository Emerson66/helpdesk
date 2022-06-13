package br.com.rr.helpdesk.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.rr.helpdesk.model.enums.ListaStatusChamado;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the chamado database table.
 * 
 */
@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "chamado", schema = "helpdesk")
public class Chamado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_chamado")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private ListaStatusChamado statusChamado;

	private String assuntosChamado;

	@Column(name = "problema_relatado")
	private String descricaoChamado;

	@OneToMany
	@JoinColumn(name = "setor_id")
	private Set<Usuario> usuarioSet;

	// bi-directional many-to-one association to UsuarioAtendente
	@ManyToOne
	@JoinColumn(name = "atendentes_id")
	private Usuario atendente;

	// bi-directional many-to-one association to UsuarioRequerente
	@ManyToOne
	@JoinColumn(name = "requerentes_id")
	private Usuario requerente;


	@Column(name = "data_solicitacao")
	@CreationTimestamp
	private LocalDate dataSolicitacao;

	@Deprecated
	public Chamado() {
	}

	public Chamado(String assuntosChamado, String descricaoChamado, Usuario requerente) {
		this.assuntosChamado = assuntosChamado;
		this.descricaoChamado = descricaoChamado;
		this.requerente = requerente;
	}

    public Chamado(Chamado chamado) {
    }
}