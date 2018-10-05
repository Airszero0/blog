package com.blog.web.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description 认证过滤器
 */
public class AuthFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String authToken = "";

        String requsetHeaderAuth = httpServletRequest.getHeader("Authorization");

        if (requsetHeaderAuth!=null&&requsetHeaderAuth.startsWith("Bear"))
        {
            authToken = requsetHeaderAuth.replace("Bear","").trim();
        }

        if (authToken!=null)
        {

        }
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}
