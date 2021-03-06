// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Defines the Sql Database resource settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType")
@JsonTypeName("Microsoft.Sql/servers/databases")
@Fluent
public final class SqlDatabaseResourceSettings extends ResourceSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlDatabaseResourceSettings.class);

    /*
     * Defines the zone redundant resource setting.
     */
    @JsonProperty(value = "zoneRedundant")
    private ZoneRedundant zoneRedundant;

    /**
     * Get the zoneRedundant property: Defines the zone redundant resource setting.
     *
     * @return the zoneRedundant value.
     */
    public ZoneRedundant zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set the zoneRedundant property: Defines the zone redundant resource setting.
     *
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the SqlDatabaseResourceSettings object itself.
     */
    public SqlDatabaseResourceSettings withZoneRedundant(ZoneRedundant zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDatabaseResourceSettings withTargetResourceName(String targetResourceName) {
        super.withTargetResourceName(targetResourceName);
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
