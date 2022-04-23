package org.test.hospitalsecurity.entity;

import lombok.Data;

import java.util.Date;

@Data
public class CurrentUser {
    
    private String account;
    private String password;
    private String title;
    private String ip;
    private String browser;
    private Date loginTime;
    private String identify;
    
    
}
