public class No$Array {
    class Customer {
        int index;
        Customer nextCustomer;
    }


    Customer first = null;
    Customer last = null;


    void push(int customerId) {
        Customer nextPush = new Customer();
        if (last == null) {
            first = last = nextPush;
        } else last.nextCustomer = nextPush;
        last = nextPush;

    }


}
