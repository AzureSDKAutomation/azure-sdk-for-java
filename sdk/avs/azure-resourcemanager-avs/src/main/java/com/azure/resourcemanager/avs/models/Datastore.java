// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.DatastoreInner;

/** An immutable client-side representation of Datastore. */
public interface Datastore {
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
     * Gets the provisioningState property: The state of the datastore provisioning.
     *
     * @return the provisioningState value.
     */
    DatastoreProvisioningState provisioningState();

    /**
     * Gets the netAppVolume property: An Azure NetApp Files volume.
     *
     * @return the netAppVolume value.
     */
    NetAppVolume netAppVolume();

    /**
     * Gets the diskPoolVolume property: An iSCSI volume.
     *
     * @return the diskPoolVolume value.
     */
    DiskPoolVolume diskPoolVolume();

    /**
     * Gets the inner com.azure.resourcemanager.avs.fluent.models.DatastoreInner object.
     *
     * @return the inner object.
     */
    DatastoreInner innerModel();

    /** The entirety of the Datastore definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Datastore definition stages. */
    interface DefinitionStages {
        /** The first stage of the Datastore definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Datastore definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, privateCloudName, clusterName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param privateCloudName Name of the private cloud.
             * @param clusterName Name of the cluster in the private cloud.
             * @return the next definition stage.
             */
            WithCreate withExistingCluster(String resourceGroupName, String privateCloudName, String clusterName);
        }
        /**
         * The stage of the Datastore definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithNetAppVolume, DefinitionStages.WithDiskPoolVolume {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Datastore create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Datastore create(Context context);
        }
        /** The stage of the Datastore definition allowing to specify netAppVolume. */
        interface WithNetAppVolume {
            /**
             * Specifies the netAppVolume property: An Azure NetApp Files volume.
             *
             * @param netAppVolume An Azure NetApp Files volume.
             * @return the next definition stage.
             */
            WithCreate withNetAppVolume(NetAppVolume netAppVolume);
        }
        /** The stage of the Datastore definition allowing to specify diskPoolVolume. */
        interface WithDiskPoolVolume {
            /**
             * Specifies the diskPoolVolume property: An iSCSI volume.
             *
             * @param diskPoolVolume An iSCSI volume.
             * @return the next definition stage.
             */
            WithCreate withDiskPoolVolume(DiskPoolVolume diskPoolVolume);
        }
    }
    /**
     * Begins update for the Datastore resource.
     *
     * @return the stage of resource update.
     */
    Datastore.Update update();

    /** The template for Datastore update. */
    interface Update extends UpdateStages.WithNetAppVolume, UpdateStages.WithDiskPoolVolume {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Datastore apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Datastore apply(Context context);
    }
    /** The Datastore update stages. */
    interface UpdateStages {
        /** The stage of the Datastore update allowing to specify netAppVolume. */
        interface WithNetAppVolume {
            /**
             * Specifies the netAppVolume property: An Azure NetApp Files volume.
             *
             * @param netAppVolume An Azure NetApp Files volume.
             * @return the next definition stage.
             */
            Update withNetAppVolume(NetAppVolume netAppVolume);
        }
        /** The stage of the Datastore update allowing to specify diskPoolVolume. */
        interface WithDiskPoolVolume {
            /**
             * Specifies the diskPoolVolume property: An iSCSI volume.
             *
             * @param diskPoolVolume An iSCSI volume.
             * @return the next definition stage.
             */
            Update withDiskPoolVolume(DiskPoolVolume diskPoolVolume);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Datastore refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Datastore refresh(Context context);
}
