package d8;

  //generic type reference
// người dùng class có thể quyết định kiểu dữ liệu
public class ArrayWrapper<T> {

    private T[] array;

    public ArrayWrapper(T[] array){
        this.array = array;

    }
    public int length(){
        return array.length;
    }

    public boolean contains(T target){
        for (T item : array){
            if (item == null) continue;
            if (item.equals(target)) return true;

        }
        return false;

    }

}
