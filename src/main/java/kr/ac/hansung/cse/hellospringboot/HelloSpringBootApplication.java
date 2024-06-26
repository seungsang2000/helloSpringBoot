package kr.ac.hansung.cse.hellospringboot;

import kr.ac.hansung.cse.hellospringboot.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"kr.ac.hansung.cse","kr.ac.hansung.eecs"})
public class HelloSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HelloSpringBootApplication.class, args);
        MyService myService=context.getBean(MyService.class);
        System.out.println(myService.getMessage());
    }

}
