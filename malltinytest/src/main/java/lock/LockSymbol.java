package lock;

import java.util.concurrent.locks.Lock;
import org.openjdk.jol.info.ClassLayout;

public class LockSymbol {
    public static void main(String[] args) {
        LockSymbol lockSymbol = new LockSymbol();
        System.out.println(ClassLayout.parseInstance(lockSymbol).toPrintable());
        System.out.println("===================================================");
    synchronized (lockSymbol){
        System.out.println(ClassLayout.parseInstance(lockSymbol).toPrintable());
        System.out.println("===================================================");

    }
        System.out.println(ClassLayout.parseInstance(lockSymbol).toPrintable());
        System.out.println("===================================================")
    }
}
