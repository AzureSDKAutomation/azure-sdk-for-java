/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.TableInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.CosmosDBManager;
import java.util.Map;

/**
 * Type representing Table.
 */
public interface Table extends HasInner<TableInner>, Indexable, Updatable<Table.Update>, HasManager<CosmosDBManager> {
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
     * @return the tableId value.
     */
    String tableId();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Table definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithApi, DefinitionStages.WithOptions, DefinitionStages.WithResource, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Table definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Table definition.
         */
        interface Blank extends WithApi {
        }

        /**
         * The stage of the table definition allowing to specify Api.
         */
        interface WithApi {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName Name of an Azure resource group
            * @param accountName Cosmos DB database account name
            * @return the next definition stage
            */
            WithOptions withExistingApi(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the table definition allowing to specify Options.
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
         * The stage of the table definition allowing to specify Resource.
         */
        interface WithResource {
           /**
            * Specifies resource.
            * @param resource The standard JSON format of a Table
            * @return the next definition stage
            */
            WithCreate withResource(TableResource resource);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Table> {
        }
    }
    /**
     * The template for a Table update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Table> {
    }

    /**
     * Grouping of Table update stages.
     */
    interface UpdateStages {
    }
}
