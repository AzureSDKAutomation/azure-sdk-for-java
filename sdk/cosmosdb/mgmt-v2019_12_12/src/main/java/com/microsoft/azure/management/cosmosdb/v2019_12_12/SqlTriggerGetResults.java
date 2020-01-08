/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.implementation.SqlTriggerGetResultsInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.implementation.CosmosDBManager;
import java.util.Map;

/**
 * Type representing SqlTriggerGetResults.
 */
public interface SqlTriggerGetResults extends HasInner<SqlTriggerGetResultsInner>, Indexable, Refreshable<SqlTriggerGetResults>, Updatable<SqlTriggerGetResults.Update>, HasManager<CosmosDBManager> {
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
     * @return the resource value.
     */
    SqlTriggerGetPropertiesResource resource();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the SqlTriggerGetResults definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithContainer, DefinitionStages.WithLocation, DefinitionStages.WithOptions, DefinitionStages.WithResource, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SqlTriggerGetResults definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SqlTriggerGetResults definition.
         */
        interface Blank extends WithContainer {
        }

        /**
         * The stage of the sqltriggergetresults definition allowing to specify Container.
         */
        interface WithContainer {
           /**
            * Specifies resourceGroupName, accountName, databaseName, containerName.
            * @param resourceGroupName Name of an Azure resource group
            * @param accountName Cosmos DB database account name
            * @param databaseName Cosmos DB database name
            * @param containerName Cosmos DB container name
            * @return the next definition stage
            */
            WithLocation withExistingContainer(String resourceGroupName, String accountName, String databaseName, String containerName);
        }

        /**
         * The stage of the sqltriggergetresults definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location the location parameter value
            * @return the next definition stage
            */
            WithOptions withLocation(String location);
        }

        /**
         * The stage of the sqltriggergetresults definition allowing to specify Options.
         */
        interface WithOptions {
           /**
            * Specifies options.
            * @param options A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request
            * @return the next definition stage
            */
            WithResource withOptions(Map<String, String> options);
        }

        /**
         * The stage of the sqltriggergetresults definition allowing to specify Resource.
         */
        interface WithResource {
           /**
            * Specifies resource.
            * @param resource The standard JSON format of a trigger
            * @return the next definition stage
            */
            WithCreate withResource(SqlTriggerResource resource);
        }

        /**
         * The stage of the sqltriggergetresults definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags the tags parameter value
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SqlTriggerGetResults>, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a SqlTriggerGetResults update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SqlTriggerGetResults>, UpdateStages.WithTags {
    }

    /**
     * Grouping of SqlTriggerGetResults update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sqltriggergetresults update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags the tags parameter value
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
