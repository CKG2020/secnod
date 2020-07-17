package com;

import com.mapper.Function1;
import jdk.nashorn.internal.objects.annotations.Function;

import java.util.List;

public class MapperBean {
    private String interfaceName;
    private List<Function1> list;

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public List<Function1> getList() {
        return list;
    }

    public void setList(List<Function1> list) {
        this.list = list;
    }
}
