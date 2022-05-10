package org.test.hospitaldataprovider.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.test.hospitaldataprovider.entity.vo.DoctorsVo;
import org.test.hospitaldataprovider.service.DoctorsService;
import org.test.hospitaldataprovider.entity.Doctors;
import org.test.hospitalutils.utils.R;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author my
 * @since 2022-04-30
 */
@RestController
@RequestMapping("/doctors")
public class DoctorsController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
    
    @Autowired
    DoctorsService doctorsService;
    
    @RequestMapping("/list")
    public R getDoctorsList(){
        List<DoctorsVo> doctorsList = doctorsService.getDoctorsList();
        return R.ok().data("doctorsList",doctorsList);
    }
    
}

