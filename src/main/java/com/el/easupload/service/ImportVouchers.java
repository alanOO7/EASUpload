package com.el.easupload.service;

import com.el.easupload.dao.F550911zDao;
import com.el.easupload.model.F550911z;
import com.el.easupload.model.F550911zExample;
import com.el.easupload.util.EASUtil;
import com.el.easupload.util.UtilTools;
import com.el.easupload.ws.WSWSVoucher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
@Service
public class ImportVouchers {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Resource
    F550911zDao f550911zDao;

    public String impVouchers(BigDecimal ukid) {
        String[][] msg = {{"Y"}};
        StringBuffer stringBuffer = new StringBuffer(" ");
        int updateR = 0;

        EASUtil easUtil = new EASUtil();

        F550911zExample f550911zExample = new F550911zExample();
        F550911zExample.Criteria criteria = f550911zExample.createCriteria();
        criteria.andGLUKIDEqualTo(ukid);//查询
        List<F550911z> f550911z = f550911zDao.selectByExample(f550911zExample);//转换
        int size = f550911z == null ? 0 : f550911z.size();

        log.info("=========查询出f550911z的条数:=" + size + " =====");
        if(size==0){
            return "没有查询到数据";
        }
        msg = easUtil.impVoucher(this.JDEConvBean(f550911z), 3, 0);//调用eas

        if (msg == null) {
            stringBuffer.append("返回值null");
        } else {
            //外循环遍历有多少个一维数组
            F550911z f = null;

            for (int i = 0; i < msg.length; i++) {
                //内循环遍历每一个一维数组的元素
                f = new F550911z();
                f550911zExample = new F550911zExample();
                criteria = f550911zExample.createCriteria();

                if (msg[i][4].equals("0000")) {
                    //success
                    f.setGLABR3(msg[i][6].trim());
                    f.setGLEV02("Y");
                    criteria.andGLICUEqualTo(new BigDecimal(msg[i][0].trim()));
                    criteria.andGLUKIDEqualTo(ukid);//查询
                    updateR = f550911zDao.updateByExampleSelective(f, f550911zExample);

                    //更新所有行的
                    f = new F550911z();
                    f.setGLABR3(msg[i][6].trim());
                    f550911zExample = new F550911zExample();
                    criteria = f550911zExample.createCriteria();
                    f.setGLABR3(msg[i][6].trim());
                    criteria.andGLICUEqualTo(new BigDecimal(msg[i][0].trim()));
                    updateR = f550911zDao.updateByExampleSelective(f, f550911zExample);
                } else {
//                    error
                    f.setGLDS05(msg[i][5].trim().length() > 80 ? msg[i][5].trim().substring(80) : msg[i][5].trim());
                    f.setGLEV02("N");
                    criteria.andGLICUEqualTo(new BigDecimal(msg[i][0].trim()));
                    criteria.andGLUKIDEqualTo(ukid);//查询
                    updateR = f550911zDao.updateByExampleSelective(f, f550911zExample);

                }
                stringBuffer.append(" /r 更新条数："+updateR+"：");
                for (int j = 0; j < msg[i].length; j++) {
                    stringBuffer.append(msg[i][j]);
                }
            }
        }
        log.info("=========返回结果:" + stringBuffer.toString() + " =========");

        return stringBuffer.toString();

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
        voucher.setEntrySeq(f550911z.getGLABR4() ==null || f550911z.getGLABR4().trim() .equals("")  ? 0:Integer.parseInt(f550911z.getGLABR4().trim()) );
        voucher.setVoucherAbstract(f550911z.getGLD200());
        voucher.setAccountNumber(f550911z.getGLDL11());
        voucher.setCurrencyNumber(f550911z.getGLR3());
        voucher.setLocalRate(f550911z.getGLCRR().doubleValue());
        voucher.setEntryDC(f550911z.getGLAG().doubleValue()!=0 ? 1:-1);
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
//        voucher.setItemFlag(f550911z.getGLPM02() ==null || f550911z.getGLPM02().trim().equals("")  ? 0:Integer.parseInt(f550911z.getGLPM02().trim()));
//        voucher.setOppAccountSeq(f550911z.getGLABR1() ==null || f550911z.getGLABR1().trim().equals("")  ? 0:Integer.parseInt(f550911z.getGLABR1().trim()));
//        voucher.setPrimaryItem(f550911z.getGLDL07());
//        voucher.setCashflowAmountOriginal(f550911z.getGLAA().abs().doubleValue());
//        voucher.setCashflowAmountLocal(f550911z.getGLAA().abs().doubleValue());

        return voucher;
    }
}
