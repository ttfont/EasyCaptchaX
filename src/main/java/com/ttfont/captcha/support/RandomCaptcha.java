package com.ttfont.captcha.support;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @Author : dayu
 * @ClassName : RandomConstant
 * @Date : 2023/5/4 16:17
 * @Description :
 */
public interface RandomCaptcha {
    /**
     * 随机工具Ø
     */
    Random RANDOM = new SecureRandom();

    /**
     * 定义验证码字符.去除了0、O、I、L等容易混淆的字母, 54
     */
    char[] ALPHA = {'2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /**
     * 数字的最大索引，不包括最大值
     */
    int NUM_MAX_INDEX = 8;
    /**
     * 字符的最小索引，包括最小值
     */
    int CHAR_MIN_INDEX = NUM_MAX_INDEX;

    /**
     * 大写字符最小索引
     */
    int UPPER_MIN_INDEX = CHAR_MIN_INDEX;
    /**
     * 大写字符最大索引
     */
    int UPPER_MAX_INDEX = UPPER_MIN_INDEX + 23;
    /**
     * 小写字母最小索引
     */
    int LOWER_MIN_INDEX = UPPER_MAX_INDEX;

    /**
     * 字符的最大索引，不包括最大值
     */
    int CHAR_MAX_INDEX = ALPHA.length;

    /**
     * 小写字母最大索引
     */
    int LOWER_MAX_INDEX = CHAR_MAX_INDEX;

}
