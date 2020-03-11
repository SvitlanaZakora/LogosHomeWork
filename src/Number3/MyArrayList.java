package Number3;

public class MyArrayList<T> {
    private Object arr[];
    private int lastIndex = 0;

    public MyArrayList() {
        arr = new Object[10];
    }

    public void add(T t) {
        arr[lastIndex] = t;
        lastIndex++;
    }

    public void remove(int index) {
        Object[] newArr = new Object[arr.length];
        for (int i = 0; i < lastIndex; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            }else{
                newArr[i]=arr[i+1];
            }
        }
        arr=newArr;
        lastIndex--;
    }

    public void print () {
        for (int i = 0; i < lastIndex; i++) {
            System.out.println(arr[i]);
        }
    }
}
