package com.mycompany.app;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class ELANService extends Service
{
    public ELANService(String name)
    {
        super(name, ServiceType.SERVICE_TYPE_ELAN);
    }
}
