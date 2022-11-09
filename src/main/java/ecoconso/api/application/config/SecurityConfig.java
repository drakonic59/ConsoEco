package ecoconso.api.application.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			/*.httpBasic().disable()	//No Http Basic Login*/
			.csrf().disable()	//No CSRF token			
			.formLogin().disable()	//No Form Login
			.logout().disable()	//No Logout
			// No Session pls
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
	
}
