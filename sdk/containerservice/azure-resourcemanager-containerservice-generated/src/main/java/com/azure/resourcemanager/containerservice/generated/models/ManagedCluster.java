// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservice.generated.fluent.models.ManagedClusterInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ManagedCluster. */
public interface ManagedCluster {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: The managed cluster SKU.
     *
     * @return the sku value.
     */
    ManagedClusterSku sku();

    /**
     * Gets the identity property: The identity of the managed cluster, if configured.
     *
     * @return the identity value.
     */
    ManagedClusterIdentity identity();

    /**
     * Gets the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the powerState property: Represents the Power State of the cluster.
     *
     * @return the powerState value.
     */
    PowerState powerState();

    /**
     * Gets the maxAgentPools property: The max number of agent pools for the managed cluster.
     *
     * @return the maxAgentPools value.
     */
    Integer maxAgentPools();

    /**
     * Gets the kubernetesVersion property: Version of Kubernetes specified when creating the managed cluster.
     *
     * @return the kubernetesVersion value.
     */
    String kubernetesVersion();

    /**
     * Gets the dnsPrefix property: DNS prefix specified when creating the managed cluster.
     *
     * @return the dnsPrefix value.
     */
    String dnsPrefix();

    /**
     * Gets the fqdnSubdomain property: FQDN subdomain specified when creating private cluster with custom private dns
     * zone.
     *
     * @return the fqdnSubdomain value.
     */
    String fqdnSubdomain();

    /**
     * Gets the fqdn property: FQDN for the master pool.
     *
     * @return the fqdn value.
     */
    String fqdn();

    /**
     * Gets the privateFqdn property: FQDN of private cluster.
     *
     * @return the privateFqdn value.
     */
    String privateFqdn();

    /**
     * Gets the agentPoolProfiles property: Properties of the agent pool.
     *
     * @return the agentPoolProfiles value.
     */
    List<ManagedClusterAgentPoolProfile> agentPoolProfiles();

    /**
     * Gets the linuxProfile property: Profile for Linux VMs in the container service cluster.
     *
     * @return the linuxProfile value.
     */
    ContainerServiceLinuxProfile linuxProfile();

    /**
     * Gets the windowsProfile property: Profile for Windows VMs in the container service cluster.
     *
     * @return the windowsProfile value.
     */
    ManagedClusterWindowsProfile windowsProfile();

    /**
     * Gets the servicePrincipalProfile property: Information about a service principal identity for the cluster to use
     * for manipulating Azure APIs.
     *
     * @return the servicePrincipalProfile value.
     */
    ManagedClusterServicePrincipalProfile servicePrincipalProfile();

    /**
     * Gets the addonProfiles property: Profile of managed cluster add-on.
     *
     * @return the addonProfiles value.
     */
    Map<String, ManagedClusterAddonProfile> addonProfiles();

    /**
     * Gets the podIdentityProfile property: Profile of managed cluster pod identity.
     *
     * @return the podIdentityProfile value.
     */
    ManagedClusterPodIdentityProfile podIdentityProfile();

    /**
     * Gets the nodeResourceGroup property: Name of the resource group containing agent pool nodes.
     *
     * @return the nodeResourceGroup value.
     */
    String nodeResourceGroup();

    /**
     * Gets the enableRbac property: Whether to enable Kubernetes Role-Based Access Control.
     *
     * @return the enableRbac value.
     */
    Boolean enableRbac();

    /**
     * Gets the enablePodSecurityPolicy property: (DEPRECATING) Whether to enable Kubernetes pod security policy
     * (preview). This feature is set for removal on October 15th, 2020. Learn more at aka.ms/aks/azpodpolicy.
     *
     * @return the enablePodSecurityPolicy value.
     */
    Boolean enablePodSecurityPolicy();

    /**
     * Gets the networkProfile property: Profile of network configuration.
     *
     * @return the networkProfile value.
     */
    ContainerServiceNetworkProfile networkProfile();

    /**
     * Gets the aadProfile property: Profile of Azure Active Directory configuration.
     *
     * @return the aadProfile value.
     */
    ManagedClusterAadProfile aadProfile();

    /**
     * Gets the autoUpgradeProfile property: Profile of auto upgrade configuration.
     *
     * @return the autoUpgradeProfile value.
     */
    ManagedClusterAutoUpgradeProfile autoUpgradeProfile();

    /**
     * Gets the autoScalerProfile property: Parameters to be applied to the cluster-autoscaler when enabled.
     *
     * @return the autoScalerProfile value.
     */
    ManagedClusterPropertiesAutoScalerProfile autoScalerProfile();

    /**
     * Gets the apiServerAccessProfile property: Access profile for managed cluster API server.
     *
     * @return the apiServerAccessProfile value.
     */
    ManagedClusterApiServerAccessProfile apiServerAccessProfile();

