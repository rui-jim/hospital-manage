package org.test.hospitalserver.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.test.hospitalserver.entity.vo.PatientsVo;
import org.test.hospitalserver.service.impl.PatientsServiceImpl;
import org.test.hospitalutils.utils.R;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author my
 * @since 2022-04-16
 */
@RestController
@RequestMapping("/patients")
@Slf4j
public class PatientsController {

    @Autowired
    PatientsServiceImpl patientsService;
    
    @GetMapping("/getPatientList")
    public R getPatientList(){
        List<PatientsVo> list = patientsService.getPatientInfo();
        log.info("list {}",list);
        return R.ok().data("patientList",list);
    }
    
}

