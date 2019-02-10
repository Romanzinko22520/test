package springboot.test.services;

import springboot.test.entity.Employer;

import java.util.List;

public interface EmployerService {
    Employer getById(Integer id);
    List<Employer> getAll();





    Employer saveEmployer(String name, Integer age);





}
