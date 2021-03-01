// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.models.PremiumMessagingRegionProperties;
import com.azure.resourcemanager.servicebus.generated.models.ResourceNamespacePatch;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Premium Messaging Region. */
@Fluent
public final class PremiumMessagingRegionInner extends ResourceNamespacePatch {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PremiumMessagingRegionInner.class);

    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private PremiumMessagingRegionProperties properties;

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public PremiumMessagingRegionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the PremiumMessagingRegionInner object itself.
     */
    public PremiumMessagingRegionInner withProperties(PremiumMessagingRegionProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PremiumMessagingRegionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PremiumMessagingRegionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (properties() != null) {
            properties().validate();
        }
    }
}
