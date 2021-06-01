// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicefabric.fluent.models.ManagedClusterInner;
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
     * Gets the sku property: The sku of the managed cluster.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the dnsName property: The cluster dns name.
     *
     * @return the dnsName value.
     */
    String dnsName();

    /**
     * Gets the fqdn property: the cluster Fully qualified domain name.
     *
     * @return the fqdn value.
     */
    String fqdn();

    /**
     * Gets the clusterId property: A service generated unique identifier for the cluster resource.
     *
     * @return the clusterId value.
     */
    String clusterId();

    /**
     * Gets the clusterState property: The current state of the cluster.
     *
     * @return the clusterState value.
     */
    ClusterState clusterState();

    /**
     * Gets the clusterCertificateThumbprint property: The cluster certificate thumbprint used node to node
     * communication.
     *
     * @return the clusterCertificateThumbprint value.
     */
    String clusterCertificateThumbprint();

    /**
     * Gets the clientConnectionPort property: The port used for client connections to the cluster.
     *
     * @return the clientConnectionPort value.
     */
    Integer clientConnectionPort();

    /**
     * Gets the httpGatewayConnectionPort property: The port used for http connections to the cluster.
     *
     * @return the httpGatewayConnectionPort value.
     */
    Integer httpGatewayConnectionPort();

    /**
     * Gets the adminUsername property: vm admin user name.
     *
     * @return the adminUsername value.
     */
    String adminUsername();

    /**
     * Gets the adminPassword property: vm admin user password.
     *
     * @return the adminPassword value.
     */
    String adminPassword();

    /**
     * Gets the loadBalancingRules property: Describes load balancing rules.
     *
     * @return the loadBalancingRules value.
     */
    List<LoadBalancingRule> loadBalancingRules();

    /**
     * Gets the clients property: client certificates for the cluster.
     *
     * @return the clients value.
     */
    List<ClientCertificate> clients();

    /**
     * Gets the azureActiveDirectory property: Azure active directory.
     *
     * @return the azureActiveDirectory value.
     */
    AzureActiveDirectory azureActiveDirectory();

    /**
     * Gets the fabricSettings property: The list of custom fabric settings to configure the cluster.
     *
     * @return the fabricSettings value.
     */
    List<SettingsSectionDescription> fabricSettings();

    /**
     * Gets the provisioningState property: The provisioning state of the managed cluster resource.
     *
     * @return the provisioningState value.
     */
    ManagedResourceProvisioningState provisioningState();

    /**
     * Gets the clusterCodeVersion property: The Service Fabric runtime version of the cluster. This property can only
     * by set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new
     * clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing
     * clusters use **availableClusterVersions**.
     *
     * @return the clusterCodeVersion value.
     */
    String clusterCodeVersion();

    /**
     * Gets the addonFeatures property: client certificates for the cluster.
     *
     * @return the addonFeatures value.
     */
    List<ManagedClusterAddOnFeature> addonFeatures();

    /**
     * Gets the etag property: Azure resource etag.
     *
     * @return the etag value.
     */
    String etag();

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
     * Gets the inner com.azure.resourcemanager.servicefabric.fluent.models.ManagedClusterInner object.
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
                DefinitionStages.WithDnsName,
                DefinitionStages.WithClientConnectionPort,
                DefinitionStages.WithHttpGatewayConnectionPort,
                DefinitionStages.WithAdminUsername,
                DefinitionStages.WithAdminPassword,
                DefinitionStages.WithLoadBalancingRules,
                DefinitionStages.WithClients,
                DefinitionStages.WithAzureActiveDirectory,
                DefinitionStages.WithFabricSettings,
                DefinitionStages.WithClusterCodeVersion,
                DefinitionStages.WithAddonFeatures {
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
             * Specifies the sku property: The sku of the managed cluster.
             *
             * @param sku The sku of the managed cluster.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the ManagedCluster definition allowing to specify dnsName. */
        interface WithDnsName {
            /**
             * Specifies the dnsName property: The cluster dns name..
             *
             * @param dnsName The cluster dns name.
             * @return the next definition stage.
             */
            WithCreate withDnsName(String dnsName);
        }
        /** The stage of the ManagedCluster definition allowing to specify clientConnectionPort. */
        interface WithClientConnectionPort {
            /**
             * Specifies the clientConnectionPort property: The port used for client connections to the cluster..
             *
             * @param clientConnectionPort The port used for client connections to the cluster.
             * @return the next definition stage.
             */
            WithCreate withClientConnectionPort(Integer clientConnectionPort);
        }
        /** The stage of the ManagedCluster definition allowing to specify httpGatewayConnectionPort. */
        interface WithHttpGatewayConnectionPort {
            /**
             * Specifies the httpGatewayConnectionPort property: The port used for http connections to the cluster..
             *
             * @param httpGatewayConnectionPort The port used for http connections to the cluster.
             * @return the next definition stage.
             */
            WithCreate withHttpGatewayConnectionPort(Integer httpGatewayConnectionPort);
        }
        /** The stage of the ManagedCluster definition allowing to specify adminUsername. */
        interface WithAdminUsername {
            /**
             * Specifies the adminUsername property: vm admin user name..
             *
             * @param adminUsername vm admin user name.
             * @return the next definition stage.
             */
            WithCreate withAdminUsername(String adminUsername);
        }
        /** The stage of the ManagedCluster definition allowing to specify adminPassword. */
        interface WithAdminPassword {
            /**
             * Specifies the adminPassword property: vm admin user password..
             *
             * @param adminPassword vm admin user password.
             * @return the next definition stage.
             */
            WithCreate withAdminPassword(String adminPassword);
        }
        /** The stage of the ManagedCluster definition allowing to specify loadBalancingRules. */
        interface WithLoadBalancingRules {
            /**
             * Specifies the loadBalancingRules property: Describes load balancing rules..
             *
             * @param loadBalancingRules Describes load balancing rules.
             * @return the next definition stage.
             */
            WithCreate withLoadBalancingRules(List<LoadBalancingRule> loadBalancingRules);
        }
        /** The stage of the ManagedCluster definition allowing to specify clients. */
        interface WithClients {
            /**
             * Specifies the clients property: client certificates for the cluster..
             *
             * @param clients client certificates for the cluster.
             * @return the next definition stage.
             */
            WithCreate withClients(List<ClientCertificate> clients);
        }
        /** The stage of the ManagedCluster definition allowing to specify azureActiveDirectory. */
        interface WithAzureActiveDirectory {
            /**
             * Specifies the azureActiveDirectory property: Azure active directory..
             *
             * @param azureActiveDirectory Azure active directory.
             * @return the next definition stage.
             */
            WithCreate withAzureActiveDirectory(AzureActiveDirectory azureActiveDirectory);
        }
        /** The stage of the ManagedCluster definition allowing to specify fabricSettings. */
        interface WithFabricSettings {
            /**
             * Specifies the fabricSettings property: The list of custom fabric settings to configure the cluster..
             *
             * @param fabricSettings The list of custom fabric settings to configure the cluster.
             * @return the next definition stage.
             */
            WithCreate withFabricSettings(List<SettingsSectionDescription> fabricSettings);
        }
        /** The stage of the ManagedCluster definition allowing to specify clusterCodeVersion. */
        interface WithClusterCodeVersion {
            /**
             * Specifies the clusterCodeVersion property: The Service Fabric runtime version of the cluster. This
             * property can only by set the user when **upgradeMode** is set to 'Manual'. To get list of available
             * Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list
             * of available version for existing clusters use **availableClusterVersions**..
             *
             * @param clusterCodeVersion The Service Fabric runtime version of the cluster. This property can only by
             *     set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric
             *     versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available
             *     version for existing clusters use **availableClusterVersions**.
             * @return the next definition stage.
             */
            WithCreate withClusterCodeVersion(String clusterCodeVersion);
        }
        /** The stage of the ManagedCluster definition allowing to specify addonFeatures. */
        interface WithAddonFeatures {
            /**
             * Specifies the addonFeatures property: client certificates for the cluster..
             *
             * @param addonFeatures client certificates for the cluster.
             * @return the next definition stage.
             */
            WithCreate withAddonFeatures(List<ManagedClusterAddOnFeature> addonFeatures);
        }
    }
    /**
     * Begins update for the ManagedCluster resource.
     *
     * @return the stage of resource update.
     */
    ManagedCluster.Update update();

    /** The template for ManagedCluster update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithClientConnectionPort,
            UpdateStages.WithHttpGatewayConnectionPort,
            UpdateStages.WithLoadBalancingRules,
            UpdateStages.WithClients,
            UpdateStages.WithAzureActiveDirectory,
            UpdateStages.WithFabricSettings,
            UpdateStages.WithClusterCodeVersion,
            UpdateStages.WithAddonFeatures {
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
             * Specifies the tags property: Managed cluster update parameters.
             *
             * @param tags Managed cluster update parameters.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ManagedCluster update allowing to specify clientConnectionPort. */
        interface WithClientConnectionPort {
            /**
             * Specifies the clientConnectionPort property: The port used for client connections to the cluster..
             *
             * @param clientConnectionPort The port used for client connections to the cluster.
             * @return the next definition stage.
             */
            Update withClientConnectionPort(Integer clientConnectionPort);
        }
        /** The stage of the ManagedCluster update allowing to specify httpGatewayConnectionPort. */
        interface WithHttpGatewayConnectionPort {
            /**
             * Specifies the httpGatewayConnectionPort property: The port used for http connections to the cluster..
             *
             * @param httpGatewayConnectionPort The port used for http connections to the cluster.
             * @return the next definition stage.
             */
            Update withHttpGatewayConnectionPort(Integer httpGatewayConnectionPort);
        }
        /** The stage of the ManagedCluster update allowing to specify loadBalancingRules. */
        interface WithLoadBalancingRules {
            /**
             * Specifies the loadBalancingRules property: Describes load balancing rules..
             *
             * @param loadBalancingRules Describes load balancing rules.
             * @return the next definition stage.
             */
            Update withLoadBalancingRules(List<LoadBalancingRule> loadBalancingRules);
        }
        /** The stage of the ManagedCluster update allowing to specify clients. */
        interface WithClients {
            /**
             * Specifies the clients property: client certificates for the cluster..
             *
             * @param clients client certificates for the cluster.
             * @return the next definition stage.
             */
            Update withClients(List<ClientCertificate> clients);
        }
        /** The stage of the ManagedCluster update allowing to specify azureActiveDirectory. */
        interface WithAzureActiveDirectory {
            /**
             * Specifies the azureActiveDirectory property: Azure active directory..
             *
             * @param azureActiveDirectory Azure active directory.
             * @return the next definition stage.
             */
            Update withAzureActiveDirectory(AzureActiveDirectory azureActiveDirectory);
        }
        /** The stage of the ManagedCluster update allowing to specify fabricSettings. */
        interface WithFabricSettings {
            /**
             * Specifies the fabricSettings property: The list of custom fabric settings to configure the cluster..
             *
             * @param fabricSettings The list of custom fabric settings to configure the cluster.
             * @return the next definition stage.
             */
            Update withFabricSettings(List<SettingsSectionDescription> fabricSettings);
        }
        /** The stage of the ManagedCluster update allowing to specify clusterCodeVersion. */
        interface WithClusterCodeVersion {
            /**
             * Specifies the clusterCodeVersion property: The Service Fabric runtime version of the cluster. This
             * property can only by set the user when **upgradeMode** is set to 'Manual'. To get list of available
             * Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list
             * of available version for existing clusters use **availableClusterVersions**..
             *
             * @param clusterCodeVersion The Service Fabric runtime version of the cluster. This property can only by
             *     set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric
             *     versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available
             *     version for existing clusters use **availableClusterVersions**.
             * @return the next definition stage.
             */
            Update withClusterCodeVersion(String clusterCodeVersion);
        }
        /** The stage of the ManagedCluster update allowing to specify addonFeatures. */
        interface WithAddonFeatures {
            /**
             * Specifies the addonFeatures property: client certificates for the cluster..
             *
             * @param addonFeatures client certificates for the cluster.
             * @return the next definition stage.
             */
            Update withAddonFeatures(List<ManagedClusterAddOnFeature> addonFeatures);
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
}
