/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2020_07_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties describing the filtering behavior of the event grid filter.
 */
public class EventFilter {
    /**
     * The subject prefix used for filtering events.
     */
    @JsonProperty(value = "subjectBeginsWith", access = JsonProperty.Access.WRITE_ONLY)
    private String subjectBeginsWith;

    /**
     * The subject suffix used for filtering events.
     */
    @JsonProperty(value = "subjectEndsWith", access = JsonProperty.Access.WRITE_ONLY)
    private String subjectEndsWith;

    /**
     * The event types that will be sent to Event Grid.
     */
    @JsonProperty(value = "includedEventTypes")
    private List<String> includedEventTypes;

    /**
     * Get the subject prefix used for filtering events.
     *
     * @return the subjectBeginsWith value
     */
    public String subjectBeginsWith() {
        return this.subjectBeginsWith;
    }

    /**
     * Get the subject suffix used for filtering events.
     *
     * @return the subjectEndsWith value
     */
    public String subjectEndsWith() {
        return this.subjectEndsWith;
    }

    /**
     * Get the event types that will be sent to Event Grid.
     *
     * @return the includedEventTypes value
     */
    public List<String> includedEventTypes() {
        return this.includedEventTypes;
    }

    /**
     * Set the event types that will be sent to Event Grid.
     *
     * @param includedEventTypes the includedEventTypes value to set
     * @return the EventFilter object itself.
     */
    public EventFilter withIncludedEventTypes(List<String> includedEventTypes) {
        this.includedEventTypes = includedEventTypes;
        return this;
    }

}
