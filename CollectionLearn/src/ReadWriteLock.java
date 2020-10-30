import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Mycache {

    private volatile Map<Integer, Object> map = new HashMap<>();
    private ReentrantReadWriteLock rwlock=new ReentrantReadWriteLock();

    public void put(int key, Object value) {
     rwlock.writeLock().lock();
     try{

         System.out.println(Thread.currentThread().getName() + "\t 正在写入：" + key);

         map.put(key, value);
         System.out.println(Thread.currentThread().getName() + "\t 写入完成");
     }

     finally{
     rwlock.writeLock().unlock();
     }

    }


    public void get(int key) {

        rwlock.readLock().lock();
        try{
            System.out.println(Thread.currentThread().getName() + "\t 读取写入：" + key);

            map.get(key);
            System.out.println(Thread.currentThread().getName() + "\t 读取完成");
        }

        finally{
        rwlock.readLock().unlock();
        }

    }



}


public class ReadWriteLock {


    public static void main(String[] args) {
        Mycache mycache = new Mycache();
        for(int i = 0; i <5 ; i++) {
            final int temp=i;
         new Thread(()->{
             mycache.put(temp,""+temp);

        },String.valueOf(i)).start();

        }


        for(int n = 0;  n< 5; n++) {
            final int temp=n;
         new Thread(()->{
            mycache.get(temp);
        },String.valueOf(n)).start();

        }


    }







}
