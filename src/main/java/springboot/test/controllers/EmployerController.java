package springboot.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import springboot.test.entity.Employer;
import springboot.test.services.EmployerService;

import java.util.List;

@RestController
public class EmployerController {
    @Autowired
    EmployerService employerService;
//
//    @GetMapping("/")
//    public String getForm(){
//        ModelAndView mav = new ModelAndView("test");
////        mav.addObject("empl", new Employer());
//        return "test";
//    }
    @GetMapping("/getEmployer")
    public String getEmployer(@RequestParam("id")Integer id){

        return employerService.getById(id).toString();
    }

    @GetMapping("/getEmployer/{id}")
    public String getEmployerId(@PathVariable("id")Integer id){

        return employerService.getById(id).toString();
    }

    @GetMapping("/getAll")
    public String getAllEmployer(){
        List<Employer> employerList = employerService.getAll();
        return employerList.toString();
    }

    @GetMapping("/saveEmployer")
    public String saveEmployer(@RequestParam("name")String name,@RequestParam("age")Integer age){
        Employer employer = employerService.saveEmployer(name, age);
        return employer.toString();
    }
}
