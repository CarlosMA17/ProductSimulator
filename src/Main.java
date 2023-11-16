import com.modules.*;

public class Main {

    public static void main(String[] args) {

        Farm farm = new Farm(5);

        Producer paco = new Producer("Paco", 5, farm);

        Consumer gentleman = new Consumer("Mr. Gentleman", 5, farm);

        Thread pacoThread = new Thread(paco);
        Thread gentlemanThread = new Thread(gentleman);

        pacoThread.start();
        gentlemanThread.start();
    }
}
