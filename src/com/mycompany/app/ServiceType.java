package com.mycompany.app;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public enum ServiceType
{
    SERVICE_TYPE_UNKNOWN(0,"UNKNOWN"),
    /**
     * This is for E-Line service which has
     * two fixed end points
     */
    SERVICE_TYPE_ELINE(1,"E-Line"),
    /**
     * This is an Ethernet type of service
     * for two or more than two end points
     */
    SERVICE_TYPE_ELAN(2,"E-LAN"),
    /**
     * This is an IP service with two
     * fixed TDM DS0 end points tansporting
     * TDM data across the IP/MPLS core network
     */
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
