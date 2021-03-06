// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EventsOutOfOrderPolicy. */
public final class EventsOutOfOrderPolicy extends ExpandableStringEnum<EventsOutOfOrderPolicy> {
    /** Static value Adjust for EventsOutOfOrderPolicy. */
    public static final EventsOutOfOrderPolicy ADJUST = fromString("Adjust");

    /** Static value Drop for EventsOutOfOrderPolicy. */
    public static final EventsOutOfOrderPolicy DROP = fromString("Drop");

    /**
     * Creates or finds a EventsOutOfOrderPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventsOutOfOrderPolicy.
     */
    @JsonCreator
    public static EventsOutOfOrderPolicy fromString(String name) {
        return fromString(name, EventsOutOfOrderPolicy.class);
    }

    /** @return known EventsOutOfOrderPolicy values. */
    public static Collection<EventsOutOfOrderPolicy> values() {
        return values(EventsOutOfOrderPolicy.class);
    }
}
