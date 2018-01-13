package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    private Object[] arr;

    public FilterDecorator(SmartArray sa, MyPredicate pr){
        super(sa);

        arr = new Object[counter(sa,pr)];
        int i = 0;
        for (Object el:
             sa.toArray()) {
            if(pr.test(el)) {
                arr[i++] = el;
            }
        }
        smartArray = new BaseArray(arr);

    }

    private int counter(SmartArray sa, MyPredicate pr){
        int n =0;
        for (Object el:
                sa.toArray()) {
            if(pr.test(el)){
                n++;
            }
        }
        return n;
    }




}
