// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for OnPremiseIotSensors Get. */
public final class OnPremiseIotSensorsGetSamples {
    /**
     * Sample code: Get on-premise IoT sensor.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getOnPremiseIoTSensor(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.onPremiseIotSensors().getWithResponse("mySensor", Context.NONE);
    }
}
