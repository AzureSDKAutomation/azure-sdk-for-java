/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ApiType;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.RestorableLocationResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ARMResourceProperties;

/**
 * A Azure Cosmos DB restorable database account.
 */
@JsonFlatten
public class RestorableDatabaseAccountGetResultInner extends ARMResourceProperties {
    /**
     * The name of the global database account.
     */
    @JsonProperty(value = "properties.accountName")
    private String accountName;

    /**
     * The creation time of the restorable database account (ISO-8601 format).
     */
    @JsonProperty(value = "properties.creationTime")
    private DateTime creationTime;

    /**
     * The time at which the restorable database account has been deleted
     * (ISO-8601 format).
     */
    @JsonProperty(value = "properties.deletionTime")
    private DateTime deletionTime;

    /**
     * Enum to indicate the API type of the restorable database account.
     * Possible values include: 'None', 'MongoDB', 'Gremlin', 'Cassandra',
     * 'Table', 'Sql', 'Etcd', 'GremlinV2'.
     */
    @JsonProperty(value = "properties.apiType", access = JsonProperty.Access.WRITE_ONLY)
    private ApiType apiType;

    /**
     * List of regions where the of the database account can be restored from.
     */
    @JsonProperty(value = "properties.restorableLocations", access = JsonProperty.Access.WRITE_ONLY)
    private List<RestorableLocationResource> restorableLocations;

    /**
     * Get the name of the global database account.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the name of the global database account.
     *
     * @param accountName the accountName value to set
     * @return the RestorableDatabaseAccountGetResultInner object itself.
     */
    public RestorableDatabaseAccountGetResultInner withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the creation time of the restorable database account (ISO-8601 format).
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creation time of the restorable database account (ISO-8601 format).
     *
     * @param creationTime the creationTime value to set
     * @return the RestorableDatabaseAccountGetResultInner object itself.
     */
    public RestorableDatabaseAccountGetResultInner withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the time at which the restorable database account has been deleted (ISO-8601 format).
     *
     * @return the deletionTime value
     */
    public DateTime deletionTime() {
        return this.deletionTime;
    }

    /**
     * Set the time at which the restorable database account has been deleted (ISO-8601 format).
     *
     * @param deletionTime the deletionTime value to set
     * @return the RestorableDatabaseAccountGetResultInner object itself.
     */
    public RestorableDatabaseAccountGetResultInner withDeletionTime(DateTime deletionTime) {
        this.deletionTime = deletionTime;
        return this;
    }

    /**
     * Get enum to indicate the API type of the restorable database account. Possible values include: 'None', 'MongoDB', 'Gremlin', 'Cassandra', 'Table', 'Sql', 'Etcd', 'GremlinV2'.
     *
     * @return the apiType value
     */
    public ApiType apiType() {
        return this.apiType;
    }

    /**
     * Get list of regions where the of the database account can be restored from.
     *
     * @return the restorableLocations value
     */
    public List<RestorableLocationResource> restorableLocations() {
        return this.restorableLocations;
    }

}
