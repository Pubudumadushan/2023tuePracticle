package lk.bitproject.emoloyee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController //implemented sevice mapping available for use
@RequestMapping(value = "/employee")//class level mapping
public class EmployeeController {



    @Autowired // inject employee repository object into variable
    private EmployeeRepository employeeDao;

    

    @GetMapping
	public ModelAndView employee(){

		ModelAndView testView = new ModelAndView();
		testView.setViewName("employee.html");

		return testView;
	}




    //create get mapping for find all            //data return type(Json/text/xml)
    //@GetMapping(value = "/employee/findall",produces = "application/json")
    @GetMapping(value = "/findall",produces = "application/json")
    public List <Employee> findAll(){

        return employeeDao.findAll();
    }

    //define mapping for get employee object by given id [/employee/getbyid/1]
    //@GetMapping(value="/employee/getbyid{id}")
    //@GetMapping(value="/getbyid{id}")

    //define mapping for employee post employee service [/employee] save
    //@PostMapping(value="/employee/")
    //@PostMapping



    // define mapping for employee post service[/employee]save
   // @PostMapping //RequestBody -->get requst body value set post ajax call
    // public String saveEmployee(@RequestBody Employee employee){

    //     //
    //     try{

    //         //set auto generated value
    //         employee.setAdded_datetime(LocalDateTime.now());
    //         employee.setEmpnumber("000002");

    //         employeeDao.save(employee);
    //         return "OK";

    //     }catch(Exception e){

    //         return "Save Not Completed:"+e.getMessage();

    //     }

    // }
}
