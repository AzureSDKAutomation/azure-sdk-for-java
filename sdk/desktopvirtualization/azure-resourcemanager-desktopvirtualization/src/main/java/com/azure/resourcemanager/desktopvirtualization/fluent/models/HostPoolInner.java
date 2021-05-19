// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolType;
import com.azure.resourcemanager.desktopvirtualization.models.LoadBalancerType;
import com.azure.resourcemanager.desktopvirtualization.models.MigrationRequestProperties;
import com.azure.resourcemanager.desktopvirtualization.models.PersonalDesktopAssignmentType;
import com.azure.resourcemanager.desktopvirtualization.models.PreferredAppGroupType;
import com.azure.resourcemanager.desktopvirtualization.models.PublicNetworkAccess;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySet;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySetIdentity;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySetPlan;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySetSku;
import com.azure.resourcemanager.desktopvirtualization.models.SsoSecretType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Represents a HostPool definition. */
@JsonFlatten
@Fluent
public class HostPoolInner extends ResourceModelWithAllowedPropertySet {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HostPoolInner.class);

    /*
     * ObjectId of HostPool. (internal use)
     */
    @JsonProperty(value = "properties.objectId", access = JsonProperty.Access.WRITE_ONLY)
    private String objectId;

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
     * Description of HostPool.
     */
    @JsonProperty(value = "properties.newProperty")
    private String newProperty;

    /*
     * HostPool type for desktop.
     */
    @JsonProperty(value = "properties.hostPoolType", required = true)
    private HostPoolType hostPoolType;

    /*
     * PersonalDesktopAssignment type for HostPool.
     */
    @JsonProperty(value = "properties.personalDesktopAssignmentType")
    private PersonalDesktopAssignmentType personalDesktopAssignmentType;

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
     * The type of the load balancer.
     */
    @JsonProperty(value = "properties.loadBalancerType", required = true)
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
    private RegistrationInfoInner registrationInfo;

    /*
     * VM template for sessionhosts configuration within hostpool.
     */
    @JsonProperty(value = "properties.vmTemplate")
    private String vmTemplate;

    /*
     * List of applicationGroup links.
     */
    @JsonProperty(value = "properties.applicationGroupReferences", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> applicationGroupReferences;

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
    @JsonProperty(value = "properties.preferredAppGroupType", required = true)
    private PreferredAppGroupType preferredAppGroupType;

    /*
     * The flag to turn on/off StartVMOnConnect feature.
     */
    @JsonProperty(value = "properties.startVMOnConnect")
    private Boolean startVMOnConnect;

    /*
     * The registration info of HostPool.
     */
    @JsonProperty(value = "properties.migrationRequest")
    private MigrationRequestProperties migrationRequest;

    /*
     * Is cloud pc resource.
     */
    @JsonProperty(value = "properties.cloudPcResource", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean cloudPcResource;

    /*
     * Enabled allows this resource to be accessed from both public and private
     * networks, Disabled allows this resource to only be accessed via private
     * endpoints
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * Get the objectId property: ObjectId of HostPool. (internal use).
     *
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withFriendlyName(String friendlyName) {
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the newProperty property: Description of HostPool.
     *
     * @return the newProperty value.
     */
    public String newProperty() {
        return this.newProperty;
    }

    /**
     * Set the newProperty property: Description of HostPool.
     *
     * @param newProperty the newProperty value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withNewProperty(String newProperty) {
        this.newProperty = newProperty;
        return this;
    }

    /**
     * Get the hostPoolType property: HostPool type for desktop.
     *
     * @return the hostPoolType value.
     */
    public HostPoolType hostPoolType() {
        return this.hostPoolType;
    }

    /**
     * Set the hostPoolType property: HostPool type for desktop.
     *
     * @param hostPoolType the hostPoolType value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withHostPoolType(HostPoolType hostPoolType) {
        this.hostPoolType = hostPoolType;
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withPersonalDesktopAssignmentType(
        PersonalDesktopAssignmentType personalDesktopAssignmentType) {
        this.personalDesktopAssignmentType = personalDesktopAssignmentType;
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withCustomRdpProperty(String customRdpProperty) {
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withMaxSessionLimit(Integer maxSessionLimit) {
        this.maxSessionLimit = maxSessionLimit;
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withLoadBalancerType(LoadBalancerType loadBalancerType) {
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withRing(Integer ring) {
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withValidationEnvironment(Boolean validationEnvironment) {
        this.validationEnvironment = validationEnvironment;
        return this;
    }

    /**
     * Get the registrationInfo property: The registration info of HostPool.
     *
     * @return the registrationInfo value.
     */
    public RegistrationInfoInner registrationInfo() {
        return this.registrationInfo;
    }

    /**
     * Set the registrationInfo property: The registration info of HostPool.
     *
     * @param registrationInfo the registrationInfo value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withRegistrationInfo(RegistrationInfoInner registrationInfo) {
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withVmTemplate(String vmTemplate) {
        this.vmTemplate = vmTemplate;
        return this;
    }

    /**
     * Get the applicationGroupReferences property: List of applicationGroup links.
     *
     * @return the applicationGroupReferences value.
     */
    public List<String> applicationGroupReferences() {
        return this.applicationGroupReferences;
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withSsoadfsAuthority(String ssoadfsAuthority) {
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withSsoClientId(String ssoClientId) {
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withSsoClientSecretKeyVaultPath(String ssoClientSecretKeyVaultPath) {
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withSsoSecretType(SsoSecretType ssoSecretType) {
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withPreferredAppGroupType(PreferredAppGroupType preferredAppGroupType) {
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
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withStartVMOnConnect(Boolean startVMOnConnect) {
        this.startVMOnConnect = startVMOnConnect;
        return this;
    }

    /**
     * Get the migrationRequest property: The registration info of HostPool.
     *
     * @return the migrationRequest value.
     */
    public MigrationRequestProperties migrationRequest() {
        return this.migrationRequest;
    }

    /**
     * Set the migrationRequest property: The registration info of HostPool.
     *
     * @param migrationRequest the migrationRequest value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withMigrationRequest(MigrationRequestProperties migrationRequest) {
        this.migrationRequest = migrationRequest;
        return this;
    }

    /**
     * Get the cloudPcResource property: Is cloud pc resource.
     *
     * @return the cloudPcResource value.
     */
    public Boolean cloudPcResource() {
        return this.cloudPcResource;
    }

    /**
     * Get the publicNetworkAccess property: Enabled allows this resource to be accessed from both public and private
     * networks, Disabled allows this resource to only be accessed via private endpoints.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Enabled allows this resource to be accessed from both public and private
     * networks, Disabled allows this resource to only be accessed via private endpoints.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withManagedBy(String managedBy) {
        super.withManagedBy(managedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withIdentity(ResourceModelWithAllowedPropertySetIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withSku(ResourceModelWithAllowedPropertySetSku sku) {
        super.withSku(sku);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withPlan(ResourceModelWithAllowedPropertySetPlan plan) {
        super.withPlan(plan);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HostPoolInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (hostPoolType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property hostPoolType in model HostPoolInner"));
        }
        if (loadBalancerType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property loadBalancerType in model HostPoolInner"));
        }
        if (registrationInfo() != null) {
            registrationInfo().validate();
        }
        if (preferredAppGroupType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property preferredAppGroupType in model HostPoolInner"));
        }
        if (migrationRequest() != null) {
            migrationRequest().validate();
        }
    }
}
