package com.el.easupload;

import com.el.easupload.dao.F550911zDao;
import com.el.easupload.model.F550911z;
import com.el.easupload.model.F550911zExample;
import com.el.easupload.service.ImportVouchers;
import com.el.easupload.util.EASUtil;
import com.el.easupload.ws.WSContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class EasUploadApplicationTests {
    @Resource
    F550911zDao f550911zDao;
    @Test
    void contextLoads() {
        EASUtil login=new EASUtil();
        WSContext wsContext=login.doEASLogin();
        System.out.println("getSessionId:"+wsContext.getSessionId());

        F550911zExample f550911zExample=new F550911zExample();
        F550911zExample.Criteria criteria = f550911zExample.createCriteria();
//        criteria.andGLUKIDEqualTo(new BigDecimal(3));

        List<F550911z> f550911z= f550911zDao.selectByExample(f550911zExample);
        ImportVouchers importVouchers=new ImportVouchers();
        System.out.println("查询出数据条数："+f550911z.size());
        String[][] msg=login.impVoucher(importVouchers.JDEConvBean(f550911z),3,0);
        if(msg==null){
            System.out.println("返回值null");

        }else {
            StringBuffer stringBuffer = new StringBuffer(" ");
            //外循环遍历有多少个一维数组
            F550911z f =null;
            int updateR=0;
            for (int i = 0; i < msg.length; i++) {
                //内循环遍历每一个一维数组的元素
                f=new F550911z();
                f550911zExample=new F550911zExample();
                criteria = f550911zExample.createCriteria();

                if(msg[i][4].equals("0000")){
                    //success
                    f.setGLABR3(msg[i][6].trim());
                    f.setGLEV02("Y");
                    criteria.andGLUKIDEqualTo(new BigDecimal(msg[i][0].trim()));
                    updateR=f550911zDao.updateByExampleSelective(f,f550911zExample);

                }else {
//                    error
                    f.setGLDS05(msg[i][5].trim().length()>80?msg[i][5].trim().substring(80):msg[i][5].trim());
                    f.setGLEV02("N");
                    criteria.andGLICUEqualTo(new BigDecimal(msg[i][0].trim()));
                    criteria.andGLEV02LessThanOrEqualTo(" ");
                    updateR=f550911zDao.updateByExampleSelective(f,f550911zExample);

                }
                stringBuffer.append(" /r ");
                for (int j = 0; j < msg[i].length; j++) {
                    stringBuffer.append(msg[i][j]);
                }
            }
            System.out.println(stringBuffer.toString());
            System.out.println("更新条数："+updateR);
//        F550911z f =new F550911z();
//        criteria.andGLICUEqualTo(new BigDecimal(3));
//        f.setGLABR1("a");
//        f551513ZDao.updateByExampleSelective(f,f550911zExample);
//        System.out.println(f550911z.get(1).getGLDKJ());
        }
    }

}
