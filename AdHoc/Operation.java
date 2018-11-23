package domain.AdHoc;

import java.util.ArrayList;

public interface Operation<T> {
    public void doOperationOn(ArrayList<T> anAdHocSetElements);
}
