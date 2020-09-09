/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for InfrastructureEncryption.
 */
public final class InfrastructureEncryption extends ExpandableStringEnum<InfrastructureEncryption> {
    /** Static value Enabled for InfrastructureEncryption. */
    public static final InfrastructureEncryption ENABLED = fromString("Enabled");

    /** Static value Disabled for InfrastructureEncryption. */
    public static final InfrastructureEncryption DISABLED = fromString("Disabled");

    /**
     * Creates or finds a InfrastructureEncryption from its string representation.
     * @param name a name to look for
     * @return the corresponding InfrastructureEncryption
     */
    @JsonCreator
    public static InfrastructureEncryption fromString(String name) {
        return fromString(name, InfrastructureEncryption.class);
    }

    /**
     * @return known InfrastructureEncryption values
     */
    public static Collection<InfrastructureEncryption> values() {
        return values(InfrastructureEncryption.class);
    }
}
