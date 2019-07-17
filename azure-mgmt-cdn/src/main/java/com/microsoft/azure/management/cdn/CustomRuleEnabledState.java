/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CustomRuleEnabledState.
 */
public final class CustomRuleEnabledState extends ExpandableStringEnum<CustomRuleEnabledState> {
    /** Static value Disabled for CustomRuleEnabledState. */
    public static final CustomRuleEnabledState DISABLED = fromString("Disabled");

    /** Static value Enabled for CustomRuleEnabledState. */
    public static final CustomRuleEnabledState ENABLED = fromString("Enabled");

    /**
     * Creates or finds a CustomRuleEnabledState from its string representation.
     * @param name a name to look for
     * @return the corresponding CustomRuleEnabledState
     */
    @JsonCreator
    public static CustomRuleEnabledState fromString(String name) {
        return fromString(name, CustomRuleEnabledState.class);
    }

    /**
     * @return known CustomRuleEnabledState values
     */
    public static Collection<CustomRuleEnabledState> values() {
        return values(CustomRuleEnabledState.class);
    }
}
