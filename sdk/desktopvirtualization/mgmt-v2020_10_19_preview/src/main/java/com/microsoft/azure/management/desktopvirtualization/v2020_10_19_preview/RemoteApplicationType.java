/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RemoteApplicationType.
 */
public final class RemoteApplicationType extends ExpandableStringEnum<RemoteApplicationType> {
    /** Static value InBuilt for RemoteApplicationType. */
    public static final RemoteApplicationType IN_BUILT = fromString("InBuilt");

    /** Static value MsixApplication for RemoteApplicationType. */
    public static final RemoteApplicationType MSIX_APPLICATION = fromString("MsixApplication");

    /**
     * Creates or finds a RemoteApplicationType from its string representation.
     * @param name a name to look for
     * @return the corresponding RemoteApplicationType
     */
    @JsonCreator
    public static RemoteApplicationType fromString(String name) {
        return fromString(name, RemoteApplicationType.class);
    }

    /**
     * @return known RemoteApplicationType values
     */
    public static Collection<RemoteApplicationType> values() {
        return values(RemoteApplicationType.class);
    }
}
