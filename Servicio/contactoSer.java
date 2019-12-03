package com.softtek.java.Academi.Servicio;

import com.softtek.java.Academi.emti.ContactType;
import com.softtek.java.Academi.temporal.Contacto;

public interface contactoSer {
public Contacto createContacto(Contacto contacto);
public Contacto updateContacto(String id,Contacto contacto);
public boolean deleteContacto(String id);
public Contacto[] findAll();
public Contacto findById(String id);
public Contacto findByEmail(String email);
public Contacto[] findByContactType(ContactType contatType);
}
