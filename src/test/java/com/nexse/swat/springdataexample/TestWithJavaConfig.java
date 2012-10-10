package com.nexse.swat.springdataexample;

import com.nexse.swat.springdataexample.conf.AppConfig;
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
@ContextConfiguration(classes = AppConfig.class)
@Transactional
public class TestWithJavaConfig extends CommonTestCode {
}
