package com.el.easupload.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilTools {
    public static String jdeToData(Integer jde){
        if(jde==null){
            return "";
        }
        String time= String.valueOf(jde.intValue());
        if(time.equals("0")){
            return "";
        }
        Date date=null;
        SimpleDateFormat formatter=new SimpleDateFormat("yyddd");
        try {
            date=formatter.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd");
        String time1=formatter1.format(date);
        return time1;
    }
}
