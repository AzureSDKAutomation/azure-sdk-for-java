// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration;

import com.azure.core.util.Context;

/** Samples for PrivateLinkResources ListByConfigurationStore. */
public final class PrivateLinkResourcesListByConfigurationStoreSamples {
    /**
     * Sample code: PrivateLinkResources_ListGroupIds.
     *
     * @param appConfigurationManager Entry point to AppConfigurationManager.
     */
    public static void privateLinkResourcesListGroupIds(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager appConfigurationManager) {
        appConfigurationManager
            .privateLinkResources()
            .listByConfigurationStore("myResourceGroup", "contoso", Context.NONE);
    }
}
