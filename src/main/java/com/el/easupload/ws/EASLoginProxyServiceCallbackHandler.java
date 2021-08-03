/**
 * EASLoginProxyServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.el.easupload.ws;


/**
 *  EASLoginProxyServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class EASLoginProxyServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public EASLoginProxyServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public EASLoginProxyServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for logout method
     * override this method for handling normal response from logout operation
     */
    public void receiveResultlogout(
        EASLoginProxyServiceStub.LogoutResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from logout operation
     */
    public void receiveErrorlogout(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for loginByLtpaToken method
     * override this method for handling normal response from loginByLtpaToken operation
     */
    public void receiveResultloginByLtpaToken(
        EASLoginProxyServiceStub.LoginByLtpaTokenResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from loginByLtpaToken operation
     */
    public void receiveErrorloginByLtpaToken(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for login method
     * override this method for handling normal response from login operation
     */
    public void receiveResultlogin(
        EASLoginProxyServiceStub.LoginResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from login operation
     */
    public void receiveErrorlogin(Exception e) {
    }
}
