// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UpgradeChannel. */
public final class UpgradeChannel extends ExpandableStringEnum<UpgradeChannel> {
    /** Static value rapid for UpgradeChannel. */
    public static final UpgradeChannel RAPID = fromString("rapid");

    /** Static value stable for UpgradeChannel. */
    public static final UpgradeChannel STABLE = fromString("stable");

    /** Static value patch for UpgradeChannel. */
    public static final UpgradeChannel PATCH = fromString("patch");

    /** Static value node-image for UpgradeChannel. */
    public static final UpgradeChannel NODE_IMAGE = fromString("node-image");

    /** Static value none for UpgradeChannel. */
    public static final UpgradeChannel NONE = fromString("none");

    /**
     * Creates or finds a UpgradeChannel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpgradeChannel.
     */
    @JsonCreator
    public static UpgradeChannel fromString(String name) {
        return fromString(name, UpgradeChannel.class);
    }

    /** @return known UpgradeChannel values. */
    public static Collection<UpgradeChannel> values() {
        return values(UpgradeChannel.class);
    }
}
