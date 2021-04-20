// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DnsRefreshConfigurationPropertiesStatus. */
public final class DnsRefreshConfigurationPropertiesStatus
    extends ExpandableStringEnum<DnsRefreshConfigurationPropertiesStatus> {
    /** Static value Succeeded for DnsRefreshConfigurationPropertiesStatus. */
    public static final DnsRefreshConfigurationPropertiesStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for DnsRefreshConfigurationPropertiesStatus. */
    public static final DnsRefreshConfigurationPropertiesStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a DnsRefreshConfigurationPropertiesStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DnsRefreshConfigurationPropertiesStatus.
     */
    @JsonCreator
    public static DnsRefreshConfigurationPropertiesStatus fromString(String name) {
        return fromString(name, DnsRefreshConfigurationPropertiesStatus.class);
    }

    /** @return known DnsRefreshConfigurationPropertiesStatus values. */
    public static Collection<DnsRefreshConfigurationPropertiesStatus> values() {
        return values(DnsRefreshConfigurationPropertiesStatus.class);
    }
}
