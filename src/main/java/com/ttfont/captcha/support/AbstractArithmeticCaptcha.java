package com.ttfont.captcha.support;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @Author : dayu
 * @ClassName : AbstractArithmeticCaptcha
 * @Date : 2023/5/4 17:35
 * @Description :
 */
public abstract class AbstractArithmeticCaptcha extends AbstractCaptchaSource {
    /**
     * 计算公式
     */
    private String arithmeticString;

    public AbstractArithmeticCaptcha() {
        setLen(2);
    }

    /**
     * 生成随机验证码
     */
    @Override
    protected void alphas() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(num(10));
            if (i < len - 1) {
                int type = num(1, 4);
                if (type == 1) {
                    sb.append("+");
                } else if (type == 2) {
                    sb.append("-");
                } else if (type == 3) {
                    sb.append("x");
                }
            }
        }
        sb.append("=?");
        arithmeticString = sb.toString();

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        try {
            chars = String.valueOf(engine.eval(sb.toString().replaceAll("x", "*")));
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }

    public String getArithmeticString() {
        checkAlpha();
        return arithmeticString;
    }

    public void setArithmeticString(String arithmeticString) {
        this.arithmeticString = arithmeticString;
    }

}
