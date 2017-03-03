package Joshua.DS.List;

/**
 * Created by Joshua on 2017-03-03.
 */
public class ArrayList {
    private final static int MAX_LIST_SIZE = 100; // 배열의 최대 크기
    private Object[] list = new Object[MAX_LIST_SIZE];
    private int length;

    public ArrayList (int length) {
        this.length = length;
        for (int index = 0; index < length; index++) {
            list[index] = 0;
        }
    }

    public ArrayList () {
        this.length = 0;
    }

    public boolean is_empty() {
        return this.length == 0;
    }

    public boolean is_full() {
        return this.length == MAX_LIST_SIZE;
    }

    public void display() {
        int index;
        for(index = 0; index < this.length; index++) {
            System.out.println(this.list[index]);
        }
    }

    public void add(int position, Object item) {
        if(!is_full() && (position >= 0) && (position <= this.length)) {
            int index;
            for(index = this.length-1; index >= position; index--) {
                this.list[index + 1] = this.list[index];
            }

            this.list[position] = item;
            this.length++;
        }
    }

    public Object delete(int position) {
        int index;
        Object item;

        if(position < 0 || position >= this.length) {
            System.out.println("position error");
        }
        item = this.list[position];

        for(index = position; index < this.length-1; index++) {
            this.list[index] = this.list[index + 1];
        }
        this.length--;

        return item;
    }
}
