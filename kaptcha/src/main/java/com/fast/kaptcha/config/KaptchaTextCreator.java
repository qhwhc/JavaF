package com.fast.kaptcha.config;

import com.google.code.kaptcha.text.impl.DefaultTextCreator;

import java.util.Random;

public class KaptchaTextCreator extends DefaultTextCreator {
    private static final String[] CNUMBERS = "0,1,2,3,4,5,6,7,8,9,10".split(",");

    public String getText() {
        Integer result;
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        StringBuilder suChinese = new StringBuilder();
        int randomoperands = (int) Math.round(Math.random() * 2.0d);
        if (randomoperands == 0) {
            result = Integer.valueOf(x * y);
            suChinese.append(CNUMBERS[x]);
            suChinese.append("*");
            suChinese.append(CNUMBERS[y]);
        } else if (randomoperands == 1) {
            if (x == 0 || y % x != 0) {
                result = Integer.valueOf(x + y);
                suChinese.append(CNUMBERS[x]);
                suChinese.append("+");
                suChinese.append(CNUMBERS[y]);
            } else {
                result = Integer.valueOf(y / x);
                suChinese.append(CNUMBERS[y]);
                suChinese.append("/");
                suChinese.append(CNUMBERS[x]);
            }
        } else if (randomoperands != 2) {
            result = Integer.valueOf(x + y);
            suChinese.append(CNUMBERS[x]);
            suChinese.append("+");
            suChinese.append(CNUMBERS[y]);
        } else if (x >= y) {
            result = Integer.valueOf(x - y);
            suChinese.append(CNUMBERS[x]);
            suChinese.append("-");
            suChinese.append(CNUMBERS[y]);
        } else {
            result = Integer.valueOf(y - x);
            suChinese.append(CNUMBERS[y]);
            suChinese.append("-");
            suChinese.append(CNUMBERS[x]);
        }
        suChinese.append("=?@" + result);
        return suChinese.toString();
    }
}
