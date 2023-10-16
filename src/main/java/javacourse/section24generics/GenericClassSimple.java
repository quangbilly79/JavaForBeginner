package javacourse.section24generics;

import java.util.ArrayList;

// Generic: Thêm <Type> vào sau tên Class để gán type cho Class
// Có thể giới hạn loại Type = cách extends Class (các subClass của class đó cx dùng đc luôn)
class GenericClassSimple<T /*extends Number*/> {
    // Sử dụng Type T bên trên để gán cho các biến, các hàm
    ArrayList<T> arrayListT = new ArrayList<T>();

    public void addElement(T elem) {
        arrayListT.add(elem);
    }

    public void removeElement(T elem) {
        arrayListT.remove(elem);
    }

    public T getElement(int index) {
        T getResult = arrayListT.get(index);
        return getResult;
    }

    public String toString() {
        return arrayListT.toString();
    }
}
