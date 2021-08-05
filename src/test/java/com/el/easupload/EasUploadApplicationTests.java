package com.el.easupload;

import com.el.easupload.dao.F550911zDao;
import com.el.easupload.model.F550911z;
import com.el.easupload.model.F550911zExample;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class EasUploadApplicationTests {
    @Resource
    F550911zDao f551513ZDao;
    @Test
    void contextLoads() {
        F550911zExample f550911zExample=new F550911zExample();
        F550911zExample.Criteria criteria = f550911zExample.createCriteria();
        criteria.andGLUKIDEqualTo(new BigDecimal(3));

        List<F550911z> f550911z= f551513ZDao.selectByExample(f550911zExample);

        F550911z f =new F550911z();
        criteria.andGLICUEqualTo(new BigDecimal(3));
        f.setGLABR1("a");
        f551513ZDao.updateByExampleSelective(f,f550911zExample);
        System.out.println(f550911z.get(1).getGLDKJ());
    }

}
