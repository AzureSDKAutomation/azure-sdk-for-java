// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WebApplicationFirewallEnabledState. */
public final class WebApplicationFirewallEnabledState extends ExpandableStringEnum<WebApplicationFirewallEnabledState> {
    /** Static value Disabled for WebApplicationFirewallEnabledState. */
    public static final WebApplicationFirewallEnabledState DISABLED = fromString("Disabled");

    /** Static value Enabled for WebApplicationFirewallEnabledState. */
    public static final WebApplicationFirewallEnabledState ENABLED = fromString("Enabled");

    /**
     * Creates or finds a WebApplicationFirewallEnabledState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WebApplicationFirewallEnabledState.
     */
    @JsonCreator
    public static WebApplicationFirewallEnabledState fromString(String name) {
        return fromString(name, WebApplicationFirewallEnabledState.class);
    }

    /** @return known WebApplicationFirewallEnabledState values. */
    public static Collection<WebApplicationFirewallEnabledState> values() {
        return values(WebApplicationFirewallEnabledState.class);
    }
}
