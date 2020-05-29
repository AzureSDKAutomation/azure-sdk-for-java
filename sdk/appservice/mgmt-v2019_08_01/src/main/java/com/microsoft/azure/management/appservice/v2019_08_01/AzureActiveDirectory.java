/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The AzureActiveDirectory model.
 */
@JsonFlatten
public class AzureActiveDirectory extends ProxyOnlyResource {
    /**
     * The enabled property.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * The registration property.
     */
    @JsonProperty(value = "properties.registration")
    private AzureActiveDirectoryRegistration registration;

    /**
     * The login property.
     */
    @JsonProperty(value = "properties.login")
    private AzureActiveDirectoryLogin login;

    /**
     * The validation property.
     */
    @JsonProperty(value = "properties.validation")
    private AzureActiveDirectoryValidation validation;

    /**
     * The isAutoProvisioned property.
     */
    @JsonProperty(value = "properties.isAutoProvisioned")
    private Boolean isAutoProvisioned;

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the registration value.
     *
     * @return the registration value
     */
    public AzureActiveDirectoryRegistration registration() {
        return this.registration;
    }

    /**
     * Set the registration value.
     *
     * @param registration the registration value to set
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withRegistration(AzureActiveDirectoryRegistration registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Get the login value.
     *
     * @return the login value
     */
    public AzureActiveDirectoryLogin login() {
        return this.login;
    }

    /**
     * Set the login value.
     *
     * @param login the login value to set
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withLogin(AzureActiveDirectoryLogin login) {
        this.login = login;
        return this;
    }

    /**
     * Get the validation value.
     *
     * @return the validation value
     */
    public AzureActiveDirectoryValidation validation() {
        return this.validation;
    }

    /**
     * Set the validation value.
     *
     * @param validation the validation value to set
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withValidation(AzureActiveDirectoryValidation validation) {
        this.validation = validation;
        return this;
    }

    /**
     * Get the isAutoProvisioned value.
     *
     * @return the isAutoProvisioned value
     */
    public Boolean isAutoProvisioned() {
        return this.isAutoProvisioned;
    }

    /**
     * Set the isAutoProvisioned value.
     *
     * @param isAutoProvisioned the isAutoProvisioned value to set
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withIsAutoProvisioned(Boolean isAutoProvisioned) {
        this.isAutoProvisioned = isAutoProvisioned;
        return this;
    }

}
