package com.liyiruo.springboot.service.impl;

import com.liyiruo.springboot.service.ISplitService;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitServiceImpl implements ISplitService {
    @SuppressWarnings("all")//这个注解此处避免校验value 的值
    @Override
    public List<String> split(String value) {
        //这句是什么我也不太懂
        return Stream.of(StringUtils.split(value,",")).collect(Collectors.toList());
    }
}
