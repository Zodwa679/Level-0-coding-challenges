public class AreaOfTriangle {
	public static void main(String[] args) {
		 System.out.println(AreaofaTriangle(3, 4, 5));
	}
	public static double AreaofaTriangle( double a, double b, double c ) {
		double s = (a + b + c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}