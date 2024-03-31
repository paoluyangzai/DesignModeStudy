package a1singleinstance;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
//            long id =  IdGeneratorEHan.getInstance().getId();
//            long id = IdGeneratorLanHan.getInstance().getId();
//            long id = IdGennratorShuangChongJianCe.getInstance().getId();
//            long id = IdGeneratorJingTaiNeiBuLei.getInstance().getId();
//            long id =IdGeneratorMeiJu.INSTANCE.getId();
//            long id = IdGeneratorXianChengWeiYi.getInstance().getId();

//            System.out.println("得到的ID为：" + id);

        }
        BackendServerDuoLi randomInstace = BackendServerDuoLi.getRandomInstace();
        System.out.println("地址为"+randomInstace.getServerAddress());
    }
}
