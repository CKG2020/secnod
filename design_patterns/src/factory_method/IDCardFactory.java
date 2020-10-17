package factory_method;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory  extends  Factory {
    private List oweners=new ArrayList();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        oweners.add(product);
    }
    public List getOweners(){
        return  oweners;
    }

}
