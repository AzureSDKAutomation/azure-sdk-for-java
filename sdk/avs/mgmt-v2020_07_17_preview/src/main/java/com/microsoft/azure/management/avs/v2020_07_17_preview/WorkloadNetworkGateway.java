/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.avs.v2020_07_17_preview.implementation.AVSManager;
import com.microsoft.azure.management.avs.v2020_07_17_preview.implementation.WorkloadNetworkGatewayInner;

/**
 * Type representing WorkloadNetworkGateway.
 */
public interface WorkloadNetworkGateway extends HasInner<WorkloadNetworkGatewayInner>, HasManager<AVSManager> {
    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the path value.
     */
    String path();

    /**
     * @return the type value.
     */
    String type();

}
