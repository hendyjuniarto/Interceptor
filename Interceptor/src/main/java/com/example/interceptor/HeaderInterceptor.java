package com.example.interceptor;

import com.sun.xml.internal.ws.addressing.model.InvalidAddressingHeaderException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import com.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class HeaderInterceptor extends HandlerInterceptorAdapter {
  public HeaderInterceptor() {
    super();
  }

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    if(StringUtils.isEmpty(request.getHeader("auth-key"))){
        throw new Exception();
    }
    return super.preHandle(request, response, handler);
  }

  @Override
  public void postHandle(HttpServletRequest request,
      HttpServletResponse response,
      Object handler,
      ModelAndView modelAndView) throws Exception {
    super.postHandle(request, response, handler, modelAndView);
  }

}
