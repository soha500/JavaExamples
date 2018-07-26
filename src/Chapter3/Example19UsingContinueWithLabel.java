package Chapter3;
// As with break statement, continue may specify a label to describe which enclosing loop to continue
public class Example19UsingContinueWithLabel {

	public static void main(String[] args) {
	
		outerloop:
			for (int i = 1; i < 10 ; i++) {
				System.out.print("\nouter loop passed: " + i + ", inner loop: ");
			for (int j = 1; j < 10; j++) {
				if(j == 5) continue outerloop; // continue outerloop
				System.out.print(j);
				
			}
				
			}

	}

}
