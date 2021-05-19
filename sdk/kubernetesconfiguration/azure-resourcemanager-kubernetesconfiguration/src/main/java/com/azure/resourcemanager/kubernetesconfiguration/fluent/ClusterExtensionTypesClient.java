// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.ExtensionTypeInner;
import com.azure.resourcemanager.kubernetesconfiguration.models.ClusterExtensionTypeClusterType;
import com.azure.resourcemanager.kubernetesconfiguration.models.ExtensionsClusterRp;

/** An instance of this class provides access to all the operations defined in ClusterExtensionTypesClient. */
public interface ClusterExtensionTypesClient {
    /**
     * Get Extension Type details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or
     *     Microsoft.Kubernetes (for OnPrem K8S clusters).
     * @param clusterType The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or
     *     connectedClusters (for OnPrem K8S clusters).
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionTypeName Extension type name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extension Type details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExtensionTypeInner get(
        String resourceGroupName,
        ExtensionsClusterRp clusterRp,
        ClusterExtensionTypeClusterType clusterType,
        String clusterName,
        String extensionTypeName);

    /**
     * Get Extension Type details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or
     *     Microsoft.Kubernetes (for OnPrem K8S clusters).
     * @param clusterType The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or
     *     connectedClusters (for OnPrem K8S clusters).
     * @param clusterName The name of the kubernetes cluster.
     * @param extensionTypeName Extension type name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extension Type details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExtensionTypeInner> getWithResponse(
        String resourceGroupName,
        ExtensionsClusterRp clusterRp,
        ClusterExtensionTypeClusterType clusterType,
        String clusterName,
        String extensionTypeName,
        Context context);
}
