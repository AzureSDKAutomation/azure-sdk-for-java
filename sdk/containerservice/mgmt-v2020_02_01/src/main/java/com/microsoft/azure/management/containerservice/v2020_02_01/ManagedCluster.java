/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerservice.v2020_02_01.implementation.ContainerServiceManager;
import java.util.List;
import java.util.Map;
import com.microsoft.azure.management.containerservice.v2020_02_01.implementation.ManagedClusterInner;

/**
 * Type representing ManagedCluster.
 */
public interface ManagedCluster extends HasInner<ManagedClusterInner>, Resource, GroupableResourceCore<ContainerServiceManager, ManagedClusterInner>, HasResourceGroup, Refreshable<ManagedCluster>, Updatable<ManagedCluster.Update>, HasManager<ContainerServiceManager> {
    /**
     * @return the aadProfile value.
     */
    ManagedClusterAADProfile aadProfile();

    /**
     * @return the addonProfiles value.
     */
    Map<String, ManagedClusterAddonProfile> addonProfiles();

    /**
     * @return the agentPoolProfiles value.
     */
    List<ManagedClusterAgentPoolProfile> agentPoolProfiles();

    /**
     * @return the apiServerAccessProfile value.
     */
    ManagedClusterAPIServerAccessProfile apiServerAccessProfile();

    /**
     * @return the diskEncryptionSetID value.
     */
    String diskEncryptionSetID();

    /**
     * @return the dnsPrefix value.
     */
    String dnsPrefix();

    /**
     * @return the enablePodSecurityPolicy value.
     */
    Boolean enablePodSecurityPolicy();

    /**
     * @return the enableRBAC value.
     */
    Boolean enableRBAC();

    /**
     * @return the fqdn value.
     */
    String fqdn();

    /**
     * @return the identity value.
     */
    ManagedClusterIdentity identity();

    /**
     * @return the identityProfile value.
     */
    Map<String, ManagedClusterPropertiesIdentityProfileValue> identityProfile();

    /**
     * @return the kubernetesVersion value.
     */
    String kubernetesVersion();

    /**
     * @return the linuxProfile value.
     */
    ContainerServiceLinuxProfile linuxProfile();

    /**
     * @return the maxAgentPools value.
     */
    Integer maxAgentPools();

    /**
     * @return the networkProfile value.
     */
    ContainerServiceNetworkProfile networkProfile();

    /**
     * @return the nodeResourceGroup value.
     */
    String nodeResourceGroup();

    /**
     * @return the privateFQDN value.
     */
    String privateFQDN();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the servicePrincipalProfile value.
     */
    ManagedClusterServicePrincipalProfile servicePrincipalProfile();

    /**
     * @return the windowsProfile value.
     */
    ManagedClusterWindowsProfile windowsProfile();

    /**
     * The entirety of the ManagedCluster definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ManagedCluster definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ManagedCluster definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ManagedCluster definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the managedcluster definition allowing to specify AadProfile.
         */
        interface WithAadProfile {
            /**
             * Specifies aadProfile.
             * @param aadProfile Profile of Azure Active Directory configuration
             * @return the next definition stage
             */
            WithCreate withAadProfile(ManagedClusterAADProfile aadProfile);
        }

        /**
         * The stage of the managedcluster definition allowing to specify AddonProfiles.
         */
        interface WithAddonProfiles {
            /**
             * Specifies addonProfiles.
             * @param addonProfiles Profile of managed cluster add-on
             * @return the next definition stage
             */
            WithCreate withAddonProfiles(Map<String, ManagedClusterAddonProfile> addonProfiles);
        }

        /**
         * The stage of the managedcluster definition allowing to specify AgentPoolProfiles.
         */
        interface WithAgentPoolProfiles {
            /**
             * Specifies agentPoolProfiles.
             * @param agentPoolProfiles Properties of the agent pool
             * @return the next definition stage
             */
            WithCreate withAgentPoolProfiles(List<ManagedClusterAgentPoolProfile> agentPoolProfiles);
        }

