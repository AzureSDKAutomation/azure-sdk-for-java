// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.Duration;
import java.util.List;

/** The DefaultRolloutSpecificationLowTraffic model. */
@Immutable
public final class DefaultRolloutSpecificationLowTraffic extends TrafficRegionRolloutConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DefaultRolloutSpecificationLowTraffic.class);

    /** {@inheritDoc} */
    @Override
    public DefaultRolloutSpecificationLowTraffic withWaitDuration(Duration waitDuration) {
        super.withWaitDuration(waitDuration);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DefaultRolloutSpecificationLowTraffic withRegions(List<String> regions) {
        super.withRegions(regions);
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
