/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.databox.implementation.DataBoxManager;
import com.microsoft.azure.management.databox.implementation.RegionConfigurationResponseInner;

/**
 * Type representing RegionConfigurationResponse.
 */
public interface RegionConfigurationResponse extends HasInner<RegionConfigurationResponseInner>, HasManager<DataBoxManager> {
    /**
     * @return the scheduleAvailabilityResponse value.
     */
    ScheduleAvailabilityResponse scheduleAvailabilityResponse();

    /**
     * @return the transportAvailabilityResponse value.
     */
    TransportAvailabilityResponse transportAvailabilityResponse();

}
