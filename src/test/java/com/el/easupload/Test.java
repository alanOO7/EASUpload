package com.el.easupload;

import com.el.easupload.util.EASLogin;
import com.el.easupload.util.Resource;
import com.el.easupload.ws.WSContext;

import java.rmi.RemoteException;


public class Test {


    public static void main(String[]args) {
        EASLogin login=new EASLogin();
        WSContext wsContext=login.doEASLogin();
        System.out.println(WSContext.getTypeDesc());



    }

}
