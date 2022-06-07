package org.test.hospitalserver.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.test.hospitalserver.entity.Doctors;
import org.test.hospitalserver.entity.vo.DoctorsVo;
import org.test.hospitalserver.service.DoctorsService;
import org.test.hospitalutils.utils.R;
import org.test.hospitalutils.utils.Utils;

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
@RequestMapping("/doctors")
@Api(tags="医院管理")
@Slf4j
public class DoctorsController {

    @Autowired
    DoctorsService doctorsService;
    
    @GetMapping("/list")
    @ApiOperation("展示医生列表")
    public R doctorsList(){
        List<DoctorsVo> list = doctorsService.getList();
        log.info("doctors list {}",list);
        return R.ok().data("doctorsList",list);
    }
    
    @PostMapping("/add")
    @ApiOperation("添加医生")
    public R addDoctors(@ApiParam(name="doctors",value="传入的实体",required = true)
                            @RequestBody DoctorsVo doctorsVo){
        log.info("input doctors {}",doctorsVo);
        Boolean aBoolean = doctorsService.addDoctors(doctorsVo);
        return Utils.booleanForR(aBoolean);
    }
}

