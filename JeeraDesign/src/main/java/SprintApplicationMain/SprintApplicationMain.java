package SprintApplicationMain;

import Tasks.SubTask;
import Tasks.TaskFactory;
import Tasks.TaskType;
import com.InvalidTaskException;
import entities.Employee;
import entities.TaskTypeEnum;
import entities.Status;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SprintApplicationMain {
    public static void main(String[] args) throws InvalidTaskException {

        System.out.println("Hello Welcome to sprint planning");
        System.out.println("Creating a sprint for you");

        Sprint sprint = createSprint();

    }


    private static Sprint createSprint() throws InvalidTaskException {
        System.out.println("Creating a sprint.");
        List<Task> taskList = getAllTasks();
        Instant startInstant = Instant.ofEpochMilli(1628227544);
        Instant endInstant = Instant.ofEpochMilli(1628427544);
        Date startDate = Date.from(startInstant);
        Date endDate = Date.from(endInstant);
        Sprint sprint = new Sprint(taskList, startDate, endDate);
        return sprint;
    }

    private static List<Task> getAllTasks() throws InvalidTaskException {
        String title1 = "BugIssueOfSev0";
        String title2 = "StoryWith2SubTask";
        String title3 = "FeatureWithImpactHigh";

        Employee creator = new Employee("Prasad", "1", "9439196381");
        Employee assignee = new Employee("Prasad", "1", "9439196381");
        Instant startInstant = Instant.ofEpochMilli(1628227544);
        Date startDate = Date.from(startInstant);
        List<Task> tasks = new ArrayList<>();

        Task task = createNewTask(title1, creator, assignee, TaskTypeEnum.BUG_TASK, startDate);
        Task task2 = createNewTask(title2, creator, assignee, TaskTypeEnum.STORY_TASK, startDate);
        Task task3 = createNewTask(title3, creator, assignee, TaskTypeEnum.FEATURE_TASK, startDate);

        System.out.println("The task is " + task.toString());
        tasks.add(task);
        tasks.add(task2);
        tasks.add(task3);
        return tasks;
    }

    public static Task createNewTask(String title, Employee creator, Employee assignee, TaskTypeEnum taskTypeEnum, Date dueDate) throws InvalidTaskException {
        TaskType taskType = null;
        if (!taskTypeEnum.equals(TaskTypeEnum.SUB_TASK)) {
            TaskFactory taskFactory = new TaskFactory(taskTypeEnum);
            taskType = taskFactory.getTask(taskTypeEnum);
        } else
            taskType = new SubTask();
        System.out.println("Called factory");
//        System.out.println("taskType" +taskType.toString());
        System.out.println("taskType Enum : " + taskTypeEnum);
//        if (!valid(taskType, taskTypeEnum))
//            throw new InvalidTaskException("Wrong task");
        Task task = new Task(title, creator, assignee, Status.OPEN, taskTypeEnum, taskType, dueDate);
        return task;
    }


}