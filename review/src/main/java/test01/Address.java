package test01;

/**
 * @author 小白
 * @create 2021/6/8
 */
public class Address {
    private String province;
    private String street;

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Address(String province, String street) {
        this.province = province;
        this.street = street;
    }

    public Address() {
    }

}
