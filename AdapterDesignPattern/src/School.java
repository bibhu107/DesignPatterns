public class School {

    public static void main(String[] args){

        Pen pen = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setPen(pen);
        assignmentWork.doAssignment("Assignment is , write Adapter Design Pattern");
    }
}
