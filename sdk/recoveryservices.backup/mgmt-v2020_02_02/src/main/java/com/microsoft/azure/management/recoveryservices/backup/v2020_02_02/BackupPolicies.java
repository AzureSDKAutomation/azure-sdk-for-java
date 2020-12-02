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

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.BackupPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BackupPolicies.
 */
public interface BackupPolicies extends HasInner<BackupPoliciesInner> {
    /**
     * Lists of backup policies associated with Recovery Services Vault. API provides pagination parameters to fetch
    scoped results.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VaultProtectionPolicyResource> listAsync(final String vaultName, final String resourceGroupName);

}
