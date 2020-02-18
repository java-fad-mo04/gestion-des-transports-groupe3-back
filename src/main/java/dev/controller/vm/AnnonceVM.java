package dev.controller.vm;

import java.time.LocalDateTime;

import dev.domain.Annonce;
import dev.domain.Statut;

public class AnnonceVM {

	private Integer id;
	private String adresseDepart;
	private String adresseArrivee;
	private String immatriculation;
	private String marque;
	private String modele;
	private Integer nombrePlacesDispo;
	private LocalDateTime dateDepart;
	private Statut statut;
	private CollegueVM collegue;

	public AnnonceVM() {
	}

	public AnnonceVM(Annonce annonce) {
		this.id = annonce.getId();
		this.adresseDepart = annonce.getAdresseDepart();
		this.adresseArrivee = annonce.getAdresseArrivee();
		this.immatriculation = annonce.getImmatriculation();
		this.marque = annonce.getMarque();
		this.modele = annonce.getModele();
		this.nombrePlacesDispo = annonce.getNombrePlacesDispo();
		this.dateDepart = annonce.getDateDepart();
		this.statut = annonce.getStatut();
		this.collegue = new CollegueVM(annonce.getCollegue());
	}

	public Annonce toAnnonce() {
		return new Annonce(this.id, this.adresseDepart, this.adresseArrivee, this.immatriculation, this.marque,
				this.modele, this.nombrePlacesDispo, this.dateDepart, this.statut, collegue.toCollegue());
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the adresseDepart
	 */
	public String getAdresseDepart() {
		return adresseDepart;
	}

	/**
	 * @param adresseDepart
	 *            the adresseDepart to set
	 */
	public void setAdresseDepart(String adresseDepart) {
		this.adresseDepart = adresseDepart;
	}

	/**
	 * @return the adresseArrivée
	 */
	public String getAdresseArrivee() {
		return adresseArrivee;
	}

	/**
	 * @param adresseArrivée
	 *            the adresseArrivée to set
	 */
	public void setAdresseArrivee(String adresseArrivee) {
		this.adresseArrivee = adresseArrivee;
	}

	/**
	 * @return the immatriculation
	 */
	public String getImmatriculation() {
		return immatriculation;
	}

	/**
	 * @param immatriculation
	 *            the immatriculation to set
	 */
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param marque
	 *            the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the modele
	 */
	public String getModele() {
		return modele;
	}

	/**
	 * @param modele
	 *            the modele to set
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}

	/**
	 * @return the nombrePlacesDispo
	 */
	public Integer getNombrePlacesDispo() {
		return nombrePlacesDispo;
	}

	/**
	 * @param nombrePlacesDispo
	 *            the nombrePlacesDispo to set
	 */
	public void setNombrePlacesDispo(Integer nombrePlacesDispo) {
		this.nombrePlacesDispo = nombrePlacesDispo;
	}

	/**
	 * @return the dateDepart
	 */
	public LocalDateTime getDateDepart() {
		return dateDepart;
	}

	/**
	 * @param dateDepart
	 *            the dateDepart to set
	 */
	public void setDateDepart(LocalDateTime dateDepart) {
		this.dateDepart = dateDepart;
	}

	/**
	 * @return the statut
	 */
	public Statut getStatut() {
		return statut;
	}

	/**
	 * @param statut
	 *            the statut to set
	 */
	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	/**
	 * @return the collegue
	 */
	public CollegueVM getCollegue() {
		return collegue;
	}

	/**
	 * @param collegue
	 *            the collegue to set
	 */
	public void setCollegue(CollegueVM collegue) {
		this.collegue = collegue;
	}

}