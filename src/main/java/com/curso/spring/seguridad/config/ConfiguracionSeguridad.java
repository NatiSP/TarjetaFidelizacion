package com.curso.spring.seguridad.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(jsr250Enabled = true, prePostEnabled = true, securedEnabled = true)
@EnableWebSecurity
public class ConfiguracionSeguridad extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/index").permitAll()
				// .antMatchers("/**").hasAnyRole("ADMIN")
				.anyRequest().authenticated().and()
				// .httpBasic()
				.formLogin().loginPage("/login").permitAll().and().logout().permitAll();

		http.logout().logoutUrl("/logout").invalidateHttpSession(true).logoutSuccessUrl("/login.jsp")
				.deleteCookies("JSESSIONID");
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth, DataSource dataSource) throws Exception {
		/*
		 * auth .inMemoryAuthentication()
		 * .withUser("user").password("password").roles("USER").and()
		 * .withUser("pepito").password("password").roles("ADMIN");
		 */

		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery("SELECT login, password, true FROM USUARIO WHERE login=?")
				.authoritiesByUsernameQuery("SELECT login, 'USER' FROM USUARIO WHERE login=?");
	}
}