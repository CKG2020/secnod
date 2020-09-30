package builder.lombok;

import org.junit.Test;

public class TestLombok {

    @Test
    public void testBuilderAnnotation(){
        People luoTianyan = People.builder()
                .sex("female")
                .age(23)
                .name("LuoTianyan")
                .build();


        System.out.println(luoTianyan.toString());
        //People(name=LuoTianyan, sex=female, age=23)

        People people = new People("LuoTianyan","female",23);
        System.out.println(luoTianyan.equals(people));
        //true
    }

}
