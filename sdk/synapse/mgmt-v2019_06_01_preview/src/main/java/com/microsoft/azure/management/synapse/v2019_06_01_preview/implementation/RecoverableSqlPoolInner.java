/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A recoverable sql pool.
 */
@JsonFlatten
public class RecoverableSqlPoolInner extends ProxyResource {
    /**
     * The edition of the database.
     */
    @JsonProperty(value = "properties.edition", access = JsonProperty.Access.WRITE_ONLY)
    private String edition;

    /**
     * The service level objective name of the database.
     */
    @JsonProperty(value = "properties.serviceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceLevelObjective;

    /**
     * The elastic pool name of the database.
     */
    @JsonProperty(value = "properties.elasticPoolName", access = JsonProperty.Access.WRITE_ONLY)
    private String elasticPoolName;

    /**
     * The last available backup date of the database (ISO8601 format).
     */
    @JsonProperty(value = "properties.lastAvailableBackupDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastAvailableBackupDate;

    /**
     * Get the edition of the database.
     *
     * @return the edition value
     */
    public String edition() {
        return this.edition;
    }

    /**
     * Get the service level objective name of the database.
     *
     * @return the serviceLevelObjective value
     */
    public String serviceLevelObjective() {
        return this.serviceLevelObjective;
    }

    /**
     * Get the elastic pool name of the database.
     *
     * @return the elasticPoolName value
     */
    public String elasticPoolName() {
        return this.elasticPoolName;
    }

    /**
     * Get the last available backup date of the database (ISO8601 format).
     *
     * @return the lastAvailableBackupDate value
     */
    public DateTime lastAvailableBackupDate() {
        return this.lastAvailableBackupDate;
    }

}
