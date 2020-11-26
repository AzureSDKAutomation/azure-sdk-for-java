/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.EnrollmentAccountsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing EnrollmentAccounts.
 */
public interface EnrollmentAccounts extends HasInner<EnrollmentAccountsInner> {
    /**
     * Lists the enrollment accounts for a billing account. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EnrollmentAccountListResult> listByBillingAccountNameAsync(String billingAccountName);

    /**
     * Gets an enrollment account by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param enrollmentAccountName The ID that uniquely identifies an enrollment account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EnrollmentAccount> getByEnrollmentAccountIdAsync(String billingAccountName, String enrollmentAccountName);

    /**
     * Delete the given enrollment account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param enrollmentAccountName The ID that uniquely identifies an enrollment account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String billingAccountName, String enrollmentAccountName);

    /**
     * Add an enrollment account to an enrollment or department.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param parameters Request parameters that are provided to the create an enrollment account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EnrollmentAccount> createAsync(String billingAccountName, CreateEnrollmentAccount parameters);

}
