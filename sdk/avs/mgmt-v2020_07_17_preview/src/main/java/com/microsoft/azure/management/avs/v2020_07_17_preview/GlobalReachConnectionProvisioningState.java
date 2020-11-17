/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for GlobalReachConnectionProvisioningState.
 */
public final class GlobalReachConnectionProvisioningState extends ExpandableStringEnum<GlobalReachConnectionProvisioningState> {
    /** Static value Succeeded for GlobalReachConnectionProvisioningState. */
    public static final GlobalReachConnectionProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for GlobalReachConnectionProvisioningState. */
    public static final GlobalReachConnectionProvisioningState FAILED = fromString("Failed");

    /** Static value Updating for GlobalReachConnectionProvisioningState. */
    public static final GlobalReachConnectionProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates or finds a GlobalReachConnectionProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding GlobalReachConnectionProvisioningState
     */
    @JsonCreator
    public static GlobalReachConnectionProvisioningState fromString(String name) {
        return fromString(name, GlobalReachConnectionProvisioningState.class);
    }

    /**
     * @return known GlobalReachConnectionProvisioningState values
     */
    public static Collection<GlobalReachConnectionProvisioningState> values() {
        return values(GlobalReachConnectionProvisioningState.class);
    }
}
