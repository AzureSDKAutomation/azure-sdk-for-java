// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.SystemTopicInner;
import java.util.Map;

/** An immutable client-side representation of SystemTopic. */
public interface SystemTopic {
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
     * Gets the identity property: Identity information for the resource.
     *
     * @return the identity value.
     */
    IdentityInfo identity();

    /**
     * Gets the systemData property: The system metadata relating to System Topic resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning state of the system topic.
     *
     * @return the provisioningState value.
     */
    ResourceProvisioningState provisioningState();

    /**
     * Gets the source property: Source for the system topic.
     *
     * @return the source value.
     */
    String source();

    /**
     * Gets the topicType property: TopicType for the system topic.
     *
     * @return the topicType value.
     */
    String topicType();

    /**
     * Gets the metricResourceId property: Metric resource id for the system topic.
     *
     * @return the metricResourceId value.
     */
    String metricResourceId();

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
     * Gets the inner com.azure.resourcemanager.eventgrid.fluent.models.SystemTopicInner object.
     *
     * @return the inner object.
     */
    SystemTopicInner innerModel();

    /** The entirety of the SystemTopic definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The SystemTopic definition stages. */
    interface DefinitionStages {
        /** The first stage of the SystemTopic definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the SystemTopic definition allowing to specify location. */
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
        /** The stage of the SystemTopic definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the SystemTopic definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithSource,
                DefinitionStages.WithTopicType {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SystemTopic create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SystemTopic create(Context context);
        }
        /** The stage of the SystemTopic definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the SystemTopic definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity information for the resource..
             *
             * @param identity Identity information for the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityInfo identity);
        }
        /** The stage of the SystemTopic definition allowing to specify source. */
        interface WithSource {
            /**
             * Specifies the source property: Source for the system topic..
             *
             * @param source Source for the system topic.
             * @return the next definition stage.
             */
            WithCreate withSource(String source);
        }
        /** The stage of the SystemTopic definition allowing to specify topicType. */
        interface WithTopicType {
            /**
             * Specifies the topicType property: TopicType for the system topic..
             *
             * @param topicType TopicType for the system topic.
             * @return the next definition stage.
             */
            WithCreate withTopicType(String topicType);
        }
    }
    /**
     * Begins update for the SystemTopic resource.
     *
     * @return the stage of resource update.
     */
    SystemTopic.Update update();

    /** The template for SystemTopic update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SystemTopic apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SystemTopic apply(Context context);
    }
    /** The SystemTopic update stages. */
    interface UpdateStages {
        /** The stage of the SystemTopic update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Tags of the system topic..
             *
             * @param tags Tags of the system topic.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the SystemTopic update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Resource identity information..
             *
             * @param identity Resource identity information.
             * @return the next definition stage.
             */
            Update withIdentity(IdentityInfo identity);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SystemTopic refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SystemTopic refresh(Context context);
}
