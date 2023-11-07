public class SmartWath extends Technique{
    String pamyat;

    public SmartWath(String name, String brand, String version, String pamyat) {
        super(name, brand, version);
        this.pamyat = pamyat;
    }

    public SmartWath(String name, String brand, String version) {
        super(name, brand, version);
    }

    public String getPamyat() {
        return pamyat;
    }

    public void setPamyat(String pamyat) {
        this.pamyat = pamyat;
    }
}
