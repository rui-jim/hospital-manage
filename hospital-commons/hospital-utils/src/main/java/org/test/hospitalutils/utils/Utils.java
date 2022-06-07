package org.test.hospitalutils.utils;

public class Utils {
    
    public static R booleanForR(Boolean judge){
        R r=null;
        if(judge){
            r=R.ok();
        }else{
            r=R.error();
        }
        return r;
    }
    
}
