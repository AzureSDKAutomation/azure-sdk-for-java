/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation.SBTopicInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation.ServiceBusManager;
import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 * Type representing SBTopic.
 */
public interface SBTopic extends HasInner<SBTopicInner>, Indexable, Refreshable<SBTopic>, Updatable<SBTopic.Update>, HasManager<ServiceBusManager> {
    /**
     * @return the accessedAt value.
     */
    DateTime accessedAt();

    /**
     * @return the autoDeleteOnIdle value.
     */
    Period autoDeleteOnIdle();

    /**
     * @return the countDetails value.
     */
    MessageCountDetails countDetails();

    /**
     * @return the createdAt value.
     */
    DateTime createdAt();

    /**
     * @return the defaultMessageTimeToLive value.
     */
    Period defaultMessageTimeToLive();

    /**
     * @return the duplicateDetectionHistoryTimeWindow value.
     */
    Period duplicateDetectionHistoryTimeWindow();

    /**
     * @return the enableBatchedOperations value.
     */
    Boolean enableBatchedOperations();

    /**
     * @return the enableExpress value.
     */
    Boolean enableExpress();

    /**
     * @return the enablePartitioning value.
     */
    Boolean enablePartitioning();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the maxSizeInMegabytes value.
     */
    Integer maxSizeInMegabytes();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the requiresDuplicateDetection value.
     */
    Boolean requiresDuplicateDetection();

    /**
     * @return the sizeInBytes value.
     */
    Long sizeInBytes();

    /**
     * @return the status value.
     */
    EntityStatus status();

    /**
     * @return the subscriptionCount value.
     */
    Integer subscriptionCount();

    /**
     * @return the supportOrdering value.
     */
    Boolean supportOrdering();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the updatedAt value.
     */
    DateTime updatedAt();

    /**
     * The entirety of the SBTopic definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNamespace, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SBTopic definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SBTopic definition.
         */
        interface Blank extends WithNamespace {
        }

        /**
         * The stage of the sbtopic definition allowing to specify Namespace.
         */
        interface WithNamespace {
           /**
            * Specifies resourceGroupName, namespaceName.
            * @param resourceGroupName Name of the Resource group within the Azure subscription
            * @param namespaceName The namespace name
            * @return the next definition stage
            */
            WithCreate withExistingNamespace(String resourceGroupName, String namespaceName);
        }

        /**
         * The stage of the sbtopic definition allowing to specify AutoDeleteOnIdle.
         */
        interface WithAutoDeleteOnIdle {
            /**
             * Specifies autoDeleteOnIdle.
             * @param autoDeleteOnIdle ISO 8601 timespan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes
             * @return the next definition stage
             */
            WithCreate withAutoDeleteOnIdle(Period autoDeleteOnIdle);
        }

        /**
         * The stage of the sbtopic definition allowing to specify DefaultMessageTimeToLive.
         */
        interface WithDefaultMessageTimeToLive {
            /**
             * Specifies defaultMessageTimeToLive.
             * @param defaultMessageTimeToLive ISO 8601 Default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself
             * @return the next definition stage
             */
            WithCreate withDefaultMessageTimeToLive(Period defaultMessageTimeToLive);
        }

        /**
         * The stage of the sbtopic definition allowing to specify DuplicateDetectionHistoryTimeWindow.
         */
        interface WithDuplicateDetectionHistoryTimeWindow {
            /**
             * Specifies duplicateDetectionHistoryTimeWindow.
             * @param duplicateDetectionHistoryTimeWindow ISO8601 timespan structure that defines the duration of the duplicate detection history. The default value is 10 minutes
             * @return the next definition stage
             */
            WithCreate withDuplicateDetectionHistoryTimeWindow(Period duplicateDetectionHistoryTimeWindow);
        }

        /**
         * The stage of the sbtopic definition allowing to specify EnableBatchedOperations.
         */
        interface WithEnableBatchedOperations {
            /**
             * Specifies enableBatchedOperations.
             * @param enableBatchedOperations Value that indicates whether server-side batched operations are enabled
             * @return the next definition stage
             */
            WithCreate withEnableBatchedOperations(Boolean enableBatchedOperations);
        }

        /**
         * The stage of the sbtopic definition allowing to specify EnableExpress.
         */
        interface WithEnableExpress {
            /**
             * Specifies enableExpress.
             * @param enableExpress Value that indicates whether Express Entities are enabled. An express topic holds a message in memory temporarily before writing it to persistent storage
             * @return the next definition stage
             */
            WithCreate withEnableExpress(Boolean enableExpress);
        }

        /**
         * The stage of the sbtopic definition allowing to specify EnablePartitioning.
         */
        interface WithEnablePartitioning {
            /**
             * Specifies enablePartitioning.
             * @param enablePartitioning Value that indicates whether the topic to be partitioned across multiple message brokers is enabled
             * @return the next definition stage
             */
            WithCreate withEnablePartitioning(Boolean enablePartitioning);
        }

        /**
         * The stage of the sbtopic definition allowing to specify MaxSizeInMegabytes.
         */
        interface WithMaxSizeInMegabytes {
            /**
             * Specifies maxSizeInMegabytes.
             * @param maxSizeInMegabytes Maximum size of the topic in megabytes, which is the size of the memory allocated for the topic. Default is 1024
             * @return the next definition stage
             */
            WithCreate withMaxSizeInMegabytes(Integer maxSizeInMegabytes);
        }

        /**
         * The stage of the sbtopic definition allowing to specify RequiresDuplicateDetection.
         */
        interface WithRequiresDuplicateDetection {
            /**
             * Specifies requiresDuplicateDetection.
             * @param requiresDuplicateDetection Value indicating if this topic requires duplicate detection
             * @return the next definition stage
             */
            WithCreate withRequiresDuplicateDetection(Boolean requiresDuplicateDetection);
        }

