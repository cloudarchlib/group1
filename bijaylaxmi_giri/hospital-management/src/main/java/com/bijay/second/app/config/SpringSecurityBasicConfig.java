package com.bijay.second.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityBasicConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.POST, "/post/**").hasAnyRole("ADMIN","Doctor")
                .antMatchers(HttpMethod.PUT, "/put/**").hasAnyRole("ADMIN","Patient")
                .antMatchers(HttpMethod.GET, "/get/**").hasAnyRole("Patient").and().csrf().disable().headers()
                .frameOptions().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("patient1").password("{noop}password").roles("Patient").and()
                .withUser("admin123").password("{noop}password").roles("ADMIN").and().withUser("patient2")
                .password("{noop}password").roles("Patient").and().withUser("admin124").password("{noop}password").roles("ADMIN").and().withUser("Doctor1").password("{noop}password").roles("Doctor").and().withUser("Doctor2").password("{noop}password").roles("Doctor");
    }
}

