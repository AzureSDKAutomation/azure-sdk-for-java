/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for InstancePoolLicenseType.
 */
public final class InstancePoolLicenseType extends ExpandableStringEnum<InstancePoolLicenseType> {
    /** Static value LicenseIncluded for InstancePoolLicenseType. */
    public static final InstancePoolLicenseType LICENSE_INCLUDED = fromString("LicenseIncluded");

    /** Static value BasePrice for InstancePoolLicenseType. */
    public static final InstancePoolLicenseType BASE_PRICE = fromString("BasePrice");

    /**
     * Creates or finds a InstancePoolLicenseType from its string representation.
     * @param name a name to look for
     * @return the corresponding InstancePoolLicenseType
     */
    @JsonCreator
    public static InstancePoolLicenseType fromString(String name) {
        return fromString(name, InstancePoolLicenseType.class);
    }

    /**
     * @return known InstancePoolLicenseType values
     */
    public static Collection<InstancePoolLicenseType> values() {
        return values(InstancePoolLicenseType.class);
    }
}
