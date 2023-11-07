public class Main {
    public static void main(String[] args) {
        Technique technique = new Technique("Laptop","hgjdk","234");

        Iphone iphone2 = new Iphone("15 pro max", "apple", "23.23.23","64");
//        Iphone iphone = new Iphone("15 pro max", "apple", "23.23.23");
        System.out.println(iphone2.getName() + "\n" + iphone2.getPamyat() + "\n" + iphone2.getBrand() + "\n" + iphone2.getVersion());
        technique.turnoff();
        Computer computer = new Computer("Asus", "intel", "20.20.18","64");
        System.out.println(computer.getName() + "\n" + computer.getPamyat() + "\n" + computer.getBrand() + "\n" + iphone2.getVersion());
        SmartWath smartWath = new SmartWath("applewath", "smart", "23.453.3","54");
        System.out.println(smartWath.getName() + "\n" + smartWath.getBrand() + "\n" + smartWath.getVersion() + "\n" + smartWath.getPamyat());

    }
}