public class Medicine {
    public String name;
    public double price;
    public String dateOfExpiring;

    public Medicine(){
        this.name="analgin";
        this.price=5.32;
        this.dateOfExpiring="22.02.2222";
    }

    public Medicine(String name, double price, String dateOfExpiring) {
        this.name = name;
        this.price = price;
        this.dateOfExpiring = dateOfExpiring;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDateOfExpiring() {
        return dateOfExpiring;
    }

    public void setDateOfExpiring(String dateOfExpiring) {
        this.dateOfExpiring = dateOfExpiring;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", dateOfExpiring='" + dateOfExpiring + '\'' +
                '}';
    }
}
