package com.ttfont.captcha.support;

import com.ttfont.captcha.common.CaptchaConstant;

import java.awt.*;

/**
 * @Author : dayu
 * @ClassName : AbstractChineseCaptcha
 * @Date : 2023/5/4 17:50
 * @Description :
 */
public abstract class AbstractChineseCaptcha extends AbstractCaptchaSource {

    public AbstractChineseCaptcha() {
        setFont(new Font("楷体", Font.PLAIN, 28));
        setLen(4);
    }

    /**
     * 生成随机验证码
     */
    @Override
    protected void alphas() {
        char[] cs = new char[len];
        for (int i = 0; i < len; i++) {
            cs[i] = alphaHan();
        }
        chars = new String(cs);
    }

    /**
     * 返回随机汉字
     *
     * @return 随机汉字
     */
    public char alphaHan() {
        return CaptchaConstant.DELTA.charAt(num(CaptchaConstant.DELTA.length()));
    }

}