    /**
     * Gets the diskEncryptionSetId property: ResourceId of the disk encryption set to use for enabling encryption at
     * rest.
     *
     * @return the diskEncryptionSetId value.
     */
    String diskEncryptionSetId();

    /**
     * Gets the identityProfile property: Identities associated with the cluster.
     *
     * @return the identityProfile value.
     */
    Map<String, UserAssignedIdentity> identityProfile();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.containerservice.generated.fluent.models.ManagedClusterInner object.
     *
     * @return the inner object.
     */
    ManagedClusterInner innerModel();

    /** The entirety of the ManagedCluster definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The ManagedCluster definition stages. */
    interface DefinitionStages {
        /** The first stage of the ManagedCluster definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ManagedCluster definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the ManagedCluster definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the ManagedCluster definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithKubernetesVersion,
                DefinitionStages.WithDnsPrefix,
                DefinitionStages.WithFqdnSubdomain,
                DefinitionStages.WithAgentPoolProfiles,
                DefinitionStages.WithLinuxProfile,
                DefinitionStages.WithWindowsProfile,
                DefinitionStages.WithServicePrincipalProfile,
                DefinitionStages.WithAddonProfiles,
                DefinitionStages.WithPodIdentityProfile,
                DefinitionStages.WithNodeResourceGroup,
                DefinitionStages.WithEnableRbac,
                DefinitionStages.WithEnablePodSecurityPolicy,
                DefinitionStages.WithNetworkProfile,
                DefinitionStages.WithAadProfile,
                DefinitionStages.WithAutoUpgradeProfile,
                DefinitionStages.WithAutoScalerProfile,
                DefinitionStages.WithApiServerAccessProfile,
                DefinitionStages.WithDiskEncryptionSetId,
                DefinitionStages.WithIdentityProfile {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ManagedCluster create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ManagedCluster create(Context context);
        }
        /** The stage of the ManagedCluster definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ManagedCluster definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The managed cluster SKU..
             *
             * @param sku The managed cluster SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(ManagedClusterSku sku);
        }
        /** The stage of the ManagedCluster definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the managed cluster, if configured..
             *
             * @param identity The identity of the managed cluster, if configured.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedClusterIdentity identity);
        }
        /** The stage of the ManagedCluster definition allowing to specify kubernetesVersion. */
        interface WithKubernetesVersion {
            /**
             * Specifies the kubernetesVersion property: Version of Kubernetes specified when creating the managed
             * cluster..
             *
             * @param kubernetesVersion Version of Kubernetes specified when creating the managed cluster.
             * @return the next definition stage.
             */
            WithCreate withKubernetesVersion(String kubernetesVersion);
        }
        /** The stage of the ManagedCluster definition allowing to specify dnsPrefix. */
        interface WithDnsPrefix {
            /**
             * Specifies the dnsPrefix property: DNS prefix specified when creating the managed cluster..
             *
             * @param dnsPrefix DNS prefix specified when creating the managed cluster.
             * @return the next definition stage.
             */
            WithCreate withDnsPrefix(String dnsPrefix);
        }
        /** The stage of the ManagedCluster definition allowing to specify fqdnSubdomain. */
        interface WithFqdnSubdomain {
            /**
             * Specifies the fqdnSubdomain property: FQDN subdomain specified when creating private cluster with custom
             * private dns zone..
             *
             * @param fqdnSubdomain FQDN subdomain specified when creating private cluster with custom private dns zone.
             * @return the next definition stage.
             */
            WithCreate withFqdnSubdomain(String fqdnSubdomain);
        }
        /** The stage of the ManagedCluster definition allowing to specify agentPoolProfiles. */
        interface WithAgentPoolProfiles {
            /**
             * Specifies the agentPoolProfiles property: Properties of the agent pool..
             *
             * @param agentPoolProfiles Properties of the agent pool.
             * @return the next definition stage.
             */
            WithCreate withAgentPoolProfiles(List<ManagedClusterAgentPoolProfile> agentPoolProfiles);
        }
        /** The stage of the ManagedCluster definition allowing to specify linuxProfile. */
        interface WithLinuxProfile {
            /**
             * Specifies the linuxProfile property: Profile for Linux VMs in the container service cluster..
             *
             * @param linuxProfile Profile for Linux VMs in the container service cluster.
             * @return the next definition stage.
             */
            WithCreate withLinuxProfile(ContainerServiceLinuxProfile linuxProfile);
        }
        /** The stage of the ManagedCluster definition allowing to specify windowsProfile. */
        interface WithWindowsProfile {
            /**
             * Specifies the windowsProfile property: Profile for Windows VMs in the container service cluster..
             *
             * @param windowsProfile Profile for Windows VMs in the container service cluster.
             * @return the next definition stage.
             */
            WithCreate withWindowsProfile(ManagedClusterWindowsProfile windowsProfile);
        }
        /** The stage of the ManagedCluster definition allowing to specify servicePrincipalProfile. */
        interface WithServicePrincipalProfile {
            /**
             * Specifies the servicePrincipalProfile property: Information about a service principal identity for the
             * cluster to use for manipulating Azure APIs..
             *
             * @param servicePrincipalProfile Information about a service principal identity for the cluster to use for
             *     manipulating Azure APIs.
             * @return the next definition stage.
             */
            WithCreate withServicePrincipalProfile(ManagedClusterServicePrincipalProfile servicePrincipalProfile);
        }
        /** The stage of the ManagedCluster definition allowing to specify addonProfiles. */
        interface WithAddonProfiles {
            /**
             * Specifies the addonProfiles property: Profile of managed cluster add-on..
             *
             * @param addonProfiles Profile of managed cluster add-on.
             * @return the next definition stage.
             */
            WithCreate withAddonProfiles(Map<String, ManagedClusterAddonProfile> addonProfiles);
        }
        /** The stage of the ManagedCluster definition allowing to specify podIdentityProfile. */
        interface WithPodIdentityProfile {
            /**
             * Specifies the podIdentityProfile property: Profile of managed cluster pod identity..
             *
             * @param podIdentityProfile Profile of managed cluster pod identity.
             * @return the next definition stage.
             */
            WithCreate withPodIdentityProfile(ManagedClusterPodIdentityProfile podIdentityProfile);
        }
        /** The stage of the ManagedCluster definition allowing to specify nodeResourceGroup. */
        interface WithNodeResourceGroup {
            /**
             * Specifies the nodeResourceGroup property: Name of the resource group containing agent pool nodes..
             *
             * @param nodeResourceGroup Name of the resource group containing agent pool nodes.
             * @return the next definition stage.
             */
            WithCreate withNodeResourceGroup(String nodeResourceGroup);
        }
        /** The stage of the ManagedCluster definition allowing to specify enableRbac. */
        interface WithEnableRbac {
            /**
             * Specifies the enableRbac property: Whether to enable Kubernetes Role-Based Access Control..
             *
             * @param enableRbac Whether to enable Kubernetes Role-Based Access Control.
             * @return the next definition stage.
             */
            WithCreate withEnableRbac(Boolean enableRbac);
        }
        /** The stage of the ManagedCluster definition allowing to specify enablePodSecurityPolicy. */
        interface WithEnablePodSecurityPolicy {
            /**
             * Specifies the enablePodSecurityPolicy property: (DEPRECATING) Whether to enable Kubernetes pod security
             * policy (preview). This feature is set for removal on October 15th, 2020. Learn more at
             * aka.ms/aks/azpodpolicy..
             *
             * @param enablePodSecurityPolicy (DEPRECATING) Whether to enable Kubernetes pod security policy (preview).
             *     This feature is set for removal on October 15th, 2020. Learn more at aka.ms/aks/azpodpolicy.
             * @return the next definition stage.
             */
            WithCreate withEnablePodSecurityPolicy(Boolean enablePodSecurityPolicy);
        }
        /** The stage of the ManagedCluster definition allowing to specify networkProfile. */
        interface WithNetworkProfile {
            /**
             * Specifies the networkProfile property: Profile of network configuration..
             *
             * @param networkProfile Profile of network configuration.
             * @return the next definition stage.
             */
            WithCreate withNetworkProfile(ContainerServiceNetworkProfile networkProfile);
        }
        /** The stage of the ManagedCluster definition allowing to specify aadProfile. */
        interface WithAadProfile {
            /**
             * Specifies the aadProfile property: Profile of Azure Active Directory configuration..
             *
             * @param aadProfile Profile of Azure Active Directory configuration.
             * @return the next definition stage.
             */
            WithCreate withAadProfile(ManagedClusterAadProfile aadProfile);
        }
        /** The stage of the ManagedCluster definition allowing to specify autoUpgradeProfile. */
        interface WithAutoUpgradeProfile {
            /**
             * Specifies the autoUpgradeProfile property: Profile of auto upgrade configuration..
             *
             * @param autoUpgradeProfile Profile of auto upgrade configuration.
             * @return the next definition stage.
             */
            WithCreate withAutoUpgradeProfile(ManagedClusterAutoUpgradeProfile autoUpgradeProfile);
        }
        /** The stage of the ManagedCluster definition allowing to specify autoScalerProfile. */
        interface WithAutoScalerProfile {
            /**
             * Specifies the autoScalerProfile property: Parameters to be applied to the cluster-autoscaler when
             * enabled.
             *
             * @param autoScalerProfile Parameters to be applied to the cluster-autoscaler when enabled.
             * @return the next definition stage.
             */
            WithCreate withAutoScalerProfile(ManagedClusterPropertiesAutoScalerProfile autoScalerProfile);
        }
        /** The stage of the ManagedCluster definition allowing to specify apiServerAccessProfile. */
        interface WithApiServerAccessProfile {
            /**
             * Specifies the apiServerAccessProfile property: Access profile for managed cluster API server..
             *
             * @param apiServerAccessProfile Access profile for managed cluster API server.
             * @return the next definition stage.
             */
            WithCreate withApiServerAccessProfile(ManagedClusterApiServerAccessProfile apiServerAccessProfile);
        }
        /** The stage of the ManagedCluster definition allowing to specify diskEncryptionSetId. */
        interface WithDiskEncryptionSetId {
            /**
             * Specifies the diskEncryptionSetId property: ResourceId of the disk encryption set to use for enabling
             * encryption at rest..
             *
             * @param diskEncryptionSetId ResourceId of the disk encryption set to use for enabling encryption at rest.
             * @return the next definition stage.
             */
            WithCreate withDiskEncryptionSetId(String diskEncryptionSetId);
        }
        /** The stage of the ManagedCluster definition allowing to specify identityProfile. */
        interface WithIdentityProfile {
            /**
             * Specifies the identityProfile property: Identities associated with the cluster..
             *
             * @param identityProfile Identities associated with the cluster.
             * @return the next definition stage.
             */
            WithCreate withIdentityProfile(Map<String, UserAssignedIdentity> identityProfile);
        }
    }
    /**
     * Begins update for the ManagedCluster resource.
     *
     * @return the stage of resource update.
     */
    ManagedCluster.Update update();

