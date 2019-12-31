/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_11_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.containerservice.v2019_11_01.OpenShiftManagedClusters;
import com.microsoft.azure.management.containerservice.v2019_11_01.ContainerServices;
import com.microsoft.azure.management.containerservice.v2019_11_01.Operations;
import com.microsoft.azure.management.containerservice.v2019_11_01.ManagedClusters;
import com.microsoft.azure.management.containerservice.v2019_11_01.AgentPools;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure ContainerService resource management.
 */
public final class ContainerServiceManager extends ManagerCore<ContainerServiceManager, ContainerServiceManagementClientImpl> {
    private OpenShiftManagedClusters openShiftManagedClusters;
    private ContainerServices containerServices;
    private Operations operations;
    private ManagedClusters managedClusters;
    private AgentPools agentPools;
    /**
    * Get a Configurable instance that can be used to create ContainerServiceManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new ContainerServiceManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of ContainerServiceManager that exposes ContainerService resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the ContainerServiceManager
    */
    public static ContainerServiceManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new ContainerServiceManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of ContainerServiceManager that exposes ContainerService resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the ContainerServiceManager
    */
    public static ContainerServiceManager authenticate(RestClient restClient, String subscriptionId) {
        return new ContainerServiceManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of ContainerServiceManager that exposes ContainerService management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing ContainerService management API entry points that work across subscriptions
        */
        ContainerServiceManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage OpenShiftManagedClusters.
     */
    public OpenShiftManagedClusters openShiftManagedClusters() {
        if (this.openShiftManagedClusters == null) {
            this.openShiftManagedClusters = new OpenShiftManagedClustersImpl(this);
        }
        return this.openShiftManagedClusters;
    }

    /**
     * @return Entry point to manage ContainerServices.
     */
    public ContainerServices containerServices() {
        if (this.containerServices == null) {
            this.containerServices = new ContainerServicesImpl(this);
        }
        return this.containerServices;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage ManagedClusters.
     */
    public ManagedClusters managedClusters() {
        if (this.managedClusters == null) {
            this.managedClusters = new ManagedClustersImpl(this);
        }
        return this.managedClusters;
    }

    /**
     * @return Entry point to manage AgentPools.
     */
    public AgentPools agentPools() {
        if (this.agentPools == null) {
            this.agentPools = new AgentPoolsImpl(this);
        }
        return this.agentPools;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public ContainerServiceManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return ContainerServiceManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private ContainerServiceManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new ContainerServiceManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
