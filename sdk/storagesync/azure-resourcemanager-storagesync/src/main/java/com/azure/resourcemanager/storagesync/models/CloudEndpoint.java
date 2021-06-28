// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storagesync.fluent.models.CloudEndpointInner;

/** An immutable client-side representation of CloudEndpoint. */
public interface CloudEndpoint {
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
     * Gets the storageAccountResourceId property: Storage Account Resource Id.
     *
     * @return the storageAccountResourceId value.
     */
    String storageAccountResourceId();

    /**
     * Gets the azureFileShareName property: Azure file share name.
     *
     * @return the azureFileShareName value.
     */
    String azureFileShareName();

    /**
     * Gets the storageAccountTenantId property: Storage Account Tenant Id.
     *
     * @return the storageAccountTenantId value.
     */
    String storageAccountTenantId();

    /**
     * Gets the partnershipId property: Partnership Id.
     *
     * @return the partnershipId value.
     */
    String partnershipId();

    /**
     * Gets the friendlyName property: Friendly Name.
     *
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * Gets the backupEnabled property: Backup Enabled.
     *
     * @return the backupEnabled value.
     */
    String backupEnabled();

    /**
     * Gets the provisioningState property: CloudEndpoint Provisioning State.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the lastWorkflowId property: CloudEndpoint lastWorkflowId.
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
     * Gets the changeEnumerationStatus property: Cloud endpoint change enumeration status.
     *
     * @return the changeEnumerationStatus value.
     */
    CloudEndpointChangeEnumerationStatus changeEnumerationStatus();

    /**
     * Gets the inner com.azure.resourcemanager.storagesync.fluent.models.CloudEndpointInner object.
     *
     * @return the inner object.
     */
    CloudEndpointInner innerModel();

    /** The entirety of the CloudEndpoint definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The CloudEndpoint definition stages. */
    interface DefinitionStages {
        /** The first stage of the CloudEndpoint definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the CloudEndpoint definition allowing to specify parent resource. */
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
         * The stage of the CloudEndpoint definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithStorageAccountResourceId,
                DefinitionStages.WithAzureFileShareName,
                DefinitionStages.WithStorageAccountTenantId,
                DefinitionStages.WithFriendlyName {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CloudEndpoint create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CloudEndpoint create(Context context);
        }
        /** The stage of the CloudEndpoint definition allowing to specify storageAccountResourceId. */
        interface WithStorageAccountResourceId {
            /**
             * Specifies the storageAccountResourceId property: Storage Account Resource Id.
             *
             * @param storageAccountResourceId Storage Account Resource Id.
             * @return the next definition stage.
             */
            WithCreate withStorageAccountResourceId(String storageAccountResourceId);
        }
        /** The stage of the CloudEndpoint definition allowing to specify azureFileShareName. */
        interface WithAzureFileShareName {
            /**
             * Specifies the azureFileShareName property: Azure file share name.
             *
             * @param azureFileShareName Azure file share name.
             * @return the next definition stage.
             */
            WithCreate withAzureFileShareName(String azureFileShareName);
        }
        /** The stage of the CloudEndpoint definition allowing to specify storageAccountTenantId. */
        interface WithStorageAccountTenantId {
            /**
             * Specifies the storageAccountTenantId property: Storage Account Tenant Id.
             *
             * @param storageAccountTenantId Storage Account Tenant Id.
             * @return the next definition stage.
             */
            WithCreate withStorageAccountTenantId(String storageAccountTenantId);
        }
        /** The stage of the CloudEndpoint definition allowing to specify friendlyName. */
        interface WithFriendlyName {
            /**
             * Specifies the friendlyName property: Friendly Name.
             *
             * @param friendlyName Friendly Name.
             * @return the next definition stage.
             */
            WithCreate withFriendlyName(String friendlyName);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CloudEndpoint refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CloudEndpoint refresh(Context context);

    /**
     * Pre Backup a given CloudEndpoint.
     *
     * @param parameters Body of Backup request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void preBackup(BackupRequest parameters);

    /**
     * Pre Backup a given CloudEndpoint.
     *
     * @param parameters Body of Backup request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void preBackup(BackupRequest parameters, Context context);

    /**
     * Post Backup a given CloudEndpoint.
     *
     * @param parameters Body of Backup request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return post Backup Response.
     */
    PostBackupResponse postBackup(BackupRequest parameters);

    /**
     * Post Backup a given CloudEndpoint.
     *
     * @param parameters Body of Backup request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return post Backup Response.
     */
    PostBackupResponse postBackup(BackupRequest parameters, Context context);

    /**
     * Pre Restore a given CloudEndpoint.
     *
     * @param parameters Body of Cloud Endpoint object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void preRestore(PreRestoreRequest parameters);

    /**
     * Pre Restore a given CloudEndpoint.
     *
     * @param parameters Body of Cloud Endpoint object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void preRestore(PreRestoreRequest parameters, Context context);

    /**
     * Restore Heartbeat a given CloudEndpoint.
     *
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restoreheartbeat();

    /**
     * Restore Heartbeat a given CloudEndpoint.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    CloudEndpointsRestoreheartbeatResponse restoreheartbeatWithResponse(Context context);

    /**
     * Post Restore a given CloudEndpoint.
     *
     * @param parameters Body of Cloud Endpoint object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void postRestore(PostRestoreRequest parameters);

    /**
     * Post Restore a given CloudEndpoint.
     *
     * @param parameters Body of Cloud Endpoint object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void postRestore(PostRestoreRequest parameters, Context context);

    /**
     * Triggers detection of changes performed on Azure File share connected to the specified Azure File Sync Cloud
     * Endpoint.
     *
     * @param parameters Trigger Change Detection Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerChangeDetection(TriggerChangeDetectionParameters parameters);

    /**
     * Triggers detection of changes performed on Azure File share connected to the specified Azure File Sync Cloud
     * Endpoint.
     *
     * @param parameters Trigger Change Detection Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerChangeDetection(TriggerChangeDetectionParameters parameters, Context context);
}
