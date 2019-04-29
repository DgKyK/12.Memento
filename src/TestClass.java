public class TestClass {
    public static void main(String[] args) {
        Code myCode = new Code("Patterns", 300);
        GitHub repository = new GitHub();
        repository.commit(myCode.createCheckPoint());
        System.out.println(myCode + "\nCoding....");
        myCode.setLinesNumber(700);
        myCode.setName("Project");
        System.out.println(myCode);
        System.out.println("Rolling back : ");
        myCode.rollBack(repository.unCommit());
        System.out.println(myCode);
    }
}
