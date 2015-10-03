package de.philulay.jenkinsbeispiel;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fakultaet faku = new Fakultaet();
		Fibonacci fib = new Fibonacci();
		Quadrat sqrt = new Quadrat();
		int[] zahlen1 = fib.rekursiv(10);
		int[] zahlen2 = fib.iterativ(10);
		
		System.out.println("Fakultät von 5 iterativ: "+faku.iterativ(5));
		System.out.println("Fakultät von 5 rekursiv: "+faku.rekursiv(5));
		System.out.println("Fibonaccizahlen rekursiv: ");
		System.out.println("Quadrat: "+sqrt.Zahlquadrat(2) );
		
		for(int i=0;i<10;i++){
			System.out.println("      "+i+".: "+zahlen1[i]);
		}
		System.out.println("Fibonaccizahlen iterativ: ");
		
		for(int i=0;i<10;i++){
			System.out.println("      "+i+".: "+zahlen2[i]);
		}
	}

}
