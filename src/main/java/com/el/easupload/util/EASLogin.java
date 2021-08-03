package com.el.easupload.util;

import com.el.easupload.ws.WSContext;

import java.net.MalformedURLException;

import static com.el.easupload.util.Resource.URL_LOGIN;


public class EASLogin {
    public WSContext doEASLogin(){
        java.net.URL endpoint =null;

            try {
                endpoint=new java.net.URL(URL_LOGIN);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        WSContext wsContext=new WSContext();

        return null;
    }
}
