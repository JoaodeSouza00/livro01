package application.controllers;

import org.springframework.stereo.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class Codigo Homercontrollers {
    @ResquestMapping(method=RequestMethod.GET)
    public String indext(){
        return "home/index.jsp"
    }
}
