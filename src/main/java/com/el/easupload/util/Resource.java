package com.el.easupload.util;

public class Resource {
    /**金蝶EAS系统登录接口地址**/
    public static final String URL_LOGIN = "http://teas.shenyejituan.com:6892/ormrpc/services/EASLogin?wsdl";
//    public static final String URL_LOGIN = "http://10.104.5.1:6892/ormrpc/services/EASLogin?wsdl";

    /**金蝶EAS系统总账接口地址**/
    public static final String URL_GL = "http://teas.shenyejituan.com:6892/ormrpc/services/WSWSVoucher?WSDL";
//    public static final String URL_GL = "http://10.104.5.1:6892/ormrpc/services/WSWSVoucher?WSDL";

    /**金蝶EAS系统登录账号，要求具有凭证业务权限**/
    public static final String USERNAME = "sy_pz";

    /**金蝶EAS系统登录密码**/
    public static final String PASSWORD = "sy-12345678";

    /**产品实例，固定值**/
    public static final String SLNNAME = "eas";

    /**金蝶EAS系统数据中心代码**/
    public static final String DBCODE = "t210723";

    /**语言：L2，简体中文；L3，繁体中文；固定值**/
    public static final String LANGUAGE = "l2";

    /**数据库类型：0，SqlServer；1，Oracle**/
    public static final int DBTYPE = 1;

//    public static final String SessionId =new EASUtil().doEASLogin().getSessionId();


}
