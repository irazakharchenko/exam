package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{

    public MapDecorator(SmartArray smartArray, MyFunction function) {
        super(smartArray);
        Object[] arr = smartArray.toArray();
        for (int i = 0; i < smartArray.size(); i++) {
            arr[i] = function.apply(arr[i]);
        }
        smartArray = new BaseArray(arr);
    }
}
