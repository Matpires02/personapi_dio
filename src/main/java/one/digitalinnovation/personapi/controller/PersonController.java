package one.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")//acesso principal a aplicação
public class PersonController {
    @GetMapping //requisição tipo get
    public String getBook(){
        return "API TEST!";
    }
}
