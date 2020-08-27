/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2020_08_01.implementation.CosmosDBManager;
import com.microsoft.azure.management.cosmosdb.v2020_08_01.implementation.NotebookWorkspaceConnectionInfoResultInner;

/**
 * Type representing NotebookWorkspaceConnectionInfoResult.
 */
public interface NotebookWorkspaceConnectionInfoResult extends HasInner<NotebookWorkspaceConnectionInfoResultInner>, HasManager<CosmosDBManager> {
    /**
     * @return the authToken value.
     */
    String authToken();

    /**
     * @return the notebookServerEndpoint value.
     */
    String notebookServerEndpoint();

}
