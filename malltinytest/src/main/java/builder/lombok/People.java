package builder.lombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class People {
    private String name;
    private String sex;
    private int age;
}
//class People加上了@Builder和@Data注解后，
//        多了一个静态内部类PeopleBuilder，
//        People调用静态方法builder生成PeopleBuilder对象，
//        PeopleBuilder对象可以使用".属性名(属性值)"的方式进行属性设置
//，再调用build()方法就生成了People对象，并且如果两个People对象的属性如果相同，
//        就会认为这两个对象相等，即重写了hashCode和equls方法。
