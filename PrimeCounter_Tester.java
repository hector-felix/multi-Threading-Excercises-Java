
public class PrimeCounter_Tester {

	public static void main(String[] args) throws InterruptedException {

		long startTime = System.nanoTime();

		PrimeCounter primeCounter0 = new PrimeCounter(0, 1, 2500);
		PrimeCounter primeCounter1 = new PrimeCounter(1, 2501, 5000);
		PrimeCounter primeCounter2 = new PrimeCounter(2, 5001, 7500);
		PrimeCounter primeCounter3 = new PrimeCounter(3, 7501, 10000);

		primeCounter0.start();
		primeCounter1.start();
		primeCounter2.start();
		primeCounter3.start();
		
		primeCounter3.join();
		primeCounter0.join();
		primeCounter1.join();
		primeCounter2.join();

		long endTime = System.nanoTime();

		System.out.println("Overall exe time: " + (endTime - startTime));
	}

}
