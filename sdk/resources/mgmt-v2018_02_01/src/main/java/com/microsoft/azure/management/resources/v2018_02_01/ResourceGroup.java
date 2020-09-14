/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.resources.v2018_02_01.implementation.ResourceGroupInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resources.v2018_02_01.implementation.ResourcesManager;
import java.util.Map;

/**
 * Type representing ResourceGroup.
 */
public interface ResourceGroup extends HasInner<ResourceGroupInner>, Indexable, Refreshable<ResourceGroup>, Updatable<ResourceGroup.Update>, HasManager<ResourcesManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the managedBy value.
     */
    String managedBy();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    ResourceGroupProperties properties();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * The entirety of the ResourceGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithSubscription, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ResourceGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ResourceGroup definition.
         */
        interface Blank extends WithSubscription {
        }

        /**
         * The stage of the resourcegroup definition allowing to specify Subscription.
         */
        interface WithSubscription {
           /**
            * Specifies .
            * @return the next definition stage
            */
            WithLocation withExistingSubscription();
        }

        /**
         * The stage of the resourcegroup definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location The location of the resource group. It cannot be changed after the resource group has been created. It must be one of the supported Azure locations
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the resourcegroup definition allowing to specify ManagedBy.
         */
        interface WithManagedBy {
            /**
             * Specifies managedBy.
             * @param managedBy The ID of the resource that manages this resource group
             * @return the next definition stage
             */
            WithCreate withManagedBy(String managedBy);
        }

        /**
         * The stage of the resourcegroup definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource group
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the resourcegroup definition allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties the properties parameter value
             * @return the next definition stage
             */
            WithCreate withProperties(ResourceGroupProperties properties);
        }

        /**
         * The stage of the resourcegroup definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags attached to the resource group
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ResourceGroup>, DefinitionStages.WithManagedBy, DefinitionStages.WithName, DefinitionStages.WithProperties, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a ResourceGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ResourceGroup>, UpdateStages.WithManagedBy, UpdateStages.WithName, UpdateStages.WithProperties, UpdateStages.WithTags {
    }

    /**
     * Grouping of ResourceGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the resourcegroup update allowing to specify ManagedBy.
         */
        interface WithManagedBy {
            /**
             * Specifies managedBy.
             * @param managedBy The ID of the resource that manages this resource group
             * @return the next update stage
             */
            Update withManagedBy(String managedBy);
        }

        /**
         * The stage of the resourcegroup update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource group
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the resourcegroup update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties the properties parameter value
             * @return the next update stage
             */
            Update withProperties(ResourceGroupProperties properties);
        }

        /**
         * The stage of the resourcegroup update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags attached to the resource group
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
