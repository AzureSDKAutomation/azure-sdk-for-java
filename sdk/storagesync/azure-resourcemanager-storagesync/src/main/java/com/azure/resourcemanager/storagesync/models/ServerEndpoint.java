// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storagesync.fluent.models.ServerEndpointInner;

/** An immutable client-side representation of ServerEndpoint. */
public interface ServerEndpoint {
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
     * Gets the serverLocalPath property: Server Local path.
     *
     * @return the serverLocalPath value.
     */
    String serverLocalPath();

    /**
     * Gets the cloudTiering property: Cloud Tiering.
     *
     * @return the cloudTiering value.
     */
    FeatureStatus cloudTiering();

    /**
     * Gets the volumeFreeSpacePercent property: Level of free space to be maintained by Cloud Tiering if it is enabled.
     *
     * @return the volumeFreeSpacePercent value.
     */
    Integer volumeFreeSpacePercent();

    /**
     * Gets the tierFilesOlderThanDays property: Tier files older than days.
     *
     * @return the tierFilesOlderThanDays value.
     */
    Integer tierFilesOlderThanDays();

    /**
     * Gets the friendlyName property: Friendly Name.
     *
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * Gets the serverResourceId property: Server Resource Id.
     *
     * @return the serverResourceId value.
     */
    String serverResourceId();

    /**
     * Gets the provisioningState property: ServerEndpoint Provisioning State.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the lastWorkflowId property: ServerEndpoint lastWorkflowId.
     *
     * @return the lastWorkflowId value.
     */
    String lastWorkflowId();

    /**
     * Gets the lastOperationName property: Resource Last Operation Name.
     *
     * @return the lastOperationName value.
     */
    String lastOperationName();

    /**
     * Gets the syncStatus property: Server Endpoint sync status.
     *
     * @return the syncStatus value.
     */
    ServerEndpointSyncStatus syncStatus();

    /**
     * Gets the offlineDataTransfer property: Offline data transfer.
     *
     * @return the offlineDataTransfer value.
     */
    FeatureStatus offlineDataTransfer();

    /**
     * Gets the offlineDataTransferStorageAccountResourceId property: Offline data transfer storage account resource ID.
     *
     * @return the offlineDataTransferStorageAccountResourceId value.
     */
    String offlineDataTransferStorageAccountResourceId();

    /**
     * Gets the offlineDataTransferStorageAccountTenantId property: Offline data transfer storage account tenant ID.
     *
     * @return the offlineDataTransferStorageAccountTenantId value.
     */
    String offlineDataTransferStorageAccountTenantId();

    /**
     * Gets the offlineDataTransferShareName property: Offline data transfer share name.
     *
     * @return the offlineDataTransferShareName value.
     */
    String offlineDataTransferShareName();

    /**
     * Gets the cloudTieringStatus property: Cloud tiering status. Only populated if cloud tiering is enabled.
     *
     * @return the cloudTieringStatus value.
     */
    ServerEndpointCloudTieringStatus cloudTieringStatus();

    /**
     * Gets the recallStatus property: Recall status. Only populated if cloud tiering is enabled.
     *
     * @return the recallStatus value.
     */
    ServerEndpointRecallStatus recallStatus();

    /**
     * Gets the initialDownloadPolicy property: Policy for how namespace and files are recalled during FastDr.
     *
     * @return the initialDownloadPolicy value.
     */
    InitialDownloadPolicy initialDownloadPolicy();

    /**
     * Gets the localCacheMode property: Policy for enabling follow-the-sun business models: link local cache to cloud
     * behavior to pre-populate before local access.
     *
     * @return the localCacheMode value.
     */
    LocalCacheMode localCacheMode();

    /**
     * Gets the initialUploadPolicy property: Policy for how the initial upload sync session is performed.
     *
     * @return the initialUploadPolicy value.
     */
    InitialUploadPolicy initialUploadPolicy();

    /**
     * Gets the serverName property: Server name.
     *
     * @return the serverName value.
     */
    String serverName();

    /**
     * Gets the inner com.azure.resourcemanager.storagesync.fluent.models.ServerEndpointInner object.
     *
     * @return the inner object.
     */
    ServerEndpointInner innerModel();

