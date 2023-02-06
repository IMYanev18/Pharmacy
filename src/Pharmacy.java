public class Pharmacy{
    public String Medicine;
    public String Provider;
    public String Manufacturer;
    public String Importer;

    public Pharmacy(){
        this.Medicine="";
        this.Provider="";
        this.Manufacturer="";
        this.Importer="";
    }

    public Pharmacy(String medicine, String provider, String manufacturer, String importer) {
        Medicine = medicine;
        Provider = provider;
        Manufacturer = manufacturer;
        Importer = importer;
    }

    public String getMedicine() {
        return Medicine;
    }

    public void setMedicine(String medicine) {
        Medicine = medicine;
    }

    public String getProvider() {
        return Provider;
    }

    public void setProvider(String provider) {
        Provider = provider;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getImporter() {
        return Importer;
    }

    public void setImporter(String importer) {
        Importer = importer;
    }
}
