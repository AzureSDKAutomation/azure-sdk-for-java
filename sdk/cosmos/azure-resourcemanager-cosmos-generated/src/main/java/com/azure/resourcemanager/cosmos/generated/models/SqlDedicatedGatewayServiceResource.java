// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.models.ServiceResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Describes the service response property. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "serviceType")
@JsonTypeName("SqlDedicatedGatewayServiceResource")
@Fluent
public final class SqlDedicatedGatewayServiceResource extends ServiceResourceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlDedicatedGatewayServiceResource.class);

    /*
     * SqlDedicatedGateway endpoint for the service.
     */
    @JsonProperty(value = "SqlDedicatedGatewayEndpoint", required = true)
    private String sqlDedicatedGatewayEndpoint;

    /*
     * An array that contains all of the locations for the service.
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<SqlDedicatedGatewayRegionalServiceResource> locations;

    /**
     * Get the sqlDedicatedGatewayEndpoint property: SqlDedicatedGateway endpoint for the service.
     *
     * @return the sqlDedicatedGatewayEndpoint value.
     */
    public String sqlDedicatedGatewayEndpoint() {
        return this.sqlDedicatedGatewayEndpoint;
    }

    /**
     * Set the sqlDedicatedGatewayEndpoint property: SqlDedicatedGateway endpoint for the service.
     *
     * @param sqlDedicatedGatewayEndpoint the sqlDedicatedGatewayEndpoint value to set.
     * @return the SqlDedicatedGatewayServiceResource object itself.
     */
    public SqlDedicatedGatewayServiceResource withSqlDedicatedGatewayEndpoint(String sqlDedicatedGatewayEndpoint) {
        this.sqlDedicatedGatewayEndpoint = sqlDedicatedGatewayEndpoint;
        return this;
    }

    /**
     * Get the locations property: An array that contains all of the locations for the service.
     *
     * @return the locations value.
     */
    public List<SqlDedicatedGatewayRegionalServiceResource> locations() {
        return this.locations;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDedicatedGatewayServiceResource withInstanceSize(ServiceSize instanceSize) {
        super.withInstanceSize(instanceSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDedicatedGatewayServiceResource withInstanceCount(Integer instanceCount) {
        super.withInstanceCount(instanceCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDedicatedGatewayServiceResource withStatus(ServiceStatus status) {
        super.withStatus(status);
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
        if (sqlDedicatedGatewayEndpoint() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sqlDedicatedGatewayEndpoint in model"
                            + " SqlDedicatedGatewayServiceResource"));
        }
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
    }
}
