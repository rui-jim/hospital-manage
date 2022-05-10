package org.test.hospitalserver.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.test.hospitalutils.utils.R;

@FeignClient("hospital-data-provider")
@Component
public interface HospitalDataProviderClient {
    
//    @Value("${servers.dataprovider}")
//    private String dataproviderURL;
//    
    @GetMapping("/doctors/list")
    public R getDoctorsList();
    
}
