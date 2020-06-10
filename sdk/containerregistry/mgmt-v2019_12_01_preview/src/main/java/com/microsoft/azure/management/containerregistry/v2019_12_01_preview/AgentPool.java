/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.AgentPoolInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.ContainerRegistryManager;
import java.util.Map;

/**
 * Type representing AgentPool.
 */
public interface AgentPool extends HasInner<AgentPoolInner>, Indexable, Refreshable<AgentPool>, Updatable<AgentPool.Update>, HasManager<ContainerRegistryManager> {
    /**
     * @return the count value.
     */
    Integer count();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the os value.
     */
    OS os();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the tier value.
     */
    String tier();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the virtualNetworkSubnetResourceId value.
     */
    String virtualNetworkSubnetResourceId();

    /**
     * The entirety of the AgentPool definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRegistry, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AgentPool definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AgentPool definition.
         */
        interface Blank extends WithRegistry {
        }

        /**
         * The stage of the agentpool definition allowing to specify Registry.
         */
        interface WithRegistry {
           /**
            * Specifies resourceGroupName, registryName.
            * @param resourceGroupName The name of the resource group to which the container registry belongs
            * @param registryName The name of the container registry
            * @return the next definition stage
            */
            WithLocation withExistingRegistry(String resourceGroupName, String registryName);
        }

        /**
         * The stage of the agentpool definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location The location of the resource. This cannot be changed after the resource is created
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the agentpool definition allowing to specify Count.
         */
        interface WithCount {
            /**
             * Specifies count.
             * @param count The count of agent machine
             * @return the next definition stage
             */
            WithCreate withCount(Integer count);
        }

        /**
         * The stage of the agentpool definition allowing to specify Os.
         */
        interface WithOs {
            /**
             * Specifies os.
             * @param os The OS of agent machine. Possible values include: 'Windows', 'Linux'
             * @return the next definition stage
             */
            WithCreate withOs(OS os);
        }

        /**
         * The stage of the agentpool definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the agentpool definition allowing to specify Tier.
         */
        interface WithTier {
            /**
             * Specifies tier.
             * @param tier The Tier of agent machine
             * @return the next definition stage
             */
            WithCreate withTier(String tier);
        }

        /**
         * The stage of the agentpool definition allowing to specify VirtualNetworkSubnetResourceId.
         */
        interface WithVirtualNetworkSubnetResourceId {
            /**
             * Specifies virtualNetworkSubnetResourceId.
             * @param virtualNetworkSubnetResourceId The Virtual Network Subnet Resource Id of the agent machine
             * @return the next definition stage
             */
            WithCreate withVirtualNetworkSubnetResourceId(String virtualNetworkSubnetResourceId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AgentPool>, DefinitionStages.WithCount, DefinitionStages.WithOs, DefinitionStages.WithTags, DefinitionStages.WithTier, DefinitionStages.WithVirtualNetworkSubnetResourceId {
        }
    }
    /**
     * The template for a AgentPool update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AgentPool>, UpdateStages.WithCount, UpdateStages.WithTags {
    }

    /**
     * Grouping of AgentPool update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the agentpool update allowing to specify Count.
         */
        interface WithCount {
            /**
             * Specifies count.
             * @param count The count of agent machine
             * @return the next update stage
             */
            Update withCount(Integer count);
        }

        /**
         * The stage of the agentpool update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The ARM resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
