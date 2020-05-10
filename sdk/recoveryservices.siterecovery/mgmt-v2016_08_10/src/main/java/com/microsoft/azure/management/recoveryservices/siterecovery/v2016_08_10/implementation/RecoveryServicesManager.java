/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationVaultHealths;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationProtectedItems;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationNetworkMappings;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationFabrics;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationvCenters;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationStorageClassificationMappings;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationStorageClassifications;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationRecoveryServicesProviders;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.RecoveryPoints;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationRecoveryPlans;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationProtectionContainers;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationProtectionContainerMappings;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationProtectableItems;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationPolicies;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.Operations;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationNetworks;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationLogicalNetworks;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationJobs;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationEvents;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationAlertSettings;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure RecoveryServices resource management.
 */
public final class RecoveryServicesManager extends ManagerCore<RecoveryServicesManager, SiteRecoveryManagementClientImpl> {
    private ReplicationVaultHealths replicationVaultHealths;
    private ReplicationProtectedItems replicationProtectedItems;
    private ReplicationNetworkMappings replicationNetworkMappings;
    private ReplicationFabrics replicationFabrics;
    private ReplicationvCenters replicationvCenters;
    private ReplicationStorageClassificationMappings replicationStorageClassificationMappings;
    private ReplicationStorageClassifications replicationStorageClassifications;
    private ReplicationRecoveryServicesProviders replicationRecoveryServicesProviders;
    private RecoveryPoints recoveryPoints;
    private ReplicationRecoveryPlans replicationRecoveryPlans;
    private ReplicationProtectionContainers replicationProtectionContainers;
    private ReplicationProtectionContainerMappings replicationProtectionContainerMappings;
    private ReplicationProtectableItems replicationProtectableItems;
    private ReplicationPolicies replicationPolicies;
    private Operations operations;
    private ReplicationNetworks replicationNetworks;
    private ReplicationLogicalNetworks replicationLogicalNetworks;
    private ReplicationJobs replicationJobs;
    private ReplicationEvents replicationEvents;
    private ReplicationAlertSettings replicationAlertSettings;
    /**
    * Get a Configurable instance that can be used to create RecoveryServicesManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new RecoveryServicesManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of RecoveryServicesManager that exposes RecoveryServices resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the RecoveryServicesManager
    */
    public static RecoveryServicesManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new RecoveryServicesManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of RecoveryServicesManager that exposes RecoveryServices resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the RecoveryServicesManager
    */
    public static RecoveryServicesManager authenticate(RestClient restClient, String subscriptionId) {
        return new RecoveryServicesManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of RecoveryServicesManager that exposes RecoveryServices management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing RecoveryServices management API entry points that work across subscriptions
        */
        RecoveryServicesManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage ReplicationVaultHealths.
     */
    public ReplicationVaultHealths replicationVaultHealths() {
        if (this.replicationVaultHealths == null) {
            this.replicationVaultHealths = new ReplicationVaultHealthsImpl(this);
        }
        return this.replicationVaultHealths;
    }

    /**
     * @return Entry point to manage ReplicationProtectedItems.
     */
    public ReplicationProtectedItems replicationProtectedItems() {
        if (this.replicationProtectedItems == null) {
            this.replicationProtectedItems = new ReplicationProtectedItemsImpl(this);
        }
        return this.replicationProtectedItems;
    }

    /**
     * @return Entry point to manage ReplicationNetworkMappings.
     */
    public ReplicationNetworkMappings replicationNetworkMappings() {
        if (this.replicationNetworkMappings == null) {
            this.replicationNetworkMappings = new ReplicationNetworkMappingsImpl(this);
        }
        return this.replicationNetworkMappings;
    }

    /**
     * @return Entry point to manage ReplicationFabrics.
     */
    public ReplicationFabrics replicationFabrics() {
        if (this.replicationFabrics == null) {
            this.replicationFabrics = new ReplicationFabricsImpl(this);
        }
        return this.replicationFabrics;
    }

    /**
     * @return Entry point to manage ReplicationvCenters.
     */
    public ReplicationvCenters replicationvCenters() {
        if (this.replicationvCenters == null) {
            this.replicationvCenters = new ReplicationvCentersImpl(this);
        }
        return this.replicationvCenters;
    }

    /**
     * @return Entry point to manage ReplicationStorageClassificationMappings.
     */
    public ReplicationStorageClassificationMappings replicationStorageClassificationMappings() {
        if (this.replicationStorageClassificationMappings == null) {
            this.replicationStorageClassificationMappings = new ReplicationStorageClassificationMappingsImpl(this);
        }
        return this.replicationStorageClassificationMappings;
    }

    /**
     * @return Entry point to manage ReplicationStorageClassifications.
     */
    public ReplicationStorageClassifications replicationStorageClassifications() {
        if (this.replicationStorageClassifications == null) {
            this.replicationStorageClassifications = new ReplicationStorageClassificationsImpl(this);
        }
        return this.replicationStorageClassifications;
    }

    /**
     * @return Entry point to manage ReplicationRecoveryServicesProviders.
     */
    public ReplicationRecoveryServicesProviders replicationRecoveryServicesProviders() {
        if (this.replicationRecoveryServicesProviders == null) {
            this.replicationRecoveryServicesProviders = new ReplicationRecoveryServicesProvidersImpl(this);
        }
        return this.replicationRecoveryServicesProviders;
    }

    /**
     * @return Entry point to manage RecoveryPoints.
     */
    public RecoveryPoints recoveryPoints() {
        if (this.recoveryPoints == null) {
            this.recoveryPoints = new RecoveryPointsImpl(this);
        }
        return this.recoveryPoints;
    }

    /**
     * @return Entry point to manage ReplicationRecoveryPlans.
     */
    public ReplicationRecoveryPlans replicationRecoveryPlans() {
        if (this.replicationRecoveryPlans == null) {
            this.replicationRecoveryPlans = new ReplicationRecoveryPlansImpl(this);
        }
        return this.replicationRecoveryPlans;
    }

    /**
     * @return Entry point to manage ReplicationProtectionContainers.
     */
    public ReplicationProtectionContainers replicationProtectionContainers() {
        if (this.replicationProtectionContainers == null) {
            this.replicationProtectionContainers = new ReplicationProtectionContainersImpl(this);
        }
        return this.replicationProtectionContainers;
    }

    /**
     * @return Entry point to manage ReplicationProtectionContainerMappings.
     */
    public ReplicationProtectionContainerMappings replicationProtectionContainerMappings() {
        if (this.replicationProtectionContainerMappings == null) {
            this.replicationProtectionContainerMappings = new ReplicationProtectionContainerMappingsImpl(this);
        }
        return this.replicationProtectionContainerMappings;
    }

    /**
     * @return Entry point to manage ReplicationProtectableItems.
     */
    public ReplicationProtectableItems replicationProtectableItems() {
        if (this.replicationProtectableItems == null) {
            this.replicationProtectableItems = new ReplicationProtectableItemsImpl(this);
        }
        return this.replicationProtectableItems;
    }

    /**
     * @return Entry point to manage ReplicationPolicies.
     */
    public ReplicationPolicies replicationPolicies() {
        if (this.replicationPolicies == null) {
            this.replicationPolicies = new ReplicationPoliciesImpl(this);
        }
        return this.replicationPolicies;
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
     * @return Entry point to manage ReplicationNetworks.
     */
    public ReplicationNetworks replicationNetworks() {
        if (this.replicationNetworks == null) {
            this.replicationNetworks = new ReplicationNetworksImpl(this);
        }
        return this.replicationNetworks;
    }

    /**
     * @return Entry point to manage ReplicationLogicalNetworks.
     */
    public ReplicationLogicalNetworks replicationLogicalNetworks() {
        if (this.replicationLogicalNetworks == null) {
            this.replicationLogicalNetworks = new ReplicationLogicalNetworksImpl(this);
        }
        return this.replicationLogicalNetworks;
    }

    /**
     * @return Entry point to manage ReplicationJobs.
     */
    public ReplicationJobs replicationJobs() {
        if (this.replicationJobs == null) {
            this.replicationJobs = new ReplicationJobsImpl(this);
        }
        return this.replicationJobs;
    }

    /**
     * @return Entry point to manage ReplicationEvents.
     */
    public ReplicationEvents replicationEvents() {
        if (this.replicationEvents == null) {
            this.replicationEvents = new ReplicationEventsImpl(this);
        }
        return this.replicationEvents;
    }

    /**
     * @return Entry point to manage ReplicationAlertSettings.
     */
    public ReplicationAlertSettings replicationAlertSettings() {
        if (this.replicationAlertSettings == null) {
            this.replicationAlertSettings = new ReplicationAlertSettingsImpl(this);
        }
        return this.replicationAlertSettings;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public RecoveryServicesManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return RecoveryServicesManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private RecoveryServicesManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new SiteRecoveryManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
