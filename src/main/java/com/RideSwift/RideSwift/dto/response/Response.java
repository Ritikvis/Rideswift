package com.RideSwift.RideSwift.dto.response;

public class Response<T> {
    T data;
    String message;

    int statusCode;
}