package cars;

public class TeslaModel {
    // Color would be the extrinsic data
    private String carColor;
    // Car would be the intrinsic data
    private Car modelType;

    public TeslaModel(String carColor, Car modelType) {
        this.carColor = carColor;
        this.modelType = modelType;
    }


    public Car getModelType() {
        return modelType;
    }
}
