public class CarFactory {

    public static ICar createCar(String mark, String color, int modelYear, double price, boolean backCamera) {
        ICar iCar;
            if (mark == "Mercedes") {
                iCar = new Mercedes(mark, color, modelYear, price, backCamera);

            }else if(mark == "Lamborghini"){
                iCar = new Lamborghini(mark, color, modelYear, price, backCamera);
            }else {
            throw new RuntimeException(mark + " adında bir markamız yoktur...");
        }
            return iCar;
    }

}