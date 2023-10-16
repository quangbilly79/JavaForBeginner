package javacourse.section24generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class genericClassExtends<T extends Number> {
    List<T> arrayListT = new ArrayList<>();
    public void addElem(T elem) {
        Collections.addAll(arrayListT, elem,elem,elem,elem);
    }
}
