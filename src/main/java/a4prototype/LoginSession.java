package a4prototype;

public class LoginSession {
    static LoginSession sLoginSession = null;
    private User loginedUser;
    private LoginSession(){}
    public static LoginSession getsLoginSession(){
        if (sLoginSession==null){
            sLoginSession = new LoginSession();
        }
        return sLoginSession;
    }

    public void setLoginedUser(User loginedUser) {
        this.loginedUser = loginedUser;
    }

    public User getLoginedUser() {
        return (User) loginedUser.clone();
//        return loginedUser;
    }
}
