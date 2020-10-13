package com.aqs;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class SelfAbstractQueueSynchronizer {

    //继承AbstractQueuedSynchronizer类
    private static class Syn extends AbstractQueuedSynchronizer {

        private static final long serialVersionUID = 1L;

        //是否拥有锁
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

        //获取锁
        public boolean tryAcquire(int acquires) {
            if(compareAndSetState(0, 1)) {
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        //释放所
        protected boolean tryRelease(int releases) {
            if(getState() == 0)
                throw new IllegalMonitorStateException();
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }
    }

    private final Syn syn = new Syn();

    public void lock() {
        syn.acquire(1);
    }

    public boolean tryLock() {
        return syn.tryAcquire(1);
    }

    public void unlock() {
        syn.release(1);
    }

    public boolean isLocked() {
        return syn.isHeldExclusively();
    }
}
