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
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/success")
    public String authAdmin(@ModelAttribute("username") String username,@ModelAttribute("password") String password, Model model){
        System.out.println(username);
        String abc = "admin";
        
        if(username.equals(abc)){
            Admin admin = new Admin();
            admin.setUsername(username);
            admin.setPassword(password);
            System.out.println(admin.getUsername());
            model.addAttribute(admin);
            return "success";
        }
        return "error";
    }
}