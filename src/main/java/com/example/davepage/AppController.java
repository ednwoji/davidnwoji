package com.example.davepage;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;




@Controller
public class AppController {




    @GetMapping("")
    public String viewHomePage() {

        return "home";
    }


//    @GetMapping("/login")
//    public String loginPage() {
//
//        return "login";
//    }

    @GetMapping("/home")
    public String GoHome() {

        return "home";
    }

    @GetMapping("/about")
    public String AboutPage() {

        return "about";
    }

    @GetMapping("/awards")
    public String AwardPage() {

        return "awards";
    }

    @GetMapping("/project")
    public String ProjectPage() {

        return "project";
    }

    @PostMapping("/login")
    public String HomePage() {

        return "home";
    }



//    @GetMapping("/signin")
//    public String registerNewUser(Model model) {
//
//        model.addAttribute("user", new User());
//
//        return "signin";
//
//    }

//    @PostMapping("/signform")
//    public String Signform (User user) {
//
//        BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
//        String encodedPassword = encoder.encode(user.getPassword());
//        user.setPassword(encodedPassword);
//
//        repo.save(user);
//        return "login";
//
//    }


}
