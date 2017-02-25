package com.mycompany.app;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class CLineService extends Service
{
    // add one line of comment to C-Line service
    public CLineService(String name)
    {
        super(name, ServiceType.SERVICE_TYPE_CLINE);
    }
}
