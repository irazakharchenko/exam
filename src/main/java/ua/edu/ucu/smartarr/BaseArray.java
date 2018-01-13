package ua.edu.ucu.smartarr;


// Base array for decorators
public class BaseArray implements SmartArray{
    private Object[] array = {};

    //public BaseArray(){}
    public BaseArray(Object[] arr){
        array = arr;
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return array.length;
    }



}
