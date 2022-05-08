package com.example.demo.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 描述：
 * @author Lishihao
 * @create 2022/04/29
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
