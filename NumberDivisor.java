
public class NumberDivisor extends Thread {

	private int num;

	public NumberDivisor(int num) {
		this.num = num;
	}

	public void run() {
		int count = 0;

		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				count++;

		System.out.println(num + " : " + count);
	}

}