        /**
         * The stage of the sbtopic definition allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status Enumerates the possible values for the status of a messaging entity. Possible values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'
             * @return the next definition stage
             */
            WithCreate withStatus(EntityStatus status);
        }

        /**
         * The stage of the sbtopic definition allowing to specify SupportOrdering.
         */
        interface WithSupportOrdering {
            /**
             * Specifies supportOrdering.
             * @param supportOrdering Value that indicates whether the topic supports ordering
             * @return the next definition stage
             */
            WithCreate withSupportOrdering(Boolean supportOrdering);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SBTopic>, DefinitionStages.WithAutoDeleteOnIdle, DefinitionStages.WithDefaultMessageTimeToLive, DefinitionStages.WithDuplicateDetectionHistoryTimeWindow, DefinitionStages.WithEnableBatchedOperations, DefinitionStages.WithEnableExpress, DefinitionStages.WithEnablePartitioning, DefinitionStages.WithMaxSizeInMegabytes, DefinitionStages.WithRequiresDuplicateDetection, DefinitionStages.WithStatus, DefinitionStages.WithSupportOrdering {
        }
    }
    /**
     * The template for a SBTopic update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SBTopic>, UpdateStages.WithAutoDeleteOnIdle, UpdateStages.WithDefaultMessageTimeToLive, UpdateStages.WithDuplicateDetectionHistoryTimeWindow, UpdateStages.WithEnableBatchedOperations, UpdateStages.WithEnableExpress, UpdateStages.WithEnablePartitioning, UpdateStages.WithMaxSizeInMegabytes, UpdateStages.WithRequiresDuplicateDetection, UpdateStages.WithStatus, UpdateStages.WithSupportOrdering {
    }

    /**
     * Grouping of SBTopic update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sbtopic update allowing to specify AutoDeleteOnIdle.
         */
        interface WithAutoDeleteOnIdle {
            /**
             * Specifies autoDeleteOnIdle.
             * @param autoDeleteOnIdle ISO 8601 timespan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes
             * @return the next update stage
             */
            Update withAutoDeleteOnIdle(Period autoDeleteOnIdle);
        }

        /**
         * The stage of the sbtopic update allowing to specify DefaultMessageTimeToLive.
         */
        interface WithDefaultMessageTimeToLive {
            /**
             * Specifies defaultMessageTimeToLive.
             * @param defaultMessageTimeToLive ISO 8601 Default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself
             * @return the next update stage
             */
            Update withDefaultMessageTimeToLive(Period defaultMessageTimeToLive);
        }

        /**
         * The stage of the sbtopic update allowing to specify DuplicateDetectionHistoryTimeWindow.
         */
        interface WithDuplicateDetectionHistoryTimeWindow {
            /**
             * Specifies duplicateDetectionHistoryTimeWindow.
             * @param duplicateDetectionHistoryTimeWindow ISO8601 timespan structure that defines the duration of the duplicate detection history. The default value is 10 minutes
             * @return the next update stage
             */
            Update withDuplicateDetectionHistoryTimeWindow(Period duplicateDetectionHistoryTimeWindow);
        }

        /**
         * The stage of the sbtopic update allowing to specify EnableBatchedOperations.
         */
        interface WithEnableBatchedOperations {
            /**
             * Specifies enableBatchedOperations.
             * @param enableBatchedOperations Value that indicates whether server-side batched operations are enabled
             * @return the next update stage
             */
            Update withEnableBatchedOperations(Boolean enableBatchedOperations);
        }

        /**
         * The stage of the sbtopic update allowing to specify EnableExpress.
         */
        interface WithEnableExpress {
            /**
             * Specifies enableExpress.
             * @param enableExpress Value that indicates whether Express Entities are enabled. An express topic holds a message in memory temporarily before writing it to persistent storage
             * @return the next update stage
             */
            Update withEnableExpress(Boolean enableExpress);
        }

        /**
         * The stage of the sbtopic update allowing to specify EnablePartitioning.
         */
        interface WithEnablePartitioning {
            /**
             * Specifies enablePartitioning.
             * @param enablePartitioning Value that indicates whether the topic to be partitioned across multiple message brokers is enabled
             * @return the next update stage
             */
            Update withEnablePartitioning(Boolean enablePartitioning);
        }

        /**
         * The stage of the sbtopic update allowing to specify MaxSizeInMegabytes.
         */
        interface WithMaxSizeInMegabytes {
            /**
             * Specifies maxSizeInMegabytes.
             * @param maxSizeInMegabytes Maximum size of the topic in megabytes, which is the size of the memory allocated for the topic. Default is 1024
             * @return the next update stage
             */
            Update withMaxSizeInMegabytes(Integer maxSizeInMegabytes);
        }

        /**
         * The stage of the sbtopic update allowing to specify RequiresDuplicateDetection.
         */
        interface WithRequiresDuplicateDetection {
            /**
             * Specifies requiresDuplicateDetection.
             * @param requiresDuplicateDetection Value indicating if this topic requires duplicate detection
             * @return the next update stage
             */
            Update withRequiresDuplicateDetection(Boolean requiresDuplicateDetection);
        }

        /**
         * The stage of the sbtopic update allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status Enumerates the possible values for the status of a messaging entity. Possible values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'
             * @return the next update stage
             */
            Update withStatus(EntityStatus status);
        }

        /**
         * The stage of the sbtopic update allowing to specify SupportOrdering.
         */
        interface WithSupportOrdering {
            /**
             * Specifies supportOrdering.
             * @param supportOrdering Value that indicates whether the topic supports ordering
             * @return the next update stage
             */
            Update withSupportOrdering(Boolean supportOrdering);
        }

    }
}
