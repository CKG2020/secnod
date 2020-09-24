package boot.spring.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface  GoodsMapper {

    @Select("SELECT  price FROM  goods   WHERE   productID=#{productID,jdbcType=INTEGER }")
    int findPrice(@Param("productID") int productID);

    @Select("SELECT  amount  FROM  storage   WHERE   productID=#{productID,jdbcType=INTEGER}   ")
    int findQuantity(@Param("productID") int productID);

    @Select("SELECT   SUM(quantity)  FROM  sales   WHERE   productID=#{productID,jdbcType=INTEGER}")
    int findMoney(@Param("productID") int productID);

}
