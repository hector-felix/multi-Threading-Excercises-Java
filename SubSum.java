
public class SubSum extends Thread {
	private int min;
	private int max;

	public SubSum(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public void run() {
		long start = System.nanoTime();
		// calculate sum of all integers within range [min, max]
		int sum = 0;

		for (int i = min; i <= max; i++)
			sum += i;

		long end = System.nanoTime();

		System.out.println("Sum of range [" 
		+ min + ", " + max + "]: " + sum 
		+ ", execution time: " + (end - start));

	}
}
