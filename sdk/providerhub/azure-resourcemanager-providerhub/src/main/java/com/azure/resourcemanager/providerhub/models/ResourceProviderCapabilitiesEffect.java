// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResourceProviderCapabilitiesEffect. */
public final class ResourceProviderCapabilitiesEffect extends ExpandableStringEnum<ResourceProviderCapabilitiesEffect> {
    /** Static value NotSpecified for ResourceProviderCapabilitiesEffect. */
    public static final ResourceProviderCapabilitiesEffect NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Allow for ResourceProviderCapabilitiesEffect. */
    public static final ResourceProviderCapabilitiesEffect ALLOW = fromString("Allow");

    /** Static value Disallow for ResourceProviderCapabilitiesEffect. */
    public static final ResourceProviderCapabilitiesEffect DISALLOW = fromString("Disallow");

    /**
     * Creates or finds a ResourceProviderCapabilitiesEffect from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceProviderCapabilitiesEffect.
     */
    @JsonCreator
    public static ResourceProviderCapabilitiesEffect fromString(String name) {
        return fromString(name, ResourceProviderCapabilitiesEffect.class);
    }

    /** @return known ResourceProviderCapabilitiesEffect values. */
    public static Collection<ResourceProviderCapabilitiesEffect> values() {
        return values(ResourceProviderCapabilitiesEffect.class);
    }
}
