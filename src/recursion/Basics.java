package recursion;

public class Basics {

	public static void main(String[] args) {
		PD(5);
		System.out.println("===");
		PI(5);
		System.out.println("===");
		PDI(5);
		System.out.println("===");
		PID(1,5);
		

	}

	private static void PID(int start,int end) {
		if(start>end) {
			return;
		}
		System.out.println(start);
		PID(start+1,end);
		System.out.println(start);
		
	}

	private static void PDI(int i) {
		if(i==0) {
			return;
		}
		
		
		System.out.println(i);
		PDI(i-1);
		System.out.println(i);
	}

	private static void PI(int i) {
		
		if(i==0) {
			return;
		}
		
		PI(i-1);
		System.out.println(i);
	}

	private static void PD(int i) {
		
		if(i==0) {
			return;
		}
		
		System.out.println(i);
		PD(i-1);
	}

}