    /** The template for ManagedCluster update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ManagedCluster apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ManagedCluster apply(Context context);
    }
    /** The ManagedCluster update stages. */
    interface UpdateStages {
        /** The stage of the ManagedCluster update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ManagedCluster refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ManagedCluster refresh(Context context);

    /**
     * Gets cluster admin credential of the managed cluster with a specified resource group and name.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster admin credential of the managed cluster with a specified resource group and name.
     */
    CredentialResults listClusterAdminCredentials();

    /**
     * Gets cluster admin credential of the managed cluster with a specified resource group and name.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster admin credential of the managed cluster with a specified resource group and name.
     */
    Response<CredentialResults> listClusterAdminCredentialsWithResponse(Context context);

    /**
     * Gets cluster user credential of the managed cluster with a specified resource group and name.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster user credential of the managed cluster with a specified resource group and name.
     */
    CredentialResults listClusterUserCredentials();

    /**
     * Gets cluster user credential of the managed cluster with a specified resource group and name.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster user credential of the managed cluster with a specified resource group and name.
     */
    Response<CredentialResults> listClusterUserCredentialsWithResponse(Context context);

    /**
     * Gets cluster monitoring user credential of the managed cluster with a specified resource group and name.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster monitoring user credential of the managed cluster with a specified resource group and name.
     */
    CredentialResults listClusterMonitoringUserCredentials();

