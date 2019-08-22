package com.xust.iot.controller;

import com.xust.iot.bean.Book;
import com.xust.iot.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: HuangXin
 * @Date: Created in 11:57 2019/8/22
 * @Description:
 */
@Controller
public class BookController {

    @Autowired
    private BookServiceImpl bookService;
    private static boolean isNew = false;


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("book") Book book, Model model) {
        System.out.println(book);
        if (isNew) {
            bookService.addAndSave(book);
            model.addAttribute("msg", "添加成功！");
        } else {
            bookService.updateAndSave(book);
            model.addAttribute("msg", "更新成功！");
        }
        return "forward:showAll";
    }

    @RequestMapping("/toUpdatePage")
    public String toUpdatePage(@ModelAttribute("book") Book book, Model model) {
        model.addAttribute("book",book);
        return "edit";
    }


    @RequestMapping("/delete")
    public String delete(@RequestParam("isbn") String isbn, Model model) {
        bookService.deleteById(isbn);
        model.addAttribute("msg", "删除成功！");
        return "forward:showAll";
    }


    @RequestMapping("/showAll")
    public String showAllBook(Model model) {
        List<Book> lists = bookService.getAll();
        model.addAttribute("books", lists);
        return "bookInfo";
    }


    @ModelAttribute
    public void check(@RequestParam(value = "isbn", defaultValue = "") String isbn,
                      @RequestParam(value = "bookName", defaultValue = "") String bookName,
                      @RequestParam(value = "price", defaultValue = "") Integer price,
                      Model model) {
        System.out.println(isbn);
        Book book = bookService.getById(isbn);
        //数据库中没有这本书，那就添加一本书
        if (null == book) {
            Book book1 = new Book();
            book1.setBookName(bookName);
            book1.setIsbn(isbn);
            book1.setPrice(price);
            model.addAttribute("book", book1);
            isNew = true;
        } else {
            //数据库中有这本书,那就直接拿出来更新信息
            isNew = false;
            model.addAttribute("book", book);
        }
    }


}
