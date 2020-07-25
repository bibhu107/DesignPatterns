public class PenAdapter implements Pen {
    PilotPen pilotPen = new PilotPen();

    @Override
    public void write(String write) {
        pilotPen.write(write);
    }
}
