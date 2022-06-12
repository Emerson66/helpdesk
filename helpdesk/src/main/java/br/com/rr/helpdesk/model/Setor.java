package br.com.rr.helpdesk.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "setor", schema = "helpdesk")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Setor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_setor")
	private Integer id;
	
	@Column(name = "descricao_setor")
	private String descricaoSetor;
	
	@Column(name = "sigla_setor")
	private String siglaSetor;
	
	@Column(name = "codigo_setor")
	private String codigoSetor;
	
	@Column(name="telefone_setor")
	private String telefone;
	
	@Column(name="email_setor")
	private String emailSetor;
}
