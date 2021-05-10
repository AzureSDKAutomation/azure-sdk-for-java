// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storagesync.fluent.models.RegisteredServerInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of RegisteredServer. */
public interface RegisteredServer {
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
     * Gets the serverCertificate property: Registered Server Certificate.
     *
     * @return the serverCertificate value.
     */
    String serverCertificate();

    /**
     * Gets the agentVersion property: Registered Server Agent Version.
     *
     * @return the agentVersion value.
     */
    String agentVersion();

    /**
     * Gets the agentVersionStatus property: Registered Server Agent Version Status.
     *
     * @return the agentVersionStatus value.
     */
    RegisteredServerAgentVersionStatus agentVersionStatus();

    /**
     * Gets the agentVersionExpirationDate property: Registered Server Agent Version Expiration Date.
     *
     * @return the agentVersionExpirationDate value.
     */
    OffsetDateTime agentVersionExpirationDate();

    /**
     * Gets the serverOSVersion property: Registered Server OS Version.
     *
     * @return the serverOSVersion value.
     */
    String serverOSVersion();

    /**
     * Gets the serverManagementErrorCode property: Registered Server Management Error Code.
     *
     * @return the serverManagementErrorCode value.
     */
    Integer serverManagementErrorCode();

    /**
     * Gets the lastHeartBeat property: Registered Server last heart beat.
     *
     * @return the lastHeartBeat value.
     */
    String lastHeartBeat();

    /**
     * Gets the provisioningState property: Registered Server Provisioning State.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the serverRole property: Registered Server serverRole.
     *
     * @return the serverRole value.
     */
    String serverRole();

    /**
     * Gets the clusterId property: Registered Server clusterId.
     *
     * @return the clusterId value.
     */
    String clusterId();

    /**
     * Gets the clusterName property: Registered Server clusterName.
     *
     * @return the clusterName value.
     */
    String clusterName();

    /**
     * Gets the serverId property: Registered Server serverId.
     *
     * @return the serverId value.
     */
    String serverId();

    /**
     * Gets the storageSyncServiceUid property: Registered Server storageSyncServiceUid.
     *
     * @return the storageSyncServiceUid value.
     */
    String storageSyncServiceUid();

    /**
     * Gets the lastWorkflowId property: Registered Server lastWorkflowId.
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
     * Gets the discoveryEndpointUri property: Resource discoveryEndpointUri.
     *
     * @return the discoveryEndpointUri value.
     */
    String discoveryEndpointUri();

    /**
     * Gets the resourceLocation property: Resource Location.
     *
     * @return the resourceLocation value.
     */
    String resourceLocation();

    /**
     * Gets the serviceLocation property: Service Location.
     *
     * @return the serviceLocation value.
     */
    String serviceLocation();

    /**
     * Gets the friendlyName property: Friendly Name.
     *
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * Gets the managementEndpointUri property: Management Endpoint Uri.
     *
     * @return the managementEndpointUri value.
     */
    String managementEndpointUri();

    /**
     * Gets the monitoringEndpointUri property: Telemetry Endpoint Uri.
     *
     * @return the monitoringEndpointUri value.
     */
    String monitoringEndpointUri();

    /**
     * Gets the monitoringConfiguration property: Monitoring Configuration.
     *
     * @return the monitoringConfiguration value.
     */
    String monitoringConfiguration();

    /**
     * Gets the serverName property: Server name.
     *
     * @return the serverName value.
     */
    String serverName();

    /**
     * Gets the inner com.azure.resourcemanager.storagesync.fluent.models.RegisteredServerInner object.
     *
     * @return the inner object.
     */
    RegisteredServerInner innerModel();

