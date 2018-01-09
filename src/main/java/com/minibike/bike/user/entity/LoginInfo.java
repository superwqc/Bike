package com.minibike.bike.user.entity;

import lombok.Data;

/**
 * @Date
 * @Description
 */

@Data
public class LoginInfo {
    /*登录信息密文*/
    private String data;

    /*RSA加密的AES密钥*/
    private  String key;

}
