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
 * The AzureActiveDirectoryValidation model.
 */
@JsonFlatten
public class AzureActiveDirectoryValidation extends ProxyOnlyResource {
    /**
     * The jwtClaimChecks property.
     */
    @JsonProperty(value = "properties.jwtClaimChecks")
    private JwtClaimChecks jwtClaimChecks;

    /**
     * The allowedAudiences property.
     */
    @JsonProperty(value = "properties.allowedAudiences")
    private List<String> allowedAudiences;

    /**
     * Get the jwtClaimChecks value.
     *
     * @return the jwtClaimChecks value
     */
    public JwtClaimChecks jwtClaimChecks() {
        return this.jwtClaimChecks;
    }

    /**
     * Set the jwtClaimChecks value.
     *
     * @param jwtClaimChecks the jwtClaimChecks value to set
     * @return the AzureActiveDirectoryValidation object itself.
     */
    public AzureActiveDirectoryValidation withJwtClaimChecks(JwtClaimChecks jwtClaimChecks) {
        this.jwtClaimChecks = jwtClaimChecks;
        return this;
    }

    /**
     * Get the allowedAudiences value.
     *
     * @return the allowedAudiences value
     */
    public List<String> allowedAudiences() {
        return this.allowedAudiences;
    }

    /**
     * Set the allowedAudiences value.
     *
     * @param allowedAudiences the allowedAudiences value to set
     * @return the AzureActiveDirectoryValidation object itself.
     */
    public AzureActiveDirectoryValidation withAllowedAudiences(List<String> allowedAudiences) {
        this.allowedAudiences = allowedAudiences;
        return this;
    }

}
