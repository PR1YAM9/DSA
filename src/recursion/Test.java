package recursion;

public class Test {

	public static void main(String[] args) {
		Climb(4,"");
		
	}

	private static void Climb(int n, String string) {
		
		if(n<0) {
			return;
		}
		if(n==0) {
			System.out.println(string);
			return;
		}
		
		Climb(n-1, string+"1");
		Climb(n-2, string+"2");	
		
		
	}

}
