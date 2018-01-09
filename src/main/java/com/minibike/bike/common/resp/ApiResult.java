package com.minibike.bike.common.resp;

import lombok.Data;

@Data
public class ApiResult <T>{

    private  int code =200;

    private  String message;

    private T data;



}
