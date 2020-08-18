public class NamedThread extends Thread {
	private int id; // The name of this thread.

	public NamedThread(int id) {
		// Constructor gives name to thread.
		this.id = id;
	}

	public void run() {
		// The run method prints a message.
		System.out.println("Greetings from thread '" + id + "'!");
	}

}
