package enumtest;

public enum  Personel {
    Mon("1", "周一"),
    Tus("2", "周二"),
    Wen("3", "周三"),
    Thu("4", "周四"),
    Fri("5", "周五"),
    Sat("6", "周六"),
    sun("7", "周日");
    private String typeId;
    private String typeName;


    Personel(String typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public String getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    //根据数字找到对应名称
    public static String getTypeNameById(String typeId) {
        String value = null;
        Personel[] values = values();
        for(int i = 0; i < values.length; ++i) {
            Personel type = values[i];
            if(type.getTypeId().equals(typeId)) {
                value = type.getTypeName();
                break;            }
        }
        return value;
    }
    //根据名称找到对应数字
    public static String getTypeIdByName(String typeName) {
        String value =null;
        Personel[] values = values();
        for(int i = 0; i < values.length; ++i) {
            Personel type = values[i];
            if(type.getTypeName().equals(typeName)) {
                value = type.getTypeId();
                break;            }
        }
        return value;

    }
}
