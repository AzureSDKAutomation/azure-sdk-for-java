/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2019_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PreferredContactMethod.
 */
public final class PreferredContactMethod extends ExpandableStringEnum<PreferredContactMethod> {
    /** Static value email for PreferredContactMethod. */
    public static final PreferredContactMethod EMAIL = fromString("email");

    /** Static value phone for PreferredContactMethod. */
    public static final PreferredContactMethod PHONE = fromString("phone");

    /**
     * Creates or finds a PreferredContactMethod from its string representation.
     * @param name a name to look for
     * @return the corresponding PreferredContactMethod
     */
    @JsonCreator
    public static PreferredContactMethod fromString(String name) {
        return fromString(name, PreferredContactMethod.class);
    }

    /**
     * @return known PreferredContactMethod values
     */
    public static Collection<PreferredContactMethod> values() {
        return values(PreferredContactMethod.class);
    }
}
