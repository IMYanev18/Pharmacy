public class Provider {
    public String name;
    public String address;
    public String phone;

    public Provider(){
        this.name="Spas";
        this.address ="iasojiadsoi";
        this.phone ="009049854";
    }

    public Provider(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "name='" + name + '\'' +
                ", age=" + address +
                ", city='" + phone + '\'' +
                '}';
    }
}



