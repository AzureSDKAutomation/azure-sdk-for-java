// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redis.generated.models.ReplicationRole;
import com.azure.resourcemanager.redis.generated.models.ResourceAutoGenerated;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response to put/get linked server (with properties) for Redis cache. */
@JsonFlatten
@Fluent
public class RedisLinkedServerWithPropertiesInner extends ResourceAutoGenerated {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RedisLinkedServerWithPropertiesInner.class);

    /*
     * Fully qualified resourceId of the linked redis cache.
     */
    @JsonProperty(value = "properties.linkedRedisCacheId")
    private String linkedRedisCacheId;

    /*
     * Location of the linked redis cache.
     */
    @JsonProperty(value = "properties.linkedRedisCacheLocation")
    private String linkedRedisCacheLocation;

    /*
     * Role of the linked server.
     */
    @JsonProperty(value = "properties.serverRole")
    private ReplicationRole serverRole;

    /*
     * Terminal state of the link between primary and secondary redis cache.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the linkedRedisCacheId property: Fully qualified resourceId of the linked redis cache.
     *
     * @return the linkedRedisCacheId value.
     */
    public String linkedRedisCacheId() {
        return this.linkedRedisCacheId;
    }

    /**
     * Set the linkedRedisCacheId property: Fully qualified resourceId of the linked redis cache.
     *
     * @param linkedRedisCacheId the linkedRedisCacheId value to set.
     * @return the RedisLinkedServerWithPropertiesInner object itself.
     */
    public RedisLinkedServerWithPropertiesInner withLinkedRedisCacheId(String linkedRedisCacheId) {
        this.linkedRedisCacheId = linkedRedisCacheId;
        return this;
    }

    /**
     * Get the linkedRedisCacheLocation property: Location of the linked redis cache.
     *
     * @return the linkedRedisCacheLocation value.
     */
    public String linkedRedisCacheLocation() {
        return this.linkedRedisCacheLocation;
    }

    /**
     * Set the linkedRedisCacheLocation property: Location of the linked redis cache.
     *
     * @param linkedRedisCacheLocation the linkedRedisCacheLocation value to set.
     * @return the RedisLinkedServerWithPropertiesInner object itself.
     */
    public RedisLinkedServerWithPropertiesInner withLinkedRedisCacheLocation(String linkedRedisCacheLocation) {
        this.linkedRedisCacheLocation = linkedRedisCacheLocation;
        return this;
    }

    /**
     * Get the serverRole property: Role of the linked server.
     *
     * @return the serverRole value.
     */
    public ReplicationRole serverRole() {
        return this.serverRole;
    }

    /**
     * Set the serverRole property: Role of the linked server.
     *
     * @param serverRole the serverRole value to set.
     * @return the RedisLinkedServerWithPropertiesInner object itself.
     */
    public RedisLinkedServerWithPropertiesInner withServerRole(ReplicationRole serverRole) {
        this.serverRole = serverRole;
        return this;
    }

    /**
     * Get the provisioningState property: Terminal state of the link between primary and secondary redis cache.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
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
