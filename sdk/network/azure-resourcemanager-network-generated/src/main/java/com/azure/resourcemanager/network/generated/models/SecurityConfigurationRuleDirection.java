// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SecurityConfigurationRuleDirection. */
public final class SecurityConfigurationRuleDirection extends ExpandableStringEnum<SecurityConfigurationRuleDirection> {
    /** Static value Inbound for SecurityConfigurationRuleDirection. */
    public static final SecurityConfigurationRuleDirection INBOUND = fromString("Inbound");

    /** Static value Outbound for SecurityConfigurationRuleDirection. */
    public static final SecurityConfigurationRuleDirection OUTBOUND = fromString("Outbound");

    /**
     * Creates or finds a SecurityConfigurationRuleDirection from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecurityConfigurationRuleDirection.
     */
    @JsonCreator
    public static SecurityConfigurationRuleDirection fromString(String name) {
        return fromString(name, SecurityConfigurationRuleDirection.class);
    }

    /** @return known SecurityConfigurationRuleDirection values. */
    public static Collection<SecurityConfigurationRuleDirection> values() {
        return values(SecurityConfigurationRuleDirection.class);
    }
}
