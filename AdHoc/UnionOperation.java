package domain.AdHoc;

import java.util.ArrayList;
import java.util.Iterator;

public class UnionOperation<T> implements Operation {
    private AdHocSet<T> adHocSet ;

    public UnionOperation(AdHocSet<T> anAdHocSet){
        this.adHocSet = anAdHocSet;
    }

    @Override
    public void doOperationOn(ArrayList anAdHocSetElements) {
        Iterator itr = this.adHocSet.getElements().iterator();
        while (itr.hasNext()){
            T elem = (T)itr.next();
            if (!anAdHocSetElements.contains(elem))
                anAdHocSetElements.add(elem);
        }
    }
}
