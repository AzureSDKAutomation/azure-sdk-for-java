// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.P2SConnectionConfiguration;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VpnClientConnectionHealth;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** P2SVpnGateway Resource. */
@JsonFlatten
@Fluent
public class P2SVpnGatewayInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(P2SVpnGatewayInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The VirtualHub to which the gateway belongs.
     */
    @JsonProperty(value = "properties.virtualHub")
    private SubResource virtualHub;

    /*
     * List of all p2s connection configurations of the gateway.
     */
    @JsonProperty(value = "properties.p2SConnectionConfigurations")
    private List<P2SConnectionConfiguration> p2SConnectionConfigurations;

    /*
     * The provisioning state of the P2S VPN gateway resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The scale unit for this p2s vpn gateway.
     */
    @JsonProperty(value = "properties.vpnGatewayScaleUnit")
    private Integer vpnGatewayScaleUnit;

    /*
     * The VpnServerConfiguration to which the p2sVpnGateway is attached to.
     */
    @JsonProperty(value = "properties.vpnServerConfiguration")
    private SubResource vpnServerConfiguration;

    /*
     * All P2S VPN clients' connection health status.
     */
    @JsonProperty(value = "properties.vpnClientConnectionHealth", access = JsonProperty.Access.WRITE_ONLY)
    private VpnClientConnectionHealth vpnClientConnectionHealth;

    /*
     * List of all customer specified DNS servers IP addresses.
     */
    @JsonProperty(value = "properties.customDnsServers")
    private List<String> customDnsServers;

    /*
     * Enable Routing Preference property for the Public IP Interface of the
     * P2SVpnGateway.
     */
    @JsonProperty(value = "properties.isRoutingPreferenceInternet")
    private Boolean isRoutingPreferenceInternet;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the p2SConnectionConfigurations property: List of all p2s connection configurations of the gateway.
     *
     * @return the p2SConnectionConfigurations value.
     */
    public List<P2SConnectionConfiguration> p2SConnectionConfigurations() {
        return this.p2SConnectionConfigurations;
    }

    /**
     * Set the p2SConnectionConfigurations property: List of all p2s connection configurations of the gateway.
     *
     * @param p2SConnectionConfigurations the p2SConnectionConfigurations value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withP2SConnectionConfigurations(
        List<P2SConnectionConfiguration> p2SConnectionConfigurations) {
        this.p2SConnectionConfigurations = p2SConnectionConfigurations;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the P2S VPN gateway resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the vpnGatewayScaleUnit property: The scale unit for this p2s vpn gateway.
     *
     * @return the vpnGatewayScaleUnit value.
     */
    public Integer vpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit;
    }

    /**
     * Set the vpnGatewayScaleUnit property: The scale unit for this p2s vpn gateway.
     *
     * @param vpnGatewayScaleUnit the vpnGatewayScaleUnit value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
        return this;
    }

    /**
     * Get the vpnServerConfiguration property: The VpnServerConfiguration to which the p2sVpnGateway is attached to.
     *
     * @return the vpnServerConfiguration value.
     */
    public SubResource vpnServerConfiguration() {
        return this.vpnServerConfiguration;
    }

    /**
     * Set the vpnServerConfiguration property: The VpnServerConfiguration to which the p2sVpnGateway is attached to.
     *
     * @param vpnServerConfiguration the vpnServerConfiguration value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVpnServerConfiguration(SubResource vpnServerConfiguration) {
        this.vpnServerConfiguration = vpnServerConfiguration;
        return this;
    }

    /**
     * Get the vpnClientConnectionHealth property: All P2S VPN clients' connection health status.
     *
     * @return the vpnClientConnectionHealth value.
     */
    public VpnClientConnectionHealth vpnClientConnectionHealth() {
        return this.vpnClientConnectionHealth;
    }

    /**
     * Get the customDnsServers property: List of all customer specified DNS servers IP addresses.
     *
     * @return the customDnsServers value.
     */
    public List<String> customDnsServers() {
        return this.customDnsServers;
    }

    /**
     * Set the customDnsServers property: List of all customer specified DNS servers IP addresses.
     *
     * @param customDnsServers the customDnsServers value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withCustomDnsServers(List<String> customDnsServers) {
        this.customDnsServers = customDnsServers;
        return this;
    }

    /**
     * Get the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the P2SVpnGateway.
     *
     * @return the isRoutingPreferenceInternet value.
     */
    public Boolean isRoutingPreferenceInternet() {
        return this.isRoutingPreferenceInternet;
    }

    /**
     * Set the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the P2SVpnGateway.
     *
     * @param isRoutingPreferenceInternet the isRoutingPreferenceInternet value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withIsRoutingPreferenceInternet(Boolean isRoutingPreferenceInternet) {
        this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public P2SVpnGatewayInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public P2SVpnGatewayInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (p2SConnectionConfigurations() != null) {
            p2SConnectionConfigurations().forEach(e -> e.validate());
        }
        if (vpnClientConnectionHealth() != null) {
            vpnClientConnectionHealth().validate();
        }
    }
}
