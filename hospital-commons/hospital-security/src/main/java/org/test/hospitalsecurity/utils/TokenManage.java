package org.test.hospitalsecurity.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Configuration
public class TokenManage {
    
    @Value("${jwt.secret}")
    private String SECRET;
    @Value("${jwt.expire}")
    private Integer EXPIRE;

    public String getToken(String account){
        return Jwts.builder().setSubject("my")
                    .setHeaderParam("typ","JWT")
                    .setHeaderParam("alg","HS256")
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis()+EXPIRE))
                    .claim("name",account)
                    .signWith(SignatureAlgorithm.HS256,SECRET)
                    .compact();
    }
    public boolean checkToken(String jwtToken) {
        if(StringUtils.isEmpty(jwtToken)) return false;
        try {
            Jwts.parser().setSigningKey(SECRET).parseClaimsJws(jwtToken);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public String getMemberIdByJwtToken(String jwtToken) {
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(jwtToken);
        Claims claims = claimsJws.getBody();
        return (String)claims.get("name");
    }
    
}
