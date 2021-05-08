// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redis.generated.fluent.models.RedisFirewallRuleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of list firewall rules Redis operation. */
@Fluent
public final class RedisFirewallRuleListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RedisFirewallRuleListResult.class);

    /*
     * Results of the list firewall rules operation.
     */
    @JsonProperty(value = "value")
    private List<RedisFirewallRuleInner> value;

    /*
     * Link for next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Results of the list firewall rules operation.
     *
     * @return the value value.
     */
    public List<RedisFirewallRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Results of the list firewall rules operation.
     *
     * @param value the value value to set.
     * @return the RedisFirewallRuleListResult object itself.
     */
    public RedisFirewallRuleListResult withValue(List<RedisFirewallRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link for next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
