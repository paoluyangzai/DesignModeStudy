package a3builder;

public class BuilderTest {
    public static void main(String[] args) {
        Computer computer =  new MacBoodBuilder().buildBoard("m1").buildDisplay("xiaomi").buildOS().create();
        System.out.println(computer);

    }
}
