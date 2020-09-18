/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_06_30;

import rx.Observable;

/**
 * Type representing UsageDetails.
 */
public interface UsageDetails {
    /**
     * Lists the usage details for a scope by billing period. Usage details are available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageDetail> listByBillingPeriodAsync(final String billingPeriodName);

    /**
     * Lists the usage details by billingAccountId for a scope by current billing period. Usage details are available via this API only for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageDetail> listByBillingAccountAsync(final String billingAccountId);

    /**
     * Lists the usage details based on billingAccountId for a scope by billing period. Usage details are available via this API only for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageDetail> listForBillingPeriodByBillingAccountAsync(final String billingAccountId, final String billingPeriodName);

    /**
     * Lists the usage details by departmentId for a scope by current billing period. Usage details are available via this API only for May 1, 2014 or later.
     *
     * @param departmentId Department ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageDetail> listByDepartmentAsync(final String departmentId);

    /**
     * Lists the usage details based on departmentId for a scope by billing period. Usage details are available via this API only for May 1, 2014 or later.
     *
     * @param departmentId Department ID
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageDetail> listForBillingPeriodByDepartmentAsync(final String departmentId, final String billingPeriodName);

    /**
     * Lists the usage details by enrollmentAccountId for a scope by current billing period. Usage details are available via this API only for May 1, 2014 or later.
     *
     * @param enrollmentAccountId EnrollmentAccount ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageDetail> listByEnrollmentAccountAsync(final String enrollmentAccountId);

    /**
     * Lists the usage details based on enrollmentAccountId for a scope by billing period. Usage details are available via this API only for May 1, 2014 or later.
     *
     * @param enrollmentAccountId EnrollmentAccount ID
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageDetail> listForBillingPeriodByEnrollmentAccountAsync(final String enrollmentAccountId, final String billingPeriodName);

    /**
     * Lists the usage detail records for all subscriptions belonging to a management group scope by current billing period. Usage details are available via this API only for May 1, 2014 or later.
     *
     * @param managementGroupId Azure Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageDetail> listByManagementGroupAsync(final String managementGroupId);

    /**
     * Lists the usage detail records for all subscriptions belonging to a management group scope by specified billing period. Usage details are available via this API only for May 1, 2014 or later.
     *
     * @param managementGroupId Azure Management Group ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageDetail> listForBillingPeriodByManagementGroupAsync(final String managementGroupId, final String billingPeriodName);

    /**
     * Lists the usage details for a scope by current billing period. Usage details are available via this API only for May 1, 2014 or later.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageDetail> listAsync();

}
