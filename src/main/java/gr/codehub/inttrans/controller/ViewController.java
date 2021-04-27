package gr.codehub.inttrans.controller;


import gr.codehub.inttrans.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
    private PersonService    personService;


    public ViewController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index( ) {

        return "index";
    }

    @RequestMapping(value = "person", method = RequestMethod.GET)
    public String getPerson(Model model) {

        model.addAttribute("persons",personService.getPersons() );

        return "person";
    }

    @RequestMapping(value = "addperson", method = RequestMethod.GET)
    public String addPerson() {



        return "addPerson";
    }

}
