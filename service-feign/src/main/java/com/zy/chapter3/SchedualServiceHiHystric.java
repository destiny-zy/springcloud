package com.zy.chapter3;

import org.springframework.stereotype.Component;

/**
 * @author zy
 * @date 2020/2/24
 */
@Component
public class SchedualServiceHiHystric implements ServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}