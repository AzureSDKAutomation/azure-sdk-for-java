// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.implementation;

import com.azure.resourcemanager.redis.generated.fluent.models.RedisFirewallRuleInner;
import com.azure.resourcemanager.redis.generated.models.RedisFirewallRule;

public final class RedisFirewallRuleImpl implements RedisFirewallRule {
    private RedisFirewallRuleInner innerObject;

    private final com.azure.resourcemanager.redis.generated.RedisManager serviceManager;

    RedisFirewallRuleImpl(
        RedisFirewallRuleInner innerObject, com.azure.resourcemanager.redis.generated.RedisManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String startIp() {
        return this.innerModel().startIp();
    }

    public String endIp() {
        return this.innerModel().endIp();
    }

    public RedisFirewallRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.redis.generated.RedisManager manager() {
        return this.serviceManager;
    }
}
