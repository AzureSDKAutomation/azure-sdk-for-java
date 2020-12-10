// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The MongoDBDatabaseGetPropertiesOptions model. */
@Immutable
public final class MongoDBDatabaseGetPropertiesOptions extends OptionsResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MongoDBDatabaseGetPropertiesOptions.class);

    /** {@inheritDoc} */
    @Override
    public MongoDBDatabaseGetPropertiesOptions withThroughput(Integer throughput) {
        super.withThroughput(throughput);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDBDatabaseGetPropertiesOptions withAutoscaleSettings(AutoscaleSettings autoscaleSettings) {
        super.withAutoscaleSettings(autoscaleSettings);
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
