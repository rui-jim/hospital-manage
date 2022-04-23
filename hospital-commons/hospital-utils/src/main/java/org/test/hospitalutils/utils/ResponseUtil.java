package org.test.hospitalutils.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseUtil {

    public static void out(HttpServletResponse response, R r) {
        ObjectMapper mapper = new ObjectMapper();
        response.setStatus(HttpStatus.OK.value());
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        try {
//            mapper.writeValue(response.getWriter(), r);
            PrintWriter writer = response.getWriter();
            writer.write(mapper.writeValueAsString(r));
            writer.flush();
        } catch (IOException e) {
            System.out.println("getWriter");
            e.printStackTrace();
        }
    }
}
