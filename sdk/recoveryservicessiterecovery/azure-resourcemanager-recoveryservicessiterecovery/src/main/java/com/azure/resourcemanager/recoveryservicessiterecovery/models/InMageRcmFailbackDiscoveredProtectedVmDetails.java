// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** InMageRcmFailback discovered VM details. */
@Immutable
public final class InMageRcmFailbackDiscoveredProtectedVmDetails {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(InMageRcmFailbackDiscoveredProtectedVmDetails.class);

    /*
     * The VCenter Id.
     */
    @JsonProperty(value = "vCenterId", access = JsonProperty.Access.WRITE_ONLY)
    private String vCenterId;

    /*
     * The VCenter fqdn.
     */
    @JsonProperty(value = "vCenterFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String vCenterFqdn;

    /*
     * The list of datastores.
     */
    @JsonProperty(value = "datastores", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> datastores;

    /*
     * The list of IP addresses.
     */
    @JsonProperty(value = "ipAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> ipAddresses;

    /*
     * The VMware tools status.
     */
    @JsonProperty(value = "vmwareToolsStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String vmwareToolsStatus;

    /*
     * The VM power status.
     */
    @JsonProperty(value = "powerStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String powerStatus;

    /*
     * The VM fqdn.
     */
    @JsonProperty(value = "vmFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String vmFqdn;

    /*
     * The VM's OS name.
     */
    @JsonProperty(value = "osName", access = JsonProperty.Access.WRITE_ONLY)
    private String osName;

    /*
     * The SDS created timestamp.
     */
    @JsonProperty(value = "createdTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTimestamp;

    /*
     * The SDS updated timestamp.
     */
    @JsonProperty(value = "updatedTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedTimestamp;

    /*
     * A value indicating whether the VM is deleted.
     */
    @JsonProperty(value = "isDeleted", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDeleted;

    /*
     * The last time when SDS information discovered in SRS.
     */
    @JsonProperty(value = "lastDiscoveryTimeInUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastDiscoveryTimeInUtc;

    /**
     * Get the vCenterId property: The VCenter Id.
     *
     * @return the vCenterId value.
     */
    public String vCenterId() {
        return this.vCenterId;
    }

    /**
     * Get the vCenterFqdn property: The VCenter fqdn.
     *
     * @return the vCenterFqdn value.
     */
    public String vCenterFqdn() {
        return this.vCenterFqdn;
    }

    /**
     * Get the datastores property: The list of datastores.
     *
     * @return the datastores value.
     */
    public List<String> datastores() {
        return this.datastores;
    }

    /**
     * Get the ipAddresses property: The list of IP addresses.
     *
     * @return the ipAddresses value.
     */
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }

    /**
     * Get the vmwareToolsStatus property: The VMware tools status.
     *
     * @return the vmwareToolsStatus value.
     */
    public String vmwareToolsStatus() {
        return this.vmwareToolsStatus;
    }

    /**
     * Get the powerStatus property: The VM power status.
     *
     * @return the powerStatus value.
     */
    public String powerStatus() {
        return this.powerStatus;
    }

    /**
     * Get the vmFqdn property: The VM fqdn.
     *
     * @return the vmFqdn value.
     */
    public String vmFqdn() {
        return this.vmFqdn;
    }

    /**
     * Get the osName property: The VM's OS name.
     *
     * @return the osName value.
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Get the createdTimestamp property: The SDS created timestamp.
     *
     * @return the createdTimestamp value.
     */
    public OffsetDateTime createdTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * Get the updatedTimestamp property: The SDS updated timestamp.
     *
     * @return the updatedTimestamp value.
     */
    public OffsetDateTime updatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * Get the isDeleted property: A value indicating whether the VM is deleted.
     *
     * @return the isDeleted value.
     */
    public Boolean isDeleted() {
        return this.isDeleted;
    }

    /**
     * Get the lastDiscoveryTimeInUtc property: The last time when SDS information discovered in SRS.
     *
     * @return the lastDiscoveryTimeInUtc value.
     */
    public OffsetDateTime lastDiscoveryTimeInUtc() {
        return this.lastDiscoveryTimeInUtc;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
