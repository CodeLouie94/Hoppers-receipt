package com.louie.hoppersreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hoppersReceiptController {
	@RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Jumper";
        String itemName = "Gold wire";
        double price = 6.00;
        String description = "Gold strips, also an illustration of nanoseconds.";
        String vendor = "Big Things Corner Store";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
    
        return "index.jsp";
    }
}
