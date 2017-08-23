/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.safiro.jmucore.ws.Login;

/**
 *
 * @author carlos
 */
public class SessionFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse res=(HttpServletResponse) response;
        String currentPath=req.getRequestURL().toString();
        Login login=(Login)((HttpServletRequest)request).getSession().getAttribute("x1A3d45");
        if(login != null){
            if(currentPath.contains("login")){
                res.sendRedirect(req.getContextPath()+"/account/account.xhtml");
            }else{
                chain.doFilter(request, response);
            }
        }else{
             if(currentPath.contains("account")){
                 res.sendRedirect(req.getContextPath()+"/login.xhtml");
             }else{
             chain.doFilter(request, response);
             }
        }
    }

    @Override
    public void destroy() {
        
    }
    
}
