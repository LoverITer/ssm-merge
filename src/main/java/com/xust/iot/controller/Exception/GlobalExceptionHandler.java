package com.xust.iot.controller.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * @Author: HuangXin
 * @Date: Created in 12:39 2019/8/21
 * @Description:
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SQLException.class)
    public String handleSQLException(HttpServletRequest request, Exception e) {
        request.setAttribute("msg", e);
        return "error";
    }

}
