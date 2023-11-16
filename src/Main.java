import com.modules.*;

public class Main {

    public static void main(String[] args) {

        Farm farm = new Farm(5);

        Producer paco = new Producer("Paco", 10, farm);
        Producer ramon = new Producer("Ramon", 10, farm);

        Consumer faustino = new Consumer("Faustino", 5, farm);
        Consumer gentleman = new Consumer("Mr. Gentleman", 10, farm);
        Consumer loquendo = new Consumer("Loquendo", 5, farm);

        Thread pacoThread = new Thread(paco);
        Thread ramonThread = new Thread(ramon);
        Thread faustinoThread = new Thread(faustino);
        Thread gentlemanThread = new Thread(gentleman);
        Thread loquendoThread = new Thread(loquendo);

        pacoThread.start();
        ramonThread.start();
        faustinoThread.start();
        gentlemanThread.start();
        loquendoThread.start();
    }
}
