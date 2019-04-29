public class GitHub {
    private CheckPoint checkPoint;

    public GitHub() {

    }

    public CheckPoint unCommit() {
        return checkPoint;
    }

    public void commit(CheckPoint checkPoint) {
        this.checkPoint = checkPoint;
    }
}
