package org.irvine.neteam.common.utils;

public enum Keywords {
    PRODUCT("product");

    private final String key;
    private Keywords(String key) {
        this.key = key;
    }
    public String key(){
        return key;
    }
}