        /**
         * The stage of the managedcluster definition allowing to specify ApiServerAccessProfile.
         */
        interface WithApiServerAccessProfile {
            /**
             * Specifies apiServerAccessProfile.
             * @param apiServerAccessProfile Access profile for managed cluster API server
             * @return the next definition stage
             */
            WithCreate withApiServerAccessProfile(ManagedClusterAPIServerAccessProfile apiServerAccessProfile);
        }

        /**
         * The stage of the managedcluster definition allowing to specify DiskEncryptionSetID.
         */
        interface WithDiskEncryptionSetID {
            /**
             * Specifies diskEncryptionSetID.
             * @param diskEncryptionSetID ResourceId of the disk encryption set to use for enabling encryption at rest
             * @return the next definition stage
             */
            WithCreate withDiskEncryptionSetID(String diskEncryptionSetID);
        }

        /**
         * The stage of the managedcluster definition allowing to specify DnsPrefix.
         */
        interface WithDnsPrefix {
            /**
             * Specifies dnsPrefix.
             * @param dnsPrefix DNS prefix specified when creating the managed cluster
             * @return the next definition stage
             */
            WithCreate withDnsPrefix(String dnsPrefix);
        }

        /**
         * The stage of the managedcluster definition allowing to specify EnablePodSecurityPolicy.
         */
        interface WithEnablePodSecurityPolicy {
            /**
             * Specifies enablePodSecurityPolicy.
             * @param enablePodSecurityPolicy (PREVIEW) Whether to enable Kubernetes Pod security policy
             * @return the next definition stage
             */
            WithCreate withEnablePodSecurityPolicy(Boolean enablePodSecurityPolicy);
        }

        /**
         * The stage of the managedcluster definition allowing to specify EnableRBAC.
         */
        interface WithEnableRBAC {
            /**
             * Specifies enableRBAC.
             * @param enableRBAC Whether to enable Kubernetes Role-Based Access Control
             * @return the next definition stage
             */
            WithCreate withEnableRBAC(Boolean enableRBAC);
        }

