// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for NetAppManagementClient class. */
public interface NetAppManagementClient {
    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
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
     * Gets the NetAppResourcesClient object to access its operations.
     *
     * @return the NetAppResourcesClient object.
     */
    NetAppResourcesClient getNetAppResources();

    /**
     * Gets the AccountsClient object to access its operations.
     *
     * @return the AccountsClient object.
     */
    AccountsClient getAccounts();

    /**
     * Gets the PoolsClient object to access its operations.
     *
     * @return the PoolsClient object.
     */
    PoolsClient getPools();

    /**
     * Gets the VolumesClient object to access its operations.
     *
     * @return the VolumesClient object.
     */
    VolumesClient getVolumes();

    /**
     * Gets the SnapshotsClient object to access its operations.
     *
     * @return the SnapshotsClient object.
     */
    SnapshotsClient getSnapshots();

    /**
     * Gets the SnapshotPoliciesClient object to access its operations.
     *
     * @return the SnapshotPoliciesClient object.
     */
    SnapshotPoliciesClient getSnapshotPolicies();

    /**
     * Gets the BackupsClient object to access its operations.
     *
     * @return the BackupsClient object.
     */
    BackupsClient getBackups();

    /**
     * Gets the VolumeRestoreStatusClient object to access its operations.
     *
     * @return the VolumeRestoreStatusClient object.
     */
    VolumeRestoreStatusClient getVolumeRestoreStatus();

    /**
     * Gets the AccountBackupsClient object to access its operations.
     *
     * @return the AccountBackupsClient object.
     */
    AccountBackupsClient getAccountBackups();

    /**
     * Gets the BackupPoliciesClient object to access its operations.
     *
     * @return the BackupPoliciesClient object.
     */
    BackupPoliciesClient getBackupPolicies();

    /**
     * Gets the VaultsClient object to access its operations.
     *
     * @return the VaultsClient object.
     */
    VaultsClient getVaults();
}
