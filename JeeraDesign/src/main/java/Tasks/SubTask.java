package Tasks;

import SprintApplicationMain.Task;


public class SubTask implements TaskType {
    Task task;

    public SubTask(Task task) {
        this.task = task;
    }

    public SubTask(){

    }

}