        /**
         * The stage of the managedcluster definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the managed cluster, if configured
             * @return the next definition stage
             */
            WithCreate withIdentity(ManagedClusterIdentity identity);
        }

        /**
         * The stage of the managedcluster definition allowing to specify IdentityProfile.
         */
        interface WithIdentityProfile {
            /**
             * Specifies identityProfile.
             * @param identityProfile Identities associated with the cluster
             * @return the next definition stage
             */
            WithCreate withIdentityProfile(Map<String, ManagedClusterPropertiesIdentityProfileValue> identityProfile);
        }

        /**
         * The stage of the managedcluster definition allowing to specify KubernetesVersion.
         */
        interface WithKubernetesVersion {
            /**
             * Specifies kubernetesVersion.
             * @param kubernetesVersion Version of Kubernetes specified when creating the managed cluster
             * @return the next definition stage
             */
            WithCreate withKubernetesVersion(String kubernetesVersion);
        }

        /**
         * The stage of the managedcluster definition allowing to specify LinuxProfile.
         */
        interface WithLinuxProfile {
            /**
             * Specifies linuxProfile.
             * @param linuxProfile Profile for Linux VMs in the container service cluster
             * @return the next definition stage
             */
            WithCreate withLinuxProfile(ContainerServiceLinuxProfile linuxProfile);
        }

        /**
         * The stage of the managedcluster definition allowing to specify NetworkProfile.
         */
        interface WithNetworkProfile {
            /**
             * Specifies networkProfile.
             * @param networkProfile Profile of network configuration
             * @return the next definition stage
             */
            WithCreate withNetworkProfile(ContainerServiceNetworkProfile networkProfile);
        }

        /**
         * The stage of the managedcluster definition allowing to specify NodeResourceGroup.
         */
        interface WithNodeResourceGroup {
            /**
             * Specifies nodeResourceGroup.
             * @param nodeResourceGroup Name of the resource group containing agent pool nodes
             * @return the next definition stage
             */
            WithCreate withNodeResourceGroup(String nodeResourceGroup);
        }

        /**
         * The stage of the managedcluster definition allowing to specify ServicePrincipalProfile.
         */
        interface WithServicePrincipalProfile {
            /**
             * Specifies servicePrincipalProfile.
             * @param servicePrincipalProfile Information about a service principal identity for the cluster to use for manipulating Azure APIs
             * @return the next definition stage
             */
            WithCreate withServicePrincipalProfile(ManagedClusterServicePrincipalProfile servicePrincipalProfile);
        }

        /**
         * The stage of the managedcluster definition allowing to specify WindowsProfile.
         */
        interface WithWindowsProfile {
            /**
             * Specifies windowsProfile.
             * @param windowsProfile Profile for Windows VMs in the container service cluster
             * @return the next definition stage
             */
            WithCreate withWindowsProfile(ManagedClusterWindowsProfile windowsProfile);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ManagedCluster>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAadProfile, DefinitionStages.WithAddonProfiles, DefinitionStages.WithAgentPoolProfiles, DefinitionStages.WithApiServerAccessProfile, DefinitionStages.WithDiskEncryptionSetID, DefinitionStages.WithDnsPrefix, DefinitionStages.WithEnablePodSecurityPolicy, DefinitionStages.WithEnableRBAC, DefinitionStages.WithIdentity, DefinitionStages.WithIdentityProfile, DefinitionStages.WithKubernetesVersion, DefinitionStages.WithLinuxProfile, DefinitionStages.WithNetworkProfile, DefinitionStages.WithNodeResourceGroup, DefinitionStages.WithServicePrincipalProfile, DefinitionStages.WithWindowsProfile {
        }
    }
    /**
     * The template for a ManagedCluster update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ManagedCluster>, Resource.UpdateWithTags<Update>, UpdateStages.WithAadProfile, UpdateStages.WithAddonProfiles, UpdateStages.WithAgentPoolProfiles, UpdateStages.WithApiServerAccessProfile, UpdateStages.WithDiskEncryptionSetID, UpdateStages.WithDnsPrefix, UpdateStages.WithEnablePodSecurityPolicy, UpdateStages.WithEnableRBAC, UpdateStages.WithIdentity, UpdateStages.WithIdentityProfile, UpdateStages.WithKubernetesVersion, UpdateStages.WithLinuxProfile, UpdateStages.WithNetworkProfile, UpdateStages.WithNodeResourceGroup, UpdateStages.WithServicePrincipalProfile, UpdateStages.WithWindowsProfile {
    }

    /**
     * Grouping of ManagedCluster update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the managedcluster update allowing to specify AadProfile.
         */
        interface WithAadProfile {
            /**
             * Specifies aadProfile.
             * @param aadProfile Profile of Azure Active Directory configuration
             * @return the next update stage
             */
            Update withAadProfile(ManagedClusterAADProfile aadProfile);
        }

        /**
         * The stage of the managedcluster update allowing to specify AddonProfiles.
         */
        interface WithAddonProfiles {
            /**
             * Specifies addonProfiles.
             * @param addonProfiles Profile of managed cluster add-on
             * @return the next update stage
             */
            Update withAddonProfiles(Map<String, ManagedClusterAddonProfile> addonProfiles);
        }

        /**
         * The stage of the managedcluster update allowing to specify AgentPoolProfiles.
         */
        interface WithAgentPoolProfiles {
            /**
             * Specifies agentPoolProfiles.
             * @param agentPoolProfiles Properties of the agent pool
             * @return the next update stage
             */
            Update withAgentPoolProfiles(List<ManagedClusterAgentPoolProfile> agentPoolProfiles);
        }

        /**
         * The stage of the managedcluster update allowing to specify ApiServerAccessProfile.
         */
        interface WithApiServerAccessProfile {
            /**
             * Specifies apiServerAccessProfile.
             * @param apiServerAccessProfile Access profile for managed cluster API server
             * @return the next update stage
             */
            Update withApiServerAccessProfile(ManagedClusterAPIServerAccessProfile apiServerAccessProfile);
        }

        /**
         * The stage of the managedcluster update allowing to specify DiskEncryptionSetID.
         */
        interface WithDiskEncryptionSetID {
            /**
             * Specifies diskEncryptionSetID.
             * @param diskEncryptionSetID ResourceId of the disk encryption set to use for enabling encryption at rest
             * @return the next update stage
             */
            Update withDiskEncryptionSetID(String diskEncryptionSetID);
        }

        /**
         * The stage of the managedcluster update allowing to specify DnsPrefix.
         */
        interface WithDnsPrefix {
            /**
             * Specifies dnsPrefix.
             * @param dnsPrefix DNS prefix specified when creating the managed cluster
             * @return the next update stage
             */
            Update withDnsPrefix(String dnsPrefix);
        }

        /**
         * The stage of the managedcluster update allowing to specify EnablePodSecurityPolicy.
         */
        interface WithEnablePodSecurityPolicy {
            /**
             * Specifies enablePodSecurityPolicy.
             * @param enablePodSecurityPolicy (PREVIEW) Whether to enable Kubernetes Pod security policy
             * @return the next update stage
             */
            Update withEnablePodSecurityPolicy(Boolean enablePodSecurityPolicy);
        }

        /**
         * The stage of the managedcluster update allowing to specify EnableRBAC.
         */
        interface WithEnableRBAC {
            /**
             * Specifies enableRBAC.
             * @param enableRBAC Whether to enable Kubernetes Role-Based Access Control
             * @return the next update stage
             */
            Update withEnableRBAC(Boolean enableRBAC);
        }

        /**
         * The stage of the managedcluster update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the managed cluster, if configured
             * @return the next update stage
             */
            Update withIdentity(ManagedClusterIdentity identity);
        }

        /**
         * The stage of the managedcluster update allowing to specify IdentityProfile.
         */
        interface WithIdentityProfile {
            /**
             * Specifies identityProfile.
             * @param identityProfile Identities associated with the cluster
             * @return the next update stage
             */
            Update withIdentityProfile(Map<String, ManagedClusterPropertiesIdentityProfileValue> identityProfile);
        }

        /**
         * The stage of the managedcluster update allowing to specify KubernetesVersion.
         */
        interface WithKubernetesVersion {
            /**
             * Specifies kubernetesVersion.
             * @param kubernetesVersion Version of Kubernetes specified when creating the managed cluster
             * @return the next update stage
             */
            Update withKubernetesVersion(String kubernetesVersion);
        }

        /**
         * The stage of the managedcluster update allowing to specify LinuxProfile.
         */
        interface WithLinuxProfile {
            /**
             * Specifies linuxProfile.
             * @param linuxProfile Profile for Linux VMs in the container service cluster
             * @return the next update stage
             */
            Update withLinuxProfile(ContainerServiceLinuxProfile linuxProfile);
        }

        /**
         * The stage of the managedcluster update allowing to specify NetworkProfile.
         */
        interface WithNetworkProfile {
            /**
             * Specifies networkProfile.
             * @param networkProfile Profile of network configuration
             * @return the next update stage
             */
            Update withNetworkProfile(ContainerServiceNetworkProfile networkProfile);
        }

        /**
         * The stage of the managedcluster update allowing to specify NodeResourceGroup.
         */
        interface WithNodeResourceGroup {
            /**
             * Specifies nodeResourceGroup.
             * @param nodeResourceGroup Name of the resource group containing agent pool nodes
             * @return the next update stage
             */
            Update withNodeResourceGroup(String nodeResourceGroup);
        }

        /**
         * The stage of the managedcluster update allowing to specify ServicePrincipalProfile.
         */
        interface WithServicePrincipalProfile {
            /**
             * Specifies servicePrincipalProfile.
             * @param servicePrincipalProfile Information about a service principal identity for the cluster to use for manipulating Azure APIs
             * @return the next update stage
             */
            Update withServicePrincipalProfile(ManagedClusterServicePrincipalProfile servicePrincipalProfile);
        }

        /**
         * The stage of the managedcluster update allowing to specify WindowsProfile.
         */
        interface WithWindowsProfile {
            /**
             * Specifies windowsProfile.
             * @param windowsProfile Profile for Windows VMs in the container service cluster
             * @return the next update stage
             */
            Update withWindowsProfile(ManagedClusterWindowsProfile windowsProfile);
        }

    }
}
