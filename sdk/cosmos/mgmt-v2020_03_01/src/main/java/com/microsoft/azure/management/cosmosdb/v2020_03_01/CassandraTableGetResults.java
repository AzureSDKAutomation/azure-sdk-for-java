/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation.CassandraTableGetResultsInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation.CosmosDBManager;
import java.util.Map;

/**
 * Type representing CassandraTableGetResults.
 */
public interface CassandraTableGetResults extends HasInner<CassandraTableGetResultsInner>, Indexable, Refreshable<CassandraTableGetResults>, Updatable<CassandraTableGetResults.Update>, HasManager<CosmosDBManager> {
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
     * @return the options value.
     */
    CassandraTableGetPropertiesOptions options();

    /**
     * @return the resource value.
     */
    CassandraTableGetPropertiesResource resource();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the CassandraTableGetResults definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCassandraKeyspace, DefinitionStages.WithLocation, DefinitionStages.WithOptions, DefinitionStages.WithResource, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of CassandraTableGetResults definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a CassandraTableGetResults definition.
         */
        interface Blank extends WithCassandraKeyspace {
        }

        /**
         * The stage of the cassandratablegetresults definition allowing to specify CassandraKeyspace.
         */
        interface WithCassandraKeyspace {
           /**
            * Specifies resourceGroupName, accountName, keyspaceName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param accountName Cosmos DB database account name
            * @param keyspaceName Cosmos DB keyspace name
            * @return the next definition stage
            */
            WithLocation withExistingCassandraKeyspace(String resourceGroupName, String accountName, String keyspaceName);
        }

        /**
         * The stage of the cassandratablegetresults definition allowing to specify Location.
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
         * The stage of the cassandratablegetresults definition allowing to specify Options.
         */
        interface WithOptions {
           /**
            * Specifies options.
            * @param options A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request
            * @return the next definition stage
            */
            WithResource withOptions(CreateUpdateOptions options);
        }

        /**
         * The stage of the cassandratablegetresults definition allowing to specify Resource.
         */
        interface WithResource {
           /**
            * Specifies resource.
            * @param resource The standard JSON format of a Cassandra table
            * @return the next definition stage
            */
            WithCreate withResource(CassandraTableResource resource);
        }

        /**
         * The stage of the cassandratablegetresults definition allowing to specify Tags.
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
        interface WithCreate extends Creatable<CassandraTableGetResults>, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a CassandraTableGetResults update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<CassandraTableGetResults>, UpdateStages.WithTags {
    }

    /**
     * Grouping of CassandraTableGetResults update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the cassandratablegetresults update allowing to specify Tags.
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
