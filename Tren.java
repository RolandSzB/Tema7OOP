import java.util.ArrayList;

public class Tren {

	private ArrayList<Vagon> vagon = new ArrayList<Vagon>(15);
	
	public void addVagon( Vagon v) {
		vagon.add(v);
	}
	
	public int total() {
		int total=0;
		for (Vagon c : vagon)
			total+=c.colete();
		return total;
		}
	
	public String compare(Tren t) {
		if (total() == t.total())
			return "Aceste doua trenuri transfera aceleasi nr de colete";
		else 
			return "Cele dou trenuri nu piate transfera aceleasi nr de colete";}

	@Override
	public String toString() {
		return "Trenul " + vagon + "  ";
	}
}
