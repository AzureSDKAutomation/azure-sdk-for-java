// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** UrlPathMaps give a url path to the backend mapping information for PathBasedRouting. */
@JsonFlatten
@Fluent
public class ApplicationGatewayUrlPathMap extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayUrlPathMap.class);

    /*
     * Name of the URL path map that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Default backend address pool resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultBackendAddressPool")
    private SubResource defaultBackendAddressPool;

    /*
     * Default backend http settings resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultBackendHttpSettings")
    private SubResource defaultBackendHttpSettings;

    /*
     * Default Rewrite rule set resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultRewriteRuleSet")
    private SubResource defaultRewriteRuleSet;

    /*
     * Default redirect configuration resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultRedirectConfiguration")
    private SubResource defaultRedirectConfiguration;

    /*
     * Default Load Distribution Policy resource of URL path map.
     */
    @JsonProperty(value = "properties.defaultLoadDistributionPolicy")
    private SubResource defaultLoadDistributionPolicy;

    /*
     * Path rule of URL path map resource.
     */
    @JsonProperty(value = "properties.pathRules")
    private List<ApplicationGatewayPathRule> pathRules;

    /*
     * The provisioning state of the URL path map resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Name of the URL path map that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the URL path map that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the defaultBackendAddressPool property: Default backend address pool resource of URL path map.
     *
     * @return the defaultBackendAddressPool value.
     */
    public SubResource defaultBackendAddressPool() {
        return this.defaultBackendAddressPool;
    }

    /**
     * Set the defaultBackendAddressPool property: Default backend address pool resource of URL path map.
     *
     * @param defaultBackendAddressPool the defaultBackendAddressPool value to set.
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap withDefaultBackendAddressPool(SubResource defaultBackendAddressPool) {
        this.defaultBackendAddressPool = defaultBackendAddressPool;
        return this;
    }

    /**
     * Get the defaultBackendHttpSettings property: Default backend http settings resource of URL path map.
     *
     * @return the defaultBackendHttpSettings value.
     */
    public SubResource defaultBackendHttpSettings() {
        return this.defaultBackendHttpSettings;
    }

    /**
     * Set the defaultBackendHttpSettings property: Default backend http settings resource of URL path map.
     *
     * @param defaultBackendHttpSettings the defaultBackendHttpSettings value to set.
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap withDefaultBackendHttpSettings(SubResource defaultBackendHttpSettings) {
        this.defaultBackendHttpSettings = defaultBackendHttpSettings;
        return this;
    }

    /**
     * Get the defaultRewriteRuleSet property: Default Rewrite rule set resource of URL path map.
     *
     * @return the defaultRewriteRuleSet value.
     */
    public SubResource defaultRewriteRuleSet() {
        return this.defaultRewriteRuleSet;
    }

    /**
     * Set the defaultRewriteRuleSet property: Default Rewrite rule set resource of URL path map.
     *
     * @param defaultRewriteRuleSet the defaultRewriteRuleSet value to set.
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap withDefaultRewriteRuleSet(SubResource defaultRewriteRuleSet) {
        this.defaultRewriteRuleSet = defaultRewriteRuleSet;
        return this;
    }

    /**
     * Get the defaultRedirectConfiguration property: Default redirect configuration resource of URL path map.
     *
     * @return the defaultRedirectConfiguration value.
     */
    public SubResource defaultRedirectConfiguration() {
        return this.defaultRedirectConfiguration;
    }

    /**
     * Set the defaultRedirectConfiguration property: Default redirect configuration resource of URL path map.
     *
     * @param defaultRedirectConfiguration the defaultRedirectConfiguration value to set.
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap withDefaultRedirectConfiguration(SubResource defaultRedirectConfiguration) {
        this.defaultRedirectConfiguration = defaultRedirectConfiguration;
        return this;
    }

    /**
     * Get the defaultLoadDistributionPolicy property: Default Load Distribution Policy resource of URL path map.
     *
     * @return the defaultLoadDistributionPolicy value.
     */
    public SubResource defaultLoadDistributionPolicy() {
        return this.defaultLoadDistributionPolicy;
    }

    /**
     * Set the defaultLoadDistributionPolicy property: Default Load Distribution Policy resource of URL path map.
     *
     * @param defaultLoadDistributionPolicy the defaultLoadDistributionPolicy value to set.
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap withDefaultLoadDistributionPolicy(SubResource defaultLoadDistributionPolicy) {
        this.defaultLoadDistributionPolicy = defaultLoadDistributionPolicy;
        return this;
    }

    /**
     * Get the pathRules property: Path rule of URL path map resource.
     *
     * @return the pathRules value.
     */
    public List<ApplicationGatewayPathRule> pathRules() {
        return this.pathRules;
    }

    /**
     * Set the pathRules property: Path rule of URL path map resource.
     *
     * @param pathRules the pathRules value to set.
     * @return the ApplicationGatewayUrlPathMap object itself.
     */
    public ApplicationGatewayUrlPathMap withPathRules(List<ApplicationGatewayPathRule> pathRules) {
        this.pathRules = pathRules;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the URL path map resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayUrlPathMap withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pathRules() != null) {
            pathRules().forEach(e -> e.validate());
        }
    }
}
