package demoJAXB;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Palette {
	private ArrayList<Peinture> liste = new ArrayList<Peinture>();

	public Palette(ArrayList<Peinture> liste) {
		super();
		this.liste = liste;
	}
	
	public Palette() {
		super();
	}

	@XmlElement(name="peinture")
	public ArrayList<Peinture> getListe() {
		return liste;
	}

	public void setListe(ArrayList<Peinture> liste) {
		this.liste = liste;
	}
	
	
	
}
