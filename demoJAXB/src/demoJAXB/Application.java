package demoJAXB;
import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.Endpoint;


public class Application {
	
	public static void main(String[] args) throws Exception {
		
		//Sérialisation Objet
		/*
		JAXBContext jc = JAXBContext.newInstance(Peinture.class); // quelle classe à sérialiser
		
		Peinture p1 = new Peinture("khorne red", "rouge", "base", "3/4"); // création nouvel objet
		
		Marshaller m = jc.createMarshaller(); // Création d'un objet Marshaller sur l'objet JAXBContext
		
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // formate
		
		m.marshal(p1,  new File("serialisation.xml")); // sérialisation de l'objet p1 dans le fichier ...
		
		System.out.println("fin");
		*/
		
		
		//Sérialisation Liste d'objets
		
		Peinture p1 = new Peinture("khorne red", "rouge", "base", "3/4");
		Peinture p2 = new Peinture("kantor blue", "bleu", "base", "1/4");
		Peinture p3 = new Peinture("nuln oil", "noir", "shade", "neuf");
		ArrayList<Peinture> liste = new ArrayList<Peinture>();
		liste.add(p1);
		liste.add(p2);
		liste.add(p3);
		Palette pal = new Palette(liste);
		
		JAXBContext jc = JAXBContext.newInstance(Palette.class); // quelle classe à sérialiser
		
		Marshaller m = jc.createMarshaller(); // Création d'un objet Marshaller sur l'objet JAXBContext
		
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // formate
		
		m.marshal(pal,  new File("serialisation2.xml")); // sérialisation de l'objet p1 dans le fichier ...
		
		System.out.println("fin");
		
		
		
		//WebService déploiement
		/*
		String url = "http://localhost:8080/";
		WebServiceSoap wss = new WebServiceSoap();
		Endpoint.publish(url, wss);
		System.out.println("Service web déployé et le WSDL, Seb Service Description est disponible à : " + url + "?wsdl");
		*/
	}
	
}
