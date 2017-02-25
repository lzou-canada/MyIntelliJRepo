package com.mycompany.app;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class Service
{
    private String name;
    private ServiceType serviceType;

    public Service(String name, ServiceType serviceType)
    {
        this.name = name;
        this.serviceType = serviceType;
    }

    public void Print()
    {
        System.out.println("Service name: " + name + ", service type: " + serviceType);
    }

}
