/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ReplicationSummaryInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ADHybridHealthServiceManager;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing ReplicationSummary.
 */
public interface ReplicationSummary extends HasInner<ReplicationSummaryInner>, HasManager<ADHybridHealthServiceManager> {
    /**
     * @return the domain value.
     */
    String domain();

    /**
     * @return the inboundNeighborCollection value.
     */
    List<InboundReplicationNeighbor> inboundNeighborCollection();

    /**
     * @return the lastAttemptedSync value.
     */
    DateTime lastAttemptedSync();

    /**
     * @return the lastSuccessfulSync value.
     */
    DateTime lastSuccessfulSync();

    /**
     * @return the site value.
     */
    String site();

    /**
     * @return the status value.
     */
    Integer status();

    /**
     * @return the targetServer value.
     */
    String targetServer();

}
