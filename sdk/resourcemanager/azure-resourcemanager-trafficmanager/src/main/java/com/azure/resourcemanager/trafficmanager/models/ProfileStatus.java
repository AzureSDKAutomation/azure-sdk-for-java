// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProfileStatus. */
public final class ProfileStatus extends ExpandableStringEnum<ProfileStatus> {
    /** Static value Enabled for ProfileStatus. */
    public static final ProfileStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for ProfileStatus. */
    public static final ProfileStatus DISABLED = fromString("Disabled");

    /**
     * Creates or finds a ProfileStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProfileStatus.
     */
    @JsonCreator
    public static ProfileStatus fromString(String name) {
        return fromString(name, ProfileStatus.class);
    }

    /** @return known ProfileStatus values. */
    public static Collection<ProfileStatus> values() {
        return values(ProfileStatus.class);
    }
}
