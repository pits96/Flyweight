package cars;

public class CarTest {
    public static void main(String[] args) {

        TeslaModel car1 = new TeslaModel("black", CarFactory.getCar("y","sedan"));
        TeslaModel car5 = new TeslaModel("blue", CarFactory.getCar("y","sedan"));
        TeslaModel car2 = new TeslaModel("white", CarFactory.getCar("y","SUV"));
        TeslaModel car6 = new TeslaModel("black", CarFactory.getCar("y","SUV"));
        TeslaModel car3 = new TeslaModel("red", CarFactory.getCar("x","sedan"));
        TeslaModel car4 = new TeslaModel("gray", CarFactory.getCar("x","SUV"));
//        System.out.println(car5.getModelType().hashCode());
//        System.out.println(car2.getModelType().hashCode());
//        System.out.println(car6.getModelType().hashCode());
//        System.out.println(car3.getModelType().hashCode());
//        System.out.println(car4.getModelType().hashCode());
        System.out.println(car1.toString());
        System.out.println("Car object: "+car1.getModelType().hashCode());
        System.out.println(car5.toString());
        System.out.println("Car object: "+car5.getModelType().hashCode());
        System.out.println(car2.toString());
        System.out.println(car6.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car4.getModelType().hashCode());

    }
}
