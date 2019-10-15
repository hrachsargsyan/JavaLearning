public class Queue$LinkedList {
    class Customer {
        int value;
        String name;
        Customer nextCustomer = null;
    }

    // 3 5 67 876 7 45
    Customer firstCustomer = null;
    Customer lastCustomer = null;
    int size = 0;

    void push(int id) {
        Customer eachPush = new Customer();
        eachPush.value = id;
        eachPush.name = "Customer " + id;
        if (lastCustomer == null) {
            firstCustomer = eachPush;
        } else {
            lastCustomer.nextCustomer = eachPush;
        }
        lastCustomer = eachPush;
        size++;
    }

    String get(int id) {
        Customer temp = null;
        Customer currentCustomer = firstCustomer;
        boolean hasNext = true;
        while (hasNext) {
            if (currentCustomer.value == id) {
                temp = currentCustomer;
                hasNext = false;
                //break
            } else {
                currentCustomer = currentCustomer.nextCustomer;
                if (currentCustomer == null) {
                    hasNext = false;
                }
            }

        }
        if (temp != null) {
            return temp.name;
        } else return "null";
    }


    int pop() {
        if (firstCustomer != null) {
            Customer temp = firstCustomer;
            firstCustomer = temp.nextCustomer;
            size--;
            return temp.value;
        }
        return -1;
    }


    int peek() {
        if (firstCustomer != null) {
            return firstCustomer.value;
        }
        return -1;
    }


    int size() {
        return size;

    }
}