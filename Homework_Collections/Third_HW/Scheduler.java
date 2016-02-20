package Third_HW;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class Scheduler implements ITask {
	public static int counter;
	Queue<ITask> myQueue = new LinkedList<ITask>();

	void push(ITask task) {
		if(task!=null){
		myQueue.add(task);
		}
	}

	@Override
	public void doWork() {
		

	}

	public static void main(String[] args) {
		Scheduler schedulerForTasks = new Scheduler();

		schedulerForTasks.push(new ITask() {

			@Override
			public void doWork() {
				System.out.println("Lets get to work!");

			}
		});

		schedulerForTasks.push(new ITask() {

			@Override
			public void doWork() {
				System.out.println("Work is on it's way");

			}
		});

		schedulerForTasks.push(new ITask() {

			@Override
			public void doWork() {
				System.out.println("I'm printing it!");

			}
		});

		schedulerForTasks.push(new ITask() {

			@Override
			public void doWork() {
				System.out.println("I'm getting coffee.");

			}
		});

		schedulerForTasks.push(new ITask() {

			@Override
			public void doWork() {
				System.out.println("And I'm doing all the work!");

			}
		});

		
		
for(ITask tasks: schedulerForTasks.myQueue){
	tasks.doWork();
}



	}

}
