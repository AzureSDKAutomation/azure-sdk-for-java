/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for backup request. Workload-specific backup requests are derived
 * from this class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType", defaultImpl = BackupRequest.class)
@JsonTypeName("BackupRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureFileShareBackupRequest", value = AzureFileShareBackupRequest.class),
    @JsonSubTypes.Type(name = "AzureWorkloadBackupRequest", value = AzureWorkloadBackupRequest.class),
    @JsonSubTypes.Type(name = "IaasVMBackupRequest", value = IaasVMBackupRequest.class)
})
public class BackupRequest {
}
