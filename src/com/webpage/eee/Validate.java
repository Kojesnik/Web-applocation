package com.webpage.eee;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

//Validating class
public class Validate {

    public static Map<String , Integer> errorMessageFN = new HashMap<String,Integer>();
    public static Integer errorWithFN = 0;

    public static Map<String , Integer> errorMessageNN = new HashMap<String,Integer>();
    public static Integer errorWithNN = 0;

    public static Map<String , Integer> errorMessageA = new HashMap<String,Integer>();
    public static Integer errorWithA = 0;

    public static Map<String , Integer> errorMessageE = new HashMap<String,Integer>();
    public static Integer errorWithE = 0;


    //Method to validate fullname
    public static void validateFullName(String fullname){
        if(errorMessageFN==null)
            errorMessageFN = new HashMap<String, Integer>();
        if(fullname.equals("")) {
            errorMessageFN.put("Write your Full Name", 0);
            return;
        }
        if((fullname.length()<5)||(fullname.length()>20)){
            if(fullname.contains(" ")) {
                errorMessageFN.put("Full Name must be >4 and <21 characters", 0);
            }
            else{
                errorMessageFN.put("Full name must be >4 and <21 characters and contain space", 0);
            }
        }else{
            if(!fullname.contains(" ")){
                errorMessageFN.put("Full Name must contain space", 0);
            }else{
                errorMessageFN.put("",1);
            }
        }
    }

    //Method to validate nikname
    public static void validateNikName(String nikname){
        if(errorMessageNN==null)
            errorMessageNN = new HashMap<String, Integer>();
        if(nikname.equals("")){
            errorMessageNN.put("Write your NikName", 0);
            return;
        }
        if((nikname.length()<4) || (nikname.length()>15)){
            errorMessageNN.put("Nik Name must be >3 and <16 characters", 0);
        }else{
            User.currentUser = nikname;
            User takenUser = DataBase.getUserFromDB();
            if(takenUser!=null) {
                errorMessageNN.put("This nikname already exists", 0);
            }else {
                errorMessageNN.put("", 1);
            }
        }

    }

    //Method to validate age
    public static void validateAge(String age){
        if(errorMessageA==null)
            errorMessageA = new HashMap<String, Integer>();
        if(age.equals("")){
            errorMessageA.put("Write your age", 0);
            return;
        }
        if(StringUtils.isNumeric(age)){
            int a = Integer.parseInt(age);
            if(a<0 || a>100)
                errorMessageA.put("Age must be between 0 and 100", 0);
            else
                errorMessageA.put("",1);
        }else{
            errorMessageA.put("Age must be a number", 0);
        }
    }

    //Method to validate email
    public static void validateEmail(String email){
        if(errorMessageE==null)
            errorMessageE = new HashMap<String, Integer>();
        if(email.equals("")){
            errorMessageE.put("Write your email", 0);
            return;
        }
        if(email.contains("@gmail.com")){
            errorMessageE.put("",1);
        }else{
            errorMessageE.put("Invalid email",0);
        }
    }

}
