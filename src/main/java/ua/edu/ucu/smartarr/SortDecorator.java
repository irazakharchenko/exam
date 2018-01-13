package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray smartArray, MyComparator comp) {
        super(smartArray);
        smartArray = new BaseArray(sort(smartArray, comp));

    }

    public Object[] sort(SmartArray smartArray, MyComparator comp){
        Object obj;
        Object[] arr = smartArray.toArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                if(comp.compare(arr[j], arr[j+1]) > 0){
                    obj = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = obj;
                }
            }
        }
        return arr;
    }
}
