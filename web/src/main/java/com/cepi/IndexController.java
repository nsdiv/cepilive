package com.cepi;

import com.cepi.repo.IndividualTEntity;
import com.cepi.repository.IndividualTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ndivadkar on 5/23/15.
 */
@Controller
public class IndexController {
    @Autowired
    private IndividualTRepository individualTRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ModelAndView index(Model model){

        return new ModelAndView("index");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public ModelAndView login(Model model, @RequestParam("username") String username,
                              @RequestParam("password") String password){
        List<IndividualTEntity> individuals =  individualTRepository.findByEmailAddress(username);
        if (individuals == null){
            return new ModelAndView("index"); // user not found
        }
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] hashedBytes = md.digest(password.getBytes("UTF-8"));
            String hashPassword = convertByteArrayToHexString(hashedBytes);
            if (!hashPassword.equals(individuals.get(0).getPassword())){
                return new ModelAndView("index"); //authentication failed
            }
        }catch (Exception ex){
            throw new RuntimeException();
        }

        return new ModelAndView("home");
    }

    private static String convertByteArrayToHexString(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16)
                    .substring(1));
        }
        return stringBuffer.toString();
    }
}
