// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.servicefabric.fluent.models.NodeTypeInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of NodeType. */
public interface NodeType {
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
     * Gets the tags property: Azure resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the isPrimary property: The node type on which system services will run. Only one node type should be marked
     * as primary. Primary node type cannot be deleted or changed for existing clusters.
     *
     * @return the isPrimary value.
     */
    Boolean isPrimary();

    /**
     * Gets the vmInstanceCount property: The number of nodes in the node type.
     *
     * @return the vmInstanceCount value.
     */
    Integer vmInstanceCount();

    /**
     * Gets the dataDiskSizeGB property: Disk size for each vm in the node type in GBs.
     *
     * @return the dataDiskSizeGB value.
     */
    Integer dataDiskSizeGB();

    /**
     * Gets the placementProperties property: The placement tags applied to nodes in the node type, which can be used to
     * indicate where certain services (workload) should run.
     *
     * @return the placementProperties value.
     */
    Map<String, String> placementProperties();

    /**
     * Gets the capacities property: The capacity tags applied to the nodes in the node type, the cluster resource
     * manager uses these tags to understand how much resource a node has.
     *
     * @return the capacities value.
     */
    Map<String, String> capacities();

    /**
     * Gets the applicationPorts property: The range of ports from which cluster assigned port to Service Fabric
     * applications.
     *
     * @return the applicationPorts value.
     */
    EndpointRangeDescription applicationPorts();

    /**
     * Gets the ephemeralPorts property: The range of ephemeral ports that nodes in this node type should be configured
     * with.
     *
     * @return the ephemeralPorts value.
     */
    EndpointRangeDescription ephemeralPorts();

    /**
     * Gets the vmSize property: The size of virtual machines in the pool. All virtual machines in a pool are the same
     * size. For example, Standard_D3.
     *
     * @return the vmSize value.
     */
    String vmSize();

    /**
     * Gets the vmImagePublisher property: The publisher of the Azure Virtual Machines Marketplace image. For example,
     * Canonical or MicrosoftWindowsServer.
     *
     * @return the vmImagePublisher value.
     */
    String vmImagePublisher();

    /**
     * Gets the vmImageOffer property: The offer type of the Azure Virtual Machines Marketplace image. For example,
     * UbuntuServer or WindowsServer.
     *
     * @return the vmImageOffer value.
     */
    String vmImageOffer();

    /**
     * Gets the vmImageSku property: The SKU of the Azure Virtual Machines Marketplace image. For example, 14.04.0-LTS
     * or 2012-R2-Datacenter.
     *
     * @return the vmImageSku value.
     */
    String vmImageSku();

    /**
     * Gets the vmImageVersion property: The version of the Azure Virtual Machines Marketplace image. A value of
     * 'latest' can be specified to select the latest version of an image. If omitted, the default is 'latest'.
     *
     * @return the vmImageVersion value.
     */
    String vmImageVersion();

    /**
     * Gets the vmSecrets property: The secrets to install in the virtual machines.
     *
     * @return the vmSecrets value.
     */
    List<VaultSecretGroup> vmSecrets();

    /**
     * Gets the vmExtensions property: Set of extensions that should be installed onto the virtual machines.
     *
     * @return the vmExtensions value.
     */
    List<VmssExtension> vmExtensions();

    /**
     * Gets the provisioningState property: The provisioning state of the managed cluster resource.
     *
     * @return the provisioningState value.
     */
    ManagedResourceProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.servicefabric.fluent.models.NodeTypeInner object.
     *
     * @return the inner object.
     */
    NodeTypeInner innerModel();

