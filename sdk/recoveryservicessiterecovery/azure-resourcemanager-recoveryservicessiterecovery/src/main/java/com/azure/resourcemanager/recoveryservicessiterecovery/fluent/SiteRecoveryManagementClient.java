// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for SiteRecoveryManagementClient class. */
public interface SiteRecoveryManagementClient {
    /**
     * Gets The subscription Id.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the ReplicationAlertSettingsClient object to access its operations.
     *
     * @return the ReplicationAlertSettingsClient object.
     */
    ReplicationAlertSettingsClient getReplicationAlertSettings();

    /**
     * Gets the ReplicationEligibilityResultsOperationsClient object to access its operations.
     *
     * @return the ReplicationEligibilityResultsOperationsClient object.
     */
    ReplicationEligibilityResultsOperationsClient getReplicationEligibilityResultsOperations();

    /**
     * Gets the ReplicationEventsClient object to access its operations.
     *
     * @return the ReplicationEventsClient object.
     */
    ReplicationEventsClient getReplicationEvents();

    /**
     * Gets the ReplicationFabricsClient object to access its operations.
     *
     * @return the ReplicationFabricsClient object.
     */
    ReplicationFabricsClient getReplicationFabrics();

    /**
     * Gets the ReplicationLogicalNetworksClient object to access its operations.
     *
     * @return the ReplicationLogicalNetworksClient object.
     */
    ReplicationLogicalNetworksClient getReplicationLogicalNetworks();

    /**
     * Gets the ReplicationNetworksClient object to access its operations.
     *
     * @return the ReplicationNetworksClient object.
     */
    ReplicationNetworksClient getReplicationNetworks();

    /**
     * Gets the ReplicationNetworkMappingsClient object to access its operations.
     *
     * @return the ReplicationNetworkMappingsClient object.
     */
    ReplicationNetworkMappingsClient getReplicationNetworkMappings();

    /**
     * Gets the ReplicationProtectionContainersClient object to access its operations.
     *
     * @return the ReplicationProtectionContainersClient object.
     */
    ReplicationProtectionContainersClient getReplicationProtectionContainers();

    /**
     * Gets the ReplicationMigrationItemsClient object to access its operations.
     *
     * @return the ReplicationMigrationItemsClient object.
     */
    ReplicationMigrationItemsClient getReplicationMigrationItems();

    /**
     * Gets the MigrationRecoveryPointsClient object to access its operations.
     *
     * @return the MigrationRecoveryPointsClient object.
     */
    MigrationRecoveryPointsClient getMigrationRecoveryPoints();

    /**
     * Gets the ReplicationProtectableItemsClient object to access its operations.
     *
     * @return the ReplicationProtectableItemsClient object.
     */
    ReplicationProtectableItemsClient getReplicationProtectableItems();

    /**
     * Gets the ReplicationProtectedItemsClient object to access its operations.
     *
     * @return the ReplicationProtectedItemsClient object.
     */
    ReplicationProtectedItemsClient getReplicationProtectedItems();

    /**
     * Gets the RecoveryPointsClient object to access its operations.
     *
     * @return the RecoveryPointsClient object.
     */
    RecoveryPointsClient getRecoveryPoints();

    /**
     * Gets the TargetComputeSizesClient object to access its operations.
     *
     * @return the TargetComputeSizesClient object.
     */
    TargetComputeSizesClient getTargetComputeSizes();

    /**
     * Gets the ReplicationProtectionContainerMappingsClient object to access its operations.
     *
     * @return the ReplicationProtectionContainerMappingsClient object.
     */
    ReplicationProtectionContainerMappingsClient getReplicationProtectionContainerMappings();

    /**
     * Gets the ReplicationProtectionIntentsClient object to access its operations.
     *
     * @return the ReplicationProtectionIntentsClient object.
     */
    ReplicationProtectionIntentsClient getReplicationProtectionIntents();

    /**
     * Gets the ReplicationRecoveryServicesProvidersClient object to access its operations.
     *
     * @return the ReplicationRecoveryServicesProvidersClient object.
     */
    ReplicationRecoveryServicesProvidersClient getReplicationRecoveryServicesProviders();

    /**
     * Gets the ReplicationStorageClassificationsClient object to access its operations.
     *
     * @return the ReplicationStorageClassificationsClient object.
     */
    ReplicationStorageClassificationsClient getReplicationStorageClassifications();

    /**
     * Gets the ReplicationStorageClassificationMappingsClient object to access its operations.
     *
     * @return the ReplicationStorageClassificationMappingsClient object.
     */
    ReplicationStorageClassificationMappingsClient getReplicationStorageClassificationMappings();

    /**
     * Gets the ReplicationvCentersClient object to access its operations.
     *
     * @return the ReplicationvCentersClient object.
     */
    ReplicationvCentersClient getReplicationvCenters();

    /**
     * Gets the ReplicationJobsClient object to access its operations.
     *
     * @return the ReplicationJobsClient object.
     */
    ReplicationJobsClient getReplicationJobs();

    /**
     * Gets the ReplicationPoliciesClient object to access its operations.
     *
     * @return the ReplicationPoliciesClient object.
     */
    ReplicationPoliciesClient getReplicationPolicies();

    /**
     * Gets the ReplicationRecoveryPlansClient object to access its operations.
     *
     * @return the ReplicationRecoveryPlansClient object.
     */
    ReplicationRecoveryPlansClient getReplicationRecoveryPlans();

    /**
     * Gets the SupportedOperatingSystemsOperationsClient object to access its operations.
     *
     * @return the SupportedOperatingSystemsOperationsClient object.
     */
    SupportedOperatingSystemsOperationsClient getSupportedOperatingSystemsOperations();

    /**
     * Gets the ReplicationVaultHealthsClient object to access its operations.
     *
     * @return the ReplicationVaultHealthsClient object.
     */
    ReplicationVaultHealthsClient getReplicationVaultHealths();

    /**
     * Gets the ReplicationVaultSettingsClient object to access its operations.
     *
     * @return the ReplicationVaultSettingsClient object.
     */
    ReplicationVaultSettingsClient getReplicationVaultSettings();
}
