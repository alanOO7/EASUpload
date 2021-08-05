package com.el.easupload;

import com.el.easupload.util.EASLogin;
import com.el.easupload.util.Resource;
import com.el.easupload.util.UtilTools;
import com.el.easupload.ws.WSContext;

import java.math.BigDecimal;
import java.net.URI;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test {


    public static void main(String[]args) throws ParseException {
        EASLogin login=new EASLogin();
        WSContext wsContext=login.doEASLogin();
        System.out.println("getSessionId:"+wsContext.getSessionId());

        String time="21021";

        Date date=null;
        SimpleDateFormat formatter=new SimpleDateFormat("yyddd");
        date=formatter.parse(time);
        System.out.println(date.toString());

        SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time1=formatter1.format(date);
        System.out.println(time1);

        UtilTools.jdeToData(new Integer("21021"));
        Integer.parseInt("   ");


    }

}
