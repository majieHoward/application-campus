package com.howard.www.common.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.resource.GzipResourceResolver;
import org.springframework.web.servlet.resource.VersionResourceResolver;

import com.howard.www.core.base.web.mvc.argument.IDataTransferObjectMethodArgumentResolver;

@Configuration
public class SystemWebConfig extends WebMvcConfigurationSupport {

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/").resourceChain(false)
				.addResolver(new GzipResourceResolver())
				.addResolver(new VersionResourceResolver().addContentVersionStrategy("/**"));
		super.addResourceHandlers(registry);
	}

	protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {

		argumentResolvers.add(iDataTransferObjectMethodArgumentResolver());
	}

	private IDataTransferObjectMethodArgumentResolver iDataTransferObjectMethodArgumentResolver() {
		IDataTransferObjectMethodArgumentResolver dataTransferObjectMethodArgumentResolver = new IDataTransferObjectMethodArgumentResolver();
		return dataTransferObjectMethodArgumentResolver;
	}

}
