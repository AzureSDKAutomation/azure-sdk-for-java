// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cloudshell.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cloudshell.models.ConsoleProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Cloud shell console. */
@Fluent
public final class CloudShellConsoleInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudShellConsoleInner.class);

    /*
     * Cloud shell console properties.
     */
    @JsonProperty(value = "properties", required = true)
    private ConsoleProperties properties;

    /**
     * Get the properties property: Cloud shell console properties.
     *
     * @return the properties value.
     */
    public ConsoleProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Cloud shell console properties.
     *
     * @param properties the properties value to set.
     * @return the CloudShellConsoleInner object itself.
     */
    public CloudShellConsoleInner withProperties(ConsoleProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CloudShellConsoleInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CloudShellConsoleInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model CloudShellConsoleInner"));
        } else {
            properties().validate();
        }
    }
}
