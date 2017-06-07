package dev.exemple.entite;

import javax.persistence.*;

@Entity
@Table(name = "EXEMPLE")
public class Exemple {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "CHAMP_1")
	private String champ1;
	@Column(name = "CHAMP_2")
	private String champ2;
}