    /**
     * Gets cluster monitoring user credential of the managed cluster with a specified resource group and name.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster monitoring user credential of the managed cluster with a specified resource group and name.
     */
    Response<CredentialResults> listClusterMonitoringUserCredentialsWithResponse(Context context);

    /**
     * Update the service principal Profile for a managed cluster.
     *
     * @param parameters Parameters supplied to the Reset Service Principal Profile operation for a Managed Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resetServicePrincipalProfile(ManagedClusterServicePrincipalProfile parameters);

    /**
     * Update the service principal Profile for a managed cluster.
     *
     * @param parameters Parameters supplied to the Reset Service Principal Profile operation for a Managed Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resetServicePrincipalProfile(ManagedClusterServicePrincipalProfile parameters, Context context);

    /**
     * Update the AAD Profile for a managed cluster.
     *
     * @param parameters Parameters supplied to the Reset AAD Profile operation for a Managed Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resetAadProfile(ManagedClusterAadProfile parameters);

    /**
     * Update the AAD Profile for a managed cluster.
     *
     * @param parameters Parameters supplied to the Reset AAD Profile operation for a Managed Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resetAadProfile(ManagedClusterAadProfile parameters, Context context);

    /**
     * Rotate certificates of a managed cluster.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void rotateClusterCertificates();

    /**
     * Rotate certificates of a managed cluster.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void rotateClusterCertificates(Context context);

    /**
     * Stops a Running Managed Cluster.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop();

    /**
     * Stops a Running Managed Cluster.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(Context context);

    /**
     * Starts a Stopped Managed Cluster.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * Starts a Stopped Managed Cluster.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);
}
