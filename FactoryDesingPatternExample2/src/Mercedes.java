public class Mercedes implements ICar {
    private String mark;
    private String color;
    private int modelYear;
    private double price;
    private boolean backCamera;

    public Mercedes(String mark, String color, int modelYear,double price, boolean backCamera){
        this.mark = mark;
        this.color = color;
        this.modelYear = modelYear;
        this.price = price;
        this.backCamera = backCamera;

    }

    @Override
    public void getMark() {

    }

    @Override
    public void getColor() {

    }

    @Override
    public void getModelYear() {

    }

    @Override
    public void getPrice() {

    }

    @Override
    public void BackCemara() {

    }

    @Override
    public void showCarInfo() {

        System.out.println("Arabanın markası: " + mark);
        System.out.println("Arabanın rengi: " + color);
        System.out.println("Arabanın model yılı: " + modelYear);
        System.out.println("Arabanın fiyatı: " + price);

        if(backCamera == true){
            System.out.println("Arabanın arka kamera özelliği var.");
        }else{
            System.out.println("Arabanın arka kamera özelliği yok.");

        }
    }
}
