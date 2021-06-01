// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/** The SkuResourceProperties model. */
@Immutable
public final class SkuResourceProperties extends ResourceTypeSku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuResourceProperties.class);

    /** {@inheritDoc} */
    @Override
    public SkuResourceProperties withSkuSettings(List<SkuSetting> skuSettings) {
        super.withSkuSettings(skuSettings);
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
