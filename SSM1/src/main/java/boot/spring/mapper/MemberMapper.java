package boot.spring.mapper;


import boot.spring.po.Member;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberMapper {
    @Select("SELECT * FROM  member   }")
    List  <Member>  findAllMember();

    @Select("SELECT * FROM  member   WHERE   id=#{id,jdbcType=INTEGER}")
    Member findById(@Param("id") int id);


    @Delete("DELETE FROM member WHERE phone=#{phone,jdbcType=VARCHAR}")
    int  deleteMember(@Param("phone") String phone);


    @Update("UPDATE  member  set  adress=#{adress,jdbcType=VARCHAR} where phone=#{phone,jdbcType=VARCHAR}")
    int updateAdress(@Param("adress") String adress, @Param("phone") String phone);



    @Update("UPDATE  member  set  discountlevel=#{discountlevel,jdbcType=DOUBLE} where phone=#{phone,jdbcType=VARCHAR}")
    int updateDiscountlevel(@Param("discountlevel") String discountlevel, @Param("phone") String phone);



    @Insert("INSERT INTO member  (mname,phone,email,adress) VALUES (#{mname},#{phone},#{email},#{adress})")
    public int addMember(@Param("mname") String mname, @Param("phone") String phone, @Param("email") String email, @Param("adress") String adress);




}


