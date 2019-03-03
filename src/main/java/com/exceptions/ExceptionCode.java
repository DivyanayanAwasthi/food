package com.exceptions;

public enum ExceptionCode  {

ACTIVE_USER_FOUND("CODE_200", "Order Placed succesfully"),
INVALID_REQUEST("CODE_402", "Order is not successfull"),
INACTIVE_USER("CODE_403", "Not Registred User"),
AKSYAY("CODE_500,","blackListed User");

private final String id;
private final String msg;

ExceptionCode(String id, String msg) {
this.id = id;
this.msg = msg;
}

public String getId() {
return this.id;
}

public String getMsg() {
return this.msg;
}
}