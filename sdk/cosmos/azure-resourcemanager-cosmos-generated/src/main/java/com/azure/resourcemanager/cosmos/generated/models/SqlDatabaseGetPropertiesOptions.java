// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The SqlDatabaseGetPropertiesOptions model. */
@Fluent
public final class SqlDatabaseGetPropertiesOptions extends OptionsResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlDatabaseGetPropertiesOptions.class);

    /** {@inheritDoc} */
    @Override
    public SqlDatabaseGetPropertiesOptions withThroughput(Integer throughput) {
        super.withThroughput(throughput);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDatabaseGetPropertiesOptions withAutoscaleSettings(AutoscaleSettings autoscaleSettings) {
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
