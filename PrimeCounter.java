
public class PrimeCounter extends Thread {
	private int id;
	private int min;
	private int max;

	public PrimeCounter(int id, int min, int max) {
		super();
		this.id = id;
		this.min = min;
		this.max = max;
	}

	@Override
	public void run() {

		long startTime = System.nanoTime();

		int count = 0;

		for (int i = min; i <= max; i++)
			if (checkPrime(i))
				count++;

		long endTime = System.nanoTime();

		System.out.println("Number of prime numbers within range [" + min + "," + max + "]: " + count
				+ ", running time: " + (endTime - startTime));
	}

	private boolean checkPrime(int n) {

		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	private boolean checkPrime2(int n) {

		for (int i = 2; i <= (int) Math.sqrt(n); i++)
			if (n % i == 0)
				return false;

		return true;
	}

}
