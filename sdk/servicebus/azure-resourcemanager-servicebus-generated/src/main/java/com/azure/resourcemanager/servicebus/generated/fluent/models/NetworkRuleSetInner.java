// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.models.DefaultAction;
import com.azure.resourcemanager.servicebus.generated.models.NWRuleSetIpRules;
import com.azure.resourcemanager.servicebus.generated.models.NWRuleSetVirtualNetworkRules;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description of NetworkRuleSet resource. */
@JsonFlatten
@Fluent
public class NetworkRuleSetInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkRuleSetInner.class);

    /*
     * Default Action for Network Rule Set
     */
    @JsonProperty(value = "properties.defaultAction")
    private DefaultAction defaultAction;

    /*
     * List VirtualNetwork Rules
     */
    @JsonProperty(value = "properties.virtualNetworkRules")
    private List<NWRuleSetVirtualNetworkRules> virtualNetworkRules;

    /*
     * List of IpRules
     */
    @JsonProperty(value = "properties.ipRules")
    private List<NWRuleSetIpRules> ipRules;

    /**
     * Get the defaultAction property: Default Action for Network Rule Set.
     *
     * @return the defaultAction value.
     */
    public DefaultAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set the defaultAction property: Default Action for Network Rule Set.
     *
     * @param defaultAction the defaultAction value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Get the virtualNetworkRules property: List VirtualNetwork Rules.
     *
     * @return the virtualNetworkRules value.
     */
    public List<NWRuleSetVirtualNetworkRules> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: List VirtualNetwork Rules.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withVirtualNetworkRules(List<NWRuleSetVirtualNetworkRules> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the ipRules property: List of IpRules.
     *
     * @return the ipRules value.
     */
    public List<NWRuleSetIpRules> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: List of IpRules.
     *
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withIpRules(List<NWRuleSetIpRules> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
    }
}
