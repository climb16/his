package online.jfree.his.test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Guo Lixiao
 * @description
 * @date 2018/12/24 18:09
 * @sign 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public abstract class AbstractTest {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

}
