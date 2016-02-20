package ThreadPoolDemo;

import java.util.concurrent.Callable;

public class ThreadPool implements Callable<Integer> {

	private String text;

	public ThreadPool(String text) {
		this.text = text;
	}

	@Override
	public Integer call() throws Exception {
		int numberOfCommas = text.replaceAll("[^,]", "").length();
		return numberOfCommas;
	}

}
