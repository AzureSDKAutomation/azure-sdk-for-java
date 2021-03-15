// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.AadAuthenticationParameters;
import com.azure.resourcemanager.network.generated.models.IpsecPolicy;
import com.azure.resourcemanager.network.generated.models.RadiusServer;
import com.azure.resourcemanager.network.generated.models.VpnAuthenticationType;
import com.azure.resourcemanager.network.generated.models.VpnGatewayTunnelingProtocol;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigRadiusClientRootCertificate;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigRadiusServerRootCertificate;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigVpnClientRevokedCertificate;
import com.azure.resourcemanager.network.generated.models.VpnServerConfigVpnClientRootCertificate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** VpnServerConfiguration Resource. */
@JsonFlatten
@Fluent
public class VpnServerConfigurationInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnServerConfigurationInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The name of the VpnServerConfiguration that is unique within a resource
     * group.
     */
    @JsonProperty(value = "properties.name")
    private String namePropertiesName;

    /*
     * VPN protocols for the VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnProtocols")
    private List<VpnGatewayTunnelingProtocol> vpnProtocols;

    /*
     * VPN authentication types for the VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnAuthenticationTypes")
    private List<VpnAuthenticationType> vpnAuthenticationTypes;

    /*
     * VPN client root certificate of VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnClientRootCertificates")
    private List<VpnServerConfigVpnClientRootCertificate> vpnClientRootCertificates;

    /*
     * VPN client revoked certificate of VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnClientRevokedCertificates")
    private List<VpnServerConfigVpnClientRevokedCertificate> vpnClientRevokedCertificates;

    /*
     * Radius Server root certificate of VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.radiusServerRootCertificates")
    private List<VpnServerConfigRadiusServerRootCertificate> radiusServerRootCertificates;

    /*
     * Radius client root certificate of VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.radiusClientRootCertificates")
    private List<VpnServerConfigRadiusClientRootCertificate> radiusClientRootCertificates;

    /*
     * VpnClientIpsecPolicies for VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnClientIpsecPolicies")
    private List<IpsecPolicy> vpnClientIpsecPolicies;

    /*
     * The radius server address property of the VpnServerConfiguration
     * resource for point to site client connection.
     */
    @JsonProperty(value = "properties.radiusServerAddress")
    private String radiusServerAddress;

    /*
     * The radius secret property of the VpnServerConfiguration resource for
     * point to site client connection.
     */
    @JsonProperty(value = "properties.radiusServerSecret")
    private String radiusServerSecret;

    /*
     * Multiple Radius Server configuration for VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.radiusServers")
    private List<RadiusServer> radiusServers;

    /*
     * The set of aad vpn authentication parameters.
     */
    @JsonProperty(value = "properties.aadAuthenticationParameters")
    private AadAuthenticationParameters aadAuthenticationParameters;

    /*
     * The provisioning state of the VpnServerConfiguration resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * List of references to P2SVpnGateways.
     */
    @JsonProperty(value = "properties.p2SVpnGateways", access = JsonProperty.Access.WRITE_ONLY)
    private List<P2SVpnGatewayInner> p2SVpnGateways;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "properties.etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etagPropertiesEtag;

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
     * Get the namePropertiesName property: The name of the VpnServerConfiguration that is unique within a resource
     * group.
     *
     * @return the namePropertiesName value.
     */
    public String namePropertiesName() {
        return this.namePropertiesName;
    }

    /**
     * Set the namePropertiesName property: The name of the VpnServerConfiguration that is unique within a resource
     * group.
     *
     * @param namePropertiesName the namePropertiesName value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withNamePropertiesName(String namePropertiesName) {
        this.namePropertiesName = namePropertiesName;
        return this;
    }

    /**
     * Get the vpnProtocols property: VPN protocols for the VpnServerConfiguration.
     *
     * @return the vpnProtocols value.
     */
    public List<VpnGatewayTunnelingProtocol> vpnProtocols() {
        return this.vpnProtocols;
    }

    /**
     * Set the vpnProtocols property: VPN protocols for the VpnServerConfiguration.
     *
     * @param vpnProtocols the vpnProtocols value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnProtocols(List<VpnGatewayTunnelingProtocol> vpnProtocols) {
        this.vpnProtocols = vpnProtocols;
        return this;
    }

    /**
     * Get the vpnAuthenticationTypes property: VPN authentication types for the VpnServerConfiguration.
     *
     * @return the vpnAuthenticationTypes value.
     */
    public List<VpnAuthenticationType> vpnAuthenticationTypes() {
        return this.vpnAuthenticationTypes;
    }

    /**
     * Set the vpnAuthenticationTypes property: VPN authentication types for the VpnServerConfiguration.
     *
     * @param vpnAuthenticationTypes the vpnAuthenticationTypes value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnAuthenticationTypes(List<VpnAuthenticationType> vpnAuthenticationTypes) {
        this.vpnAuthenticationTypes = vpnAuthenticationTypes;
        return this;
    }

    /**
     * Get the vpnClientRootCertificates property: VPN client root certificate of VpnServerConfiguration.
     *
     * @return the vpnClientRootCertificates value.
     */
    public List<VpnServerConfigVpnClientRootCertificate> vpnClientRootCertificates() {
        return this.vpnClientRootCertificates;
    }

    /**
     * Set the vpnClientRootCertificates property: VPN client root certificate of VpnServerConfiguration.
     *
     * @param vpnClientRootCertificates the vpnClientRootCertificates value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnClientRootCertificates(
        List<VpnServerConfigVpnClientRootCertificate> vpnClientRootCertificates) {
        this.vpnClientRootCertificates = vpnClientRootCertificates;
        return this;
    }

    /**
     * Get the vpnClientRevokedCertificates property: VPN client revoked certificate of VpnServerConfiguration.
     *
     * @return the vpnClientRevokedCertificates value.
     */
    public List<VpnServerConfigVpnClientRevokedCertificate> vpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates;
    }

    /**
     * Set the vpnClientRevokedCertificates property: VPN client revoked certificate of VpnServerConfiguration.
     *
     * @param vpnClientRevokedCertificates the vpnClientRevokedCertificates value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnClientRevokedCertificates(
        List<VpnServerConfigVpnClientRevokedCertificate> vpnClientRevokedCertificates) {
        this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
        return this;
    }

    /**
     * Get the radiusServerRootCertificates property: Radius Server root certificate of VpnServerConfiguration.
     *
     * @return the radiusServerRootCertificates value.
     */
    public List<VpnServerConfigRadiusServerRootCertificate> radiusServerRootCertificates() {
        return this.radiusServerRootCertificates;
    }

    /**
     * Set the radiusServerRootCertificates property: Radius Server root certificate of VpnServerConfiguration.
     *
     * @param radiusServerRootCertificates the radiusServerRootCertificates value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusServerRootCertificates(
        List<VpnServerConfigRadiusServerRootCertificate> radiusServerRootCertificates) {
        this.radiusServerRootCertificates = radiusServerRootCertificates;
        return this;
    }

    /**
     * Get the radiusClientRootCertificates property: Radius client root certificate of VpnServerConfiguration.
     *
     * @return the radiusClientRootCertificates value.
     */
    public List<VpnServerConfigRadiusClientRootCertificate> radiusClientRootCertificates() {
        return this.radiusClientRootCertificates;
    }

    /**
     * Set the radiusClientRootCertificates property: Radius client root certificate of VpnServerConfiguration.
     *
     * @param radiusClientRootCertificates the radiusClientRootCertificates value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusClientRootCertificates(
        List<VpnServerConfigRadiusClientRootCertificate> radiusClientRootCertificates) {
        this.radiusClientRootCertificates = radiusClientRootCertificates;
        return this;
    }

    /**
     * Get the vpnClientIpsecPolicies property: VpnClientIpsecPolicies for VpnServerConfiguration.
     *
     * @return the vpnClientIpsecPolicies value.
     */
    public List<IpsecPolicy> vpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies;
    }

    /**
     * Set the vpnClientIpsecPolicies property: VpnClientIpsecPolicies for VpnServerConfiguration.
     *
     * @param vpnClientIpsecPolicies the vpnClientIpsecPolicies value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnClientIpsecPolicies(List<IpsecPolicy> vpnClientIpsecPolicies) {
        this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
        return this;
    }

    /**
     * Get the radiusServerAddress property: The radius server address property of the VpnServerConfiguration resource
     * for point to site client connection.
     *
     * @return the radiusServerAddress value.
     */
    public String radiusServerAddress() {
        return this.radiusServerAddress;
    }

    /**
     * Set the radiusServerAddress property: The radius server address property of the VpnServerConfiguration resource
     * for point to site client connection.
     *
     * @param radiusServerAddress the radiusServerAddress value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusServerAddress(String radiusServerAddress) {
        this.radiusServerAddress = radiusServerAddress;
        return this;
    }

    /**
     * Get the radiusServerSecret property: The radius secret property of the VpnServerConfiguration resource for point
     * to site client connection.
     *
     * @return the radiusServerSecret value.
     */
    public String radiusServerSecret() {
        return this.radiusServerSecret;
    }

    /**
     * Set the radiusServerSecret property: The radius secret property of the VpnServerConfiguration resource for point
     * to site client connection.
     *
     * @param radiusServerSecret the radiusServerSecret value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusServerSecret(String radiusServerSecret) {
        this.radiusServerSecret = radiusServerSecret;
        return this;
    }

    /**
     * Get the radiusServers property: Multiple Radius Server configuration for VpnServerConfiguration.
     *
     * @return the radiusServers value.
     */
    public List<RadiusServer> radiusServers() {
        return this.radiusServers;
    }

    /**
     * Set the radiusServers property: Multiple Radius Server configuration for VpnServerConfiguration.
     *
     * @param radiusServers the radiusServers value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusServers(List<RadiusServer> radiusServers) {
        this.radiusServers = radiusServers;
        return this;
    }

    /**
     * Get the aadAuthenticationParameters property: The set of aad vpn authentication parameters.
     *
     * @return the aadAuthenticationParameters value.
     */
    public AadAuthenticationParameters aadAuthenticationParameters() {
        return this.aadAuthenticationParameters;
    }

    /**
     * Set the aadAuthenticationParameters property: The set of aad vpn authentication parameters.
     *
     * @param aadAuthenticationParameters the aadAuthenticationParameters value to set.
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withAadAuthenticationParameters(
        AadAuthenticationParameters aadAuthenticationParameters) {
        this.aadAuthenticationParameters = aadAuthenticationParameters;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VpnServerConfiguration resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the p2SVpnGateways property: List of references to P2SVpnGateways.
     *
     * @return the p2SVpnGateways value.
     */
    public List<P2SVpnGatewayInner> p2SVpnGateways() {
        return this.p2SVpnGateways;
    }

    /**
     * Get the etagPropertiesEtag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etagPropertiesEtag value.
     */
    public String etagPropertiesEtag() {
        return this.etagPropertiesEtag;
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
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VpnServerConfigurationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VpnServerConfigurationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vpnClientRootCertificates() != null) {
            vpnClientRootCertificates().forEach(e -> e.validate());
        }
        if (vpnClientRevokedCertificates() != null) {
            vpnClientRevokedCertificates().forEach(e -> e.validate());
        }
        if (radiusServerRootCertificates() != null) {
            radiusServerRootCertificates().forEach(e -> e.validate());
        }
        if (radiusClientRootCertificates() != null) {
            radiusClientRootCertificates().forEach(e -> e.validate());
        }
        if (vpnClientIpsecPolicies() != null) {
            vpnClientIpsecPolicies().forEach(e -> e.validate());
        }
        if (radiusServers() != null) {
            radiusServers().forEach(e -> e.validate());
        }
        if (aadAuthenticationParameters() != null) {
            aadAuthenticationParameters().validate();
        }
        if (p2SVpnGateways() != null) {
            p2SVpnGateways().forEach(e -> e.validate());
        }
    }
}
