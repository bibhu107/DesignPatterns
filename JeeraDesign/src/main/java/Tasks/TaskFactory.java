package Tasks;

import com.InvalidTaskException;
import SprintApplicationMain.SprintApplicationMain;
import SprintApplicationMain.Task;
import entities.Employee;
import entities.TaskTypeEnum;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskFactory {
    TaskTypeEnum taskTypeEnum;

    public TaskFactory(TaskTypeEnum taskTypeEnum) {
        this.taskTypeEnum = taskTypeEnum;
    }

    public TaskType getTask(TaskTypeEnum taskTypeEnum) throws InvalidTaskException {
        System.out.println(taskTypeEnum);
        if (TaskTypeEnum.BUG_TASK.equals(taskTypeEnum))
            return new BugTask();
        else if (TaskTypeEnum.STORY_TASK.equals(taskTypeEnum))
            return new StoryTask("Summary", 10, getSubTasks("ab"));
        else if (TaskTypeEnum.FEATURE_TASK.equals(taskTypeEnum))
            return new FeatureTask();
        else
            throw new InvalidTaskException("Couldn't find any task for taskType");
    }


    private List<SubTask> getSubTasks(String title) throws InvalidTaskException {
        String title1 = "BugIssueOfSev0";
        Employee creator = new Employee("Prasad", "1", "9439196381");
        Employee assignee = new Employee("Prasad", "1", "9439196381");
        Instant startInstant = Instant.ofEpochMilli(1628227544);
        Date startDate = Date.from(startInstant);
        SprintApplicationMain sprintApplicationMain = new SprintApplicationMain();
        Task task1 = sprintApplicationMain.createNewTask(title1, creator, assignee, TaskTypeEnum.SUB_TASK, startDate);
        Task task2 = sprintApplicationMain.createNewTask(title1, creator, assignee, TaskTypeEnum.SUB_TASK, startDate);
        Task task3 = sprintApplicationMain.createNewTask(title1, creator, assignee, TaskTypeEnum.SUB_TASK, startDate);

        List<SubTask> tasks = new ArrayList<>();
        SubTask subTask1 = new SubTask(task1);
        SubTask subTask2 = new SubTask(task2);
        SubTask subTask3 = new SubTask(task3);
        tasks.add(subTask1);
        tasks.add(subTask2);
        tasks.add(subTask3);
        return tasks;
    }
}

