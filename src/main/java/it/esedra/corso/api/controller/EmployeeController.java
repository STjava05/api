package it.esedra.corso.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import it.esedra.corso.api.entity.Employee;
import it.esedra.corso.api.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
    * Read - Get all employees
    * @return - An Iterable object of Employee full filled
    */
   
    @GetMapping("/employees")
    public String home(Model model) {
        Iterable<Employee> listEmployee = employeeService.getEmployees();
        model.addAttribute("employees", listEmployee);
        
        return "/home";
    }
    
    /**
    @GetMapping("/employees")
    public @ResponseBody Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
    
    @GetMapping("/deleteEmployee/{id}")
    public ModelAndView deleteEmployee(@PathVariable("id") final int id) {
        employeeService.deleteEmployee(id);
        return new ModelAndView("redirect:/");
    }
    
    
    @PostMapping("/saveEmployee")
    public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
        employeeService.saveEmployee(employee);
        return new ModelAndView("redirect:/");
    }
*/
}