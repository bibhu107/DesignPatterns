package Tasks;


import java.util.List;

public class StoryTask implements TaskType {
    String summary;
    int points; //human hours
    List<SubTask> subTaskList;

    public StoryTask(String summary, int points, List<SubTask> subTasks) {
        this.summary = summary;
        this.points = points;
        this.subTaskList = subTasks;
    }


}
