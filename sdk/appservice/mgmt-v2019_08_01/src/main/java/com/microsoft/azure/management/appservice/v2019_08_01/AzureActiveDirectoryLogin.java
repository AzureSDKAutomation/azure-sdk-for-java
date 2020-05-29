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
 * The AzureActiveDirectoryLogin model.
 */
@JsonFlatten
public class AzureActiveDirectoryLogin extends ProxyOnlyResource {
    /**
     * The disableWWWAuthenticate property.
     */
    @JsonProperty(value = "properties.disableWWWAuthenticate")
    private Boolean disableWWWAuthenticate;

    /**
     * The loginParameters property.
     */
    @JsonProperty(value = "properties.loginParameters")
    private List<String> loginParameters;

    /**
     * Get the disableWWWAuthenticate value.
     *
     * @return the disableWWWAuthenticate value
     */
    public Boolean disableWWWAuthenticate() {
        return this.disableWWWAuthenticate;
    }

    /**
     * Set the disableWWWAuthenticate value.
     *
     * @param disableWWWAuthenticate the disableWWWAuthenticate value to set
     * @return the AzureActiveDirectoryLogin object itself.
     */
    public AzureActiveDirectoryLogin withDisableWWWAuthenticate(Boolean disableWWWAuthenticate) {
        this.disableWWWAuthenticate = disableWWWAuthenticate;
        return this;
    }

    /**
     * Get the loginParameters value.
     *
     * @return the loginParameters value
     */
    public List<String> loginParameters() {
        return this.loginParameters;
    }

    /**
     * Set the loginParameters value.
     *
     * @param loginParameters the loginParameters value to set
     * @return the AzureActiveDirectoryLogin object itself.
     */
    public AzureActiveDirectoryLogin withLoginParameters(List<String> loginParameters) {
        this.loginParameters = loginParameters;
        return this;
    }

}
