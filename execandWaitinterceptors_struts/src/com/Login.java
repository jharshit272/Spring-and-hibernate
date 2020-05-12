package com;
import com.opensymphony.xwork2.ActionSupport;
 
public class Login extends ActionSupport{
    private static final long serialVersionUID = 1L;    
 
    public String execute()
    {
        try
        {
            Thread.sleep(4000);
        } catch(Exception e)
        {
 
        }        
 
        return SUCCESS;
    }
 
}