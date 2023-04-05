import com.javaee.dao.BookDao;
import com.javaee.po.Book;
import com.javaee.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class BookDaoTest {
    @Test
    public void findStudentBySnoTest(){
        System.out.println("findBookByIdTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BookDao bookDao = sqlSession.getMapper(BookDao.class);

        Book book = bookDao.findBookById(1);
        System.out.println(book);
        sqlSession.close();
    }

    @Test
    public void findStudentAllTest(){
        System.out.println("findBookAllTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BookDao bookDao = sqlSession.getMapper(BookDao.class);

        List<Book> bookList = bookDao.findBookAll();
        System.out.println(bookList);
        sqlSession.close();
    }

    @Test
    public void findStudentBySnameTest(){
        System.out.println("findBookByBnameTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BookDao bookDao = sqlSession.getMapper(BookDao.class);
        List<Book> bookList = bookDao.findBookByBname("据");
        System.out.println(bookList);
        sqlSession.close();
    }

    @Test
    public void insertStudentTest(){
        System.out.println("insertBookTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BookDao bookDao = sqlSession.getMapper(BookDao.class);

        Book book = new Book();
        book.setBname("高等数学(下)");
        book.setId(5);
        book.setPrice(56.5);
        book.setPub("高等教育出版社");
        int lines = bookDao.insertBook(book);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功插入了" + lines + "条记录");
    }

    @Test
    public void updateStudentTest(){
        System.out.println("updateBookTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BookDao bookDao = sqlSession.getMapper(BookDao.class);

        Book book = new Book();
        book.setId(2);
        book.setBname("大学英语");
        book.setPrice(74.5);
        book.setPub("高等教育出版社");
        int lines = bookDao.updateBook(book);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功更新了" + lines + "条记录");
    }

    @Test
    public void deleteStudentBySnoTest(){
        System.out.println("deleteBookByIdTest:");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        BookDao bookDao = sqlSession.getMapper(BookDao.class);

        int lines = bookDao.deleteBookById(5);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功删除了" + lines + "条记录");
    }
}