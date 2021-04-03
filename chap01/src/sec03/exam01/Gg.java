package sec03.exam01;

public class Gg {
	public static void main(String[] args) {
	
		String s1 = "o";
		String s2 = "-";
		int i1 = 5;
		
		for (int i=1; i<=i1; i++) {
			for (int j=1; j<=i1*2-1; j++) {
				if (i+j < i1+1) {
					System.out.print(s2);
				} else if (j-i >= i1) {
					System.out.print(s2);
				} else {
					System.out.print(s1);
				}
			} 
			System.out.println();
			
		}
	}

}
