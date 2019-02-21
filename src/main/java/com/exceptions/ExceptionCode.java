package com.exceptions;

public enum ExceptionCode  {

ACTIVE_USER_FOUND("CODE_200", "Active user found"),
INVALID_REQUEST("CODE_402", "The request is invalid"),
INACTIVE_USER("CODE_403", "Inactive user");

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