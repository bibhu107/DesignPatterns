package SprintApplicationMain;

import Tasks.TaskType;
import entities.Employee;
import entities.Status;
import entities.TaskTypeEnum;


import java.util.Date;

public class Task {
    String title;
    Employee creator;
    Employee assignee;
    Status status;
    TaskTypeEnum taskTypeEnum;
    TaskType taskType;
    Date dueDate;

    public Task(String title, Employee creator, Employee assignee, Status status, TaskTypeEnum taskTypeEnum, TaskType taskType, Date dueDate) {
        this.title = title;
        this.creator = creator;
        this.assignee = assignee;
        this.status = status;
        this.taskTypeEnum = taskTypeEnum;
        this.taskType = taskType;
        this.dueDate = dueDate;
    }


}
