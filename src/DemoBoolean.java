
public class DemoBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b = new Boolean(1 > 2);
		b.booleanValue();
		System.out.println("b.booleanValue() => " + b);
		
		// Compare b with false
		int a = b.compareTo(true);
		System.out.println("b.compareTo(true) => " + a);
		
		Boolean a1, a2;
		a1 = new Boolean(true);
		a2 = new Boolean(false);
		boolean equal = a1.equals(a2);
		System.out.println("a1: " + a1 + " ; " + "a2: " + a2 + " => a1 equal a2: " + equal);
		
		boolean parseBoolean = new Boolean(false).parseBoolean("false");
		System.out.println("result of parseBoolean: " + parseBoolean);
	}
}
