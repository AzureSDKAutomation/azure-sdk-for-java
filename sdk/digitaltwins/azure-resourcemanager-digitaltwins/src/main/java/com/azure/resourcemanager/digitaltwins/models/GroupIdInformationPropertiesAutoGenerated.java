// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/** The GroupIdInformationPropertiesAutoGenerated model. */
@Immutable
public final class GroupIdInformationPropertiesAutoGenerated extends GroupIdInformationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GroupIdInformationPropertiesAutoGenerated.class);

    /** {@inheritDoc} */
    @Override
    public GroupIdInformationPropertiesAutoGenerated withGroupId(String groupId) {
        super.withGroupId(groupId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GroupIdInformationPropertiesAutoGenerated withRequiredMembers(List<String> requiredMembers) {
        super.withRequiredMembers(requiredMembers);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GroupIdInformationPropertiesAutoGenerated withRequiredZoneNames(List<String> requiredZoneNames) {
        super.withRequiredZoneNames(requiredZoneNames);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
