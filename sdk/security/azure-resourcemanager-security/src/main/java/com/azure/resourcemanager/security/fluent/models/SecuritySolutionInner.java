// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.Location;
import com.azure.resourcemanager.security.models.ProvisioningState;
import com.azure.resourcemanager.security.models.SecurityFamily;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SecuritySolution model. */
@JsonFlatten
@Fluent
public class SecuritySolutionInner extends Location {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecuritySolutionInner.class);

    /*
     * The security family of the security solution
     */
    @JsonProperty(value = "properties.securityFamily")
    private SecurityFamily securityFamily;

    /*
     * The security family provisioning State
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /*
     * The security solutions' template
     */
    @JsonProperty(value = "properties.template")
    private String template;

    /*
     * The security solutions' status
     */
    @JsonProperty(value = "properties.protectionStatus")
    private String protectionStatus;

    /**
     * Get the securityFamily property: The security family of the security solution.
     *
     * @return the securityFamily value.
     */
    public SecurityFamily securityFamily() {
        return this.securityFamily;
    }

    /**
     * Set the securityFamily property: The security family of the security solution.
     *
     * @param securityFamily the securityFamily value to set.
     * @return the SecuritySolutionInner object itself.
     */
    public SecuritySolutionInner withSecurityFamily(SecurityFamily securityFamily) {
        this.securityFamily = securityFamily;
        return this;
    }

    /**
     * Get the provisioningState property: The security family provisioning State.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The security family provisioning State.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the SecuritySolutionInner object itself.
     */
    public SecuritySolutionInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the template property: The security solutions' template.
     *
     * @return the template value.
     */
    public String template() {
        return this.template;
    }

    /**
     * Set the template property: The security solutions' template.
     *
     * @param template the template value to set.
     * @return the SecuritySolutionInner object itself.
     */
    public SecuritySolutionInner withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * Get the protectionStatus property: The security solutions' status.
     *
     * @return the protectionStatus value.
     */
    public String protectionStatus() {
        return this.protectionStatus;
    }

    /**
     * Set the protectionStatus property: The security solutions' status.
     *
     * @param protectionStatus the protectionStatus value to set.
     * @return the SecuritySolutionInner object itself.
     */
    public SecuritySolutionInner withProtectionStatus(String protectionStatus) {
        this.protectionStatus = protectionStatus;
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
