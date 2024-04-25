package a7IteratorPattern.example3;

public class XiaoMin {
    public static void main(String[] args) {
        Leder groupLeder = new GroupLeader();
        Leder directorLeder  = new Director();
        Leder boss = new Boss();

        groupLeder.nextLeder = directorLeder;
        directorLeder.nextLeder = boss;

        groupLeder.hadleRequest(99999);
    }
}
