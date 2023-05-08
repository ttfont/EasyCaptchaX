package com.ttfont.captcha.support;

/**
 * @Author : dayu
 * @ClassName : AbstractRandomCharSupport
 * @Date : 2023/5/4 15:53
 * @Description :
 */
public abstract class AbstractRandomCharSupport implements RandomCaptcha {


    /**
     * 产生两个数之间的随机数
     *
     * @param min 最小值
     * @param max 最大值
     * @return 随机数
     */
    protected int num(int min, int max) {
        return min + RANDOM.nextInt(max - min);
    }

    /**
     * 产生0-num的随机数,不包括num
     *
     * @param num 最大值
     * @return 随机数
     */
    protected int num(int num) {
        return RANDOM.nextInt(num);
    }

    /**
     * 返回ALPHA中的随机字符
     *
     * @return 随机字符
     */
    protected char alpha() {
        return ALPHA[num(ALPHA.length)];
    }

    /**
     * 返回ALPHA中第0位到第num位的随机字符
     *
     * @param num 到第几位结束
     * @return 随机字符
     */
    protected char alpha(int num) {
        return ALPHA[num(num)];
    }

    /**
     * 返回ALPHA中第min位到第max位的随机字符
     *
     * @param min 从第几位开始
     * @param max 到第几位结束
     * @return 随机字符
     */
    protected char alpha(int min, int max) {
        return ALPHA[num(min, max)];
    }


}
