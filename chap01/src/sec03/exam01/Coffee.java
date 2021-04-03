package sec03.exam01;

public class Coffee {
	public static void main(String[] args) {
		
		String s1 = "=";
		String s2 = "0";
		int i1 = 5;
		
		for (int i=1; i<i1; i++) {
			for (int j=(i1-1); j>1; j--) {
				if (i < j) {
					System.out.print(s1);
				} else {
					System.out.print(s2);
				}
			} 
			for (int j=1; j<i1; j++) {
				if (i < j) {
					System.out.print(s1);
				} else {
					System.out.print(s2);
				}
			}
			System.out.println();
		} 

	}

}
