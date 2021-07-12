// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.models.EncryptionProperty;
import com.azure.resourcemanager.machinelearningservices.models.Identity;
import com.azure.resourcemanager.machinelearningservices.models.ProvisioningState;
import com.azure.resourcemanager.machinelearningservices.models.PublicNetworkAccess;
import com.azure.resourcemanager.machinelearningservices.models.ServiceManagedResourcesSettings;
import com.azure.resourcemanager.machinelearningservices.models.SharedPrivateLinkResource;
import com.azure.resourcemanager.machinelearningservices.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** An object that represents a machine learning workspace. */
@JsonFlatten
@Fluent
public class WorkspaceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspaceInner.class);

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * Specifies the location of the resource.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Contains resource tags defined as key/value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The sku of the workspace.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * System data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The immutable id associated with this workspace.
     */
    @JsonProperty(value = "properties.workspaceId", access = JsonProperty.Access.WRITE_ONLY)
    private String workspaceId;

    /*
     * The description of this workspace.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The friendly name for this workspace. This name in mutable
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /*
     * ARM id of the key vault associated with this workspace. This cannot be
     * changed once the workspace has been created
     */
    @JsonProperty(value = "properties.keyVault")
    private String keyVault;

    /*
     * ARM id of the application insights associated with this workspace. This
     * cannot be changed once the workspace has been created
     */
    @JsonProperty(value = "properties.applicationInsights")
    private String applicationInsights;

    /*
     * ARM id of the container registry associated with this workspace. This
     * cannot be changed once the workspace has been created
     */
    @JsonProperty(value = "properties.containerRegistry")
    private String containerRegistry;

    /*
     * ARM id of the storage account associated with this workspace. This
     * cannot be changed once the workspace has been created
     */
    @JsonProperty(value = "properties.storageAccount")
    private String storageAccount;

    /*
     * Url for the discovery service to identify regional endpoints for machine
     * learning experimentation services
     */
    @JsonProperty(value = "properties.discoveryUrl")
    private String discoveryUrl;

    /*
     * The current deployment state of workspace resource. The
     * provisioningState is to indicate states for resource provisioning.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The encryption settings of Azure ML workspace.
     */
    @JsonProperty(value = "properties.encryption")
    private EncryptionProperty encryption;

    /*
     * The flag to signal HBI data in the workspace and reduce diagnostic data
     * collected by the service
     */
    @JsonProperty(value = "properties.hbiWorkspace")
    private Boolean hbiWorkspace;

    /*
     * The name of the managed resource group created by workspace RP in
     * customer subscription if the workspace is CMK workspace
     */
    @JsonProperty(value = "properties.serviceProvisionedResourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceProvisionedResourceGroup;

    /*
     * Count of private connections in the workspace
     */
    @JsonProperty(value = "properties.privateLinkCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer privateLinkCount;

    /*
     * The compute name for image build
     */
    @JsonProperty(value = "properties.imageBuildCompute")
    private String imageBuildCompute;

    /*
     * The flag to indicate whether to allow public access when behind VNet.
     */
    @JsonProperty(value = "properties.allowPublicAccessWhenBehindVnet")
    private Boolean allowPublicAccessWhenBehindVnet;

    /*
     * Whether requests from Public Network are allowed.
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The list of private endpoint connections in the workspace.
     */
    @JsonProperty(value = "properties.privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The list of shared private link resources in this workspace.
     */
    @JsonProperty(value = "properties.sharedPrivateLinkResources")
    private List<SharedPrivateLinkResource> sharedPrivateLinkResources;

    /*
     * The notebook info of Azure ML workspace.
     */
    @JsonProperty(value = "properties.notebookInfo", access = JsonProperty.Access.WRITE_ONLY)
    private NotebookResourceInfoInner notebookInfo;

    /*
     * The service managed resource settings.
     */
    @JsonProperty(value = "properties.serviceManagedResourcesSettings")
    private ServiceManagedResourcesSettings serviceManagedResourcesSettings;

    /*
     * The user assigned identity resource id that represents the workspace
     * identity.
     */
    @JsonProperty(value = "properties.primaryUserAssignedIdentity")
    private String primaryUserAssignedIdentity;

    /*
     * The tenant id associated with this workspace.
     */
    @JsonProperty(value = "properties.tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * If the storage associated with the workspace has HNS enabled.
     */
    @JsonProperty(value = "properties.storageHnsEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private String storageHnsEnabled;

    /*
     * The URI associated with this workspace that machine learning flow must
     * point at to set up tracking.
     */
    @JsonProperty(value = "properties.mlFlowTrackingUri", access = JsonProperty.Access.WRITE_ONLY)
    private String mlFlowTrackingUri;

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the location property: Specifies the location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Specifies the location of the resource.
     *
     * @param location the location value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Contains resource tags defined as key/value pairs.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Contains resource tags defined as key/value pairs.
     *
     * @param tags the tags value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: The sku of the workspace.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku of the workspace.
     *
     * @param sku the sku value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: System data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the workspaceId property: The immutable id associated with this workspace.
     *
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Get the description property: The description of this workspace.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of this workspace.
     *
     * @param description the description value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the friendlyName property: The friendly name for this workspace. This name in mutable.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: The friendly name for this workspace. This name in mutable.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the keyVault property: ARM id of the key vault associated with this workspace. This cannot be changed once
     * the workspace has been created.
     *
     * @return the keyVault value.
     */
    public String keyVault() {
        return this.keyVault;
    }

    /**
     * Set the keyVault property: ARM id of the key vault associated with this workspace. This cannot be changed once
     * the workspace has been created.
     *
     * @param keyVault the keyVault value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withKeyVault(String keyVault) {
        this.keyVault = keyVault;
        return this;
    }

    /**
     * Get the applicationInsights property: ARM id of the application insights associated with this workspace. This
     * cannot be changed once the workspace has been created.
     *
     * @return the applicationInsights value.
     */
    public String applicationInsights() {
        return this.applicationInsights;
    }

    /**
     * Set the applicationInsights property: ARM id of the application insights associated with this workspace. This
     * cannot be changed once the workspace has been created.
     *
     * @param applicationInsights the applicationInsights value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withApplicationInsights(String applicationInsights) {
        this.applicationInsights = applicationInsights;
        return this;
    }

    /**
     * Get the containerRegistry property: ARM id of the container registry associated with this workspace. This cannot
     * be changed once the workspace has been created.
     *
     * @return the containerRegistry value.
     */
    public String containerRegistry() {
        return this.containerRegistry;
    }

    /**
     * Set the containerRegistry property: ARM id of the container registry associated with this workspace. This cannot
     * be changed once the workspace has been created.
     *
     * @param containerRegistry the containerRegistry value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withContainerRegistry(String containerRegistry) {
        this.containerRegistry = containerRegistry;
        return this;
    }

    /**
     * Get the storageAccount property: ARM id of the storage account associated with this workspace. This cannot be
     * changed once the workspace has been created.
     *
     * @return the storageAccount value.
     */
    public String storageAccount() {
        return this.storageAccount;
    }

    /**
     * Set the storageAccount property: ARM id of the storage account associated with this workspace. This cannot be
     * changed once the workspace has been created.
     *
     * @param storageAccount the storageAccount value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withStorageAccount(String storageAccount) {
        this.storageAccount = storageAccount;
        return this;
    }

    /**
     * Get the discoveryUrl property: Url for the discovery service to identify regional endpoints for machine learning
     * experimentation services.
     *
     * @return the discoveryUrl value.
     */
    public String discoveryUrl() {
        return this.discoveryUrl;
    }

    /**
     * Set the discoveryUrl property: Url for the discovery service to identify regional endpoints for machine learning
     * experimentation services.
     *
     * @param discoveryUrl the discoveryUrl value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
        return this;
    }

    /**
     * Get the provisioningState property: The current deployment state of workspace resource. The provisioningState is
     * to indicate states for resource provisioning.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the encryption property: The encryption settings of Azure ML workspace.
     *
     * @return the encryption value.
     */
    public EncryptionProperty encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The encryption settings of Azure ML workspace.
     *
     * @param encryption the encryption value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withEncryption(EncryptionProperty encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the hbiWorkspace property: The flag to signal HBI data in the workspace and reduce diagnostic data collected
     * by the service.
     *
     * @return the hbiWorkspace value.
     */
    public Boolean hbiWorkspace() {
        return this.hbiWorkspace;
    }

    /**
     * Set the hbiWorkspace property: The flag to signal HBI data in the workspace and reduce diagnostic data collected
     * by the service.
     *
     * @param hbiWorkspace the hbiWorkspace value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withHbiWorkspace(Boolean hbiWorkspace) {
        this.hbiWorkspace = hbiWorkspace;
        return this;
    }

    /**
     * Get the serviceProvisionedResourceGroup property: The name of the managed resource group created by workspace RP
     * in customer subscription if the workspace is CMK workspace.
     *
     * @return the serviceProvisionedResourceGroup value.
     */
    public String serviceProvisionedResourceGroup() {
        return this.serviceProvisionedResourceGroup;
    }

    /**
     * Get the privateLinkCount property: Count of private connections in the workspace.
     *
     * @return the privateLinkCount value.
     */
    public Integer privateLinkCount() {
        return this.privateLinkCount;
    }

    /**
     * Get the imageBuildCompute property: The compute name for image build.
     *
     * @return the imageBuildCompute value.
     */
    public String imageBuildCompute() {
        return this.imageBuildCompute;
    }

    /**
     * Set the imageBuildCompute property: The compute name for image build.
     *
     * @param imageBuildCompute the imageBuildCompute value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withImageBuildCompute(String imageBuildCompute) {
        this.imageBuildCompute = imageBuildCompute;
        return this;
    }

    /**
     * Get the allowPublicAccessWhenBehindVnet property: The flag to indicate whether to allow public access when behind
     * VNet.
     *
     * @return the allowPublicAccessWhenBehindVnet value.
     */
    public Boolean allowPublicAccessWhenBehindVnet() {
        return this.allowPublicAccessWhenBehindVnet;
    }

    /**
     * Set the allowPublicAccessWhenBehindVnet property: The flag to indicate whether to allow public access when behind
     * VNet.
     *
     * @param allowPublicAccessWhenBehindVnet the allowPublicAccessWhenBehindVnet value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withAllowPublicAccessWhenBehindVnet(Boolean allowPublicAccessWhenBehindVnet) {
        this.allowPublicAccessWhenBehindVnet = allowPublicAccessWhenBehindVnet;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: The list of private endpoint connections in the workspace.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the sharedPrivateLinkResources property: The list of shared private link resources in this workspace.
     *
     * @return the sharedPrivateLinkResources value.
     */
    public List<SharedPrivateLinkResource> sharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources;
    }

    /**
     * Set the sharedPrivateLinkResources property: The list of shared private link resources in this workspace.
     *
     * @param sharedPrivateLinkResources the sharedPrivateLinkResources value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withSharedPrivateLinkResources(List<SharedPrivateLinkResource> sharedPrivateLinkResources) {
        this.sharedPrivateLinkResources = sharedPrivateLinkResources;
        return this;
    }

    /**
     * Get the notebookInfo property: The notebook info of Azure ML workspace.
     *
     * @return the notebookInfo value.
     */
    public NotebookResourceInfoInner notebookInfo() {
        return this.notebookInfo;
    }

    /**
     * Get the serviceManagedResourcesSettings property: The service managed resource settings.
     *
     * @return the serviceManagedResourcesSettings value.
     */
    public ServiceManagedResourcesSettings serviceManagedResourcesSettings() {
        return this.serviceManagedResourcesSettings;
    }

    /**
     * Set the serviceManagedResourcesSettings property: The service managed resource settings.
     *
     * @param serviceManagedResourcesSettings the serviceManagedResourcesSettings value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withServiceManagedResourcesSettings(
        ServiceManagedResourcesSettings serviceManagedResourcesSettings) {
        this.serviceManagedResourcesSettings = serviceManagedResourcesSettings;
        return this;
    }

    /**
     * Get the primaryUserAssignedIdentity property: The user assigned identity resource id that represents the
     * workspace identity.
     *
     * @return the primaryUserAssignedIdentity value.
     */
    public String primaryUserAssignedIdentity() {
        return this.primaryUserAssignedIdentity;
    }

    /**
     * Set the primaryUserAssignedIdentity property: The user assigned identity resource id that represents the
     * workspace identity.
     *
     * @param primaryUserAssignedIdentity the primaryUserAssignedIdentity value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withPrimaryUserAssignedIdentity(String primaryUserAssignedIdentity) {
        this.primaryUserAssignedIdentity = primaryUserAssignedIdentity;
        return this;
    }

    /**
     * Get the tenantId property: The tenant id associated with this workspace.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the storageHnsEnabled property: If the storage associated with the workspace has HNS enabled.
     *
     * @return the storageHnsEnabled value.
     */
    public String storageHnsEnabled() {
        return this.storageHnsEnabled;
    }

    /**
     * Get the mlFlowTrackingUri property: The URI associated with this workspace that machine learning flow must point
     * at to set up tracking.
     *
     * @return the mlFlowTrackingUri value.
     */
    public String mlFlowTrackingUri() {
        return this.mlFlowTrackingUri;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (sharedPrivateLinkResources() != null) {
            sharedPrivateLinkResources().forEach(e -> e.validate());
        }
        if (notebookInfo() != null) {
            notebookInfo().validate();
        }
        if (serviceManagedResourcesSettings() != null) {
            serviceManagedResourcesSettings().validate();
        }
    }
}
