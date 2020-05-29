/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The GlobalValidation model.
 */
@JsonFlatten
public class GlobalValidation extends ProxyOnlyResource {
    /**
     * The requireAuthentication property.
     */
    @JsonProperty(value = "properties.requireAuthentication")
    private Boolean requireAuthentication;

    /**
     * Possible values include: 'RedirectToLoginPage', 'AllowAnonymous',
     * 'Return401', 'Return403'.
     */
    @JsonProperty(value = "properties.unauthenticatedClientAction")
    private UnauthenticatedClientActionV2 unauthenticatedClientAction;

    /**
     * The redirectToProvider property.
     */
    @JsonProperty(value = "properties.redirectToProvider")
    private String redirectToProvider;

    /**
     * The excludedPaths property.
     */
    @JsonProperty(value = "properties.excludedPaths")
    private List<String> excludedPaths;

    /**
     * Get the requireAuthentication value.
     *
     * @return the requireAuthentication value
     */
    public Boolean requireAuthentication() {
        return this.requireAuthentication;
    }

    /**
     * Set the requireAuthentication value.
     *
     * @param requireAuthentication the requireAuthentication value to set
     * @return the GlobalValidation object itself.
     */
    public GlobalValidation withRequireAuthentication(Boolean requireAuthentication) {
        this.requireAuthentication = requireAuthentication;
        return this;
    }

    /**
     * Get possible values include: 'RedirectToLoginPage', 'AllowAnonymous', 'Return401', 'Return403'.
     *
     * @return the unauthenticatedClientAction value
     */
    public UnauthenticatedClientActionV2 unauthenticatedClientAction() {
        return this.unauthenticatedClientAction;
    }

    /**
     * Set possible values include: 'RedirectToLoginPage', 'AllowAnonymous', 'Return401', 'Return403'.
     *
     * @param unauthenticatedClientAction the unauthenticatedClientAction value to set
     * @return the GlobalValidation object itself.
     */
    public GlobalValidation withUnauthenticatedClientAction(UnauthenticatedClientActionV2 unauthenticatedClientAction) {
        this.unauthenticatedClientAction = unauthenticatedClientAction;
        return this;
    }

    /**
     * Get the redirectToProvider value.
     *
     * @return the redirectToProvider value
     */
    public String redirectToProvider() {
        return this.redirectToProvider;
    }

    /**
     * Set the redirectToProvider value.
     *
     * @param redirectToProvider the redirectToProvider value to set
     * @return the GlobalValidation object itself.
     */
    public GlobalValidation withRedirectToProvider(String redirectToProvider) {
        this.redirectToProvider = redirectToProvider;
        return this;
    }

    /**
     * Get the excludedPaths value.
     *
     * @return the excludedPaths value
     */
    public List<String> excludedPaths() {
        return this.excludedPaths;
    }

    /**
     * Set the excludedPaths value.
     *
     * @param excludedPaths the excludedPaths value to set
     * @return the GlobalValidation object itself.
     */
    public GlobalValidation withExcludedPaths(List<String> excludedPaths) {
        this.excludedPaths = excludedPaths;
        return this;
    }

}
