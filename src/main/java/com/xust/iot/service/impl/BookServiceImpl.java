package com.xust.iot.service.impl;

import com.xust.iot.bean.Book;
import com.xust.iot.mapper.BookMapper;
import com.xust.iot.service.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: HuangXin
 * @Date: Created in 11:29 2019/8/22
 * @Description:
 */
@Service
public class BookServiceImpl implements ServiceBase<Book> {

    @Autowired
    private BookMapper bookMapper;


    @Override
    public Book getById(Object param) {
        Book book=bookMapper.getBookByISBN(param.toString());
        return book;
    }

    @Override
    public void deleteById(Object param) {
       bookMapper.deleteBookByISBN((String)param);
    }

    @Override
    public void updateAndSave(Book book) {
        bookMapper.updateBookByISBN(book);
    }

    @Override
    public void addAndSave(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public List<Book> getAll() {
        List<Book> lists=bookMapper.getAllBook();
        return lists;
    }
}
