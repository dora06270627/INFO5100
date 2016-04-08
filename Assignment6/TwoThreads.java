/**
 * 2. Create two threads, one prints out number 1 to 52, another prints out A to
 * Z. The result shows on the screen should be: “12A34B56C78D…”
 */

public class TwoThreads {

	public static void main(String[] args) {
		ThreadNum n = new ThreadNum();
		ThreadChar c = new ThreadChar();

		n.setChar(c);
		c.setNum(n);

		n.start();
		c.start();
	}
}

class ThreadNum extends Thread {
	private ThreadChar c;

	public void setChar(ThreadChar c) {
		this.c = c;
	}

	@Override
	public synchronized void run() {
		for (int i = 1; i < 52; i += 2) {
			System.out.print("" + i + (i + 1));
			synchronized (c) {
				c.notify();
			}
			try {
				wait();
			} catch (Exception e) {
			}
		}
	}
}

class ThreadChar extends Thread {
	private ThreadNum n;

	public void setNum(ThreadNum n) {
		this.n = n;
	}

	@Override
	public synchronized void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			try {
				wait();
			} catch (Exception e) {
			}
			System.out.print(i);
			synchronized (n) {
				n.notify();
			}
		}
	}
}
