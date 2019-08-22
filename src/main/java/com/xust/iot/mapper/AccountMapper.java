package com.xust.iot.mapper;

import com.xust.iot.bean.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: HuangXin
 * @Date: Created in 12:08 2019/8/21
 * @Description:
 */
@Repository
public interface AccountMapper {

    /**
     * 添加一个账户
     * @param account
     */
    public void addAccount(Account account) ;

   /* *//**
     * 查询所有账户
     * @return
     *//*
    public List<Account> getAllAccount();
*/

    /**
     * 根据用户名得到用户账户信息
     * @param username
     * @return
     */
    public Account getAccountByUserName(@Param("username") String username);


    /**
     * 更新账户信息
     */
    public void updateAccount(@Param("username") String username,@Param("pay") Integer pay);


 /*   *//**
     * 删除账户信息
     * @param username
     *//*
    public void deleteAccount(@Param("username") String username);
*/
}
