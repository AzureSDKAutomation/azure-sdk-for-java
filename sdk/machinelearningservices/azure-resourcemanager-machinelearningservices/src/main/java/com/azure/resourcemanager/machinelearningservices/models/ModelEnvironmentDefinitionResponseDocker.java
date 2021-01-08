// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The definition of a Docker container. */
@Immutable
public final class ModelEnvironmentDefinitionResponseDocker extends ModelDockerSectionResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ModelEnvironmentDefinitionResponseDocker.class);

    /** {@inheritDoc} */
    @Override
    public ModelEnvironmentDefinitionResponseDocker withBaseImage(String baseImage) {
        super.withBaseImage(baseImage);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ModelEnvironmentDefinitionResponseDocker withBaseDockerfile(String baseDockerfile) {
        super.withBaseDockerfile(baseDockerfile);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ModelEnvironmentDefinitionResponseDocker withBaseImageRegistry(ContainerRegistryResponse baseImageRegistry) {
        super.withBaseImageRegistry(baseImageRegistry);
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
