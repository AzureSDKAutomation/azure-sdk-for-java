/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation.EventhubInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation.ServiceBusManager;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing Eventhub.
 */
public interface Eventhub extends HasInner<EventhubInner>, HasManager<ServiceBusManager> {
    /**
     * @return the captureDescription value.
     */
    CaptureDescription captureDescription();

    /**
     * @return the createdAt value.
     */
    DateTime createdAt();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the messageRetentionInDays value.
     */
    Long messageRetentionInDays();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the partitionCount value.
     */
    Long partitionCount();

    /**
     * @return the partitionIds value.
     */
    List<String> partitionIds();

    /**
     * @return the status value.
     */
    EntityStatus status();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the updatedAt value.
     */
    DateTime updatedAt();

}
