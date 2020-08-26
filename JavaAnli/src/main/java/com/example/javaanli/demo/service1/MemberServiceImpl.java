package com.example.javaanli.demo.service1;


import com.example.javaanli.demo.dao1.mapper.MemberMapper;
import com.example.javaanli.demo.entity1.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl {

    @Autowired
    private MemberMapper memberMapper;

    public List<Member> findAllMember() {
        return (List<Member>) memberMapper.findAllMember();
    }


    public  Member  findById(int id){
        return (Member) memberMapper.findById(id);

    }

  public  int  deleteMember( String phone){

        return  memberMapper.deleteMember(phone);
  }


    public   int updateAdress( String adress, String phone){
        return  memberMapper.updateAdress(adress,phone);
    }


    public   int updateDiscountlevel( String discountlevel,String phone){
        return  memberMapper.updateDiscountlevel(discountlevel,phone);
    }


}
