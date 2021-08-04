package com.el.easupload.util;

import com.el.easupload.ws.EASLoginProxy;
import com.el.easupload.ws.EASLoginProxyServiceLocator;
import com.el.easupload.ws.WSContext;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

import static com.el.easupload.util.Resource.URL_LOGIN;


public class EASLogin {
    public WSContext doEASLogin(){
        java.net.URL endpoint =null;

            try {

                endpoint=new java.net.URL(URL_LOGIN);


        EASLoginProxy proxy=null;

            proxy =new EASLoginProxyServiceLocator().getEASLogin(endpoint);

            return  proxy.login(Resource.USERNAME,Resource.PASSWORD,Resource.SLNNAME,Resource.DBCODE,
                    Resource.LANGUAGE,Resource.DBTYPE);
        } catch (ServiceException e) {
            e.printStackTrace();

            } catch (MalformedURLException e) {
                e.printStackTrace();

            }finally {
                return null;
            }
    }


}
