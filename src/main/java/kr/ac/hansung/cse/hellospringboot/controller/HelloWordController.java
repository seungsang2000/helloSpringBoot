package kr.ac.hansung.cse.hellospringboot.controller;

import kr.ac.hansung.cse.hellospringboot.configuration.MyConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWordController {

//    @Value("${app.professor}")
//    private String professor;
//
//    @Value("${app.course}")
//    private String course;
//
//    @Value("${app.student}")
//    private String student;

    @Autowired
    private MyConfiguration myConfiguration;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String sayHello(Model model) {
//        logger.debug("professor name: {}", professor);
//        logger.debug("course name: {}", course);
//        logger.debug("student name: {}", student);

        logger.debug("professor name: {}",myConfiguration.getProfessor());
        logger.debug("course name: {}",myConfiguration.getCourse());
        logger.debug("student name: {}",myConfiguration.getStudent());

        model.addAttribute("msg", "Hello World! from Controller");
        model.addAttribute("appconfig", myConfiguration);
        return "index";
    }
}
