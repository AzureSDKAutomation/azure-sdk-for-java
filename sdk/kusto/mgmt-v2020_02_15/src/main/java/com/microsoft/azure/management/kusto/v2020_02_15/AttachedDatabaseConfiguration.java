/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_02_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.kusto.v2020_02_15.implementation.AttachedDatabaseConfigurationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2020_02_15.implementation.KustoManager;
import java.util.List;

/**
 * Type representing AttachedDatabaseConfiguration.
 */
public interface AttachedDatabaseConfiguration extends HasInner<AttachedDatabaseConfigurationInner>, Indexable, Refreshable<AttachedDatabaseConfiguration>, Updatable<AttachedDatabaseConfiguration.Update>, HasManager<KustoManager> {
    /**
     * @return the attachedDatabaseNames value.
     */
    List<String> attachedDatabaseNames();

    /**
     * @return the clusterResourceId value.
     */
    String clusterResourceId();

    /**
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * @return the defaultPrincipalsModificationKind value.
     */
    DefaultPrincipalsModificationKind defaultPrincipalsModificationKind();

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
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the AttachedDatabaseConfiguration definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCluster, DefinitionStages.WithClusterResourceId, DefinitionStages.WithDatabaseName, DefinitionStages.WithDefaultPrincipalsModificationKind, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AttachedDatabaseConfiguration definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AttachedDatabaseConfiguration definition.
         */
        interface Blank extends WithCluster {
        }

        /**
         * The stage of the attacheddatabaseconfiguration definition allowing to specify Cluster.
         */
        interface WithCluster {
           /**
            * Specifies resourceGroupName, clusterName.
            * @param resourceGroupName The name of the resource group containing the Kusto cluster
            * @param clusterName The name of the Kusto cluster
            * @return the next definition stage
            */
            WithClusterResourceId withExistingCluster(String resourceGroupName, String clusterName);
        }

        /**
         * The stage of the attacheddatabaseconfiguration definition allowing to specify ClusterResourceId.
         */
        interface WithClusterResourceId {
           /**
            * Specifies clusterResourceId.
            * @param clusterResourceId The resource id of the cluster where the databases you would like to attach reside
            * @return the next definition stage
            */
            WithDatabaseName withClusterResourceId(String clusterResourceId);
        }

        /**
         * The stage of the attacheddatabaseconfiguration definition allowing to specify DatabaseName.
         */
        interface WithDatabaseName {
           /**
            * Specifies databaseName.
            * @param databaseName The name of the database which you would like to attach, use * if you want to follow all current and future databases
            * @return the next definition stage
            */
            WithDefaultPrincipalsModificationKind withDatabaseName(String databaseName);
        }

        /**
         * The stage of the attacheddatabaseconfiguration definition allowing to specify DefaultPrincipalsModificationKind.
         */
        interface WithDefaultPrincipalsModificationKind {
           /**
            * Specifies defaultPrincipalsModificationKind.
            * @param defaultPrincipalsModificationKind The default principals modification kind. Possible values include: 'Union', 'Replace', 'None'
            * @return the next definition stage
            */
            WithCreate withDefaultPrincipalsModificationKind(DefaultPrincipalsModificationKind defaultPrincipalsModificationKind);
        }

        /**
         * The stage of the attacheddatabaseconfiguration definition allowing to specify Location.
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
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AttachedDatabaseConfiguration>, DefinitionStages.WithLocation {
        }
    }
    /**
     * The template for a AttachedDatabaseConfiguration update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AttachedDatabaseConfiguration>, UpdateStages.WithLocation {
    }

    /**
     * Grouping of AttachedDatabaseConfiguration update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the attacheddatabaseconfiguration update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Resource location
             * @return the next update stage
             */
            Update withLocation(String location);
        }

    }
}
