package pojoE;

import pojo.Orders;

/**
 * Created by admin on 2017/7/1.
 */
public class OrdersUser extends Orders {

    //在Orders中新增User的属性
    private String username;
    private String sex;
    private String address;

    @Override
    public String toString() {
        return "OrdersUser{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", id='" + super.getId()+ '\'' +
                ", Note='" + super.getNote() + '\'' +
                ", Number='" + super.getNumber() + '\'' +
                ", Createtine='" + super.getCreatetine() + '\'' +
                '}';
    }

    public String supToString() {
        return super.toString();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
