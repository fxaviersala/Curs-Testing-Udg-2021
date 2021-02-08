package net.xaviersala.model;

import java.util.ArrayList;
import java.util.List;

public class Camio {
    private double maxPes;
    private double pesActual;
    private double litres;
    
    private List<Vaca> vaques;

    public Camio(double maxPes) {
        this.maxPes = maxPes;
        pesActual = 0;
        litres = 0;
        vaques = new ArrayList<>();
    }

    public List<Vaca> getVaques() {
        return vaques;
    }

    public boolean EntraVaca(Vaca vaca) {
        if (pesActual + vaca.getPes() <= maxPes) {
            pesActual += vaca.getPes();
            litres += vaca.getLitres();
            vaques.add(vaca);
            return true;
        }
        return false;
    }

    public double getLitres() {
    	return litres;
    }
    public double getPesActual() {
        return pesActual;
    }

    public void buida() {
        pesActual = 0;
        litres = 0;
        vaques.clear();
    }

	public void remove(Vaca vaca) {
		pesActual -= vaca.getPes();
		litres -= vaca.getLitres();
        vaques.remove(vaca);
	}
}
