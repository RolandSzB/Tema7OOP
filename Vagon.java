
public abstract class Vagon {
 
	public String deschideUsa() {
		if(getVagon()!="Marfa") 
			return "Se deschid usile";
		else return "Usile de la acest vagon nu pot fi deschise automat"; 
		}
	public String inchideUsa() {
		if(getVagon()!="Marfa") 
			return "Se inchid usile";
		else return "Usile de la acest vagon nu pot fi inchise automat"; 
		}
	public String blocareGeam() {
		if(getVagon()=="CalatoriB") 
			return "S-au blocat geamurile";
		else return "Geamurile de la acest vagon nu pot fi blocate"; 
		}
	
	public String getVagon() {
		return "Vagon";
	}
	public abstract int pasageri();
	public abstract int colete();
	
}
