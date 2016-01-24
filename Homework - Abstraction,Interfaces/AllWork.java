import java.util.Arrays;

public class AllWork {

	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;

	int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	void setFreePlacesForTasks(int freePlacesForTasks) {
		this.freePlacesForTasks = freePlacesForTasks;
	}

	int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}

	void setCurrentUnassignedTask(int currentUnassignedTask) {
		this.currentUnassignedTask = currentUnassignedTask;
	}

	public AllWork() {
		
		this.setFreePlacesForTasks(10); 
		this.setCurrentUnassignedTask(0);
		tasks=new Task[freePlacesForTasks];
		
		}

	

	protected void addTask(Task newTask) {
		if (newTask != null) {
			if (this.freePlacesForTasks > 0) {
				for (int index = 0; index < tasks.length; index++) {
					if (tasks[index]== null){
						tasks[index] = newTask;
						this.freePlacesForTasks--;
						break;
					}
				}
			} 
			else {
				System.out.println("No capacity for more tasks");
			}
		}
	}
	
	
	public Task getNextTask() {
		if (this.currentUnassignedTask < this.tasks.length) {
			return this.tasks[currentUnassignedTask++];
		}
		return this.tasks[(currentUnassignedTask++)%10];
	}
	
	
	public Task[] getTasks(){
		return this.tasks;
	}
	
	public boolean isAllWorkDone(){
		for(int i=0;i<this.tasks.length;i++){
			if(this.tasks!=null && this.tasks[i]!=null){
				if(this.tasks[i].getWorkingHours()!=0){
					return false;
				}
			}
		}
		return true;
	}

	public int getLength() {
		return tasks.length;
	}
	

}
