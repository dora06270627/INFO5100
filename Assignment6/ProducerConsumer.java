
	/**
	 * 3. Understand producer-consumer problem and implement it.
	 */
public class ProducerConsumer {
	public static void main(String[] args) {
		Store c = new Store();
		Producer p1 = new Producer(c);
		Consumer c1 = new Consumer(c);
		p1.start();
		c1.start();
	}
}

class Store {
	private int contents;
	private boolean available = false; 

	public synchronized int get() {
		while (available == false) { 
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notifyAll();
		return contents;
	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		contents = value;
		available = true;
		notifyAll();
	}
}

class Consumer extends Thread {
	private Store store;

	public Consumer(Store c) {
		store = c;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) { // consumer get goods
			value = store.get();
			System.out.println("Consumer " + " got: " + value);
		}
	}
}

class Producer extends Thread {
	private Store store;

	public Producer(Store c) {
		store = c;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			store.put(i); // produce put goods in store
			System.out.println("Producer " + " put: " + i);
			try {
				sleep(50); 
				} catch (InterruptedException e) {
			}
		}
	}
}