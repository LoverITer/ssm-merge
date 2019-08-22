package com.xust.iot.mapper;

import com.xust.iot.bean.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: HuangXin
 * @Date: Created in 20:10 2019/8/21
 * @Description:
 */
@Repository
public interface BookMapper {

    /**
     * 根据图书的ISBN(主键)获得图书信息
     * @param isbn
     * @return
     */
    public Book getBookByISBN(@Param("isbn") String isbn);


    /**
     * 得到所有的书
     * @return
     */
    public List<Book> getAllBook();


    /**
     * 添加一本书
     * @param book
     * @return
     */
    public void addBook(Book book);

    /**
     * 根据isbn更新书
     * @param book
     */
    public  void updateBookByISBN(Book book);

    /**
     * 根据isbn删除一本书
     * @param isbn
     */
    public void deleteBookByISBN(@Param("isbn") String isbn);

}
