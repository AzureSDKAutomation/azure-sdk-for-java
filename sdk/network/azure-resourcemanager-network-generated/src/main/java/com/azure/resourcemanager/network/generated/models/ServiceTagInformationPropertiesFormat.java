// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the service tag information. */
@Immutable
public final class ServiceTagInformationPropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceTagInformationPropertiesFormat.class);

    /*
     * The iteration number of service tag.
     */
    @JsonProperty(value = "changeNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String changeNumber;

    /*
     * The region of service tag.
     */
    @JsonProperty(value = "region", access = JsonProperty.Access.WRITE_ONLY)
    private String region;

    /*
     * The name of system service.
     */
    @JsonProperty(value = "systemService", access = JsonProperty.Access.WRITE_ONLY)
    private String systemService;

    /*
     * The list of IP address prefixes.
     */
    @JsonProperty(value = "addressPrefixes", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> addressPrefixes;

    /**
     * Get the changeNumber property: The iteration number of service tag.
     *
     * @return the changeNumber value.
     */
    public String changeNumber() {
        return this.changeNumber;
    }

    /**
     * Get the region property: The region of service tag.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Get the systemService property: The name of system service.
     *
     * @return the systemService value.
     */
    public String systemService() {
        return this.systemService;
    }

    /**
     * Get the addressPrefixes property: The list of IP address prefixes.
     *
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
