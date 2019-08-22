package com.xust.iot.mapper;

import com.xust.iot.bean.BookStock;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author: HuangXin
 * @Date: Created in 20:12 2019/8/21
 * @Description:
 */
@Repository
public interface BookStockMapper {


    /**
     * 根据图书的isbn获得图书的库存信息
     * @param isbn
     * @return
     */
    public BookStock getBookStockByISBN(String isbn);


    /**
     * 更新图书的库存信息
     */
    public void updateBookStock(@Param("books") Integer books,@Param("isbn") String isbn);

}
