// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OperationsDefinitionActionType. */
public final class OperationsDefinitionActionType extends ExpandableStringEnum<OperationsDefinitionActionType> {
    /** Static value NotSpecified for OperationsDefinitionActionType. */
    public static final OperationsDefinitionActionType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Internal for OperationsDefinitionActionType. */
    public static final OperationsDefinitionActionType INTERNAL = fromString("Internal");

    /**
     * Creates or finds a OperationsDefinitionActionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationsDefinitionActionType.
     */
    @JsonCreator
    public static OperationsDefinitionActionType fromString(String name) {
        return fromString(name, OperationsDefinitionActionType.class);
    }

    /** @return known OperationsDefinitionActionType values. */
    public static Collection<OperationsDefinitionActionType> values() {
        return values(OperationsDefinitionActionType.class);
    }
}
