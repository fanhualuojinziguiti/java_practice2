package com.zyht.servlet;

import com.zyht.service.GoodsSellerRelationService;
import com.zyht.service.GoodsSellerRelationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Administrator on 2018/2/27.
 */
public class PriceUpdateServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        doPost(request,response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        GoodsSellerRelationService goodsSellerRelationService=new GoodsSellerRelationServiceImpl();
        String str = ""+request.getAttribute("sellerid");
        Long id = Long.parseLong(str);
        try {
            goodsSellerRelationService.queryGoodsSellerRelationById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("jsp/seller.jsp").forward(request, response);
    }
}
