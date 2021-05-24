// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of the regional restorable account. */
@Immutable
public final class RestorableLocationResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorableLocationResource.class);

    /*
     * The location of the regional restorable account.
     */
    @JsonProperty(value = "locationName", access = JsonProperty.Access.WRITE_ONLY)
    private String locationName;

    /*
     * The instance id of the regional restorable account.
     */
    @JsonProperty(value = "regionalDatabaseAccountInstanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String regionalDatabaseAccountInstanceId;

    /*
     * The creation time of the regional restorable database account (ISO-8601
     * format).
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * The time at which the regional restorable database account has been
     * deleted (ISO-8601 format).
     */
    @JsonProperty(value = "deletionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime deletionTime;

    /**
     * Get the locationName property: The location of the regional restorable account.
     *
     * @return the locationName value.
     */
    public String locationName() {
        return this.locationName;
    }

    /**
     * Get the regionalDatabaseAccountInstanceId property: The instance id of the regional restorable account.
     *
     * @return the regionalDatabaseAccountInstanceId value.
     */
    public String regionalDatabaseAccountInstanceId() {
        return this.regionalDatabaseAccountInstanceId;
    }

    /**
     * Get the creationTime property: The creation time of the regional restorable database account (ISO-8601 format).
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the deletionTime property: The time at which the regional restorable database account has been deleted
     * (ISO-8601 format).
     *
     * @return the deletionTime value.
     */
    public OffsetDateTime deletionTime() {
        return this.deletionTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
