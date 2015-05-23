package com.cepi;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.HashMap;

/**
 * Created by ndivadkar on 5/23/15.
 */
public class IndexController {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ModelAndView index(Model model){

        return new ModelAndView("index");
    }
}
