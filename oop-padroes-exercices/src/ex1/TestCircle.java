package ex1;

public class TestCircle {
	public static void main (String[] args) {
		Circle c1 = new Circle();
		System.out.println("O c�rculo tem tem raio de " + c1.getRadius() + " e a �rea � " + c1.getArea());
		
		
		Circle c2 = new Circle(1.0);
		System.out.println("O c�rculo tem raio de "+ c2.getRadius() + " e �rea de " + c2.getArea());
		//c1.getRadius = 5.0;
		
		Circle c3 = new Circle ();
		System.out.println("A cor � "+ c3.getColor()+".");
		System.out.println(c3.getColor());
		
		// Testando Sets
		Circle c4 = new Circle();
		c4.setColor("blue");
		System.out.println("A nova cor � " + c4.getColor());
		
		
		Circle c5 = new Circle();
		c5.setRadius(15);
		System.out.println("O novo raio � " + c5.getRadius());
		
		//
		Circle c6 = new Circle(5.5);
		System.out.println(c6.toString());
	}
	

}
