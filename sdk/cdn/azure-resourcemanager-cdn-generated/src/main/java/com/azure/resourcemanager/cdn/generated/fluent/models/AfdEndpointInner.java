// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.generated.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.generated.models.EnabledState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * CDN endpoint is the entity within a CDN profile containing configuration information such as origin, protocol,
 * content caching and delivery behavior. The AzureFrontDoor endpoint uses the URL format
 * &lt;endpointname&gt;.azureedge.net.
 */
@JsonFlatten
@Fluent
public class AfdEndpointInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AfdEndpointInner.class);

    /*
     * Send and receive timeout on forwarding request to the origin. When
     * timeout is reached, the request fails and returns.
     */
    @JsonProperty(value = "properties.originResponseTimeoutSeconds")
    private Integer originResponseTimeoutSeconds;

    /*
     * Whether to enable use of this rule. Permitted values are 'Enabled' or
     * 'Disabled'
     */
    @JsonProperty(value = "properties.enabledState")
    private EnabledState enabledState;

    /*
     * Provisioning status
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AfdProvisioningState provisioningState;

    /*
     * The deploymentStatus property.
     */
    @JsonProperty(value = "properties.deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentStatus deploymentStatus;

    /*
     * The host name of the endpoint structured as {endpointName}.{DNSZone},
     * e.g. contoso.azureedge.net
     */
    @JsonProperty(value = "properties.hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /**
     * Get the originResponseTimeoutSeconds property: Send and receive timeout on forwarding request to the origin. When
     * timeout is reached, the request fails and returns.
     *
     * @return the originResponseTimeoutSeconds value.
     */
    public Integer originResponseTimeoutSeconds() {
        return this.originResponseTimeoutSeconds;
    }

    /**
     * Set the originResponseTimeoutSeconds property: Send and receive timeout on forwarding request to the origin. When
     * timeout is reached, the request fails and returns.
     *
     * @param originResponseTimeoutSeconds the originResponseTimeoutSeconds value to set.
     * @return the AfdEndpointInner object itself.
     */
    public AfdEndpointInner withOriginResponseTimeoutSeconds(Integer originResponseTimeoutSeconds) {
        this.originResponseTimeoutSeconds = originResponseTimeoutSeconds;
        return this;
    }

    /**
     * Get the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @return the enabledState value.
     */
    public EnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @param enabledState the enabledState value to set.
     * @return the AfdEndpointInner object itself.
     */
    public AfdEndpointInner withEnabledState(EnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Get the hostname property: The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g.
     * contoso.azureedge.net.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /** {@inheritDoc} */
    @Override
    public AfdEndpointInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdEndpointInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
