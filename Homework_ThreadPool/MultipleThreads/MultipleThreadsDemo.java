package MultipleThreads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;




public class MultipleThreadsDemo {
	static  AtomicInteger count = new AtomicInteger(0);
	
	public static class MyThread extends Thread{
		
		private String text;
		
		public MyThread(String text){
			this.text=text;
		}
		
		
		@Override
		public void run() {
			for (int index = 0; index < text.length(); index++) {
				if (text.charAt(index) == ',') {
					count.incrementAndGet();
				}
			}
		}
	}
	
	
public static void main(String[] args) throws FileNotFoundException, InterruptedException {
	
	Scanner sc = new Scanner(new File("war_peace.txt"));
	StringBuilder sb = new StringBuilder();

	while (sc.hasNextLine()) {
		String line = sc.nextLine();
		sb.append(line);
		sb.append("\n");
	}

	sc.close();
	
	
	long startOfMThreads = System.currentTimeMillis();
	
	List<Thread> myThreads=new ArrayList<Thread>();
	
	
	for (int part = 0; part <= 4; part++) {
		Thread t=new MyThread(sb.substring((part*sb.length()/5)+1,(part+1)*sb.length()/5));
		t.start();
		myThreads.add(t);
	}
	
	for (Thread t : myThreads) {
		t.join();
	}
	
	System.out.println(count);
	System.out.println("Time " + (System.currentTimeMillis()-startOfMThreads));
}
}
