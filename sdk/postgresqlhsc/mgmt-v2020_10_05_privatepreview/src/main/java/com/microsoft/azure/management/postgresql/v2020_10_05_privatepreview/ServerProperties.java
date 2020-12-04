/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a server.
 */
public class ServerProperties {
    /**
     * The edition of a server (default: GeneralPurpose). Possible values
     * include: 'GeneralPurpose', 'MemoryOptimized'.
     */
    @JsonProperty(value = "serverEdition")
    private ServerEdition serverEdition;

    /**
     * The storage of a server in MB (max: 2097152 = 2TiB).
     */
    @JsonProperty(value = "storageQuotaInMb")
    private Long storageQuotaInMb;

    /**
     * The vCores count of a server (max: 64).
     */
    @JsonProperty(value = "vCores")
    private Long vCores;

    /**
     * The standby count of a server.
     */
    @JsonProperty(value = "standbyCount")
    private Integer standbyCount;

    /**
     * If public IP is requested or not for a server.
     */
    @JsonProperty(value = "isPublicIpRequested", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isPublicIpRequested;

    /**
     * Get the edition of a server (default: GeneralPurpose). Possible values include: 'GeneralPurpose', 'MemoryOptimized'.
     *
     * @return the serverEdition value
     */
    public ServerEdition serverEdition() {
        return this.serverEdition;
    }

    /**
     * Set the edition of a server (default: GeneralPurpose). Possible values include: 'GeneralPurpose', 'MemoryOptimized'.
     *
     * @param serverEdition the serverEdition value to set
     * @return the ServerProperties object itself.
     */
    public ServerProperties withServerEdition(ServerEdition serverEdition) {
        this.serverEdition = serverEdition;
        return this;
    }

    /**
     * Get the storage of a server in MB (max: 2097152 = 2TiB).
     *
     * @return the storageQuotaInMb value
     */
    public Long storageQuotaInMb() {
        return this.storageQuotaInMb;
    }

    /**
     * Set the storage of a server in MB (max: 2097152 = 2TiB).
     *
     * @param storageQuotaInMb the storageQuotaInMb value to set
     * @return the ServerProperties object itself.
     */
    public ServerProperties withStorageQuotaInMb(Long storageQuotaInMb) {
        this.storageQuotaInMb = storageQuotaInMb;
        return this;
    }

    /**
     * Get the vCores count of a server (max: 64).
     *
     * @return the vCores value
     */
    public Long vCores() {
        return this.vCores;
    }

    /**
     * Set the vCores count of a server (max: 64).
     *
     * @param vCores the vCores value to set
     * @return the ServerProperties object itself.
     */
    public ServerProperties withVCores(Long vCores) {
        this.vCores = vCores;
        return this;
    }

    /**
     * Get the standby count of a server.
     *
     * @return the standbyCount value
     */
    public Integer standbyCount() {
        return this.standbyCount;
    }

    /**
     * Set the standby count of a server.
     *
     * @param standbyCount the standbyCount value to set
     * @return the ServerProperties object itself.
     */
    public ServerProperties withStandbyCount(Integer standbyCount) {
        this.standbyCount = standbyCount;
        return this;
    }

    /**
     * Get if public IP is requested or not for a server.
     *
     * @return the isPublicIpRequested value
     */
    public Boolean isPublicIpRequested() {
        return this.isPublicIpRequested;
    }

}
