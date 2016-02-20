package OneThread;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ReadDemo {

	public static void main(String[] args) throws IOException {

		class MyThread implements Runnable {

			private String text;

			public MyThread(String text) {
				this.text = text;
			}

			@Override
			public void run() {

				int numberOfCommas = text.replaceAll("[^,]", "").length();

				System.out.println("Number of commas in the text: "
						+ numberOfCommas);

			}
		}

		// With one Thread
	
		Scanner sc = new Scanner(new File("war_peace.txt"));
		StringBuilder sb = new StringBuilder();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			sb.append(line);
			sb.append("\n");
		}

		sc.close();

		long millis = System.currentTimeMillis();

		Thread t1 = new Thread(new MyThread(sb.toString()));
		t1.start();

		System.out.println("Time elpased "
				+ (System.currentTimeMillis() - millis));

	}
}