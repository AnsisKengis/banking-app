//package hello;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//import javax.validation.Valid;
//
//@Controller
//public class UserController extends WebMvcConfigurerAdapter{
//
//    @GetMapping("/login")
//    public String userForm(Model model) {
//        model.addAttribute("user", new User());
//        return "login";
//    }
//
//    @PostMapping("/user")
//    public String UserSubmit(@ModelAttribute User user) {
//        return "user";
//    }
//
//    @GetMapping("/deposit")
//    public String depositMoney(Model model) {
//        model.addAttribute("user", new User());
//        return "deposit";
//
//    }
//    @PostMapping("/deposit")
//    public String depositMoneyResult(@ModelAttribute User user) {
//        return "deposit";
//    }
//
//
//}
