package taxibooking.sumit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import taxibooking.sumit.model.Contactform;

@Controller
public class MyController {

    @GetMapping(path = {"/", "/home", "/welcome", "/index"})
    public String welcomeview(HttpServletRequest req, Model model) {
        String requestUri = req.getRequestURI();
        model.addAttribute("mycurrentpage", requestUri);
        return "index";
    }

    @GetMapping(path = {"/about"})
    public String aboutview(HttpServletRequest req, Model model) {
        String requestUri = req.getRequestURI();
        model.addAttribute("mycurrentpage", requestUri);
        return "about";
    }

    @GetMapping(path = {"/cars"})
    public String aboutcar(HttpServletRequest req, Model model) {
        String requestUri = req.getRequestURI();
        model.addAttribute("mycurrentpage", requestUri);
        return "cars";
    }

    @GetMapping(path = {"/contacts"})
    public String aboutcontacts(HttpServletRequest req, Model model) {
        String requestUri = req.getRequestURI();
        model.addAttribute("mycurrentpage", requestUri);
        model.addAttribute("contactForm", new Contactform());
        
        return "contacts";
    }

    @GetMapping(path = {"/services"})
    public String aboutservices(HttpServletRequest req, Model model) {
        String requestUri = req.getRequestURI();
        model.addAttribute("mycurrentpage", requestUri);
        return "services";
    }

    @PostMapping("/contactform")
    public String contactform(@Valid @ModelAttribute Contactform contactform, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("bindingresult", bindingResult);
            return "contacts";
        }

        
       // redirectAttributes.addFlashAttribute("successMessage", "Contact form submitted successfully!");
        return "redirect:/contacts";
    }
}
