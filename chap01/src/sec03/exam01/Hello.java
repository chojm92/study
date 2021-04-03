package sec03.exam01;

public class Hello {

	public static void main(String[] args) {
		
		draw(10);
		
	}
	
	public static void draw(int lineCount) {
		
		String s1 = "A";
		String s2 = "_";
		
		
		for (int i=1; i<=lineCount; i++) {
			for (int j=(lineCount-1); j>=1; j--) {
				
				if (i > j) {
					System.out.print(s1);
				} else {
					System.out.print(s2);	
				} 	
				
			}
			
			for (int j=1; j<=lineCount; j++) {
				
				if (i >= j) {
					System.out.print(s1);
				} else {
					System.out.print(s2);
				}

			}
			
			System.out.println();
				
		}
	}
}
