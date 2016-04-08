/**
 * 1. Create five threads, let them print out “A”, “B”, “C”, “D”, “E”
 * individually. The result shows on the screen should be: “ABCDEABCDEABCDE…...”
 */

public class FiveThreads {

	public static void main(String[] args) {
		ThreadA A = new ThreadA();
		ThreadB B = new ThreadB();
		ThreadC C = new ThreadC();
		ThreadD D = new ThreadD();
		ThreadE E = new ThreadE();

		A.setB(B);
		B.setC(C);
		C.setD(D);
		D.setE(E);
		E.setA(A);

		A.start();
		B.start();
		C.start();
		D.start();
		E.start();
	}
}

class ThreadA extends Thread {
	private ThreadB B;

	public void setB(ThreadB B) {
		this.B = B;
	}

	@Override
	public synchronized void run() {
		while (true) {
			for (int i = 0; i < 20; i++) {
				synchronized (this) {
					System.out.print("A");
					synchronized (B) {
						B.notify();
					}
					try {
						this.wait();
					} catch (Exception e) {
					}
				}
			}
		}
	}
}

class ThreadB extends Thread {
	private ThreadC C;

	public void setC(ThreadC C) {
		this.C = C;
	}

	@Override
	public synchronized void run() {
		while (true) {
			for (int i = 0; i < 20; i++) {
				try {
					wait();
				} catch (Exception e) {
				}
				System.out.print("B");
				synchronized (C) {
					C.notify();
				}
			}
		}
	}
}

class ThreadC extends Thread {
	private ThreadD D;

	public void setD(ThreadD D) {
		this.D = D;
	}

	@Override
	public synchronized void run() {
		while (true) {
			for (int i = 0; i < 20; i++) {
				try {
					wait();
				} catch (Exception e) {
				}

				System.out.print("C");
				synchronized (D) {
					D.notify();
				}
			}

		}
	}
}

class ThreadD extends Thread {
	private ThreadE E;

	public void setE(ThreadE E) {
		this.E = E;
	}

	@Override
	public synchronized void run() {
		while (true) {
			for (int i = 0; i < 20; i++) {
				try {
					wait();
				} catch (Exception e) {
				}
				System.out.print("D");
				synchronized (E) {
					E.notify();
				}
			}
		}
	}
}

class ThreadE extends Thread {
	private ThreadA A;

	public void setA(ThreadA A) {
		this.A = A;
	}

	@Override
	public synchronized void run() {
		while (true) {
			for (int i = 0; i < 20; i++) {
				try {
					wait();
				} catch (Exception e) {
				}
				System.out.print("E");
				synchronized (A) {
					A.notify();
				}
			}
		}
	}
}
