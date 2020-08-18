
public class NamedThread_Tester {

	public static void main(String[] args) {
		NamedThread namedThread0 = new NamedThread(0);
		NamedThread namedThread1 = new NamedThread(1);
		NamedThread namedThread2 = new NamedThread(2);

		namedThread0.start();
		namedThread1.start();
		namedThread2.start();
		
		System.out.println("Hello");
	}

}
