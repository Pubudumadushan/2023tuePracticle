package lk.bitproject.designation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DesignationController {


    @Autowired
    private DesignationRepository designationDao;
    

    @GetMapping(value = "designation/findall",produces = "application/json")
    public List <Designation> findAll(){

        return designationDao.findAll();
    }
    

    
}