    /** The entirety of the ServerEndpoint definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ServerEndpoint definition stages. */
    interface DefinitionStages {
        /** The first stage of the ServerEndpoint definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ServerEndpoint definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, storageSyncServiceName, syncGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param storageSyncServiceName Name of Storage Sync Service resource.
             * @param syncGroupName Name of Sync Group resource.
             * @return the next definition stage.
             */
            WithCreate withExistingSyncGroup(
                String resourceGroupName, String storageSyncServiceName, String syncGroupName);
        }
        /**
         * The stage of the ServerEndpoint definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithServerLocalPath,
                DefinitionStages.WithCloudTiering,
                DefinitionStages.WithVolumeFreeSpacePercent,
                DefinitionStages.WithTierFilesOlderThanDays,
                DefinitionStages.WithFriendlyName,
                DefinitionStages.WithServerResourceId,
                DefinitionStages.WithOfflineDataTransfer,
                DefinitionStages.WithOfflineDataTransferShareName,
                DefinitionStages.WithInitialDownloadPolicy,
                DefinitionStages.WithLocalCacheMode,
                DefinitionStages.WithInitialUploadPolicy {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ServerEndpoint create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ServerEndpoint create(Context context);
        }
        /** The stage of the ServerEndpoint definition allowing to specify serverLocalPath. */
        interface WithServerLocalPath {
            /**
             * Specifies the serverLocalPath property: Server Local path..
             *
             * @param serverLocalPath Server Local path.
             * @return the next definition stage.
             */
            WithCreate withServerLocalPath(String serverLocalPath);
        }
        /** The stage of the ServerEndpoint definition allowing to specify cloudTiering. */
        interface WithCloudTiering {
            /**
             * Specifies the cloudTiering property: Cloud Tiering..
             *
             * @param cloudTiering Cloud Tiering.
             * @return the next definition stage.
             */
            WithCreate withCloudTiering(FeatureStatus cloudTiering);
        }
        /** The stage of the ServerEndpoint definition allowing to specify volumeFreeSpacePercent. */
        interface WithVolumeFreeSpacePercent {
            /**
             * Specifies the volumeFreeSpacePercent property: Level of free space to be maintained by Cloud Tiering if
             * it is enabled..
             *
             * @param volumeFreeSpacePercent Level of free space to be maintained by Cloud Tiering if it is enabled.
             * @return the next definition stage.
             */
            WithCreate withVolumeFreeSpacePercent(Integer volumeFreeSpacePercent);
        }
        /** The stage of the ServerEndpoint definition allowing to specify tierFilesOlderThanDays. */
        interface WithTierFilesOlderThanDays {
            /**
             * Specifies the tierFilesOlderThanDays property: Tier files older than days..
             *
             * @param tierFilesOlderThanDays Tier files older than days.
             * @return the next definition stage.
             */
            WithCreate withTierFilesOlderThanDays(Integer tierFilesOlderThanDays);
        }
        /** The stage of the ServerEndpoint definition allowing to specify friendlyName. */
        interface WithFriendlyName {
            /**
             * Specifies the friendlyName property: Friendly Name.
             *
             * @param friendlyName Friendly Name.
             * @return the next definition stage.
             */
            WithCreate withFriendlyName(String friendlyName);
        }
        /** The stage of the ServerEndpoint definition allowing to specify serverResourceId. */
        interface WithServerResourceId {
            /**
             * Specifies the serverResourceId property: Server Resource Id..
             *
             * @param serverResourceId Server Resource Id.
             * @return the next definition stage.
             */
            WithCreate withServerResourceId(String serverResourceId);
        }
        /** The stage of the ServerEndpoint definition allowing to specify offlineDataTransfer. */
        interface WithOfflineDataTransfer {
            /**
             * Specifies the offlineDataTransfer property: Offline data transfer.
             *
             * @param offlineDataTransfer Offline data transfer.
             * @return the next definition stage.
             */
            WithCreate withOfflineDataTransfer(FeatureStatus offlineDataTransfer);
        }
        /** The stage of the ServerEndpoint definition allowing to specify offlineDataTransferShareName. */
        interface WithOfflineDataTransferShareName {
            /**
             * Specifies the offlineDataTransferShareName property: Offline data transfer share name.
             *
             * @param offlineDataTransferShareName Offline data transfer share name.
             * @return the next definition stage.
             */
            WithCreate withOfflineDataTransferShareName(String offlineDataTransferShareName);
        }
        /** The stage of the ServerEndpoint definition allowing to specify initialDownloadPolicy. */
        interface WithInitialDownloadPolicy {
            /**
             * Specifies the initialDownloadPolicy property: Policy for how namespace and files are recalled during
             * FastDr..
             *
             * @param initialDownloadPolicy Policy for how namespace and files are recalled during FastDr.
             * @return the next definition stage.
             */
            WithCreate withInitialDownloadPolicy(InitialDownloadPolicy initialDownloadPolicy);
        }
        /** The stage of the ServerEndpoint definition allowing to specify localCacheMode. */
        interface WithLocalCacheMode {
            /**
             * Specifies the localCacheMode property: Policy for enabling follow-the-sun business models: link local
             * cache to cloud behavior to pre-populate before local access..
             *
             * @param localCacheMode Policy for enabling follow-the-sun business models: link local cache to cloud
             *     behavior to pre-populate before local access.
             * @return the next definition stage.
             */
            WithCreate withLocalCacheMode(LocalCacheMode localCacheMode);
        }
        /** The stage of the ServerEndpoint definition allowing to specify initialUploadPolicy. */
        interface WithInitialUploadPolicy {
            /**
             * Specifies the initialUploadPolicy property: Policy for how the initial upload sync session is performed..
             *
             * @param initialUploadPolicy Policy for how the initial upload sync session is performed.
             * @return the next definition stage.
             */
            WithCreate withInitialUploadPolicy(InitialUploadPolicy initialUploadPolicy);
        }
    }
    /**
     * Begins update for the ServerEndpoint resource.
     *
     * @return the stage of resource update.
     */
    ServerEndpoint.Update update();

    /** The template for ServerEndpoint update. */
    interface Update
        extends UpdateStages.WithCloudTiering,
            UpdateStages.WithVolumeFreeSpacePercent,
            UpdateStages.WithTierFilesOlderThanDays,
            UpdateStages.WithOfflineDataTransfer,
            UpdateStages.WithOfflineDataTransferShareName,
            UpdateStages.WithLocalCacheMode {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ServerEndpoint apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ServerEndpoint apply(Context context);
    }
    /** The ServerEndpoint update stages. */
    interface UpdateStages {
        /** The stage of the ServerEndpoint update allowing to specify cloudTiering. */
        interface WithCloudTiering {
            /**
             * Specifies the cloudTiering property: Cloud Tiering..
             *
             * @param cloudTiering Cloud Tiering.
             * @return the next definition stage.
             */
            Update withCloudTiering(FeatureStatus cloudTiering);
        }
        /** The stage of the ServerEndpoint update allowing to specify volumeFreeSpacePercent. */
        interface WithVolumeFreeSpacePercent {
            /**
             * Specifies the volumeFreeSpacePercent property: Level of free space to be maintained by Cloud Tiering if
             * it is enabled..
             *
             * @param volumeFreeSpacePercent Level of free space to be maintained by Cloud Tiering if it is enabled.
             * @return the next definition stage.
             */
            Update withVolumeFreeSpacePercent(Integer volumeFreeSpacePercent);
        }
        /** The stage of the ServerEndpoint update allowing to specify tierFilesOlderThanDays. */
        interface WithTierFilesOlderThanDays {
            /**
             * Specifies the tierFilesOlderThanDays property: Tier files older than days..
             *
             * @param tierFilesOlderThanDays Tier files older than days.
             * @return the next definition stage.
             */
            Update withTierFilesOlderThanDays(Integer tierFilesOlderThanDays);
        }
        /** The stage of the ServerEndpoint update allowing to specify offlineDataTransfer. */
        interface WithOfflineDataTransfer {
            /**
             * Specifies the offlineDataTransfer property: Offline data transfer.
             *
             * @param offlineDataTransfer Offline data transfer.
             * @return the next definition stage.
             */
            Update withOfflineDataTransfer(FeatureStatus offlineDataTransfer);
        }
        /** The stage of the ServerEndpoint update allowing to specify offlineDataTransferShareName. */
        interface WithOfflineDataTransferShareName {
            /**
             * Specifies the offlineDataTransferShareName property: Offline data transfer share name.
             *
             * @param offlineDataTransferShareName Offline data transfer share name.
             * @return the next definition stage.
             */
            Update withOfflineDataTransferShareName(String offlineDataTransferShareName);
        }
        /** The stage of the ServerEndpoint update allowing to specify localCacheMode. */
        interface WithLocalCacheMode {
            /**
             * Specifies the localCacheMode property: Policy for enabling follow-the-sun business models: link local
             * cache to cloud behavior to pre-populate before local access..
             *
             * @param localCacheMode Policy for enabling follow-the-sun business models: link local cache to cloud
             *     behavior to pre-populate before local access.
             * @return the next definition stage.
             */
            Update withLocalCacheMode(LocalCacheMode localCacheMode);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ServerEndpoint refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ServerEndpoint refresh(Context context);

    /**
     * Recall a server endpoint.
     *
     * @param parameters Body of Recall Action object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void recallAction(RecallActionParameters parameters);

    /**
     * Recall a server endpoint.
     *
     * @param parameters Body of Recall Action object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void recallAction(RecallActionParameters parameters, Context context);
}
