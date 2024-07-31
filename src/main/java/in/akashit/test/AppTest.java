package in.akashit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.akashit.config.AppConfig;
import in.akashit.service.ReportService;

public class AppTest {

    public static void main(String[] args) {

        ApplicationContext cnxt = new AnnotationConfigApplicationContext(AppConfig.class);

        ReportService service = cnxt.getBean(ReportService.class);
        service.generateData();

    }
}
