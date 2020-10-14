package demoJAXB;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
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

	@XmlElementWrapper(name="listePeintures")
	@XmlElements({
		@XmlElement(name="paint", type=Peinture.class)
	})
	public ArrayList<Peinture> getListe() {
		return liste;
	}

	public void setListe(ArrayList<Peinture> liste) {
		this.liste = liste;
	}
	
	
	
}
