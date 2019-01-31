package com.enson.webservice.service.impl;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.enson.webservice.service.UserService;

@Path("demo")
public class UserServiceImpl implements UserService {

	@POST
	@Path("doTest1")
	@Produces({MediaType.APPLICATION_JSON})
	public String hello(@Context HttpServletRequest request ) {
		System.out.println("dddddddddddddddddddddddddddddddddddddddddddddd");
		String s=ReadAsChars2(request);
		return  s;
	}
	
	public static String ReadAsChars2(HttpServletRequest request)
    {
        InputStream is = null;
        try
        {
            is = request.getInputStream();
            StringBuilder sb = new StringBuilder();
            byte[] b = new byte[4096];
            for (int n; (n = is.read(b)) != -1;)
            {
                sb.append(new String(b, 0, n));
            }
            return sb.toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (null != is)
            {
                try
                {
                    is.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
		return null;
 
    }

 

}
