/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.ConfigurationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Configurations.
 */
public interface Configurations extends SupportsCreating<Configuration.DefinitionStages.Blank>, HasInner<ConfigurationsInner> {
    /**
     * Gets information about a configuration of server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param configurationName The name of the server configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Configuration> getAsync(String resourceGroupName, String serverName, String configurationName);

    /**
     * List all the configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Configuration> listByServerAsync(String resourceGroupName, String serverName);

}
