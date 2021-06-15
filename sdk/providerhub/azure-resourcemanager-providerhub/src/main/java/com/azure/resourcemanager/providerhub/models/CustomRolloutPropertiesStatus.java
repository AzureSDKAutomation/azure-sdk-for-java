// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.Map;

/** The CustomRolloutPropertiesStatus model. */
@Immutable
public final class CustomRolloutPropertiesStatus extends CustomRolloutStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomRolloutPropertiesStatus.class);

    /** {@inheritDoc} */
    @Override
    public CustomRolloutPropertiesStatus withCompletedRegions(List<String> completedRegions) {
        super.withCompletedRegions(completedRegions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomRolloutPropertiesStatus withFailedOrSkippedRegions(
        Map<String, ExtendedErrorInfo> failedOrSkippedRegions) {
        super.withFailedOrSkippedRegions(failedOrSkippedRegions);
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
