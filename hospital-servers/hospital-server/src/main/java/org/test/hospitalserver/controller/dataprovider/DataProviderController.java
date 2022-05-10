package org.test.hospitalserver.controller.dataprovider;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.hospitalserver.client.HospitalDataProviderClient;
import org.test.hospitalutils.utils.R;

@RestController
@Api(tags="DataProviderController")
@CrossOrigin
public class DataProviderController {

    @Autowired
    HospitalDataProviderClient hospitalDataProviderClient;


    @GetMapping("/provider/doctors/list")
    @ApiOperation("医生列表")
    public R doctorsList(){
        R doctorsList = hospitalDataProviderClient.getDoctorsList();
        return doctorsList; 
    }
    
}
