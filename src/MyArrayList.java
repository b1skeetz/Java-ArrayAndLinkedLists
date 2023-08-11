public class MyArrayList implements MyList {

    private Object[] items;
    private int size;

    public MyArrayList() {
        items = new Object[10];
        size = 0;
    }

    @Override
    public void add(String value) {
        int bufSize = size++;
        Object[] bufArray = items;
        if (bufSize >= items.length) {
            items = new Object[(int) (size * 1.5 + 1)];
            for (int i = 0; i < bufArray.length; i++) {
                items[i] = bufArray[i];
            }
        }
        items[bufSize] = value;
    }

    @Override
    public void add(int index, String value) {
        int bufSize = size++;
        if (bufSize >= items.length) {
            Object[] bufArray = new Object[(int) (size * 1.5 + 1)];
            for (int i = 0; i < items.length; i++) {
                bufArray[i] = items[i];
            }
            items = bufArray;
        }
        for (int i = size - 1; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = value;
    }

    @Override
    public void remove(int index) {
        items[index] = null;
        for (int i = index + 1; i < size; i++) {
            items[i - 1] = items[i];
        }
        size--;
    }

    @Override
    public void set(int index, String value) {
        if (index >= 0 && index <= items.length - 1) {
            items[index] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String get(int index) {
        return (String) items[index];
    }


    @Override
    public boolean contains(String value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(items[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String value) {
        for(int i = 0; i < size; i++){
            if(get(i).equals(value)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String value) {
        for(int i = size - 1; i >= 0; i--){
            if(get(i).equals(value)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }


}
