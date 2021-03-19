// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Tags. */
public interface Tags {
    /**
     * Get all available tag keys for the defined scope.
     *
     * @param scope The scope associated with tags operations. This includes '/subscriptions/{subscriptionId}/' for
     *     subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope and '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     *     Management Group scope..
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available tag keys for the defined scope.
     */
    TagsResult get(String scope);

    /**
     * Get all available tag keys for the defined scope.
     *
     * @param scope The scope associated with tags operations. This includes '/subscriptions/{subscriptionId}/' for
     *     subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope and '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     *     Management Group scope..
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available tag keys for the defined scope.
     */
    Response<TagsResult> getWithResponse(String scope, Context context);
}
