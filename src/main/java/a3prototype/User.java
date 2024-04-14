package a3prototype;

public class User implements Cloneable{
    public int age;
    public String name;
    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    /**
     * 确保已登录用户信息的安全性
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = null;
        user = (User) super.clone();
        return user;
    }
}
