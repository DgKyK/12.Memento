public class CheckPoint {
    private final String name;
    private final int lineNumbers;

    public CheckPoint(String name, int lineNumbers) {
        this.name = name;
        this.lineNumbers = lineNumbers;
    }

    public String getName() {
        return name;
    }

    public int getLineNumbers() {
        return lineNumbers;
    }
}
