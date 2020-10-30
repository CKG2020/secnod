package bloom;

import java.util.BitSet;

public class MyBloomFilter {
    //位数组的创建
    private static final int DEFAULT_SIZE = 2 << 24;
//通过这个数组可以创建６个ｈａｓｈ函数
    private static final int[] SEEDS = new int[]{3, 13, 46, 71, 91, 134};
//位数组
    private BitSet bits = new BitSet(DEFAULT_SIZE);
//存放ｈａｓｈ函数的类数组
    private SimpleHash[] func = new SimpleHash[SEEDS.length];


    public MyBloomFilter() {
        for (int i = 0; i < SEEDS.length; i++) {
            func[i] = new SimpleHash(DEFAULT_SIZE, SEEDS[i]);
        }
    }

//    public static MyBloomFilter create(Funnel<Integer> integerFunnel, int i, double v) {
//    }

    public void add(Object value) {
        for (SimpleHash f : func) {
            bits.set(f.hash(value), true);
        }
    }

    public boolean contains(Object value) {
        boolean ret = true;
        for (SimpleHash f : func) {
            ret = ret && bits.get(f.hash(value));
        }
        return ret;
    }

    public static class SimpleHash {
        private int cap;
        private int seed;

        public SimpleHash(int cap, int seed) {
            this.cap = cap;
            this.seed = seed;
        }
        public int hash(Object value) {
            int h;
            return (value == null) ? 0 : Math.abs(seed * (cap - 1) & ((h = value.hashCode()) ^ (h >>> 16)));
        }
    }




    public static void main(String[] args) {
        String value1 = "https://javaguide.cn/";
        String value2 = "https://github.com/Snailclimb";
        MyBloomFilter filter = new MyBloomFilter();
        System.out.println(filter.contains(value1));
        System.out.println(filter.contains(value2));
        filter.add(value1);
        filter.add(value2);
        System.out.println(filter.contains(value1));
        System.out.println(filter.contains(value2));



    }

}
