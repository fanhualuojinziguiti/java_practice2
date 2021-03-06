package com.zyht.action;/********************************************************************/
/**
 * @Project: jspweb
 * @Package com.zyht.action
 * @author caoxin
 * @date 2018/3/4 17:01
 * @Copyright: 2018 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import com.opensymphony.xwork2.ActionSupport;
import com.zyht.base.BaseAction;
import com.zyht.common.util.SpringContextUtil;
import com.zyht.domain.Buyer;
import com.zyht.service.BuyerService;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * @author caoxin
 * @ClassName AddrChangeAction
 * @Description 修改地址Action
 * @date 2018/3/4
 */
@Action
//@Results({
//        @Result(name ="home" ,location = "/jsp/homepage.jsp")
//})
public class AddrChangeAction extends ActionSupport implements BaseAction {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private String message;

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String addrChange(){
//        获取buyerService对象
        BuyerService buyerService=(BuyerService) SpringContextUtil.getBean("buyerService");
//        获取request和response对象
        request= ServletActionContext.getRequest();
        response=ServletActionContext.getResponse();
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html;charset=utf-8");
        Long buyerId=Long.parseLong(request.getParameter("buyerid"));
        Buyer buyer=buyerService.queryBuyerById(buyerId);
        String formerAddr=buyer.getPermanentAddr();
        String addr=request.getParameter("myaddr");
        if(addr!=null&&addr!=""){
            if(formerAddr.equals(addr)){
                message="地址并未修改";
            }else{
                message="地址修改成功";
                buyer.setPermanentAddr(addr);
                buyerService.updateBuyer(buyer);
            }
        }else {
            message="地址为空！";
        }
        return HOME;
    }
}
