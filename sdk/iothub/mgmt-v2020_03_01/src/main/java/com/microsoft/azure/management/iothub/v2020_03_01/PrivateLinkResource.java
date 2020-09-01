/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iothub.v2020_03_01.implementation.DevicesManager;
import com.microsoft.azure.management.iothub.v2020_03_01.implementation.PrivateLinkResourceInner;
import com.microsoft.azure.management.iothub.v2020_03_01.implementation.GroupIdInformationInner;
import java.util.List;

/**
 * Type representing PrivateLinkResource.
 */
public interface PrivateLinkResource extends HasInner<PrivateLinkResourceInner>, HasManager<DevicesManager> {
    /**
     * @return the value value.
     */
    List<GroupIdInformationInner> value();

}
