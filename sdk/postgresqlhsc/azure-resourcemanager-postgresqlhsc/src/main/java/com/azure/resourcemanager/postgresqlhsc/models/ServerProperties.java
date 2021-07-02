// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlhsc.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a server. */
@Fluent
public class ServerProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerProperties.class);

    /*
     * The edition of a server (default: GeneralPurpose).
     */
    @JsonProperty(value = "serverEdition")
    private ServerEdition serverEdition;

    /*
     * The storage of a server in MB (max: 2097152 = 2TiB).
     */
    @JsonProperty(value = "storageQuotaInMb")
    private Long storageQuotaInMb;

    /*
     * The vCores count of a server (max: 64).
     */
    @JsonProperty(value = "vCores")
    private Long vCores;

    /*
     * If high availability is enabled or not for the server.
     */
    @JsonProperty(value = "enableHa")
    private Boolean enableHa;

    /*
     * If public IP is requested or not for a server.
     */
    @JsonProperty(value = "enablePublicIp", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean enablePublicIp;

    /**
     * Get the serverEdition property: The edition of a server (default: GeneralPurpose).
     *
     * @return the serverEdition value.
     */
    public ServerEdition serverEdition() {
        return this.serverEdition;
    }

    /**
     * Set the serverEdition property: The edition of a server (default: GeneralPurpose).
     *
     * @param serverEdition the serverEdition value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withServerEdition(ServerEdition serverEdition) {
        this.serverEdition = serverEdition;
        return this;
    }

    /**
     * Get the storageQuotaInMb property: The storage of a server in MB (max: 2097152 = 2TiB).
     *
     * @return the storageQuotaInMb value.
     */
    public Long storageQuotaInMb() {
        return this.storageQuotaInMb;
    }

    /**
     * Set the storageQuotaInMb property: The storage of a server in MB (max: 2097152 = 2TiB).
     *
     * @param storageQuotaInMb the storageQuotaInMb value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withStorageQuotaInMb(Long storageQuotaInMb) {
        this.storageQuotaInMb = storageQuotaInMb;
        return this;
    }

    /**
     * Get the vCores property: The vCores count of a server (max: 64).
     *
     * @return the vCores value.
     */
    public Long vCores() {
        return this.vCores;
    }

    /**
     * Set the vCores property: The vCores count of a server (max: 64).
     *
     * @param vCores the vCores value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withVCores(Long vCores) {
        this.vCores = vCores;
        return this;
    }

    /**
     * Get the enableHa property: If high availability is enabled or not for the server.
     *
     * @return the enableHa value.
     */
    public Boolean enableHa() {
        return this.enableHa;
    }

    /**
     * Set the enableHa property: If high availability is enabled or not for the server.
     *
     * @param enableHa the enableHa value to set.
     * @return the ServerProperties object itself.
     */
    public ServerProperties withEnableHa(Boolean enableHa) {
        this.enableHa = enableHa;
        return this;
    }

    /**
     * Get the enablePublicIp property: If public IP is requested or not for a server.
     *
     * @return the enablePublicIp value.
     */
    public Boolean enablePublicIp() {
        return this.enablePublicIp;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
