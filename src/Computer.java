public class Computer extends Technique{
    String pamyat;

    public Computer(String name, String brand, String version, String pamyat) {
        super(name, brand, version);
        this.pamyat = pamyat;
    }


    public Computer(String name, String brand, String version) {
        super(name, brand, version);
    }

    public String getPamyat() {
        return pamyat;
    }

    public void setPamyat(String pamyat) {
        this.pamyat = pamyat;
    }

    }

