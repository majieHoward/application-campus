package com.howard.www.core.base.web.mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.MethodParameter;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @ClassName:  FrameworkHandlerInterceptor   
 * @Description:TODO拦截所有的请求将请求的传参封装到IDataTransferObject对象中  
 * @author: mayijie
 * @date:   2017年2月9日 上午11:02:20   
 *     
 * @Copyright: 2017 https://github.com/majieHoward Inc. All rights reserved.
 */
public class FrameworkHandlerInterceptor implements HandlerInterceptor {

	/**
	 * 
	 * <p>Title: preHandle</p>   
	 * <p>Description: handler is access Action Controller Class Object</p>   
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception   
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
        /**
         * 该方法将在请求处理之前进行调用
         * 可以在这个方法中进行一些判断来决定请求是否要继续进行下去
         * 该方法的返回值是布尔值Boolean 类型的,当它返回为false 时,
         * 表示请求结束,后续的Interceptor 和Controller 都不会再执行;
         * 当返回值为true 时就会继续调用下一个Interceptor 的preHandle 方法,
         * 如果已经是最后一个Interceptor 的时候就会是调用当前请求的Controller 方法
         */
		if(HandlerMethod.class==handler.getClass()){
			MethodParameter[] parameters = ((HandlerMethod) handler).getMethodParameters();
			
            for (MethodParameter parameter : parameters){
            	
              
            }
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {


	}

}
