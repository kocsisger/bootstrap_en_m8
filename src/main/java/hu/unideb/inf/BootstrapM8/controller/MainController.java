package hu.unideb.inf.BootstrapM8.controller;

import hu.unideb.inf.BootstrapM8.model.Person;
import hu.unideb.inf.BootstrapM8.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("")
    public String showHomepage(){
        return "index";
    }

    @GetMapping("/persons")
    public String getAllPersons(Model model){
        List<Person> personsList = personRepository.findAll();
        model.addAttribute("personsList", personsList);
        return "persons";
    }
}