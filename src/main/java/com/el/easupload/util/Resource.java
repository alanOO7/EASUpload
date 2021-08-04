package com.el.easupload.util;

public class Resource {
    /**金蝶EAS系统登录接口地址**/
    public static final String URL_LOGIN = "http://teas.shenyejituan.com:6892/ormrpc/services/EASLogin?wsdl";

    /**金蝶EAS系统总账接口地址**/
    public static final String URL_GL = "http://teas.shenyejituan.com:6892/ormrpc/services/WSGLWebServiceFacade?WSDL";

    /**金蝶EAS系统登录账号，要求具有凭证业务权限**/
    public static final String USERNAME = "user";

    /**金蝶EAS系统登录密码**/
    public static final String PASSWORD = "kduser_123";

    /**产品实例，固定值**/
    public static final String SLNNAME = "eas";

    /**金蝶EAS系统数据中心代码**/
    public static final String DBCODE = "T201030";

    /**语言：L2，简体中文；L3，繁体中文；固定值**/
    public static final String LANGUAGE = "L2";

    /**数据库类型：0，SqlServer；1，Oracle**/
    public static final int DBTYPE = 1;

}
