package polymorphism;

public class MainArea {
	public static void main(String[] args) {
		
		Area a = new Area();
		a.find(2, 5);
		a.find(5, 5, 9);
		Area a1 = new Area();
		a1.find(7, 5);
		a1.find(7, 6, 9);
		
	}

}
