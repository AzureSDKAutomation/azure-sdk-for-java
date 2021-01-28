// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RestoreRequestType. */
public final class RestoreRequestType extends ExpandableStringEnum<RestoreRequestType> {
    /** Static value Invalid for RestoreRequestType. */
    public static final RestoreRequestType INVALID = fromString("Invalid");

    /** Static value FullShareRestore for RestoreRequestType. */
    public static final RestoreRequestType FULL_SHARE_RESTORE = fromString("FullShareRestore");

    /** Static value ItemLevelRestore for RestoreRequestType. */
    public static final RestoreRequestType ITEM_LEVEL_RESTORE = fromString("ItemLevelRestore");

    /**
     * Creates or finds a RestoreRequestType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RestoreRequestType.
     */
    @JsonCreator
    public static RestoreRequestType fromString(String name) {
        return fromString(name, RestoreRequestType.class);
    }

    /** @return known RestoreRequestType values. */
    public static Collection<RestoreRequestType> values() {
        return values(RestoreRequestType.class);
    }
}
