package BathroomProblem;

public class Bathroom {

	 String currentGeneder="";
	int totalPeopleInBathroom;
	int max_allowed_people = 3;//For Example

	//There is one bathroom and max 3 people can use it and if lady is present then gents can't use it
	public void run() {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					ladies("Kat");
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					ladies("Kat");
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		});
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					gents("Kat");
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		});
		thread1.start();
		thread2.start();
		thread3.start();

	}

	private synchronized boolean cantUseBathroom(String gender) {
		if (currentGeneder.isEmpty() && totalPeopleInBathroom < max_allowed_people) {
			totalPeopleInBathroom++;
			currentGeneder = gender;
			return true;
		}
		if (currentGeneder.equals(gender) && totalPeopleInBathroom < max_allowed_people) {
			totalPeopleInBathroom++;
			return true;
		}
		return false;
	}

	private synchronized void leaveBathroom(String name) {
		totalPeopleInBathroom--;
		if (totalPeopleInBathroom == 0)
			currentGeneder = "";
		notifyAll();
	}

	private synchronized void useBathroom(String name) {
		System.out.println("BathroomProblem.Bathroom is used by:"+name);
	}

	private void ladies(String name) throws InterruptedException {
		while (!cantUseBathroom("Lady")) {
			this.wait();
		}
		useBathroom(name);
		leaveBathroom(name);
	}


	private void gents(String name) throws InterruptedException {
		while (!cantUseBathroom("Gents")) {
			this.wait();
		}
		useBathroom(name);
		leaveBathroom(name);
	}
}
