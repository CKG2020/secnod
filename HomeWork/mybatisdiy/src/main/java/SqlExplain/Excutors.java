package SqlExplain;

public interface Excutors {
    public <T> T query(String statement,Object parameter);
}
