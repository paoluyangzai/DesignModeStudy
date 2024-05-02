package a10Observer;

public class Test {
    public static void main(String[] args) {
        DevTechFrontier devTechFrontier = new DevTechFrontier("羊崽论坛");
        Coder coder = new Coder("许一");
        Coder coder1 = new Coder("许二");
        Coder coder2 = new Coder("许三");
        Coder coder3 = new Coder("许四");
        Coder coder4 = new Coder("许五");

        devTechFrontier.addObserver(coder);
        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);
        devTechFrontier.addObserver(coder4);

        devTechFrontier.postNewPublication("更新啦");
    }
}
