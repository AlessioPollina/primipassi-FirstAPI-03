package it.develhope.primipassiFirstAPI03.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping(value = "/string")
    public String string(@RequestParam String string1, @RequestParam(required = false) String string2){
        if(string2 == null){
            return string1;
        }else{
        return string1.concat(string2);
        }
    }
}
