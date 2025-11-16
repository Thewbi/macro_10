package com.mycompany.model;

public enum ConditionalAssemblyType {
    
    IFE

    ;

    public static ConditionalAssemblyType fromString(String data) {

        if (data.equalsIgnoreCase("IFE")) {
            return IFE;
        }

        throw new RuntimeException("Unknown ConditionalAssembly: " + data);
    }
}
