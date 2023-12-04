package lk.bitproject.employeeStatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeStatusController {

     @Autowired
    private EmployeeStatusRepository employeeStatusDao;
    

    @GetMapping(value = "employeeStatus/findall",produces = "application/json")
    public List <EmployeeStatus> findAll(){

        return employeeStatusDao.findAll();
    }
    
    
}
