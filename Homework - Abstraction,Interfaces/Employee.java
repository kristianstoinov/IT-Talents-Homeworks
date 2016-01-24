public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;
	private AllWork allwork;

	AllWork getAllwork() {
		return this.allwork;
	}

	void setAllwork(AllWork allwork) {
		this.allwork = allwork;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		if (this.currentTask != null) {
			return this.currentTask;
		} else
			return new Task("No current task", 0);
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		}
	}

	public int getHoursLeft() {
		return this.hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}

	public Employee(String name) {
		if (name != null) {
			this.name = name;
			this.setHoursLeft(8);

		}
	}

	public void work() {
		this.startWorkingDay();

		int ctr = 0;
		while (this.getHoursLeft() > 0) {
			while (this.getCurrentTask().getWorkingHours() == 0) {
				this.setCurrentTask(allwork.getNextTask());
				ctr++;
				if (ctr == this.allwork.getLength()) {
					this.currentTask = new Task("No task", 0);
					break;
				}
			}
			if (!this.getCurrentTask().getName().equals("No current task")
					&& !this.getCurrentTask().getName().equals("No task")) {
				System.out.println("Starting the day's work on "
						+ this.getCurrentTask().getName() + " ");
				if ((this.getHoursLeft() >= this.getCurrentTask()
						.getWorkingHours() && (this.getCurrentTask()
						.getWorkingHours() > 0))) {
					this.setHoursLeft(this.getHoursLeft()
							- this.getCurrentTask().getWorkingHours());

					this.getCurrentTask().setWorkingHours(0);
					System.out.println(this.name + " finished "
							+ this.getCurrentTask().getName() + " \n\n");
				} else {
					this.getCurrentTask().setWorkingHours(
							getCurrentTask().getWorkingHours()
									- this.getHoursLeft());
					System.out.println(this.name + " did "
							+ this.getHoursLeft() + " hours of "
							+ this.getCurrentTask().getName());
					this.setHoursLeft(0);
				}
			} else {
				continue;
			}
		}

	}

	void startWorkingDay() {
		this.setHoursLeft(8);
		System.out.println("\nI'm starting a new day here, y'all! " + "("
				+ this.getName() + ")");
	}

}