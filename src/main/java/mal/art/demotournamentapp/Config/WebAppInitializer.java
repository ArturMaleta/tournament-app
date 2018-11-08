package mal.art.demotournamentapp.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {WebConfig.class, HibernateConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

//    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";

   /* @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebAppConfig.class);
        context.refresh();

        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", dispatcherServlet);

        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }*/
}