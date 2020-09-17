package com.ckg.entity;
import javax.persistence.*;

@Entity(name = "t_book")
//创建的表的名字为 name的属性值
public class Book{
    @Id
    //表明该属性为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    、、表明主键的生成策略
    private Integer id;
    @Column(name = "book_name",nullable = false)
    private String name;
    private String author;
    private Float price;
    @Transient
    private  String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
