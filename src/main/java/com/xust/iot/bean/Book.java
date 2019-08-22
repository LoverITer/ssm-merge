package com.xust.iot.bean;

import java.io.Serializable;

/**
 * @Author: HuangXin
 * @Date: Created in 19:54 2019/8/21
 * @Description:
 */
public class Book implements Serializable {
    private static final long serialVersionUID = -4831204776657528176L;
    private String isbn;
    private String bookName;
    private Integer price;



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}
