/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kubernetesconfiguration.v2020_07_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OperatorScopeType.
 */
public final class OperatorScopeType extends ExpandableStringEnum<OperatorScopeType> {
    /** Static value cluster for OperatorScopeType. */
    public static final OperatorScopeType CLUSTER = fromString("cluster");

    /** Static value namespace for OperatorScopeType. */
    public static final OperatorScopeType NAMESPACE = fromString("namespace");

    /**
     * Creates or finds a OperatorScopeType from its string representation.
     * @param name a name to look for
     * @return the corresponding OperatorScopeType
     */
    @JsonCreator
    public static OperatorScopeType fromString(String name) {
        return fromString(name, OperatorScopeType.class);
    }

    /**
     * @return known OperatorScopeType values
     */
    public static Collection<OperatorScopeType> values() {
        return values(OperatorScopeType.class);
    }
}
