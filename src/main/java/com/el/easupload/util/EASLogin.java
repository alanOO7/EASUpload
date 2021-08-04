package com.el.easupload.util;

import com.el.easupload.ws.*;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.rmi.RemoteException;


public class EASLogin {
    public WSContext doEASLogin() {
        java.net.URL endpoint = null;

        try {
            endpoint = new java.net.URL(Resource.URL_LOGIN);
            EASLoginProxy proxy = null;
            proxy = new EASLoginProxyServiceLocator().getEASLogin(endpoint);
            return proxy.login(Resource.USERNAME, Resource.PASSWORD, Resource.SLNNAME, Resource.DBCODE,
                    Resource.LANGUAGE, Resource.DBTYPE);
        } catch (ServiceException e) {
            e.printStackTrace();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
            return null;
        }
    }

    public void impVoucher() {
        WSWSVoucher[] voucher = null;

        try {
            java.net.URL endpoint = new java.net.URL(Resource.URL_GL);
            int verify = 0;
            int cashflow = 0;
            WSGLWebServiceFacadeSrvProxyServiceLocator locator = new WSGLWebServiceFacadeSrvProxyServiceLocator();
            locator.getWSGLWebServiceFacade(endpoint).importVoucher(voucher, 0, verify, cashflow);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (WSInvokeException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
