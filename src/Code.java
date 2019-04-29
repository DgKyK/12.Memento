public class Code {
    private int linesNumber;
    private String name;

    public Code(String name, int linesNumber) {
        this.name = name;
        this.linesNumber = linesNumber;
    }

    public CheckPoint createCheckPoint() {
        return new CheckPoint(name, linesNumber);
    }

    public void rollBack(CheckPoint checkPoint) {
        this.linesNumber = checkPoint.getLineNumbers();
        this.name = checkPoint.getName();
    }

    public void setLinesNumber(int linesNumber) {
        this.linesNumber = linesNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Code{" +
                "linesNumber=" + linesNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
