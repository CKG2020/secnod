//package com;
//
//import java.io.IOException;
//
//public class MybatisTest {
//    public static void main(String[] args) {
//        @Test
//        public void query1 () throws IOException {
//
//            SqlSession session = getSession();
//
//            // 获取映射接口实例
//            StudentMapper mapper = session.getMapper(StudentMapper.class);
//            Student stu1_1 = mapper.queryStudentById("1");
//            Student stu1_2 = mapper.queryStudentById("1");
//            System.out.println(stu1_1 == stu1_2);
//        }
//    }
//}
