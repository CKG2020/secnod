package Factory;

public class IDCard  extends Product{
    private String owner;
    IDCard(String owner){
        this.setOwner(owner);
        System.out.println("制作"+this.getOwner()+"的ID卡");
    }


    @Override
    public void use() {
        System.out.println("使用"+this.getOwner()+"的ID卡");
    }

    public  String getOwner(){
        return owner;
    }

    public void setOwner(String owner){
        this.owner=owner;

    }


}
