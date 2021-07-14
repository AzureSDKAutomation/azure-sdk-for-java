// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationProtectedItemInner;

/** An immutable client-side representation of ReplicationProtectedItem. */
public interface ReplicationProtectedItem {
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
     * Gets the properties property: The custom data.
     *
     * @return the properties value.
     */
    ReplicationProtectedItemProperties properties();

    /**
     * Gets the location property: Resource Location.
     *
     * @return the location value.
     */
    String location();

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
     * Gets the inner com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationProtectedItemInner
     * object.
     *
     * @return the inner object.
     */
    ReplicationProtectedItemInner innerModel();

    /** The entirety of the ReplicationProtectedItem definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ReplicationProtectedItem definition stages. */
    interface DefinitionStages {
        /** The first stage of the ReplicationProtectedItem definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ReplicationProtectedItem definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceName, resourceGroupName, fabricName, protectionContainerName.
             *
             * @param resourceName The name of the recovery services vault.
             * @param resourceGroupName The name of the resource group where the recovery services vault is present.
             * @param fabricName Name of the fabric.
             * @param protectionContainerName Protection container name.
             * @return the next definition stage.
             */
            WithCreate withExistingReplicationProtectionContainer(
                String resourceName, String resourceGroupName, String fabricName, String protectionContainerName);
        }
        /**
         * The stage of the ReplicationProtectedItem definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ReplicationProtectedItem create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ReplicationProtectedItem create(Context context);
        }
        /** The stage of the ReplicationProtectedItem definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Enable protection input properties..
             *
             * @param properties Enable protection input properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(EnableProtectionInputProperties properties);
        }
    }
    /**
     * Begins update for the ReplicationProtectedItem resource.
     *
     * @return the stage of resource update.
     */
    ReplicationProtectedItem.Update update();

    /** The template for ReplicationProtectedItem update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ReplicationProtectedItem apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ReplicationProtectedItem apply(Context context);
    }
    /** The ReplicationProtectedItem update stages. */
    interface UpdateStages {
        /** The stage of the ReplicationProtectedItem update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Update replication protected item properties..
             *
             * @param properties Update replication protected item properties.
             * @return the next definition stage.
             */
            Update withProperties(UpdateReplicationProtectedItemInputProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ReplicationProtectedItem refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ReplicationProtectedItem refresh(Context context);

    /**
     * Operation to add disks(s) to the replication protected item.
     *
     * @param addDisksInput Add disks input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem addDisks(AddDisksInput addDisksInput);

    /**
     * Operation to add disks(s) to the replication protected item.
     *
     * @param addDisksInput Add disks input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem addDisks(AddDisksInput addDisksInput, Context context);

    /**
     * The operation to change the recovery point of a failed over replication protected item.
     *
     * @param applyRecoveryPointInput The ApplyRecoveryPointInput.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem applyRecoveryPoint(ApplyRecoveryPointInput applyRecoveryPointInput);

    /**
     * The operation to change the recovery point of a failed over replication protected item.
     *
     * @param applyRecoveryPointInput The ApplyRecoveryPointInput.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem applyRecoveryPoint(ApplyRecoveryPointInput applyRecoveryPointInput, Context context);

    /**
     * Operation to cancel the failover of the replication protected item.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem failoverCancel();

    /**
     * Operation to cancel the failover of the replication protected item.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem failoverCancel(Context context);

    /**
     * Operation to commit the failover of the replication protected item.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem failoverCommit();

    /**
     * Operation to commit the failover of the replication protected item.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem failoverCommit(Context context);

    /**
     * Operation to initiate a planned failover of the replication protected item.
     *
     * @param failoverInput Planned failover input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem plannedFailover(PlannedFailoverInput failoverInput);

    /**
     * Operation to initiate a planned failover of the replication protected item.
     *
     * @param failoverInput Planned failover input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem plannedFailover(PlannedFailoverInput failoverInput, Context context);

    /**
     * The operation to disable replication on a replication protected item. This will also remove the item.
     *
     * @param disableProtectionInput Disable protection input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(DisableProtectionInput disableProtectionInput);

    /**
     * The operation to disable replication on a replication protected item. This will also remove the item.
     *
     * @param disableProtectionInput Disable protection input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(DisableProtectionInput disableProtectionInput, Context context);

    /**
     * Operation to remove disk(s) from the replication protected item.
     *
     * @param removeDisksInput Remove disks input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem removeDisks(RemoveDisksInput removeDisksInput);

    /**
     * Operation to remove disk(s) from the replication protected item.
     *
     * @param removeDisksInput Remove disks input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem removeDisks(RemoveDisksInput removeDisksInput, Context context);

    /**
     * The operation to start resynchronize/repair replication for a replication protected item requiring
     * resynchronization.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem repairReplication();

    /**
     * The operation to start resynchronize/repair replication for a replication protected item requiring
     * resynchronization.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem repairReplication(Context context);

    /**
     * Operation to reprotect or reverse replicate a failed over replication protected item.
     *
     * @param reprotectInput Reverse replication input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem reprotect(ReverseReplicationInput reprotectInput);

    /**
     * Operation to reprotect or reverse replicate a failed over replication protected item.
     *
     * @param reprotectInput Reverse replication input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem reprotect(ReverseReplicationInput reprotectInput, Context context);

    /**
     * Operation to resolve health issues of the replication protected item.
     *
     * @param resolveHealthInput Health issue input object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem resolveHealthErrors(ResolveHealthInput resolveHealthInput);

    /**
     * Operation to resolve health issues of the replication protected item.
     *
     * @param resolveHealthInput Health issue input object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem resolveHealthErrors(ResolveHealthInput resolveHealthInput, Context context);

    /**
     * Operation to perform a test failover of the replication protected item.
     *
     * @param testfailoverInput Test failover input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem testFailover(TestFailoverInput testfailoverInput);

    /**
     * Operation to perform a test failover of the replication protected item.
     *
     * @param testfailoverInput Test failover input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem testFailover(TestFailoverInput testfailoverInput, Context context);

    /**
     * Operation to clean up the test failover of a replication protected item.
     *
     * @param cleanupInput Test failover cleanup input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem testFailoverCleanup(TestFailoverCleanupInput cleanupInput);

    /**
     * Operation to clean up the test failover of a replication protected item.
     *
     * @param cleanupInput Test failover cleanup input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem testFailoverCleanup(TestFailoverCleanupInput cleanupInput, Context context);

    /**
     * Operation to initiate a failover of the replication protected item.
     *
     * @param failoverInput Failover input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem unplannedFailover(UnplannedFailoverInput failoverInput);

    /**
     * Operation to initiate a failover of the replication protected item.
     *
     * @param failoverInput Failover input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem unplannedFailover(UnplannedFailoverInput failoverInput, Context context);

    /**
     * The operation to update appliance of an ASR replication protected item.
     *
     * @param applianceUpdateInput Appliance update protection input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem updateAppliance(UpdateApplianceForReplicationProtectedItemInput applianceUpdateInput);

    /**
     * The operation to update appliance of an ASR replication protected item.
     *
     * @param applianceUpdateInput Appliance update protection input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return replication protected item.
     */
    ReplicationProtectedItem updateAppliance(
        UpdateApplianceForReplicationProtectedItemInput applianceUpdateInput, Context context);
}
