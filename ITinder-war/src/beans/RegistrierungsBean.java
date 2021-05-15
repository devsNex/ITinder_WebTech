package beans;

import java.sql.Date;

public class RegistrierungsBean {
	private String benutzername;
	private String vorname;
	private String nachname;
	// checkbox??
	private String geschlecht;
	private Date geburtstag;
	private String lieblingsgame;
	private String hobby;
	// sprachen??
	private String [] programmiersprachen;
	private String weiteresprachen;
	// profilbild
	private String email;
	private String emailbestätigen;
	private String passwort;
	private String passwortbestätigen;
	
	
	public String getBenutzername() {
		return benutzername;
	}
	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}
	public Date getGeburtstag() {
		return geburtstag;
	}
	public void setGeburtstag(Date geburtstag) {
		this.geburtstag = geburtstag;
	}
	public String getLieblingsgame() {
		return lieblingsgame;
	}
	public void setLieblingsgame(String lieblingsgame) {
		this.lieblingsgame = lieblingsgame;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String[] getProgrammiersprachen() {
		return programmiersprachen;
	}
	public void setProgrammiersprachen(String[] programmiersprachen) {
		this.programmiersprachen = programmiersprachen;
	}
	public String getWeiteresprachen() {
		return weiteresprachen;
	}
	public void setWeiteresprachen(String weiteresprachen) {
		this.weiteresprachen = weiteresprachen;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailbestätigen() {
		return emailbestätigen;
	}
	public void setEmailbestätigen(String emailbestätigen) {
		this.emailbestätigen = emailbestätigen;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	public String getPasswortbestätigen() {
		return passwortbestätigen;
	}
	public void setPasswortbestätigen(String passwortbestätigen) {
		this.passwortbestätigen = passwortbestätigen;
	}
}
