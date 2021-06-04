// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EnablementRules. */
public final class EnablementRules extends ExpandableStringEnum<EnablementRules> {
    /** Static value MultiFactorAuthentication for EnablementRules. */
    public static final EnablementRules MULTI_FACTOR_AUTHENTICATION = fromString("MultiFactorAuthentication");

    /** Static value Justification for EnablementRules. */
    public static final EnablementRules JUSTIFICATION = fromString("Justification");

    /** Static value Ticketing for EnablementRules. */
    public static final EnablementRules TICKETING = fromString("Ticketing");

    /**
     * Creates or finds a EnablementRules from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EnablementRules.
     */
    @JsonCreator
    public static EnablementRules fromString(String name) {
        return fromString(name, EnablementRules.class);
    }

    /** @return known EnablementRules values. */
    public static Collection<EnablementRules> values() {
        return values(EnablementRules.class);
    }
}
