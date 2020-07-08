/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_07_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Private link resource.
 */
@JsonFlatten
public class PrivateLinkResourceInner extends ProxyResource {
    /**
     * Group Id of the private link resource.
     */
    @JsonProperty(value = "properties.groupId")
    private String groupId;

    /**
     * Required members of the private link resource.
     */
    @JsonProperty(value = "properties.requiredMembers")
    private List<String> requiredMembers;

    /**
     * Required private DNS zone names.
     */
    @JsonProperty(value = "properties.requiredZoneNames")
    private List<String> requiredZoneNames;

    /**
     * Get group Id of the private link resource.
     *
     * @return the groupId value
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set group Id of the private link resource.
     *
     * @param groupId the groupId value to set
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get required members of the private link resource.
     *
     * @return the requiredMembers value
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Set required members of the private link resource.
     *
     * @param requiredMembers the requiredMembers value to set
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withRequiredMembers(List<String> requiredMembers) {
        this.requiredMembers = requiredMembers;
        return this;
    }

    /**
     * Get required private DNS zone names.
     *
     * @return the requiredZoneNames value
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Set required private DNS zone names.
     *
     * @param requiredZoneNames the requiredZoneNames value to set
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withRequiredZoneNames(List<String> requiredZoneNames) {
        this.requiredZoneNames = requiredZoneNames;
        return this;
    }

}
