/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.ReplicationProtectionContainerMappingsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationProtectionContainerMappings.
 */
public interface ReplicationProtectionContainerMappings extends SupportsCreating<ProtectionContainerMapping.DefinitionStages.Blank>, HasInner<ReplicationProtectionContainerMappingsInner> {
    /**
     * Remove protection container mapping.
     * The operation to delete or remove a protection container mapping.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String fabricName, String protectionContainerName, String mappingName);

    /**
     * Gets the list of all protection container mappings in a vault.
     * Lists the protection container mappings in the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProtectionContainerMapping> listAsync();

    /**
     * Gets a protection container mapping/.
     * Gets the details of a protection container mapping.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection Container mapping name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProtectionContainerMapping> getAsync(String fabricName, String protectionContainerName, String mappingName);

    /**
     * Gets the list of protection container mappings for a protection container.
     * Lists the protection container mappings for a protection container.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProtectionContainerMapping> listByReplicationProtectionContainersAsync(final String fabricName, final String protectionContainerName);

    /**
     * Purge protection container mapping.
     * The operation to purge(force delete) a protection container mapping.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param mappingName Protection container mapping name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable purgeAsync(String fabricName, String protectionContainerName, String mappingName);

}
