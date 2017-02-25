package com.mycompany.app;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class ELANService extends Service
{
    // add one line to move the Dev2 branch ahead
    public ELANService(String name)
    {
        super(name, ServiceType.SERVICE_TYPE_ELAN);
    }
}
