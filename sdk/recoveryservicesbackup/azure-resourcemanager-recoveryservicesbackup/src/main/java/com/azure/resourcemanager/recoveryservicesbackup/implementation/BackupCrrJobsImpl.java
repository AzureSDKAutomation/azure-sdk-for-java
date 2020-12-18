// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupCrrJobsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.JobResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupCrrJobs;
import com.azure.resourcemanager.recoveryservicesbackup.models.CrrJobRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.JobResource;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BackupCrrJobsImpl implements BackupCrrJobs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupCrrJobsImpl.class);

    private final BackupCrrJobsClient innerClient;

    private final RecoveryServicesBackupManager serviceManager;

    public BackupCrrJobsImpl(BackupCrrJobsClient innerClient, RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<JobResource> list(String azureRegion, CrrJobRequest parameters) {
        PagedIterable<JobResourceInner> inner = this.serviceClient().list(azureRegion, parameters);
        return inner.mapPage(inner1 -> new JobResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<JobResource> list(
        String azureRegion, CrrJobRequest parameters, String filter, String skipToken, Context context) {
        PagedIterable<JobResourceInner> inner =
            this.serviceClient().list(azureRegion, parameters, filter, skipToken, context);
        return inner.mapPage(inner1 -> new JobResourceImpl(inner1, this.manager()));
    }

    private BackupCrrJobsClient serviceClient() {
        return this.innerClient;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
