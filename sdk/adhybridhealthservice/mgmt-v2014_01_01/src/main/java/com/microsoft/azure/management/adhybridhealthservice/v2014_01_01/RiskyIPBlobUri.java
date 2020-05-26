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
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.RiskyIPBlobUriInner;
import org.joda.time.DateTime;

/**
 * Type representing RiskyIPBlobUri.
 */
public interface RiskyIPBlobUri extends HasInner<RiskyIPBlobUriInner>, HasManager<ADHybridHealthServiceManager> {
    /**
     * @return the blobCreateDateTime value.
     */
    DateTime blobCreateDateTime();

    /**
     * @return the jobCompletionTime value.
     */
    DateTime jobCompletionTime();

    /**
     * @return the resultSasUri value.
     */
    String resultSasUri();

    /**
     * @return the serviceId value.
     */
    String serviceId();

    /**
     * @return the status value.
     */
    String status();

    /**
     * @return the tenantId value.
     */
    String tenantId();

}
