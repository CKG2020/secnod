interface top{
    default int face(){
        return 1;
    }
}

interface middle1 extends top{
    @Override
    default int face(){
        return 0;
    }
}

interface middle2 extends top{
    @Override
    default int face(){
        return 2;
    }
}

class bottom implements middle1,middle2{

    @Override
    public int face() {
        return 0;
    }

}
public class Test2{

}
