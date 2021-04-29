// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.StreamingLocatorInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** An immutable client-side representation of StreamingLocator. */
public interface StreamingLocator {
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
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the assetName property: Asset Name.
     *
     * @return the assetName value.
     */
    String assetName();

    /**
     * Gets the created property: The creation time of the Streaming Locator.
     *
     * @return the created value.
     */
    OffsetDateTime created();

    /**
     * Gets the startTime property: The start time of the Streaming Locator.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: The end time of the Streaming Locator.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the streamingLocatorId property: The StreamingLocatorId of the Streaming Locator.
     *
     * @return the streamingLocatorId value.
     */
    UUID streamingLocatorId();

    /**
     * Gets the streamingPolicyName property: Name of the Streaming Policy used by this Streaming Locator. Either
     * specify the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined
     * Streaming Policies available are: 'Predefined_DownloadOnly', 'Predefined_ClearStreamingOnly',
     * 'Predefined_DownloadAndClearStreaming', 'Predefined_ClearKey', 'Predefined_MultiDrmCencStreaming' and
     * 'Predefined_MultiDrmStreaming'.
     *
     * @return the streamingPolicyName value.
     */
    String streamingPolicyName();

    /**
     * Gets the defaultContentKeyPolicyName property: Name of the default ContentKeyPolicy used by this Streaming
     * Locator.
     *
     * @return the defaultContentKeyPolicyName value.
     */
    String defaultContentKeyPolicyName();

    /**
     * Gets the contentKeys property: The ContentKeys used by this Streaming Locator.
     *
     * @return the contentKeys value.
     */
    List<StreamingLocatorContentKey> contentKeys();

    /**
     * Gets the alternativeMediaId property: Alternative Media ID of this Streaming Locator.
     *
     * @return the alternativeMediaId value.
     */
    String alternativeMediaId();

    /**
     * Gets the filters property: A list of asset or account filters which apply to this streaming locator.
     *
     * @return the filters value.
     */
    List<String> filters();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.fluent.models.StreamingLocatorInner object.
     *
     * @return the inner object.
     */
    StreamingLocatorInner innerModel();

    /** The entirety of the StreamingLocator definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The StreamingLocator definition stages. */
    interface DefinitionStages {
        /** The first stage of the StreamingLocator definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the StreamingLocator definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group within the Azure subscription.
             * @param accountName The Media Services account name.
             * @return the next definition stage.
             */
            WithCreate withExistingMediaService(String resourceGroupName, String accountName);
        }
        /**
         * The stage of the StreamingLocator definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithAssetName,
                DefinitionStages.WithStartTime,
                DefinitionStages.WithEndTime,
                DefinitionStages.WithStreamingLocatorId,
                DefinitionStages.WithStreamingPolicyName,
                DefinitionStages.WithDefaultContentKeyPolicyName,
                DefinitionStages.WithContentKeys,
                DefinitionStages.WithAlternativeMediaId,
                DefinitionStages.WithFilters {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            StreamingLocator create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            StreamingLocator create(Context context);
        }
        /** The stage of the StreamingLocator definition allowing to specify assetName. */
        interface WithAssetName {
            /**
             * Specifies the assetName property: Asset Name.
             *
             * @param assetName Asset Name.
             * @return the next definition stage.
             */
            WithCreate withAssetName(String assetName);
        }
        /** The stage of the StreamingLocator definition allowing to specify startTime. */
        interface WithStartTime {
            /**
             * Specifies the startTime property: The start time of the Streaming Locator..
             *
             * @param startTime The start time of the Streaming Locator.
             * @return the next definition stage.
             */
            WithCreate withStartTime(OffsetDateTime startTime);
        }
        /** The stage of the StreamingLocator definition allowing to specify endTime. */
        interface WithEndTime {
            /**
             * Specifies the endTime property: The end time of the Streaming Locator..
             *
             * @param endTime The end time of the Streaming Locator.
             * @return the next definition stage.
             */
            WithCreate withEndTime(OffsetDateTime endTime);
        }
        /** The stage of the StreamingLocator definition allowing to specify streamingLocatorId. */
        interface WithStreamingLocatorId {
            /**
             * Specifies the streamingLocatorId property: The StreamingLocatorId of the Streaming Locator..
             *
             * @param streamingLocatorId The StreamingLocatorId of the Streaming Locator.
             * @return the next definition stage.
             */
            WithCreate withStreamingLocatorId(UUID streamingLocatorId);
        }
        /** The stage of the StreamingLocator definition allowing to specify streamingPolicyName. */
        interface WithStreamingPolicyName {
            /**
             * Specifies the streamingPolicyName property: Name of the Streaming Policy used by this Streaming Locator.
             * Either specify the name of Streaming Policy you created or use one of the predefined Streaming Policies.
             * The predefined Streaming Policies available are: 'Predefined_DownloadOnly',
             * 'Predefined_ClearStreamingOnly', 'Predefined_DownloadAndClearStreaming', 'Predefined_ClearKey',
             * 'Predefined_MultiDrmCencStreaming' and 'Predefined_MultiDrmStreaming'.
             *
             * @param streamingPolicyName Name of the Streaming Policy used by this Streaming Locator. Either specify
             *     the name of Streaming Policy you created or use one of the predefined Streaming Policies. The
             *     predefined Streaming Policies available are: 'Predefined_DownloadOnly',
             *     'Predefined_ClearStreamingOnly', 'Predefined_DownloadAndClearStreaming', 'Predefined_ClearKey',
             *     'Predefined_MultiDrmCencStreaming' and 'Predefined_MultiDrmStreaming'.
             * @return the next definition stage.
             */
            WithCreate withStreamingPolicyName(String streamingPolicyName);
        }
        /** The stage of the StreamingLocator definition allowing to specify defaultContentKeyPolicyName. */
        interface WithDefaultContentKeyPolicyName {
            /**
             * Specifies the defaultContentKeyPolicyName property: Name of the default ContentKeyPolicy used by this
             * Streaming Locator..
             *
             * @param defaultContentKeyPolicyName Name of the default ContentKeyPolicy used by this Streaming Locator.
             * @return the next definition stage.
             */
            WithCreate withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName);
        }
        /** The stage of the StreamingLocator definition allowing to specify contentKeys. */
        interface WithContentKeys {
            /**
             * Specifies the contentKeys property: The ContentKeys used by this Streaming Locator..
             *
             * @param contentKeys The ContentKeys used by this Streaming Locator.
             * @return the next definition stage.
             */
            WithCreate withContentKeys(List<StreamingLocatorContentKey> contentKeys);
        }
        /** The stage of the StreamingLocator definition allowing to specify alternativeMediaId. */
        interface WithAlternativeMediaId {
            /**
             * Specifies the alternativeMediaId property: Alternative Media ID of this Streaming Locator.
             *
             * @param alternativeMediaId Alternative Media ID of this Streaming Locator.
             * @return the next definition stage.
             */
            WithCreate withAlternativeMediaId(String alternativeMediaId);
        }
        /** The stage of the StreamingLocator definition allowing to specify filters. */
        interface WithFilters {
            /**
             * Specifies the filters property: A list of asset or account filters which apply to this streaming locator.
             *
             * @param filters A list of asset or account filters which apply to this streaming locator.
             * @return the next definition stage.
             */
            WithCreate withFilters(List<String> filters);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    StreamingLocator refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    StreamingLocator refresh(Context context);
}
