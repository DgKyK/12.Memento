public class GitHub {
    private CheckPoint checkPoint;

    public void GitHub(CheckPoint checkPoint) {
        this.checkPoint = checkPoint;
    }

    public CheckPoint unCommit() {
        return checkPoint;
    }

    public void commit(CheckPoint checkPoint) {
        this.checkPoint = checkPoint;
    }
}
