
public class AssignmentWork {


    private Pen pen;

    public void doAssignment(String work) {
        pen.write(work);
    }


    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }
}
