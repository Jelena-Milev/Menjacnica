package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	
	private GregorianCalendar datum;
	double prodajni;
	double srednji;
	double kupovni;
	public GregorianCalendar getDatum() {
		return datum;
	}
	
	

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Kurs))
			return false;
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Kurs: datum:" + datum.getTime() + "\n"+ "prodajni kurs:" + prodajni + "\n"+ "srednji kurs:" + srednji +"\n"+"kupovni kurs:" + kupovni;
	}
	
	
	

}
