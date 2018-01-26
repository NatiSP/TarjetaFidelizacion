package com.curso.spring.mvc.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.curso.spring.mvc.entity.mapper.ClienteMapper;
import com.curso.spring.mvc.entity.mapper.OperadorMapper;
import com.curso.spring.mvc.entity.mapper.TarjetaMapper;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.curso.spring.mvc")
public class ConfiguracionWeb implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/img/**").addResourceLocations("/img/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
	}
	
	/**
	 * Debemos conservar el end-point de formulario para que me muestre una vista al hacer una peticion GET
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		WebMvcConfigurer.super.addViewControllers(registry);
		
		registry.addViewController("/formulario").setViewName("formulario");
	}
	
	@Bean
	public View miVista() {
		return new InternalResourceView("/WEB-INF/jsp/index.jsp");
	}
	
	@Bean
	public View otraVista() {
		return new InternalResourceView("/WEB-INF/jsp/index.jsp");
	}
	
	@Bean
	public ViewResolver beanNameViewResolver() {
		BeanNameViewResolver viewResolver = new BeanNameViewResolver();
		viewResolver.setOrder(1);
		return viewResolver;
	}
	
	@Bean
	public ViewResolver internalResourceViewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/jsp/",".jsp");
	}
	
	@Bean
	public ClienteMapper clienteMapper() {
		return new ClienteMapper();
	}
	
	@Bean
	public OperadorMapper operadorMapper() {
		return new OperadorMapper();
	}
	
	@Bean
	public TarjetaMapper tarjetaMapper() {
		return new TarjetaMapper();
	}

}