    /** The entirety of the RegisteredServer definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The RegisteredServer definition stages. */
    interface DefinitionStages {
        /** The first stage of the RegisteredServer definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the RegisteredServer definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, storageSyncServiceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param storageSyncServiceName Name of Storage Sync Service resource.
             * @return the next definition stage.
             */
            WithCreate withExistingStorageSyncService(String resourceGroupName, String storageSyncServiceName);
        }
        /**
         * The stage of the RegisteredServer definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithServerCertificate,
                DefinitionStages.WithAgentVersion,
                DefinitionStages.WithServerOSVersion,
                DefinitionStages.WithLastHeartBeat,
                DefinitionStages.WithServerRole,
                DefinitionStages.WithClusterId,
                DefinitionStages.WithClusterName,
                DefinitionStages.WithServerId,
                DefinitionStages.WithFriendlyName {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            RegisteredServer create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RegisteredServer create(Context context);
        }
        /** The stage of the RegisteredServer definition allowing to specify serverCertificate. */
        interface WithServerCertificate {
            /**
             * Specifies the serverCertificate property: Registered Server Certificate.
             *
             * @param serverCertificate Registered Server Certificate.
             * @return the next definition stage.
             */
            WithCreate withServerCertificate(String serverCertificate);
        }
        /** The stage of the RegisteredServer definition allowing to specify agentVersion. */
        interface WithAgentVersion {
            /**
             * Specifies the agentVersion property: Registered Server Agent Version.
             *
             * @param agentVersion Registered Server Agent Version.
             * @return the next definition stage.
             */
            WithCreate withAgentVersion(String agentVersion);
        }
        /** The stage of the RegisteredServer definition allowing to specify serverOSVersion. */
        interface WithServerOSVersion {
            /**
             * Specifies the serverOSVersion property: Registered Server OS Version.
             *
             * @param serverOSVersion Registered Server OS Version.
             * @return the next definition stage.
             */
            WithCreate withServerOSVersion(String serverOSVersion);
        }
        /** The stage of the RegisteredServer definition allowing to specify lastHeartBeat. */
        interface WithLastHeartBeat {
            /**
             * Specifies the lastHeartBeat property: Registered Server last heart beat.
             *
             * @param lastHeartBeat Registered Server last heart beat.
             * @return the next definition stage.
             */
            WithCreate withLastHeartBeat(String lastHeartBeat);
        }
        /** The stage of the RegisteredServer definition allowing to specify serverRole. */
        interface WithServerRole {
            /**
             * Specifies the serverRole property: Registered Server serverRole.
             *
             * @param serverRole Registered Server serverRole.
             * @return the next definition stage.
             */
            WithCreate withServerRole(String serverRole);
        }
        /** The stage of the RegisteredServer definition allowing to specify clusterId. */
        interface WithClusterId {
            /**
             * Specifies the clusterId property: Registered Server clusterId.
             *
             * @param clusterId Registered Server clusterId.
             * @return the next definition stage.
             */
            WithCreate withClusterId(String clusterId);
        }
        /** The stage of the RegisteredServer definition allowing to specify clusterName. */
        interface WithClusterName {
            /**
             * Specifies the clusterName property: Registered Server clusterName.
             *
             * @param clusterName Registered Server clusterName.
             * @return the next definition stage.
             */
            WithCreate withClusterName(String clusterName);
        }
        /** The stage of the RegisteredServer definition allowing to specify serverId. */
        interface WithServerId {
            /**
             * Specifies the serverId property: Registered Server serverId.
             *
             * @param serverId Registered Server serverId.
             * @return the next definition stage.
             */
            WithCreate withServerId(String serverId);
        }
        /** The stage of the RegisteredServer definition allowing to specify friendlyName. */
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
    RegisteredServer refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RegisteredServer refresh(Context context);

    /**
     * Triggers Server certificate rollover.
     *
     * @param parameters Body of Trigger Rollover request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerRollover(TriggerRolloverRequest parameters);

    /**
     * Triggers Server certificate rollover.
     *
     * @param parameters Body of Trigger Rollover request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerRollover(TriggerRolloverRequest parameters, Context context);
}
