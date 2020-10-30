package com.example.demo.cache9_14.config.info;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


//用于将mysql的配置文件管理在spring的容器中，从而在程序中优雅的使用。
@Component
//@PropertySource("classpath:mysql.properties")
public class JdbcInfo {

//    @Value("${URL}")
    private String url="jdbc:mysql://192.168.56.101:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";

//    @Value("${DRIVER}")
    private String driver="com.mysql.jdbc.Driver";

//    @Value("${USERNAME}")
    private String username="root";

//    @Value("${PASSWORD}")
    private String password="root";

//    @Value("${FILTERS}")
    private String filters="stat,config";


//    @Value("${CONNECTION_PROPERTIES}")
//    private String connectionProperties="config.decrypt=true;config.decrypt.key=${mariaDB.publicKey}";


//    @Value("${mybatis.type.alias.package}")
//    private String typeAliasesPackage;
//
//    public String getTypeAliasesPackage() {
//        return typeAliasesPackage;
//    }
//
//    public void setTypeAliasesPackage(String typeAliasesPackage) {
//        this.typeAliasesPackage = typeAliasesPackage;
//    }


//    @Value("${mariaDB.validationQuery}")
//    private String validationQuery;
//
//    public String getValidationQuery() {
//        return validationQuery;
//    }


    public String getFilters() {
        return filters;
    }

//    public String getConnectionProperties() {
//        return connectionProperties;
//    }


    public String getUrl() {
        return url;
    }

    public String getDriver() {
        return driver;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
