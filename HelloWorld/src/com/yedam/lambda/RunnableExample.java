package com.yedam.lambda;

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("runnable run.");
				for (int i = 0; i < 5; i++) {
					System.out.println("a=>"+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("runnable run stop.");
			}

		};

		Thread thread = new Thread(runnable);
		thread.start();

		Thread thread2 = new Thread(() -> {
			System.out.println("anonymous runnable run.");
			for (int i = 0; i < 5; i++) {
				System.out.println("b=>"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("anonymous runnable run stop.");

		});
		thread2.start();

	}

}
