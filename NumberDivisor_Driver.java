
public class NumberDivisor_Driver {

	public static void main(String[] args) throws InterruptedException {

		long startTime = System.currentTimeMillis();

		NumberDivisor thread1 = new NumberDivisor(123465789);
		NumberDivisor thread2 = new NumberDivisor(223465789);
		NumberDivisor thread3 = new NumberDivisor(323465789);
		NumberDivisor thread4 = new NumberDivisor(423465789);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();

		long endTime = System.currentTimeMillis();

		System.out.println("Overall exe time: " + (endTime - startTime));
	}

}
