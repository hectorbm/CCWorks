package domain.AdHoc;

import java.util.ArrayList;
import java.util.Iterator;

public class IntersectionOperation<T> implements Operation {
    private AdHocSet<T> adHocSet ;

    public IntersectionOperation(AdHocSet<T> anAdHocSet){
        this.adHocSet = anAdHocSet;
    }
    @Override
    public void doOperationOn(ArrayList anAdHocSetElements) {
        Iterator itr = anAdHocSetElements.iterator();
        while(itr.hasNext()){
            T elem = (T)itr.next();
            if(!this.adHocSet.contains(elem))
                anAdHocSetElements.remove(elem);
        }

    }
}
