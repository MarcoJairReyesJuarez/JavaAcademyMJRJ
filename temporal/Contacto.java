package com.softtek.java.Academi.temporal;

import com.softtek.java.Academi.emti.ContactType;

public class Contacto {
	private String id;
	private String FirNam;
	private String LasNam;
	private String MotNam;
	private String email;
	private String Numero;
	private ContactType contactType;

	public Contacto() {
		this.contactType = ContactType.UNKNOWN;
	}

	
	
	
	
	
	
	
	
	public Contacto(String id, String firNam, String lasNam, String motNam, String email, String numero,
			ContactType contactType) {
		super();
		this.id = id;
		FirNam = firNam;
		LasNam = lasNam;
		MotNam = motNam;
		this.email = email;
		Numero = numero;
		this.contactType = contactType;
	}









	public String getId() {
		return this.id;
	}

	public String getFirNam() {
		return FirNam;
	}

	public void setFirNam(String firNam) {
		FirNam = firNam;
	}

	public String getLasNam() {
		return LasNam;
	}

	public void setLasNam(String lasNam) {
		LasNam = lasNam;
	}

	public String getMotNam() {
		return MotNam;
	}

	public void setMotNam(String motNam) {
		MotNam = motNam;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Contacto_Id =" + this.getId() + "\n");
		sb.append("Contacto.FirNam =" + this.getFirNam() + "\n");
		sb.append("Contacto.LastName =" + this.getLasNam() + "\n");
		sb.append("Contacto.email =" + this.getEmail() + "\n");
		sb.append("Contacto_numero =" + this.getNumero() + "\n");
		return sb.toString();
	}

}
