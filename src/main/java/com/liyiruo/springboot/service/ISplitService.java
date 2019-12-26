package com.liyiruo.springboot.service;

import java.util.List;

/**
 * 字符串分隔服务接口的定义
 */
public interface ISplitService {
    List<String> split(String value);
}
