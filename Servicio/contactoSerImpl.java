package com.softtek.java.Academi.Servicio;

import com.softtek.java.Academi.emti.ContactType;
import com.softtek.java.Academi.emti.Util;
import com.softtek.java.Academi.temporal.Contacto;
/* (String id, String firNam, String lasNam, String motNam, String email, String numero,
			ContactType contactType)  */

public class contactoSerImpl implements contactoSer {
	Contacto[] contactos;
	int currentIndex;
	private Util u;
	public contactoSerImpl() {
		contactos = new Contacto[100];
		currentIndex= 0;
		u =new Util();
	
	}

	@Override
	public Contacto createContacto(Contacto contacto) {
		Contacto newContacto= new Contacto(
				u.generateId(),
				contacto.getFirNam(),
				contacto.getLasNam(),
				contacto.getMotNam(),
				contacto.getEmail(),
				contacto.getNumero(),
				contacto.getContactType()
				);
		contactos[currentIndex] = newContacto;
		currentIndex++;
		return newContacto;
	}

	@Override
	public Contacto updateContacto(String id, Contacto contacto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContacto(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contacto findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contacto findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contacto[] findByContactType(ContactType contatType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contacto[] findAll() {
		Contacto[] storeContacto = new Contacto[currentIndex];
		for(int i = 0;i<contactos.length; i++) {
			Contacto c = contactos[i];
			if(c != null) {
				storeContacto[i]=c;
			}else {break;}
		}
		return storeContacto;
	}

}
