package team3925.maurice;

public class ArrayList {
    private Object[] arr;
    private int currsize = 0;
    
    public ArrayList(int slots) {
        arr = new Object[slots];
    }
    public ArrayList() {
        this(1);
    }
    
    public Object get(int i) {
        return arr[i];
    }
    
    public int size() {
        return currsize;
    }
    
    public void expand(int n) {
        Object[] temp = new Object[arr.length + n];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }
    
    public void add(Object o) {
        if (currsize >= arr.length) {
            expand(currsize - arr.length + 1);
        }
        arr[currsize++] = o;
    }
    
    public void remove(int index) {
        arr[index] = null;
        System.arraycopy(arr, index + 1, arr, index, arr.length - index - 1);
        currsize--;
    }
}