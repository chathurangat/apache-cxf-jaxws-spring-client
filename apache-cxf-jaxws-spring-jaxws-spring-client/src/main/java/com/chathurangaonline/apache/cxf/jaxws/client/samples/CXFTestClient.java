package com.chathurangaonline.apache.cxf.jaxws.client.samples;

import com.chathurangaonline.apache.cxf.jaxws.spring.samples.impl.CalculatorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CXFTestClient {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        CalculatorService calculatorService = (CalculatorService) applicationContext.getBean("calcServiceBean");
        double answer =  calculatorService.multiply(10,22);
        System.out.println(" answer is ["+answer+"]");
    }
}
