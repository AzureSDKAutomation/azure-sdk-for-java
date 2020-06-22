/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.TableInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.StorageManager;

/**
 * Type representing Table.
 */
public interface Table extends HasInner<TableInner>, Indexable, Updatable<Table.Update>, HasManager<StorageManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the tableName value.
     */
    String tableName();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Table definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithTableService, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Table definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Table definition.
         */
        interface Blank extends WithTableService {
        }

        /**
         * The stage of the table definition allowing to specify TableService.
         */
        interface WithTableService {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive
            * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only
            * @return the next definition stage
            */
            WithCreate withExistingTableService(String resourceGroupName, String accountName);
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
