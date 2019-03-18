package com.webpage.eee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


//Controller class
@SuppressWarnings("Duplicates")
@Controller
public class UserController {

    //Main page controller
    @RequestMapping(value = "/main")
    public String mainPage(){
        return "main";
    }

    //Registration class controller
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView registerUserGET(Model model){
        ModelAndView result = new ModelAndView("register");
        result.addObject("userModel", new User());
        if(Validate.errorWithFN == 1) {
            Map<String, Integer> errorMessageFN = Validate.errorMessageFN;
            Map.Entry<String, Integer> entryFN = errorMessageFN.entrySet().iterator().next();
            String keyFN = entryFN.getKey();
            Integer valueFN = entryFN.getValue();

            if (valueFN == 0)
                model.addAttribute("errorFN", keyFN);

            Validate.errorWithFN = 0;
            Validate.errorMessageFN = null;
        }
        if(Validate.errorWithNN == 1){
            Map<String, Integer> errroMessageNN = Validate.errorMessageNN;
            Map.Entry<String, Integer> entryNN = errroMessageNN.entrySet().iterator().next();
            Integer valueNN = entryNN.getValue();
            String keyNN = entryNN.getKey();

            if(valueNN == 0)
                model.addAttribute("errorNN", keyNN);
            Validate.errorWithNN = 0;
            Validate.errorMessageNN = null;
        }
        if(Validate.errorWithA == 1){
            Map<String, Integer> errroMessageA = Validate.errorMessageA;
            Map.Entry<String, Integer> entryA = errroMessageA.entrySet().iterator().next();
            Integer valueA = entryA.getValue();
            String keyA = entryA.getKey();

            if(valueA == 0)
                model.addAttribute("errorA", keyA);
            Validate.errorWithA = 0;
            Validate.errorMessageA = null;
        }
        if(Validate.errorWithE == 1){
            Map<String, Integer> errroMessageE = Validate.errorMessageE;
            Map.Entry<String, Integer> entryE = errroMessageE.entrySet().iterator().next();
            Integer valueE = entryE.getValue();
            String keyE = entryE.getKey();

            if(valueE == 0)
                model.addAttribute("errorE", keyE);
            Validate.errorWithE = 0;
            Validate.errorMessageE = null;
        }
        return result;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUserPOST(User userModel, Model model, BindingResult bindingResult){

        if(bindingResult.hasErrors())
            return "redirect: /register";


        Validate.validateFullName(userModel.getFullName());
        Map.Entry<String, Integer> entryFN = Validate.errorMessageFN.entrySet().iterator().next();
        Integer valueFN = entryFN.getValue();

        Validate.validateNikName(userModel.getNikName());
        Map.Entry<String, Integer> entryNN = Validate.errorMessageNN.entrySet().iterator().next();
        Integer valueNN = entryNN.getValue();

        Validate.validateAge(userModel.getAge());
        Map.Entry<String, Integer> entryA = Validate.errorMessageA.entrySet().iterator().next();
        Integer valueA = entryA.getValue();

        Validate.validateEmail(userModel.getEmail());
        Map.Entry<String, Integer> entryE = Validate.errorMessageE.entrySet().iterator().next();
        Integer valueE = entryE.getValue();

        if(valueNN==0){
            Validate.errorWithNN = 1;
            if(valueFN==0)
                Validate.errorWithFN = 1;
            if(valueA==0)
                Validate.errorWithA = 1;
            if(valueE==0)
                Validate.errorWithE = 1;
            return "redirect: /register";
        }

        if(valueFN==0) {
            Validate.errorWithFN = 1;
            if(valueNN==0)
                Validate.errorWithNN = 1;
            if(valueA==0)
                Validate.errorWithA = 1;
            if(valueE==0)
                Validate.errorWithE = 1;
            return "redirect: /register";
        }

        if(valueA==0) {
            Validate.errorWithA = 1;
            if(valueNN==0)
                Validate.errorWithNN = 1;
            if(valueFN==0)
                Validate.errorWithFN = 1;
            if(valueE==0)
                Validate.errorWithE = 1;
            return "redirect: /register";
        }

        if(valueE==0){
            Validate.errorWithE = 1;
            if(valueFN==0)
                Validate.errorWithFN = 1;
            if(valueNN==0)
                Validate.errorWithNN = 1;
            if(valueA==0)
                Validate.errorWithA = 1;
            return "redirect: /register";
        }



        DataBase.putUserIntoDB(userModel);
        User.currentUser = userModel.getNikName();

        model.addAttribute("fullname", userModel.getFullName());
        model.addAttribute("nikname", userModel.getNikName());
        model.addAttribute("email", userModel.getEmail());
        model.addAttribute("age", userModel.getAge());
        model.addAttribute("password", userModel.getPassword());

        return "account";
    }

    //Updating page controller
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView updateUserGET(Model model){
        ModelAndView result = new ModelAndView("update");
        result.addObject("userModel", new User());
        if(Validate.errorWithFN == 1) {
            Map<String, Integer> errorMessageFN = Validate.errorMessageFN;
            Map.Entry<String, Integer> entryFN = errorMessageFN.entrySet().iterator().next();
            String keyFN = entryFN.getKey();
            Integer valueFN = entryFN.getValue();

            if (valueFN == 0)
                model.addAttribute("errorFN", keyFN);

            Validate.errorWithFN = 0;
            Validate.errorMessageFN = null;
        }
        if(Validate.errorWithNN == 1){
            Map<String, Integer> errroMessageNN = Validate.errorMessageNN;
            Map.Entry<String, Integer> entryNN = errroMessageNN.entrySet().iterator().next();
            Integer valueNN = entryNN.getValue();
            String keyNN = entryNN.getKey();

            if(valueNN == 0)
                model.addAttribute("errorNN", keyNN);
            Validate.errorWithNN = 0;
            Validate.errorMessageNN = null;
        }
        if(Validate.errorWithA == 1){
            Map<String, Integer> errroMessageA = Validate.errorMessageA;
            Map.Entry<String, Integer> entryA = errroMessageA.entrySet().iterator().next();
            Integer valueA = entryA.getValue();
            String keyA = entryA.getKey();

            if(valueA == 0)
                model.addAttribute("errorA", keyA);
            Validate.errorWithA = 0;
            Validate.errorMessageA = null;
        }
        if(Validate.errorWithE == 1){
            Map<String, Integer> errroMessageE = Validate.errorMessageE;
            Map.Entry<String, Integer> entryE = errroMessageE.entrySet().iterator().next();
            Integer valueE = entryE.getValue();
            String keyE = entryE.getKey();

            if(valueE == 0)
                model.addAttribute("errorE", keyE);
            Validate.errorWithE = 0;
            Validate.errorMessageE = null;
        }
        return result;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUserPOST(User userModel,Model model){

        if(!userModel.getFullName().equals(""))
            DataBase.updateFullName(userModel.getFullName());

        if(!userModel.getNikName().equals(""))
            DataBase.updateNikName(userModel.getNikName());

        if(!userModel.getEmail().equals(""))
            DataBase.updateEmail(userModel.getEmail());

        if(!userModel.getAge().equals(""))
            DataBase.updateAge(userModel.getAge());

        if(!userModel.getPassword().equals(""))
            DataBase.updatePassword(userModel.getPassword());

        User takenUser = DataBase.getUserFromDB();

        model.addAttribute("fullname", takenUser.getFullName());
        model.addAttribute("nikname", takenUser.getNikName());
        model.addAttribute("email", takenUser.getEmail());
        model.addAttribute("age", takenUser.getAge());
        model.addAttribute("password", takenUser.getPassword());

        return "account";
    }

    //Delte page controller
    @RequestMapping(value = "/delete")
    public String deleteUser(){
        DataBase.deleteFromDB();
        return "delete";
    }


    //Enter page controller
    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    public ModelAndView enterUserGET(){
        ModelAndView result = new ModelAndView("enter");
        result.addObject("userModel", new User());
        return result;
    }

    @RequestMapping(value = "/enter", method = RequestMethod.POST)
    public String enterUserPOST(User userModel, Model model){
        User.currentUser = userModel.getNikName();
        User takenUser = DataBase.getUserFromDB();
        if(User.currentUser.equals("NO")) {
            return "redirect: /enter";
        }
        else{
            if(userModel.getPassword().equals(takenUser.getPassword())) {
                model.addAttribute("fullname", takenUser.getFullName());
                model.addAttribute("nikname", takenUser.getNikName());
                model.addAttribute("email", takenUser.getEmail());
                model.addAttribute("age", takenUser.getAge());
                model.addAttribute("password", takenUser.getPassword());
                return "account";
            }else{
                return "redirect: /enter";
            }
        }
    }

}
