package az.ahc.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
/**
 * Created by Nahid
 */

@Configuration
@EnableWebMvc
@Import(JpaConfig.class)
@ComponentScan(basePackages = "az.ahc")
/**
 *  WebMvcConfigurerAdapter Provides a stub implementation of all interface methods.
 *  Defines callback methods to customize the Java-based configuration
 *  @EnableWebMvc gives a chance to customize the default configuration
 * */
public class AppConfig  extends WebMvcConfigurerAdapter{

    /**
     * Configure view resolvers to translate String-based view names returned from controllers
     * into concrete View implementations to perform rendering with.
     * */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        registry.viewResolver(viewResolver);
    }
    /**
     * It is used for utilizing static resources in jsp files.such as css js files.
     * */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}
