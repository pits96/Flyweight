package cars;

public class Car {
    private String modeltype;
    private String bodyType;

    public Car(String modeltype, String bodyType) {
        this.modeltype = modeltype;
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modeltype='" + modeltype + '\'' +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }
}
