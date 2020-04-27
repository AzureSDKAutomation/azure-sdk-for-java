/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ExportStatusInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ADHybridHealthServiceManager;
import org.joda.time.DateTime;
import java.util.UUID;

/**
 * Type representing ServicememberServiceExportStatus.
 */
public interface ServicememberServiceExportStatus extends HasInner<ExportStatusInner>, HasManager<ADHybridHealthServiceManager> {
    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the runStepResultId value.
     */
    String runStepResultId();

    /**
     * @return the serviceId value.
     */
    UUID serviceId();

    /**
     * @return the serviceMemberId value.
     */
    UUID serviceMemberId();

}
