import com.javaee.dao.StudentDao;
import com.javaee.po.Student;
import com.javaee.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentDaoTest {
    @Test
    public void findStudentBySnoTest(){
        System.out.println("findStudentBySnoTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

        Student student = studentDao.findStudentBySno("100000001");
        System.out.println(student.getSname());
        sqlSession.close();
    }

    @Test
    public void findStudentAllTest(){
        System.out.println("findStudentAllTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = studentDao.findStudentAll();
        System.out.println(studentList);
        sqlSession.close();
    }

    @Test
    public void findStudentBySnameTest(){
        System.out.println("findStudentBySnameTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = studentDao.findStudentBySname("小");
        System.out.println(studentList);
        sqlSession.close();
    }

    @Test
    public void insertStudentTest(){
        System.out.println("insertStudentTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        student.setSno("888888888");
        student.setSname("张思源");
        student.setSsex("男");
        student.setSnative("广东广州");
        student.setMno(1);
        int lines = studentDao.insertStudent(student);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功插入了" + lines + "条记录");
    }

    @Test
    public void updateStudentTest(){
        System.out.println("updateStudentTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        student.setSno("888888888");
        student.setSname("张思霞");
        student.setSsex("女");
        student.setSnative("广东佛山");
        student.setMno(1);
        int lines = studentDao.insertStudent(student);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功更新了" + lines + "条记录");
    }

    @Test
    public void deleteStudentBySnoTest(){
        System.out.println("deleteStudentBySnoTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

        int lines = studentDao.deleteStudentBySno("888888888");
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功删除了" + lines + "条记录");
    }
}
