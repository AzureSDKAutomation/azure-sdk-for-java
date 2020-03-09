/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_03_13;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of a supported private link resource for the Azure
 * Cognitive Search service. For a given API version, this represents the
 * 'supported' groupIds when creating a shared private link resource.
 */
public class PrivateLinkResourceProperties {
    /**
     * The group ID of the private link resource.
     */
    @JsonProperty(value = "groupId", access = JsonProperty.Access.WRITE_ONLY)
    private String groupId;

    /**
     * The list of required members of the private link resource.
     */
    @JsonProperty(value = "requiredMembers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredMembers;

    /**
     * The list of required DNS zone names of the private link resource.
     */
    @JsonProperty(value = "requiredZoneNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredZoneNames;

    /**
     * The list of resources that are onboarded to private link service, that
     * are supported by Azure Cognitive Search.
     */
    @JsonProperty(value = "shareablePrivateLinkResourceTypes", access = JsonProperty.Access.WRITE_ONLY)
    private List<ShareablePrivateLinkResourceType> shareablePrivateLinkResourceTypes;

    /**
     * Get the group ID of the private link resource.
     *
     * @return the groupId value
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Get the list of required members of the private link resource.
     *
     * @return the requiredMembers value
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Get the list of required DNS zone names of the private link resource.
     *
     * @return the requiredZoneNames value
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Get the list of resources that are onboarded to private link service, that are supported by Azure Cognitive Search.
     *
     * @return the shareablePrivateLinkResourceTypes value
     */
    public List<ShareablePrivateLinkResourceType> shareablePrivateLinkResourceTypes() {
        return this.shareablePrivateLinkResourceTypes;
    }

}
