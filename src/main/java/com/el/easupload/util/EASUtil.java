package com.el.easupload.util;

import com.el.easupload.ws.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.rmi.RemoteException;


public class EASUtil {
    private final Logger log = LoggerFactory.getLogger(getClass());
    public WSContext doEASLogin() {
        java.net.URL endpoint = null;

        try {
            endpoint = new java.net.URL(Resource.URL_LOGIN);
            EASLoginProxy proxy  = new EASLoginProxyServiceLocator().getEASLogin(endpoint);

            return proxy.login(Resource.USERNAME, Resource.PASSWORD, Resource.SLNNAME, Resource.DBCODE,
                    Resource.LANGUAGE, Resource.DBTYPE);

        } catch (ServiceException e) {
            e.printStackTrace();
            return null;

        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;

        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String[][] impVoucher(WSWSVoucher[] voucher, int verify,int cashflow) {

        String[][] ls=null;
        try {
            java.net.URL endpoint = new java.net.URL(Resource.URL_GL);
            WSWSVoucherSrvProxyServiceLocator locator1=new WSWSVoucherSrvProxyServiceLocator();
            String SessionId=this.doEASLogin().getSessionId();
            log.info("=========SessionId="+SessionId+" begin=====");
            WSWSVoucherSoapBindingStub locator = new WSWSVoucherSoapBindingStub(endpoint,locator1);
            locator.setHeader(Resource.URL_GL,"SessionId",SessionId);
            ls=locator.importVoucher(voucher, verify, cashflow);

        } catch (MalformedURLException e) {
            e.printStackTrace();

        } catch (WSInvokeException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }finally {
            return ls;
        }
    }
}
