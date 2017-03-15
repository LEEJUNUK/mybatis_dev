package kr.or.dgit.mybatis_dev;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class SqlSessionTest {

	private static SqlSessionFactory sqlSessionFactory;
	   @BeforeClass
	   public static void setUpBeforeClass() throws Exception {
	      sqlSessionFactory = MybatisSqlSessionFactory.getSqlSessionFactory();
	   }

	   @AfterClass
	   public static void tearDownAfterClass() throws Exception {
	      sqlSessionFactory = null;
	   }

	   @Test
	   public void test() {
	      Assert.assertNotNull(sqlSessionFactory.openSession());
	   }
	   
	   @Test void pTestSelectStudentByALLForResultMap(){
		            Student student = new Student();
		            student.setStudId(1);
		            
		            
		            
		            Student selectStudent = StudentService.selectStudentByNoForResultMap(stduent);
		            Assert.asserArrayNull(selectStudent);

		            
		            
	   }
	 
	  @Test
	  public void pTestSelectStudentByALLForHashMap(){
		  List<Map<String, Object>> lists = StudentService.select
 		  List<Map<String, Object>> emptyLists = StudentService.select

 		  
 		  	
 	  }
}
