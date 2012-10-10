package com.nexse.swat.springdataexample;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author germano giudici
 *         Date: 08/10/12
 *         Time: 13:44
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:/com/nexse/swat/springdataexample/conf/infrastructure.xml"})
@Transactional
public class TestWithXmlConfig extends CommonTestCode {
}
