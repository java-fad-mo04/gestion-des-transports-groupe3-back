package dev.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 * Représente le concept de collaborateur
 * 
 * @author Diginamc
 *
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Collaborateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/** Identifiant d'un collaborateur */

	private String nom;
	/** Nom d'un collaborateur */

	private String prenom;
	/** Prénom d'une collaborateur */

	private String email;
	/** Adresse email d'un collaborateur */

	private String motDePasse;
	/** Mot de passe d'un collaborateur */

	private String numeroTel;
	/** Numéro de téléphone d'un collaborateur */

	@OneToMany(mappedBy = "collaborateur", cascade = CascadeType.PERSIST)
	private List<RoleCollaborateur> roles;

	/**
	 * Constructeurs
	 */
	public Collaborateur() {
	}

	public Collaborateur(Long id, String nom, String prenom, String email, String motDePasse, String numeroTel,
			List<RoleCollaborateur> roles) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.numeroTel = numeroTel;
		this.roles = roles;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public List<RoleCollaborateur> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleCollaborateur> roles) {
		this.roles = roles;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}