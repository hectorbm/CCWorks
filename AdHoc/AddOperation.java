package AdHoc;

import java.util.ArrayList;
import java.util.Iterator;

public class AddOperation<T> implements Operation {
    private T element ;

    public AddOperation(T anElement){
        this.element = anElement;
    }

    @Override
    public void doOperationOn(ArrayList anAdHocSetElements) {
        Iterator itr = anAdHocSetElements.iterator();
        boolean contains = false;
        while (itr.hasNext()){
            T elem = (T)itr.next();
            if(elem.equals(this.element))
                contains = true;
        }
        if(!contains)
            anAdHocSetElements.add(this.element);
    }
}
