package org.syaku.spring.boot.config;

import com.nhncorp.lucy.security.xss.XssFilter;
import com.nhncorp.lucy.security.xss.XssSaxFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.syaku.spring.xss.support.aop.XssFilterAspect;

/**
 * @author Seok Kyun. Choi. 최석균 (Syaku)
 * @site http://syaku.tistory.com
 * @since 2017. 4. 14.
 */
@Configuration
public class LucyXssFilterConfiguration {

	@Bean
	public XssSaxFilter xssSaxFilter() {
		return XssSaxFilter.getInstance("lucy-xss-sax.xml", false);
	}

	@Bean
	public XssFilter xssFilter() {
		return XssFilter.getInstance("lucy-xss.xml", false);
	}

	@Bean
	public XssFilterAspect xssFilterAspect() {
		return new XssFilterAspect();
	}
}
