package springboot.test.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.test.entity.Employer;
import springboot.test.repository.EmployerRepository;
import springboot.test.services.EmployerService;

import java.util.List;
@Service
public class EmployerServiceImpl implements EmployerService {
    @Autowired
    EmployerRepository employerRepository;

    @Override
    public Employer getById(Integer id) {

        return employerRepository.getOne(id);
    }

    @Override
    public List<Employer> getAll() {

        return employerRepository.findAll();
    }

    @Override
    public Employer saveEmployer(String name, Integer age) {
        Employer employer= new Employer();
        employer.setName(name);
        employer.setAge(age);
        return employerRepository.save(employer);
    }

}
