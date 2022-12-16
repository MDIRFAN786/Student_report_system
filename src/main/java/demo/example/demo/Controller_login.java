package demo.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javafx.scene.text.Text;

@Controller
public class Controller_login{
    public String admin;
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/success")
    public String authAdmin(@ModelAttribute("username") String username, Model model){
        System.out.println(username);
        String abc = "admin";
        admin = username;
        
        if(username.equals(abc)){
            return "success";
        }
        return "error";
    }
}