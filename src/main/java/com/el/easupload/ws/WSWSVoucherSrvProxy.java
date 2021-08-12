/**
 * WSWSVoucherSrvProxy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.el.easupload.ws;

public interface WSWSVoucherSrvProxy extends java.rmi.Remote {
    public String nExportVoucher(String params) throws java.rmi.RemoteException, WSInvokeException;
    public String nImportVoucher(String rows, String params) throws java.rmi.RemoteException, WSInvokeException;
    public String nGetBalance(String params) throws java.rmi.RemoteException, WSInvokeException;
    public String[][] importVoucher(WSWSVoucher[] voucherCols, int isVerify, int isImpCashflow) throws java.rmi.RemoteException, WSInvokeException;
    public WSWSRtnInfo[] importVoucher(WSWSVoucher[] voucherCols, boolean isTempSave, boolean isVerify, boolean hasCashflow) throws java.rmi.RemoteException, WSInvokeException;
    public String nOperateVoucher(String params) throws java.rmi.RemoteException, WSInvokeException;
    public String[][] importVoucherOfReturnID(WSWSVoucher[] voucherCols, int isVerify, int isImpCashflow) throws java.rmi.RemoteException, WSInvokeException;
}
