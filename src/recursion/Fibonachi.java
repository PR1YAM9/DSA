package recursion;

public class Fibonachi {

	public static void main(String[] args) {
		System.out.println(Fibo(8));
		

	}

	private static int Fibo(int i) {
		
		if(i<=1) {
			return i;
		}
		
		int sp1 = Fibo(i-1);
		int sp2= Fibo(i-2);
		
		return sp1+sp2;
		
	}

}
