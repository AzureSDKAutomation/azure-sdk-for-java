// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Hostpool update fault information. */
@Fluent
public final class HostPoolUpdateFault {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HostPoolUpdateFault.class);

    /*
     * Hostpool update fault type. Either ServiceError or UserError.
     */
    @JsonProperty(value = "faultType")
    private String faultType;

    /*
     * Hostpool update fault code.
     */
    @JsonProperty(value = "faultCode")
    private String faultCode;

    /*
     * Hostpool update fault text.
     */
    @JsonProperty(value = "faultText")
    private String faultText;

    /*
     * Hostpool update fault context.
     */
    @JsonProperty(value = "faultContext")
    private String faultContext;

    /**
     * Get the faultType property: Hostpool update fault type. Either ServiceError or UserError.
     *
     * @return the faultType value.
     */
    public String faultType() {
        return this.faultType;
    }

    /**
     * Set the faultType property: Hostpool update fault type. Either ServiceError or UserError.
     *
     * @param faultType the faultType value to set.
     * @return the HostPoolUpdateFault object itself.
     */
    public HostPoolUpdateFault withFaultType(String faultType) {
        this.faultType = faultType;
        return this;
    }

    /**
     * Get the faultCode property: Hostpool update fault code.
     *
     * @return the faultCode value.
     */
    public String faultCode() {
        return this.faultCode;
    }

    /**
     * Set the faultCode property: Hostpool update fault code.
     *
     * @param faultCode the faultCode value to set.
     * @return the HostPoolUpdateFault object itself.
     */
    public HostPoolUpdateFault withFaultCode(String faultCode) {
        this.faultCode = faultCode;
        return this;
    }

    /**
     * Get the faultText property: Hostpool update fault text.
     *
     * @return the faultText value.
     */
    public String faultText() {
        return this.faultText;
    }

    /**
     * Set the faultText property: Hostpool update fault text.
     *
     * @param faultText the faultText value to set.
     * @return the HostPoolUpdateFault object itself.
     */
    public HostPoolUpdateFault withFaultText(String faultText) {
        this.faultText = faultText;
        return this;
    }

    /**
     * Get the faultContext property: Hostpool update fault context.
     *
     * @return the faultContext value.
     */
    public String faultContext() {
        return this.faultContext;
    }

    /**
     * Set the faultContext property: Hostpool update fault context.
     *
     * @param faultContext the faultContext value to set.
     * @return the HostPoolUpdateFault object itself.
     */
    public HostPoolUpdateFault withFaultContext(String faultContext) {
        this.faultContext = faultContext;
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
