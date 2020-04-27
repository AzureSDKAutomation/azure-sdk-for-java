/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ADHybridHealthServiceManager;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ReplicationStatusInner;

/**
 * Type representing ReplicationStatus.
 */
public interface ReplicationStatus extends HasInner<ReplicationStatusInner>, HasManager<ADHybridHealthServiceManager> {
    /**
     * @return the errorDcCount value.
     */
    Integer errorDcCount();

    /**
     * @return the forestName value.
     */
    String forestName();

    /**
     * @return the totalDcCount value.
     */
    Integer totalDcCount();

}
