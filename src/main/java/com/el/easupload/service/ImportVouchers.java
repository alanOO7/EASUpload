package com.el.easupload.service;

import com.el.easupload.model.F550911z;
import com.el.easupload.util.UtilTools;
import com.el.easupload.ws.WSWSVoucher;

import java.util.List;

public class ImportVouchers {

    public void impVouchers(){
        String[][] msg=null;

        //定义一个标识存放元素个数
        int count = 0;
        //外循环遍历有多少个一维数组
        for(int i = 0; i <msg.length;i++){
            //内循环遍历每一个一维数组的元素
            for(int j = 0; j <msg.length;j++){
                count++;	//如果有元素，计数标识+1
            }
        }

    }
    public WSWSVoucher[] JDEConvBean(List<F550911z> f550911zs) {
        WSWSVoucher[] vouchers=new WSWSVoucher[f550911zs.size()];
        for (int i = 0; i < f550911zs.size(); i++) {
            vouchers[i] =this.JDEConvBean(f550911zs.get(i));
        }
        return vouchers;
    }
    public WSWSVoucher JDEConvBean(F550911z f550911z){
        WSWSVoucher voucher=new WSWSVoucher();
        voucher.setCompanyNumber(f550911z.getGLCO());
        voucher.setBookedDate(UtilTools.jdeToData(f550911z.getGLDGJ()));
        voucher.setBizDate(UtilTools.jdeToData(f550911z.getGLIVD()));
        voucher.setPeriodYear(f550911z.getGLFY().intValue()+2000);
        voucher.setPeriodNumber(f550911z.getGLPN().intValue());
        voucher.setVoucherType("记");//f550911z.getGLICUT()
        voucher.setVoucherNumber(String.valueOf(f550911z.getGLICU().intValue()));
        voucher.setEntrySeq(f550911z.getGLABR4() ==null || f550911z.getGLABR4().trim() ==""  ? 0:Integer.parseInt(f550911z.getGLABR4()) );
        voucher.setVoucherAbstract(f550911z.getGLD200());
        voucher.setAccountNumber(f550911z.getGLDL11());
        voucher.setCurrencyNumber(f550911z.getGLR3());
        voucher.setLocalRate(f550911z.getGLCRR().doubleValue());
        voucher.setEntryDC(f550911z.getGLPM01() ==null || f550911z.getGLPM01().trim() ==""  ? 0:Integer.parseInt(f550911z.getGLPM01()));
        voucher.setOriginalAmount(f550911z.getGLACR().doubleValue()/100);
        voucher.setDebitAmount(f550911z.getGLAG().doubleValue()/100);
        voucher.setCreditAmount(f550911z.getGLAAP().doubleValue()/100);
        voucher.setCreator(f550911z.getGLDL08());
        voucher.setCussent(Integer.parseInt(f550911z.getGLPM03()));
        voucher.setAsstActType1(f550911z.getGLSRP1());
        voucher.setAsstActNumber1(f550911z.getGLDL01());
        voucher.setAsstActName1(f550911z.getGLDS01());
        voucher.setAsstActType2(f550911z.getGLSRP2());
        voucher.setAsstActNumber2(f550911z.getGLDL02());
        voucher.setAsstActName2(f550911z.getGLDS02());
        voucher.setAsstActType3(f550911z.getGLSRP3());
        voucher.setAsstActNumber3(f550911z.getGLDL03());
        voucher.setAsstActName3(f550911z.getGLDS03());
        voucher.setItemFlag(f550911z.getGLPM02() ==null || f550911z.getGLPM02().trim() ==""  ? 0:Integer.parseInt(f550911z.getGLPM02()));
        voucher.setOppAccountSeq(f550911z.getGLABR1() ==null || f550911z.getGLABR1().trim() ==""  ? 0:Integer.parseInt(f550911z.getGLABR1()));
        voucher.setPrimaryItem(f550911z.getGLDL07());
        voucher.setCashflowAmountOriginal(f550911z.getGLAA().abs().doubleValue());
        voucher.setCashflowAmountLocal(f550911z.getGLAA().abs().doubleValue());

        return voucher;
    }
}
