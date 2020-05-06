/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_04_01.implementation.FlowLogInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_04_01.implementation.NetworkManager;
import java.util.Map;

/**
 * Type representing FlowLog.
 */
public interface FlowLog extends HasInner<FlowLogInner>, Indexable, Refreshable<FlowLog>, Updatable<FlowLog.Update>, HasManager<NetworkManager> {
    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the flowAnalyticsConfiguration value.
     */
    TrafficAnalyticsProperties flowAnalyticsConfiguration();

    /**
     * @return the format value.
     */
    FlowLogFormatParameters format();

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
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the retentionPolicy value.
     */
    RetentionPolicyParameters retentionPolicy();

    /**
     * @return the storageId value.
     */
    String storageId();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the targetResourceGuid value.
     */
    String targetResourceGuid();

    /**
     * @return the targetResourceId value.
     */
    String targetResourceId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the FlowLog definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNetworkWatcher, DefinitionStages.WithStorageId, DefinitionStages.WithTargetResourceId, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of FlowLog definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a FlowLog definition.
         */
        interface Blank extends WithNetworkWatcher {
        }

        /**
         * The stage of the flowlog definition allowing to specify NetworkWatcher.
         */
        interface WithNetworkWatcher {
           /**
            * Specifies resourceGroupName, networkWatcherName.
            * @param resourceGroupName The name of the resource group
            * @param networkWatcherName The name of the network watcher
            * @return the next definition stage
            */
            WithStorageId withExistingNetworkWatcher(String resourceGroupName, String networkWatcherName);
        }

        /**
         * The stage of the flowlog definition allowing to specify StorageId.
         */
        interface WithStorageId {
           /**
            * Specifies storageId.
            * @param storageId ID of the storage account which is used to store the flow log
            * @return the next definition stage
            */
            WithTargetResourceId withStorageId(String storageId);
        }

        /**
         * The stage of the flowlog definition allowing to specify TargetResourceId.
         */
        interface WithTargetResourceId {
           /**
            * Specifies targetResourceId.
            * @param targetResourceId ID of network security group to which flow log will be applied
            * @return the next definition stage
            */
            WithCreate withTargetResourceId(String targetResourceId);
        }

        /**
         * The stage of the flowlog definition allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             * @param enabled Flag to enable/disable flow logging
             * @return the next definition stage
             */
            WithCreate withEnabled(Boolean enabled);
        }

        /**
         * The stage of the flowlog definition allowing to specify FlowAnalyticsConfiguration.
         */
        interface WithFlowAnalyticsConfiguration {
            /**
             * Specifies flowAnalyticsConfiguration.
             * @param flowAnalyticsConfiguration Parameters that define the configuration of traffic analytics
             * @return the next definition stage
             */
            WithCreate withFlowAnalyticsConfiguration(TrafficAnalyticsProperties flowAnalyticsConfiguration);
        }

        /**
         * The stage of the flowlog definition allowing to specify Format.
         */
        interface WithFormat {
            /**
             * Specifies format.
             * @param format Parameters that define the flow log format
             * @return the next definition stage
             */
            WithCreate withFormat(FlowLogFormatParameters format);
        }

        /**
         * The stage of the flowlog definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the flowlog definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Resource location
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the flowlog definition allowing to specify RetentionPolicy.
         */
        interface WithRetentionPolicy {
            /**
             * Specifies retentionPolicy.
             * @param retentionPolicy Parameters that define the retention policy for flow log
             * @return the next definition stage
             */
            WithCreate withRetentionPolicy(RetentionPolicyParameters retentionPolicy);
        }

        /**
         * The stage of the flowlog definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<FlowLog>, DefinitionStages.WithEnabled, DefinitionStages.WithFlowAnalyticsConfiguration, DefinitionStages.WithFormat, DefinitionStages.WithId, DefinitionStages.WithLocation, DefinitionStages.WithRetentionPolicy, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a FlowLog update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<FlowLog>, UpdateStages.WithEnabled, UpdateStages.WithFlowAnalyticsConfiguration, UpdateStages.WithFormat, UpdateStages.WithId, UpdateStages.WithLocation, UpdateStages.WithRetentionPolicy, UpdateStages.WithTags {
    }

    /**
     * Grouping of FlowLog update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the flowlog update allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             * @param enabled Flag to enable/disable flow logging
             * @return the next update stage
             */
            Update withEnabled(Boolean enabled);
        }

        /**
         * The stage of the flowlog update allowing to specify FlowAnalyticsConfiguration.
         */
        interface WithFlowAnalyticsConfiguration {
            /**
             * Specifies flowAnalyticsConfiguration.
             * @param flowAnalyticsConfiguration Parameters that define the configuration of traffic analytics
             * @return the next update stage
             */
            Update withFlowAnalyticsConfiguration(TrafficAnalyticsProperties flowAnalyticsConfiguration);
        }

        /**
         * The stage of the flowlog update allowing to specify Format.
         */
        interface WithFormat {
            /**
             * Specifies format.
             * @param format Parameters that define the flow log format
             * @return the next update stage
             */
            Update withFormat(FlowLogFormatParameters format);
        }

        /**
         * The stage of the flowlog update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the flowlog update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Resource location
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the flowlog update allowing to specify RetentionPolicy.
         */
        interface WithRetentionPolicy {
            /**
             * Specifies retentionPolicy.
             * @param retentionPolicy Parameters that define the retention policy for flow log
             * @return the next update stage
             */
            Update withRetentionPolicy(RetentionPolicyParameters retentionPolicy);
        }

        /**
         * The stage of the flowlog update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
