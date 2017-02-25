package com.mycompany.app;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class ElineService extends Service
{
    public ElineService(String name)
    {
        super(name, ServiceType.SERVICE_TYPE_ELINE);
    }
}
