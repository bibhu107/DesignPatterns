package SprintApplicationMain;

import java.util.Date;
import java.util.List;

public class Sprint {
    List<Task> listOfTasks;
    Date startDate;
    Date endDate;

    public Sprint(List<Task> tasks,Date startDate, Date endDate){
        this.listOfTasks = tasks;
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