    /** The entirety of the NodeType definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The NodeType definition stages. */
    interface DefinitionStages {
        /** The first stage of the NodeType definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the NodeType definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, clusterName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param clusterName The name of the cluster resource.
             * @return the next definition stage.
             */
            WithCreate withExistingManagedCluster(String resourceGroupName, String clusterName);
        }
        /**
         * The stage of the NodeType definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIsPrimary,
                DefinitionStages.WithVmInstanceCount,
                DefinitionStages.WithDataDiskSizeGB,
                DefinitionStages.WithPlacementProperties,
                DefinitionStages.WithCapacities,
                DefinitionStages.WithApplicationPorts,
                DefinitionStages.WithEphemeralPorts,
                DefinitionStages.WithVmSize,
                DefinitionStages.WithVmImagePublisher,
                DefinitionStages.WithVmImageOffer,
                DefinitionStages.WithVmImageSku,
                DefinitionStages.WithVmImageVersion,
                DefinitionStages.WithVmSecrets,
                DefinitionStages.WithVmExtensions {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            NodeType create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NodeType create(Context context);
        }
        /** The stage of the NodeType definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Azure resource tags..
             *
             * @param tags Azure resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the NodeType definition allowing to specify isPrimary. */
        interface WithIsPrimary {
            /**
             * Specifies the isPrimary property: The node type on which system services will run. Only one node type
             * should be marked as primary. Primary node type cannot be deleted or changed for existing clusters..
             *
             * @param isPrimary The node type on which system services will run. Only one node type should be marked as
             *     primary. Primary node type cannot be deleted or changed for existing clusters.
             * @return the next definition stage.
             */
            WithCreate withIsPrimary(Boolean isPrimary);
        }
        /** The stage of the NodeType definition allowing to specify vmInstanceCount. */
        interface WithVmInstanceCount {
            /**
             * Specifies the vmInstanceCount property: The number of nodes in the node type..
             *
             * @param vmInstanceCount The number of nodes in the node type.
             * @return the next definition stage.
             */
            WithCreate withVmInstanceCount(Integer vmInstanceCount);
        }
        /** The stage of the NodeType definition allowing to specify dataDiskSizeGB. */
        interface WithDataDiskSizeGB {
            /**
             * Specifies the dataDiskSizeGB property: Disk size for each vm in the node type in GBs..
             *
             * @param dataDiskSizeGB Disk size for each vm in the node type in GBs.
             * @return the next definition stage.
             */
            WithCreate withDataDiskSizeGB(Integer dataDiskSizeGB);
        }
        /** The stage of the NodeType definition allowing to specify placementProperties. */
        interface WithPlacementProperties {
            /**
             * Specifies the placementProperties property: The placement tags applied to nodes in the node type, which
             * can be used to indicate where certain services (workload) should run..
             *
             * @param placementProperties The placement tags applied to nodes in the node type, which can be used to
             *     indicate where certain services (workload) should run.
             * @return the next definition stage.
             */
            WithCreate withPlacementProperties(Map<String, String> placementProperties);
        }
        /** The stage of the NodeType definition allowing to specify capacities. */
        interface WithCapacities {
            /**
             * Specifies the capacities property: The capacity tags applied to the nodes in the node type, the cluster
             * resource manager uses these tags to understand how much resource a node has..
             *
             * @param capacities The capacity tags applied to the nodes in the node type, the cluster resource manager
             *     uses these tags to understand how much resource a node has.
             * @return the next definition stage.
             */
            WithCreate withCapacities(Map<String, String> capacities);
        }
        /** The stage of the NodeType definition allowing to specify applicationPorts. */
        interface WithApplicationPorts {
            /**
             * Specifies the applicationPorts property: The range of ports from which cluster assigned port to Service
             * Fabric applications..
             *
             * @param applicationPorts The range of ports from which cluster assigned port to Service Fabric
             *     applications.
             * @return the next definition stage.
             */
            WithCreate withApplicationPorts(EndpointRangeDescription applicationPorts);
        }
        /** The stage of the NodeType definition allowing to specify ephemeralPorts. */
        interface WithEphemeralPorts {
            /**
             * Specifies the ephemeralPorts property: The range of ephemeral ports that nodes in this node type should
             * be configured with..
             *
             * @param ephemeralPorts The range of ephemeral ports that nodes in this node type should be configured
             *     with.
             * @return the next definition stage.
             */
            WithCreate withEphemeralPorts(EndpointRangeDescription ephemeralPorts);
        }
        /** The stage of the NodeType definition allowing to specify vmSize. */
        interface WithVmSize {
            /**
             * Specifies the vmSize property: The size of virtual machines in the pool. All virtual machines in a pool
             * are the same size. For example, Standard_D3..
             *
             * @param vmSize The size of virtual machines in the pool. All virtual machines in a pool are the same size.
             *     For example, Standard_D3.
             * @return the next definition stage.
             */
            WithCreate withVmSize(String vmSize);
        }
        /** The stage of the NodeType definition allowing to specify vmImagePublisher. */
        interface WithVmImagePublisher {
            /**
             * Specifies the vmImagePublisher property: The publisher of the Azure Virtual Machines Marketplace image.
             * For example, Canonical or MicrosoftWindowsServer..
             *
             * @param vmImagePublisher The publisher of the Azure Virtual Machines Marketplace image. For example,
             *     Canonical or MicrosoftWindowsServer.
             * @return the next definition stage.
             */
            WithCreate withVmImagePublisher(String vmImagePublisher);
        }
        /** The stage of the NodeType definition allowing to specify vmImageOffer. */
        interface WithVmImageOffer {
            /**
             * Specifies the vmImageOffer property: The offer type of the Azure Virtual Machines Marketplace image. For
             * example, UbuntuServer or WindowsServer..
             *
             * @param vmImageOffer The offer type of the Azure Virtual Machines Marketplace image. For example,
             *     UbuntuServer or WindowsServer.
             * @return the next definition stage.
             */
            WithCreate withVmImageOffer(String vmImageOffer);
        }
        /** The stage of the NodeType definition allowing to specify vmImageSku. */
        interface WithVmImageSku {
            /**
             * Specifies the vmImageSku property: The SKU of the Azure Virtual Machines Marketplace image. For example,
             * 14.04.0-LTS or 2012-R2-Datacenter..
             *
             * @param vmImageSku The SKU of the Azure Virtual Machines Marketplace image. For example, 14.04.0-LTS or
             *     2012-R2-Datacenter.
             * @return the next definition stage.
             */
            WithCreate withVmImageSku(String vmImageSku);
        }
        /** The stage of the NodeType definition allowing to specify vmImageVersion. */
        interface WithVmImageVersion {
            /**
             * Specifies the vmImageVersion property: The version of the Azure Virtual Machines Marketplace image. A
             * value of 'latest' can be specified to select the latest version of an image. If omitted, the default is
             * 'latest'..
             *
             * @param vmImageVersion The version of the Azure Virtual Machines Marketplace image. A value of 'latest'
             *     can be specified to select the latest version of an image. If omitted, the default is 'latest'.
             * @return the next definition stage.
             */
            WithCreate withVmImageVersion(String vmImageVersion);
        }
        /** The stage of the NodeType definition allowing to specify vmSecrets. */
        interface WithVmSecrets {
            /**
             * Specifies the vmSecrets property: The secrets to install in the virtual machines..
             *
             * @param vmSecrets The secrets to install in the virtual machines.
             * @return the next definition stage.
             */
            WithCreate withVmSecrets(List<VaultSecretGroup> vmSecrets);
        }
        /** The stage of the NodeType definition allowing to specify vmExtensions. */
        interface WithVmExtensions {
            /**
             * Specifies the vmExtensions property: Set of extensions that should be installed onto the virtual
             * machines..
             *
             * @param vmExtensions Set of extensions that should be installed onto the virtual machines.
             * @return the next definition stage.
             */
            WithCreate withVmExtensions(List<VmssExtension> vmExtensions);
        }
    }
    /**
     * Begins update for the NodeType resource.
     *
     * @return the stage of resource update.
     */
    NodeType.Update update();

    /** The template for NodeType update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithVmInstanceCount,
            UpdateStages.WithPlacementProperties,
            UpdateStages.WithCapacities,
            UpdateStages.WithApplicationPorts,
            UpdateStages.WithEphemeralPorts,
            UpdateStages.WithVmSecrets,
            UpdateStages.WithVmExtensions {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        NodeType apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NodeType apply(Context context);
    }
    /** The NodeType update stages. */
    interface UpdateStages {
        /** The stage of the NodeType update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Node type update parameters.
             *
             * @param tags Node type update parameters.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the NodeType update allowing to specify vmInstanceCount. */
        interface WithVmInstanceCount {
            /**
             * Specifies the vmInstanceCount property: The number of nodes in the node type..
             *
             * @param vmInstanceCount The number of nodes in the node type.
             * @return the next definition stage.
             */
            Update withVmInstanceCount(Integer vmInstanceCount);
        }
        /** The stage of the NodeType update allowing to specify placementProperties. */
        interface WithPlacementProperties {
            /**
             * Specifies the placementProperties property: The placement tags applied to nodes in the node type, which
             * can be used to indicate where certain services (workload) should run..
             *
             * @param placementProperties The placement tags applied to nodes in the node type, which can be used to
             *     indicate where certain services (workload) should run.
             * @return the next definition stage.
             */
            Update withPlacementProperties(Map<String, String> placementProperties);
        }
        /** The stage of the NodeType update allowing to specify capacities. */
        interface WithCapacities {
            /**
             * Specifies the capacities property: The capacity tags applied to the nodes in the node type, the cluster
             * resource manager uses these tags to understand how much resource a node has..
             *
             * @param capacities The capacity tags applied to the nodes in the node type, the cluster resource manager
             *     uses these tags to understand how much resource a node has.
             * @return the next definition stage.
             */
            Update withCapacities(Map<String, String> capacities);
        }
        /** The stage of the NodeType update allowing to specify applicationPorts. */
        interface WithApplicationPorts {
            /**
             * Specifies the applicationPorts property: The range of ports from which cluster assigned port to Service
             * Fabric applications..
             *
             * @param applicationPorts The range of ports from which cluster assigned port to Service Fabric
             *     applications.
             * @return the next definition stage.
             */
            Update withApplicationPorts(EndpointRangeDescription applicationPorts);
        }
        /** The stage of the NodeType update allowing to specify ephemeralPorts. */
        interface WithEphemeralPorts {
            /**
             * Specifies the ephemeralPorts property: The range of ephemeral ports that nodes in this node type should
             * be configured with..
             *
             * @param ephemeralPorts The range of ephemeral ports that nodes in this node type should be configured
             *     with.
             * @return the next definition stage.
             */
            Update withEphemeralPorts(EndpointRangeDescription ephemeralPorts);
        }
        /** The stage of the NodeType update allowing to specify vmSecrets. */
        interface WithVmSecrets {
            /**
             * Specifies the vmSecrets property: The secrets to install in the virtual machines..
             *
             * @param vmSecrets The secrets to install in the virtual machines.
             * @return the next definition stage.
             */
            Update withVmSecrets(List<VaultSecretGroup> vmSecrets);
        }
        /** The stage of the NodeType update allowing to specify vmExtensions. */
        interface WithVmExtensions {
            /**
             * Specifies the vmExtensions property: Set of extensions that should be installed onto the virtual
             * machines..
             *
             * @param vmExtensions Set of extensions that should be installed onto the virtual machines.
             * @return the next definition stage.
             */
            Update withVmExtensions(List<VmssExtension> vmExtensions);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    NodeType refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NodeType refresh(Context context);

    /**
     * Restarts one or more nodes on the node type. It will disable the fabric nodes, trigger a restart on the VMs and
     * activate the nodes back again.
     *
     * @param parameters parameters for restart action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(NodeTypeActionParameters parameters);

    /**
     * Restarts one or more nodes on the node type. It will disable the fabric nodes, trigger a restart on the VMs and
     * activate the nodes back again.
     *
     * @param parameters parameters for restart action.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(NodeTypeActionParameters parameters, Context context);

    /**
     * Reimages one or more nodes on the node type. It will disable the fabric nodes, trigger a reimage on the VMs and
     * activate the nodes back again.
     *
     * @param parameters parameters for reimage action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(NodeTypeActionParameters parameters);

    /**
     * Reimages one or more nodes on the node type. It will disable the fabric nodes, trigger a reimage on the VMs and
     * activate the nodes back again.
     *
     * @param parameters parameters for reimage action.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(NodeTypeActionParameters parameters, Context context);

    /**
     * Deletes one or more nodes on the node type. It will disable the fabric nodes, trigger a delete on the VMs and
     * removes the state from the cluster.
     *
     * @param parameters parameters for delete action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteNode(NodeTypeActionParameters parameters);

    /**
     * Deletes one or more nodes on the node type. It will disable the fabric nodes, trigger a delete on the VMs and
     * removes the state from the cluster.
     *
     * @param parameters parameters for delete action.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteNode(NodeTypeActionParameters parameters, Context context);
}
