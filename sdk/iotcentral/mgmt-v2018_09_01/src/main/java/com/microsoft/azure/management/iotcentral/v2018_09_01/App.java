/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iotcentral.v2018_09_01.implementation.IoTCentralManager;
import com.microsoft.azure.management.iotcentral.v2018_09_01.implementation.AppInner;

/**
 * Type representing App.
 */
public interface App extends HasInner<AppInner>, Resource, GroupableResourceCore<IoTCentralManager, AppInner>, HasResourceGroup, Refreshable<App>, HasManager<IoTCentralManager> {
    /**
     * @return the applicationId value.
     */
    String applicationId();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the sku value.
     */
    AppSkuInfo sku();

    /**
     * @return the subdomain value.
     */
    String subdomain();

    /**
     * @return the template value.
     */
    String template();

}
