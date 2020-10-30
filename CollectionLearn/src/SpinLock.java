import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.concurrent.atomic.AtomicReference;

public class SpinLock {
     AtomicReference<Thread>  atomicReference=new AtomicReference<>();

     public void mylock(){
         Thread  thread=Thread.currentThread();
         System.out.println(Thread.currentThread().getName()+"\t come in");
         while(!atomicReference.compareAndSet(null,thread)){

         }

     }
     public void unlock(){
         Thread thread=Thread.currentThread();
         atomicReference.compareAndSet(thread,null);
         System.out.println(Thread.currentThread().getName()+"\t invoked mylock()" );
  }





}
