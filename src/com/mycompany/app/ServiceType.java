package com.mycompany.app;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public enum ServiceType
{
    SERVICE_TYPE_UNKNOWN(0,"UNKNOWN"),
    SERVICE_TYPE_ELINE(1,"E-Line"),
    SERVICE_TYPE_ELAN(2,"E-LAN"),
    SERVICE_TYPE_CLINE(3,"C-Line");

    private int index;
    private String name;

    ServiceType(int index, String name)
    {
        this.index = index;
        this.name = name;
    }

    public int getIndex()
    {
        return index;
    }

    public String getName()
    {
        return name;
    }

}
