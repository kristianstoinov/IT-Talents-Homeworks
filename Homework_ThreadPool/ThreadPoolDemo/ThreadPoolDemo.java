package ThreadPoolDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import MultipleThreads.MultipleThreadsDemo.MyThread;

public class ThreadPoolDemo {
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException, ExecutionException {
		Scanner sc = new Scanner(new File("war_peace.txt"));
		StringBuilder sb = new StringBuilder();

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			sb.append(line);
			sb.append("\n");
		}

		sc.close();
		long startOfThreadPool = System.currentTimeMillis();
		
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		List<Future<Integer>> commonCount=new ArrayList<Future<Integer>>();
		for (int part = 0; part <= 4; part++) {
			commonCount.add(threadPool.submit(new ThreadPool(sb.substring((part*sb.length()/5)+1,(part+1)*sb.length()/5))));
		}
		threadPool.shutdown();
		int commasInText=0;
		for(Future<Integer> eachCount:commonCount){
			commasInText+=eachCount.get();
		}
		System.out.println(commasInText);
		System.out.println("Time " + (System.currentTimeMillis()-startOfThreadPool));
		
	}
	}

