package com.example.demo.error;

/**
 * 描述：业务异常
 * @author Lishihao
 * @create 2022/04/29
 */
public class BusinessException extends RuntimeException{

    public BusinessException(){}

    public BusinessException(String message) {
        super(message);
    }
}
