package backend.spring.security;



import backend.spring.factory.ServiceFac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import io.jsonwebtoken.ExpiredJwtException;


@Component
public class JwtRequestFilter extends OncePerRequestFilter {
    @Autowired
    ServiceFac serviceFac;
    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        final  String requestTokenHeader =  request.getHeader("Authorization");
        String usernameLogin =  null;
        String jwtToken =  null;

        if(requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")){
            jwtToken = requestTokenHeader.substring(7);
            try {
                usernameLogin = jwtTokenUtil.getUsernameFromToken(jwtToken);
            }catch (IllegalArgumentException e){
                System.out.println("tidak bisa mengambil JWT Token");
            }catch (ExpiredJwtException e){
                System.out.println("JWT Token sudah kadaluarsa");
            }
        }else {
            logger.warn("JWT Token does not begin with Bearer String");
        }

        if(usernameLogin != null && SecurityContextHolder.getContext().getAuthentication() ==null){
            UserDetails userDetails = this.serviceFac.getJwtMasukDetailService().loadUserByUsername(usernameLogin);
            if(jwtTokenUtil.validateToken(jwtToken,userDetails)){
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                        userDetails,null,userDetails.getAuthorities());
                        usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                        SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);

            }
        }
       chain.doFilter(request, response);
    }
}