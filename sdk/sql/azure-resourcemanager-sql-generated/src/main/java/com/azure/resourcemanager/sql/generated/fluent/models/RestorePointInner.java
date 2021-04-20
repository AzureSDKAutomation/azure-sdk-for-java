// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.RestorePointType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Database restore points. */
@JsonFlatten
@Immutable
public class RestorePointInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorePointInner.class);

    /*
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * The type of restore point
     */
    @JsonProperty(value = "properties.restorePointType", access = JsonProperty.Access.WRITE_ONLY)
    private RestorePointType restorePointType;

    /*
     * The earliest time to which this database can be restored
     */
    @JsonProperty(value = "properties.earliestRestoreDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime earliestRestoreDate;

    /*
     * The time the backup was taken
     */
    @JsonProperty(value = "properties.restorePointCreationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime restorePointCreationDate;

    /*
     * The label of restore point for backup request by user
     */
    @JsonProperty(value = "properties.restorePointLabel", access = JsonProperty.Access.WRITE_ONLY)
    private String restorePointLabel;

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the restorePointType property: The type of restore point.
     *
     * @return the restorePointType value.
     */
    public RestorePointType restorePointType() {
        return this.restorePointType;
    }

    /**
     * Get the earliestRestoreDate property: The earliest time to which this database can be restored.
     *
     * @return the earliestRestoreDate value.
     */
    public OffsetDateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

    /**
     * Get the restorePointCreationDate property: The time the backup was taken.
     *
     * @return the restorePointCreationDate value.
     */
    public OffsetDateTime restorePointCreationDate() {
        return this.restorePointCreationDate;
    }

    /**
     * Get the restorePointLabel property: The label of restore point for backup request by user.
     *
     * @return the restorePointLabel value.
     */
    public String restorePointLabel() {
        return this.restorePointLabel;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
