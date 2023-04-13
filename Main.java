
public class Main {

	public static void main(String[] args) {
		Tren t1 = new Tren();
		Tren t2 = new Tren();
		
		Vagon v1 = new CalatoriA();
		Vagon v2 = new CalatoriB();
		Vagon v3 = new Marfa();

t1.addVagon(v1);
t1.addVagon(v2);
t1.addVagon(v3);
t2.addVagon(v1);
t2.addVagon(v2);
t2.addVagon(v3);

System.out.println("Primul tren= "+ t1);
System.out.println(v1.inchideUsa());
System.out.println(v1.deschideUsa());
System.out.println(v1.blocareGeam());

System.out.println("Al doilea tren= "+t2);
System.out.println("Comparare= " t1.compare(t2));

	}

}
