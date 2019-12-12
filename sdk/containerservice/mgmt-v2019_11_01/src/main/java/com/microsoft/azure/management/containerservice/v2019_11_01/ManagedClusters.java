/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_11_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.containerservice.v2019_11_01.implementation.ManagedClustersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ManagedClusters.
 */
public interface ManagedClusters extends SupportsCreating<ManagedCluster.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<ManagedCluster>, SupportsListingByResourceGroup<ManagedCluster>, SupportsListing<ManagedCluster>, HasInner<ManagedClustersInner> {
    /**
     * Gets cluster admin credential of a managed cluster.
     * Gets cluster admin credential of the managed cluster with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CredentialResults> listClusterAdminCredentialsAsync(String resourceGroupName, String resourceName);

    /**
     * Gets cluster user credential of a managed cluster.
     * Gets cluster user credential of the managed cluster with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CredentialResults> listClusterUserCredentialsAsync(String resourceGroupName, String resourceName);

    /**
     * Reset Service Principal Profile of a managed cluster.
     * Update the service principal Profile for a managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param parameters Parameters supplied to the Reset Service Principal Profile operation for a Managed Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resetServicePrincipalProfileAsync(String resourceGroupName, String resourceName, ManagedClusterServicePrincipalProfile parameters);

    /**
     * Reset AAD Profile of a managed cluster.
     * Update the AAD Profile for a managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param parameters Parameters supplied to the Reset AAD Profile operation for a Managed Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resetAADProfileAsync(String resourceGroupName, String resourceName, ManagedClusterAADProfile parameters);

    /**
     * Rotate certificates of a managed cluster.
     * Rotate certificates of a managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable rotateClusterCertificatesAsync(String resourceGroupName, String resourceName);

    /**
     * Gets upgrade profile for a managed cluster.
     * Gets the details of the upgrade profile for a managed cluster with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagedClusterUpgradeProfile> getUpgradeProfileAsync(String resourceGroupName, String resourceName);

    /**
     * Gets an access profile of a managed cluster.
     * Gets the accessProfile for the specified role name of the managed cluster with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param roleName The name of the role for managed cluster accessProfile resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagedClusterAccessProfile> getAccessProfileAsync(String resourceGroupName, String resourceName, String roleName);

}
