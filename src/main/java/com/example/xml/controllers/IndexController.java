package com.example.xml.controllers;

import com.example.xml.services.KwadraatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
    private final KwadraatService kwadraatService;

    public IndexController(KwadraatService kwadraatService) {
        this.kwadraatService = kwadraatService;
    }

    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("index", "kwadraat", kwadraatService.kwadraatVan(4));
    }
}