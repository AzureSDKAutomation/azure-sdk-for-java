// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.ProcessThreadInfoInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of ProcessThreadInfo. */
public interface ProcessThreadInfo {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the identifier property: Site extension ID.
     *
     * @return the identifier value.
     */
    Integer identifier();

    /**
     * Gets the href property: HRef URI.
     *
     * @return the href value.
     */
    String href();

    /**
     * Gets the process property: Process URI.
     *
     * @return the process value.
     */
    String process();

    /**
     * Gets the startAddress property: Start address.
     *
     * @return the startAddress value.
     */
    String startAddress();

    /**
     * Gets the currentPriority property: Current thread priority.
     *
     * @return the currentPriority value.
     */
    Integer currentPriority();

    /**
     * Gets the priorityLevel property: Thread priority level.
     *
     * @return the priorityLevel value.
     */
    String priorityLevel();

    /**
     * Gets the basePriority property: Base priority.
     *
     * @return the basePriority value.
     */
    Integer basePriority();

    /**
     * Gets the startTime property: Start time.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the totalProcessorTime property: Total processor time.
     *
     * @return the totalProcessorTime value.
     */
    String totalProcessorTime();

    /**
     * Gets the userProcessorTime property: User processor time.
     *
     * @return the userProcessorTime value.
     */
    String userProcessorTime();

    /**
     * Gets the state property: Thread state.
     *
     * @return the state value.
     */
    String state();

    /**
     * Gets the waitReason property: Wait reason.
     *
     * @return the waitReason value.
     */
    String waitReason();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.ProcessThreadInfoInner object.
     *
     * @return the inner object.
     */
    ProcessThreadInfoInner innerModel();
}
