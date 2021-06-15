package cars;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    static Map<String,Car> model = new HashMap<>();

    public static Car getCar(String name, String modeltype){
        Car result = model.get(name+modeltype);
        if(result==null){
            result = new Car(name,modeltype);
            model.put(name+modeltype,result);
        }
        return result;
    }
}
