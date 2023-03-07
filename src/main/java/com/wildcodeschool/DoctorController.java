package com.wildcodeschool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    @GetMapping("/doctor/1")
    @ResponseBody
    public String doctor1(){
    
        return "<a href='https://www.gettyimages.fr/detail/photo-d%27actualité/actor-william-hartnell-the-first-doctor-pictured-photo-dactualité/952030170'>William Hartnell</a>";
    }
    @GetMapping("/doctor/10")
    @ResponseBody
    public String doctor10(){
    
        return "<a href='https://www.google.com/url?sa=i&url=https%3A%2F%2Ffr.wikipedia.org%2Fwiki%2FDavid_Tennant&psig=AOvVaw35vJ7yYF-DGXK_UH0tBgzp&ust=1678278327018000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCPi1oo7oyf0CFQAAAAAdAAAAABAE'>David Tenant</a>";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String doctor13(){
    
        return "<a href='https://api.time.com/wp-content/uploads/2017/07/jodie-whittaker.jpg?quality=85&w=800'>Jodie Whittaker</a>";
    }


    
}
