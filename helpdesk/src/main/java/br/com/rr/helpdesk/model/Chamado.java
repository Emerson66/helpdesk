package br.com.rr.helpdesk.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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

	@ManyToOne
	@JoinColumn(name = "setor")
	private Setor setor;

	// bi-directional many-to-one association to UsuarioAtendente
	@ManyToOne
	@JoinColumn(name = "atendente")
	private Usuario atendente;

	// bi-directional many-to-one association to UsuarioRequerente
	@ManyToOne
	@JoinColumn(name = "id_requerente")
	private Long requerenteId;


	@Column(name = "data_solicitacao")
	@CreationTimestamp
	private LocalDate dataSolicitacao;

	@Deprecated
	public Chamado() {
	}

	public Chamado(String assuntosChamado, String descricaoChamado, Long requerenteId) {
		this.assuntosChamado = assuntosChamado;
		this.descricaoChamado = descricaoChamado;
		this.requerenteId = requerenteId;
	}
}