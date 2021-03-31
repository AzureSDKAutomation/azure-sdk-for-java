// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Check Domain availability result. */
@Fluent
public final class CheckDomainAvailabilityResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckDomainAvailabilityResultInner.class);

    /*
     * Indicates the given SKU is available or not.
     */
    @JsonProperty(value = "isSubdomainAvailable")
    private Boolean isSubdomainAvailable;

    /*
     * Reason why the SKU is not available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /*
     * The subdomain name to use.
     */
    @JsonProperty(value = "subdomainName")
    private String subdomainName;

    /*
     * The Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the isSubdomainAvailable property: Indicates the given SKU is available or not.
     *
     * @return the isSubdomainAvailable value.
     */
    public Boolean isSubdomainAvailable() {
        return this.isSubdomainAvailable;
    }

    /**
     * Set the isSubdomainAvailable property: Indicates the given SKU is available or not.
     *
     * @param isSubdomainAvailable the isSubdomainAvailable value to set.
     * @return the CheckDomainAvailabilityResultInner object itself.
     */
    public CheckDomainAvailabilityResultInner withIsSubdomainAvailable(Boolean isSubdomainAvailable) {
        this.isSubdomainAvailable = isSubdomainAvailable;
        return this;
    }

    /**
     * Get the reason property: Reason why the SKU is not available.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Reason why the SKU is not available.
     *
     * @param reason the reason value to set.
     * @return the CheckDomainAvailabilityResultInner object itself.
     */
    public CheckDomainAvailabilityResultInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the subdomainName property: The subdomain name to use.
     *
     * @return the subdomainName value.
     */
    public String subdomainName() {
        return this.subdomainName;
    }

    /**
     * Set the subdomainName property: The subdomain name to use.
     *
     * @param subdomainName the subdomainName value to set.
     * @return the CheckDomainAvailabilityResultInner object itself.
     */
    public CheckDomainAvailabilityResultInner withSubdomainName(String subdomainName) {
        this.subdomainName = subdomainName;
        return this;
    }

    /**
     * Get the type property: The Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The Type of the resource.
     *
     * @param type the type value to set.
     * @return the CheckDomainAvailabilityResultInner object itself.
     */
    public CheckDomainAvailabilityResultInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
