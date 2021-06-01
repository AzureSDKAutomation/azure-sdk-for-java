// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResourceProviderManagementResourceAccessPolicy. */
public final class ResourceProviderManagementResourceAccessPolicy
    extends ExpandableStringEnum<ResourceProviderManagementResourceAccessPolicy> {
    /** Static value NotSpecified for ResourceProviderManagementResourceAccessPolicy. */
    public static final ResourceProviderManagementResourceAccessPolicy NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value AcisReadAllowed for ResourceProviderManagementResourceAccessPolicy. */
    public static final ResourceProviderManagementResourceAccessPolicy ACIS_READ_ALLOWED =
        fromString("AcisReadAllowed");

    /** Static value AcisActionAllowed for ResourceProviderManagementResourceAccessPolicy. */
    public static final ResourceProviderManagementResourceAccessPolicy ACIS_ACTION_ALLOWED =
        fromString("AcisActionAllowed");

    /**
     * Creates or finds a ResourceProviderManagementResourceAccessPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceProviderManagementResourceAccessPolicy.
     */
    @JsonCreator
    public static ResourceProviderManagementResourceAccessPolicy fromString(String name) {
        return fromString(name, ResourceProviderManagementResourceAccessPolicy.class);
    }

    /** @return known ResourceProviderManagementResourceAccessPolicy values. */
    public static Collection<ResourceProviderManagementResourceAccessPolicy> values() {
        return values(ResourceProviderManagementResourceAccessPolicy.class);
    }
}
