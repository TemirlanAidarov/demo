package com.example.demo.security;

public enum AppUserPermission {
    STATISTICS_READ("statistics:read");

    private final String permission;
    AppUserPermission(String permission){
        this.permission = permission;
    }
    public String getPermission(){
        return permission;
    }
}
