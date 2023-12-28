package com.zjh.ojcodesandbox.model.enums;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum ExecuteCodeStatusEum {
    SUCCESS("执行成功", 1),
    COMPILE_FAIL("编译失败", 2),
    RUNNING_FAIL("运行失败", 3),
    TIMEOUT_FAIL("程序运行超时", 4),
    NO_AUTH("没有调用权限", 5);

    private final String text;

    private final Integer value;

    ExecuteCodeStatusEum(String text, Integer value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<Integer> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value
     * @return
     */
    public static ExecuteCodeStatusEum getEnumByValue(Integer value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (ExecuteCodeStatusEum anEnum : ExecuteCodeStatusEum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }

    public Integer getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
