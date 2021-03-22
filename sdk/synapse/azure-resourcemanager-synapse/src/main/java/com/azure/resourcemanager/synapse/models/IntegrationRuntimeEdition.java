// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IntegrationRuntimeEdition. */
public final class IntegrationRuntimeEdition extends ExpandableStringEnum<IntegrationRuntimeEdition> {
    /** Static value Standard for IntegrationRuntimeEdition. */
    public static final IntegrationRuntimeEdition STANDARD = fromString("Standard");

    /** Static value Enterprise for IntegrationRuntimeEdition. */
    public static final IntegrationRuntimeEdition ENTERPRISE = fromString("Enterprise");

    /**
     * Creates or finds a IntegrationRuntimeEdition from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IntegrationRuntimeEdition.
     */
    @JsonCreator
    public static IntegrationRuntimeEdition fromString(String name) {
        return fromString(name, IntegrationRuntimeEdition.class);
    }

    /** @return known IntegrationRuntimeEdition values. */
    public static Collection<IntegrationRuntimeEdition> values() {
        return values(IntegrationRuntimeEdition.class);
    }
}
