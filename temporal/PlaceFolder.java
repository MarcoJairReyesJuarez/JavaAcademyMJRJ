package com.softtek.java.Academi.temporal;
import com.softtek.java.Academi.Servicio.contactoSer;
import com.softtek.java.Academi.Servicio.contactoSerImpl;
import com.softtek.java.Academi.emti.ContactType;
public class PlaceFolder {
	private Contacto contacto;
	private Contacto friend;
	
	public static void main(String [] args) {
		PlaceFolder p = new PlaceFolder();
		p.crearcontacto();
		contactoSer cs = new contactoSerImpl();
		Contacto miCont = cs.createContacto(p.contacto);
		Contacto miAmi = cs.createContacto(p.friend);
		Contacto[] contactos= cs.findAll();
		for(Contacto c: contactos) {
			System.out.println(c);
		}
	}
public void crearcontacto() {
	 contacto =new Contacto();
	contacto.setFirNam("Jair");
	contacto.setLasNam("Reyes");
	contacto.setMotNam("Juarez");
	contacto.setEmail("jaireyes32@gmail.com");
	contacto.setNumero("8115651698");
	
	
	
	 friend = new Contacto("1","Adriana","Ramirez","Magallanes","adriana@gmail.com", 
			"8115651698",ContactType.FRIEND);
	
}
}
