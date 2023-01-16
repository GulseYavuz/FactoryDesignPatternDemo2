public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException  {

        ICar lambo =  CarFactory.createCar("Lamborghini", "Siyah", 2019, 2000000, true);
        ICar mercedes = CarFactory.createCar("Mercedes", "Kırmızı", 2020, 1500000, true);

        lambo.showCarInfo();
        System.out.println("-------------------------------");
        mercedes.showCarInfo();

    }
}