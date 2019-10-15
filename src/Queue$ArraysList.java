import java.util.ArrayList;

public class Queue$ArraysList {
    ArrayList<Integer> list = new ArrayList<>();

      /*    public int id;   // ID
        public int pop;  // veradadzrnum es IDn u jnjum
        public int peek; // hertakan hamar - veradardznum e ID-n   */


    public void push(int id) {
        list.add(id);
    }

    public int pop() {
        int pop = list.get(0);
        list.remove(0);
        return pop;
    }

    public int peek() {
        return list.get(0);
    }

    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else return false;
    }


}



