package kr.or.dgit.mybatis_dev;

import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentMapper;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class StudentService {
    public int insertStudentAutoIncrement(Student student){
    	Logger.debug("updateStudent()");
     SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
     try {
    	 StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        int res = studentMapper.updateStundent(student);
        sqlSession.commit();
       return res; 
     }catch (Exception e){
    	 sqlSession.rollback();
    	 e.printStackTrace();
    	 throw new RuntimeException(e.getCause());
     }finally{
    	 sqlSession.close();
     }
    }
	
}
