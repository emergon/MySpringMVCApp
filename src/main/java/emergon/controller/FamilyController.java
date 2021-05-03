package emergon.controller;

import emergon.entity.Family;
import emergon.entity.Salesman;
import emergon.service.FamilyService;
import emergon.service.SalesmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/family")
public class FamilyController {
    
    @Autowired
    private FamilyService service;
    @Autowired
    private SalesmanService salesmanService;
//    @RequestMapping
//    public ModelAndView showFamily(ModelAndView modelAndView){
//        List<Family> family = service.getFamily();
//        modelAndView.addObject("listOfFamily", family);
//        modelAndView.setViewName("familyList");
//        return modelAndView;
//    }
    
    /**
     * URLs
     * /family/create : GET  (familyList.jsp - link)
     * /family/create : POST (familyForm.jsp - form)
     */
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(Model model, @ModelAttribute("member") Family member, @RequestParam("salesmanId")int scode){
        Salesman salesman = salesmanService.getSalesmanById(scode);
        model.addAttribute("salesman", salesman);
        return "family/familyForm";
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@ModelAttribute("member")Family family, @RequestParam("salesmanId")int scode, RedirectAttributes attributes){
        Salesman salesman = salesmanService.getSalesmanById(scode);
        family.setSalesman(salesman);
        service.addFamily(family);
        String minima = "Family "+ family.getFname() + " successfully created!!";
        attributes.addFlashAttribute("message", minima);
        StringBuilder builder = new StringBuilder();
        builder.append("redirect:/salesman/")
                .append(salesman.getScode()).append("/")
                .append("family");
        return builder.toString();//Redirect instructs client to sent a new GET request to /family
    }
    ///{id}/family
//    @GetMapping("/delete")
//    public String delete(@RequestParam("id") int id, RedirectAttributes attributes){
//        service.deleteFamily(id);
//        String minima = "Family successfully deleted!!";
//        attributes.addFlashAttribute("message", minima);
//        return "redirect:/family";
//    }
    
//    @GetMapping("/update/{ccode}")
//    public String showFormUpdate(@PathVariable("ccode") int ccode, Model model){
//        Family family = service.getFamilyById(ccode);
//        model.addAttribute("familyToEdit", family);
//        return "familyForm";
//    }
    
//    @PostMapping("/update")
//    public String update(Family family, RedirectAttributes attributes){
//        service.updateFamily(family);
//        String minima = "Family updated successfully!!";
//        attributes.addFlashAttribute("message", minima);
//        return "redirect:/family";
//    }
    
    
    
    
    
    
}
