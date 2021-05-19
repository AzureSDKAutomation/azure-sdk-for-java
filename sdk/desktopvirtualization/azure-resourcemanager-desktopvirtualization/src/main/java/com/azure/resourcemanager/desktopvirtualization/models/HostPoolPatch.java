// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** HostPool properties that can be patched. */
@JsonFlatten
@Fluent
public class HostPoolPatch extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HostPoolPatch.class);

    /*
     * tags to be updated
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Friendly name of HostPool.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /*
     * Description of HostPool.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Custom rdp property of HostPool.
     */
    @JsonProperty(value = "properties.customRdpProperty")
    private String customRdpProperty;

    /*
     * The max session limit of HostPool.
     */
    @JsonProperty(value = "properties.maxSessionLimit")
    private Integer maxSessionLimit;

    /*
     * PersonalDesktopAssignment type for HostPool.
     */
    @JsonProperty(value = "properties.personalDesktopAssignmentType")
    private PersonalDesktopAssignmentType personalDesktopAssignmentType;

    /*
     * The type of the load balancer.
     */
    @JsonProperty(value = "properties.loadBalancerType")
    private LoadBalancerType loadBalancerType;

    /*
     * The ring number of HostPool.
     */
    @JsonProperty(value = "properties.ring")
    private Integer ring;

    /*
     * Is validation environment.
     */
    @JsonProperty(value = "properties.validationEnvironment")
    private Boolean validationEnvironment;

    /*
     * The registration info of HostPool.
     */
    @JsonProperty(value = "properties.registrationInfo")
    private RegistrationInfoPatch registrationInfo;

    /*
     * VM template for sessionhosts configuration within hostpool.
     */
    @JsonProperty(value = "properties.vmTemplate")
    private String vmTemplate;

    /*
     * URL to customer ADFS server for signing WVD SSO certificates.
     */
    @JsonProperty(value = "properties.ssoadfsAuthority")
    private String ssoadfsAuthority;

    /*
     * ClientId for the registered Relying Party used to issue WVD SSO
     * certificates.
     */
    @JsonProperty(value = "properties.ssoClientId")
    private String ssoClientId;

    /*
     * Path to Azure KeyVault storing the secret used for communication to
     * ADFS.
     */
    @JsonProperty(value = "properties.ssoClientSecretKeyVaultPath")
    private String ssoClientSecretKeyVaultPath;

    /*
     * The type of single sign on Secret Type.
     */
    @JsonProperty(value = "properties.ssoSecretType")
    private SsoSecretType ssoSecretType;

    /*
     * The type of preferred application group type, default to Desktop
     * Application Group
     */
    @JsonProperty(value = "properties.preferredAppGroupType")
    private PreferredAppGroupType preferredAppGroupType;

    /*
     * The flag to turn on/off StartVMOnConnect feature.
     */
    @JsonProperty(value = "properties.startVMOnConnect")
    private Boolean startVMOnConnect;

    /*
     * Enabled to allow this resource to be access from the public network
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * Get the tags property: tags to be updated.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: tags to be updated.
     *
     * @param tags the tags value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of HostPool.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of HostPool.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the description property: Description of HostPool.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of HostPool.
     *
     * @param description the description value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the customRdpProperty property: Custom rdp property of HostPool.
     *
     * @return the customRdpProperty value.
     */
    public String customRdpProperty() {
        return this.customRdpProperty;
    }

    /**
     * Set the customRdpProperty property: Custom rdp property of HostPool.
     *
     * @param customRdpProperty the customRdpProperty value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withCustomRdpProperty(String customRdpProperty) {
        this.customRdpProperty = customRdpProperty;
        return this;
    }

    /**
     * Get the maxSessionLimit property: The max session limit of HostPool.
     *
     * @return the maxSessionLimit value.
     */
    public Integer maxSessionLimit() {
        return this.maxSessionLimit;
    }

    /**
     * Set the maxSessionLimit property: The max session limit of HostPool.
     *
     * @param maxSessionLimit the maxSessionLimit value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withMaxSessionLimit(Integer maxSessionLimit) {
        this.maxSessionLimit = maxSessionLimit;
        return this;
    }

    /**
     * Get the personalDesktopAssignmentType property: PersonalDesktopAssignment type for HostPool.
     *
     * @return the personalDesktopAssignmentType value.
     */
    public PersonalDesktopAssignmentType personalDesktopAssignmentType() {
        return this.personalDesktopAssignmentType;
    }

    /**
     * Set the personalDesktopAssignmentType property: PersonalDesktopAssignment type for HostPool.
     *
     * @param personalDesktopAssignmentType the personalDesktopAssignmentType value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withPersonalDesktopAssignmentType(
        PersonalDesktopAssignmentType personalDesktopAssignmentType) {
        this.personalDesktopAssignmentType = personalDesktopAssignmentType;
        return this;
    }

    /**
     * Get the loadBalancerType property: The type of the load balancer.
     *
     * @return the loadBalancerType value.
     */
    public LoadBalancerType loadBalancerType() {
        return this.loadBalancerType;
    }

    /**
     * Set the loadBalancerType property: The type of the load balancer.
     *
     * @param loadBalancerType the loadBalancerType value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withLoadBalancerType(LoadBalancerType loadBalancerType) {
        this.loadBalancerType = loadBalancerType;
        return this;
    }

    /**
     * Get the ring property: The ring number of HostPool.
     *
     * @return the ring value.
     */
    public Integer ring() {
        return this.ring;
    }

    /**
     * Set the ring property: The ring number of HostPool.
     *
     * @param ring the ring value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withRing(Integer ring) {
        this.ring = ring;
        return this;
    }

    /**
     * Get the validationEnvironment property: Is validation environment.
     *
     * @return the validationEnvironment value.
     */
    public Boolean validationEnvironment() {
        return this.validationEnvironment;
    }

    /**
     * Set the validationEnvironment property: Is validation environment.
     *
     * @param validationEnvironment the validationEnvironment value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withValidationEnvironment(Boolean validationEnvironment) {
        this.validationEnvironment = validationEnvironment;
        return this;
    }

    /**
     * Get the registrationInfo property: The registration info of HostPool.
     *
     * @return the registrationInfo value.
     */
    public RegistrationInfoPatch registrationInfo() {
        return this.registrationInfo;
    }

    /**
     * Set the registrationInfo property: The registration info of HostPool.
     *
     * @param registrationInfo the registrationInfo value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withRegistrationInfo(RegistrationInfoPatch registrationInfo) {
        this.registrationInfo = registrationInfo;
        return this;
    }

    /**
     * Get the vmTemplate property: VM template for sessionhosts configuration within hostpool.
     *
     * @return the vmTemplate value.
     */
    public String vmTemplate() {
        return this.vmTemplate;
    }

    /**
     * Set the vmTemplate property: VM template for sessionhosts configuration within hostpool.
     *
     * @param vmTemplate the vmTemplate value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withVmTemplate(String vmTemplate) {
        this.vmTemplate = vmTemplate;
        return this;
    }

    /**
     * Get the ssoadfsAuthority property: URL to customer ADFS server for signing WVD SSO certificates.
     *
     * @return the ssoadfsAuthority value.
     */
    public String ssoadfsAuthority() {
        return this.ssoadfsAuthority;
    }

    /**
     * Set the ssoadfsAuthority property: URL to customer ADFS server for signing WVD SSO certificates.
     *
     * @param ssoadfsAuthority the ssoadfsAuthority value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withSsoadfsAuthority(String ssoadfsAuthority) {
        this.ssoadfsAuthority = ssoadfsAuthority;
        return this;
    }

    /**
     * Get the ssoClientId property: ClientId for the registered Relying Party used to issue WVD SSO certificates.
     *
     * @return the ssoClientId value.
     */
    public String ssoClientId() {
        return this.ssoClientId;
    }

    /**
     * Set the ssoClientId property: ClientId for the registered Relying Party used to issue WVD SSO certificates.
     *
     * @param ssoClientId the ssoClientId value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withSsoClientId(String ssoClientId) {
        this.ssoClientId = ssoClientId;
        return this;
    }

    /**
     * Get the ssoClientSecretKeyVaultPath property: Path to Azure KeyVault storing the secret used for communication to
     * ADFS.
     *
     * @return the ssoClientSecretKeyVaultPath value.
     */
    public String ssoClientSecretKeyVaultPath() {
        return this.ssoClientSecretKeyVaultPath;
    }

    /**
     * Set the ssoClientSecretKeyVaultPath property: Path to Azure KeyVault storing the secret used for communication to
     * ADFS.
     *
     * @param ssoClientSecretKeyVaultPath the ssoClientSecretKeyVaultPath value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withSsoClientSecretKeyVaultPath(String ssoClientSecretKeyVaultPath) {
        this.ssoClientSecretKeyVaultPath = ssoClientSecretKeyVaultPath;
        return this;
    }

    /**
     * Get the ssoSecretType property: The type of single sign on Secret Type.
     *
     * @return the ssoSecretType value.
     */
    public SsoSecretType ssoSecretType() {
        return this.ssoSecretType;
    }

    /**
     * Set the ssoSecretType property: The type of single sign on Secret Type.
     *
     * @param ssoSecretType the ssoSecretType value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withSsoSecretType(SsoSecretType ssoSecretType) {
        this.ssoSecretType = ssoSecretType;
        return this;
    }

    /**
     * Get the preferredAppGroupType property: The type of preferred application group type, default to Desktop
     * Application Group.
     *
     * @return the preferredAppGroupType value.
     */
    public PreferredAppGroupType preferredAppGroupType() {
        return this.preferredAppGroupType;
    }

    /**
     * Set the preferredAppGroupType property: The type of preferred application group type, default to Desktop
     * Application Group.
     *
     * @param preferredAppGroupType the preferredAppGroupType value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withPreferredAppGroupType(PreferredAppGroupType preferredAppGroupType) {
        this.preferredAppGroupType = preferredAppGroupType;
        return this;
    }

    /**
     * Get the startVMOnConnect property: The flag to turn on/off StartVMOnConnect feature.
     *
     * @return the startVMOnConnect value.
     */
    public Boolean startVMOnConnect() {
        return this.startVMOnConnect;
    }

    /**
     * Set the startVMOnConnect property: The flag to turn on/off StartVMOnConnect feature.
     *
     * @param startVMOnConnect the startVMOnConnect value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withStartVMOnConnect(Boolean startVMOnConnect) {
        this.startVMOnConnect = startVMOnConnect;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Enabled to allow this resource to be access from the public network.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Enabled to allow this resource to be access from the public network.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (registrationInfo() != null) {
            registrationInfo().validate();
        }
    }
}
