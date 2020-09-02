/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of a resource type that has been onboarded to
 * private link service, supported by Azure Cognitive Search.
 */
public class ShareablePrivateLinkResourceProperties {
    /**
     * The resource provider type for the resource that has been onboarded to
     * private link service, supported by Azure Cognitive Search.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The resource provider group id for the resource that has been onboarded
     * to private link service, supported by Azure Cognitive Search.
     */
    @JsonProperty(value = "groupId", access = JsonProperty.Access.WRITE_ONLY)
    private String groupId;

    /**
     * The description of the resource type that has been onboarded to private
     * link service, supported by Azure Cognitive Search.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the resource provider type for the resource that has been onboarded to private link service, supported by Azure Cognitive Search.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the resource provider group id for the resource that has been onboarded to private link service, supported by Azure Cognitive Search.
     *
     * @return the groupId value
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Get the description of the resource type that has been onboarded to private link service, supported by Azure Cognitive Search.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

}
