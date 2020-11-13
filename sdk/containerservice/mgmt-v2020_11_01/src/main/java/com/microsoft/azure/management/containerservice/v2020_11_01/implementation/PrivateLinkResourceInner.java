/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_11_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A private link resource.
 */
public class PrivateLinkResourceInner {
    /**
     * The ID of the private link resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the private link resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The group ID of the resource.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /**
     * RequiredMembers of the resource.
     */
    @JsonProperty(value = "requiredMembers")
    private List<String> requiredMembers;

    /**
     * The private link service ID of the resource, this field is exposed only
     * to NRP internally.
     */
    @JsonProperty(value = "privateLinkServiceID", access = JsonProperty.Access.WRITE_ONLY)
    private String privateLinkServiceID;

    /**
     * Get the ID of the private link resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of the private link resource.
     *
     * @param id the id value to set
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name of the private link resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the private link resource.
     *
     * @param name the name value to set
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the resource type.
     *
     * @param type the type value to set
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the group ID of the resource.
     *
     * @return the groupId value
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the group ID of the resource.
     *
     * @param groupId the groupId value to set
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get requiredMembers of the resource.
     *
     * @return the requiredMembers value
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Set requiredMembers of the resource.
     *
     * @param requiredMembers the requiredMembers value to set
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withRequiredMembers(List<String> requiredMembers) {
        this.requiredMembers = requiredMembers;
        return this;
    }

    /**
     * Get the private link service ID of the resource, this field is exposed only to NRP internally.
     *
     * @return the privateLinkServiceID value
     */
    public String privateLinkServiceID() {
        return this.privateLinkServiceID;
    }

}
