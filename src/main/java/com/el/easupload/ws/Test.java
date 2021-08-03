package com.el.easupload.ws;

import com.el.easupload.util.Resource;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;


public class Test {


    public static void main(String[]args) {
        EASLoginProxyServiceStub a;
        try {
            a = new EASLoginProxyServiceStub();
            EASLoginProxyServiceStub.Login b= new EASLoginProxyServiceStub.Login();
            b.setDbType(Resource.DBTYPE);
            b.setLanguage(Resource.LANGUAGE);
            b.setDcName(Resource.DBCODE);
            b.setSlnName(Resource.SLNNAME);
            b.setPassword(Resource.PASSWORD);
            b.setUserName(Resource.USERNAME);
            EASLoginProxyServiceStub.LoginResponse login = a.login(b);
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
