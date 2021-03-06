package com.zyht.dao;


import com.zyht.base.Base;
import com.zyht.domain.Account;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author denghongbo
 * @ClassName AccountDaoImpl
 * @Package java.dao
 * @Description 账户表Dao类接口实现
 * @date 2018/1/20
 */
@Repository("accountDao")
public class AccountDaoImpl extends Base<Account> implements AccountDao {
  /**
   * @Title: cancelUser
   * @Description: 删除数据
   * @author DengHongbo
   * @date 2018/2/28 14:11
   * @param account
   * @return java.lang.Integer
   * @throw
   */
    @Override
    public int cancelUser(Account account) {
//        preparedStatement=connection.prepareStatement("DELETE FROM account WHERE ID=?");
//        preparedStatement.setLong(1,account.getId());
//        int rows=preparedStatement.executeUpdate();
//        return rows;
        return this.sqlSessionTemplate.delete(getMybaitsNameSpace()+"deleteOne",account);
    }
    /**
     * @Title: registerUser
     * @Description: 插入数据
     * @author DengHongbo
     * @date 2018/2/28 14:13
     * @param account
     * @return com.zyht.domain.Account
     */
    @Override
    public int registerUser(Account account){
//        preparedStatement = connection.prepareStatement("INSERT INTO account(ID,ACCOUNT,PASSWORD,BUYER_ID,ADD_TIME,UPDATE_TIME) VALUES(DEFAULT ,?,?,?,?,?);");
//        preparedStatement.setString(1,account.getAccount());
//        preparedStatement.setString(2,account.getPassword());
////        preparedStatement.setBoolean(3,account.getIsFrozen());
////        preparedStatement.setBoolean(4,account.getIsCanceled());
////        preparedStatement.setBoolean(5,account.getIsDelete());
//        preparedStatement.setLong(3,account.getBuyerId());
////        preparedStatement.setLong( 4,account.getSellerId());
//        preparedStatement.setDate(4, new java.sql.Date(account.getAddTime().getTime()));
//        preparedStatement.setDate(5, new java.sql.Date(account.getUpdateTime().getTime()));
//        preparedStatement.executeUpdate();
//        return account;
        return this.sqlSessionTemplate.insert(getMybaitsNameSpace()+"insert",account);
    }
    /**
     * @Title: modifyAccount
     * @Description: 修改账户
     * @author DengHongbo
     * @date 2018/1/20 14:09
     * @param account, connection, preparedStatement
     * @return Account
     * @throw SQLException
     */
    @Override
    public int modifyUser(Account account) {
//        preparedStatement = connection.prepareStatement("UPDATE account SET ID=?,ACCOUNT=?,PASSWORD=?,IS_FROZEN=?,IS_CANCELED=?,IS_DELETE=?,BUYER_ID=?,SELLER_ID=?,ADD_TIME=?,UPDATE_TIME=? WHERE ID=?");
//        preparedStatement.setLong(1,account.getId());
//        preparedStatement.setString(2,account.getAccount());
//        preparedStatement.setString(3,account.getPassword());
//        preparedStatement.setBoolean(4,account.getIsFrozen());
//        preparedStatement.setBoolean(5,account.getIsCanceled());
//        preparedStatement.setBoolean(6,account.getIsDelete());
//        preparedStatement.setLong(7,account.getBuyerId());
//        preparedStatement.setLong(8,account.getSellerId());
//        preparedStatement.setDate(9, new java.sql.Date(account.getAddTime().getTime()));
//        preparedStatement.setDate(10, new java.sql.Date(account.getUpdateTime().getTime()));
//        preparedStatement.setLong(11,account.getId());
//        preparedStatement.executeUpdate();
//        return account;
        return this.sqlSessionTemplate.update(getMybaitsNameSpace()+"update",account);
    }
    /**
     * @Title: logInUser
     * @Description: 登录账户
     * @author DengHongbo
     * @date 2018/2/28 15:35
     * @param stringObjectMap
     * @return com.zyht.domain.Account
     * @throw
     */
    @Override
    public Account logInUser(Map<String,Object> stringObjectMap){
//        ResultSet resultSet = null;
//        Account account1 = null;
//        System.out.println(account.getAccount());
//        System.out.println(account.getPassword());
//        String selectStr = "SELECT ID,ACCOUNT,PASSWORD,IS_FROZEN,IS_CANCELED,IS_DELETE,BUYER_ID,SELLER_ID,ADD_TIME,UPDATE_TIME FROM account WHERE ACCOUNT='"+account.getAccount()+"' AND `PASSWORD`="+account.getPassword();
//        preparedStatement = connection.prepareStatement(selectStr);
//        resultSet = preparedStatement.executeQuery();
//        if(resultSet != null){
//            while(resultSet.next()){
//                account1=new Account();
//                account1.setId(resultSet.getLong(1));
//                account1.setAccount(resultSet.getString(2));
//                account1.setPassword(resultSet.getString(3));
//                account1.setIsFrozen(resultSet.getBoolean(4));
//                account1.setIsCanceled(resultSet.getBoolean(5));
//                account1.setIsDelete(resultSet.getBoolean(6));
//                account1.setBuyerId(resultSet.getLong(7));
//                account1.setSellerId(resultSet.getLong(8));
//                account1.setAddTime(resultSet.getDate(9));
//                account1.setUpdateTime(resultSet.getDate(10));
//            }
//        }
//        return account1;
        return this.sqlSessionTemplate.selectOne(getMybaitsNameSpace()+"selectOne",stringObjectMap);
    }
    @Override
    public List<Account> queryAll() {
        return this.sqlSessionTemplate.selectList(getMybaitsNameSpace()+"selectAll");
    }

    @Override
    public Account queryOne(Long id) {
        return this.sqlSessionTemplate.selectOne(getMybaitsNameSpace()+"selectId",id);
    }
}