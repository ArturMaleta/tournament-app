package mal.art.demotournamentapp.Config;

import mal.art.demotournamentapp.Utils.ViewNames;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("home").setViewName(ViewNames.HOME);
        registry.addViewController("add-players").setViewName(ViewNames.ADD_PLAYERS);
        registry.addViewController("players").setViewName(ViewNames.PLAYERS);
        registry.addViewController("table").setViewName(ViewNames.TABLE);
        registry.addViewController("summary-players").setViewName(ViewNames.SUMMARY_PLAYERS);
    }
}


/*
OLD WEB CONFIGURATION
package mal.art.demotournamentapp.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "mal.art")
public class WebAppConfig {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");

        return resolver;
    }

}
*/