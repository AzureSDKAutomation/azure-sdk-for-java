// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NotificationLevel. */
public final class NotificationLevel extends ExpandableStringEnum<NotificationLevel> {
    /** Static value None for NotificationLevel. */
    public static final NotificationLevel NONE = fromString("None");

    /** Static value Critical for NotificationLevel. */
    public static final NotificationLevel CRITICAL = fromString("Critical");

    /** Static value All for NotificationLevel. */
    public static final NotificationLevel ALL = fromString("All");

    /**
     * Creates or finds a NotificationLevel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NotificationLevel.
     */
    @JsonCreator
    public static NotificationLevel fromString(String name) {
        return fromString(name, NotificationLevel.class);
    }

    /** @return known NotificationLevel values. */
    public static Collection<NotificationLevel> values() {
        return values(NotificationLevel.class);
    }
}
