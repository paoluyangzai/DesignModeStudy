package a4prototype;

public class LoginImpl implements Login {
    @Override
    public void login() {
        User loginUser = new User();
        loginUser.age = 22;
        loginUser.name = "xuyang";
        loginUser.address = new Address("北京市", "平谷区", "兴谷街道");
        LoginSession.getsLoginSession().setLoginedUser(loginUser);

    }


}
