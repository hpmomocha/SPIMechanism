package com.hpe.kevin;

import com.hpe.kevin.services.JDKSPIService;

import java.util.Iterator;
import java.util.ServiceLoader;

public class JDKSPIServiceTest {
    public static void main(String[] args) {
        ServiceLoader<JDKSPIService> jdkSPIServices = ServiceLoader.load(JDKSPIService.class);
        // 遍历方法一
        Iterator<JDKSPIService> iterator = jdkSPIServices.iterator();
        while (iterator.hasNext()) {
            JDKSPIService jdkspiService = iterator.next();
            jdkspiService.doSomething();
        }

        System.out.println("===============================");

        // 遍历方法二
        for(JDKSPIService service: jdkSPIServices) {
            service.doSomething();
        }
    }
}