/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.netapp.v2020_02_01.implementation.NetAppManager;
import com.microsoft.azure.management.netapp.v2020_02_01.implementation.CheckAvailabilityResponseInner;

/**
 * Type representing CheckAvailabilityResponse.
 */
public interface CheckAvailabilityResponse extends HasInner<CheckAvailabilityResponseInner>, HasManager<NetAppManager> {
    /**
     * @return the isAvailable value.
     */
    Boolean isAvailable();

    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the reason value.
     */
    InAvailabilityReasonType reason();

}
