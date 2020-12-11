// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of UsageDetails. */
public interface UsageDetails {
    /**
     * The Usage Details API provides an easy way to get raw, unaggregated cost data that corresponds to your Azure
     * bill. The API is useful when your organization needs a programmatic cost data retrieval solution. The data in
     * Usage Details is provided on a per meter basis, per day. Consider using the API if you're looking to analyze
     * smaller cost data sets. However, please note that the API is paginated and synchronous. It is not performant if
     * you have large cost datasets that you wish to analyze. To retrieve large cost datasets on a recurring basis, we
     * encourage you to utilize our [Exports API](https://docs.microsoft.com/en-us/rest/api/cost-management/exports).
     * Please also be aware that there are two types of API responses available via this API. The responses available
     * are in either the Legacy or Modern format. The format of the usage details record will be dependent on the type
     * of customer you are. If you are an EA or Legacy Pay-As-You-Go customer, you will receive records in the Legacy
     * format. If you are a Modern Customer Agreement customer you will receive records in the Modern format. To learn
     * more about the different formats and how to use the API please visit our documentation page [here](
     * https://docs.microsoft.com/en-us/azure/cost-management-billing/costs/manage-automation#automate-retrieval-with-usage-details-api).
     *
     * @param scope The scope associated with usage details operations. This includes '/subscriptions/{subscriptionId}/'
     *     for subscription scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account
     *     scope, '/providers/Microsoft.Billing/departments/{departmentId}' for Department scope,
     *     '/providers/Microsoft.Billing/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope and
     *     '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group scope. For
     *     subscription, billing account, department, enrollment account and management group, you can also add billing
     *     period to the scope using '/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'. For e.g. to
     *     specify billing period at department scope use
     *     '/providers/Microsoft.Billing/departments/{departmentId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'.
     *     Also, Modern Commerce Account scopes are '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}'
     *     for billingAccount scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing usage details.
     */
    PagedIterable<UsageDetail> list(String scope);

    /**
     * The Usage Details API provides an easy way to get raw, unaggregated cost data that corresponds to your Azure
     * bill. The API is useful when your organization needs a programmatic cost data retrieval solution. The data in
     * Usage Details is provided on a per meter basis, per day. Consider using the API if you're looking to analyze
     * smaller cost data sets. However, please note that the API is paginated and synchronous. It is not performant if
     * you have large cost datasets that you wish to analyze. To retrieve large cost datasets on a recurring basis, we
     * encourage you to utilize our [Exports API](https://docs.microsoft.com/en-us/rest/api/cost-management/exports).
     * Please also be aware that there are two types of API responses available via this API. The responses available
     * are in either the Legacy or Modern format. The format of the usage details record will be dependent on the type
     * of customer you are. If you are an EA or Legacy Pay-As-You-Go customer, you will receive records in the Legacy
     * format. If you are a Modern Customer Agreement customer you will receive records in the Modern format. To learn
     * more about the different formats and how to use the API please visit our documentation page [here](
     * https://docs.microsoft.com/en-us/azure/cost-management-billing/costs/manage-automation#automate-retrieval-with-usage-details-api).
     *
     * @param scope The scope associated with usage details operations. This includes '/subscriptions/{subscriptionId}/'
     *     for subscription scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account
     *     scope, '/providers/Microsoft.Billing/departments/{departmentId}' for Department scope,
     *     '/providers/Microsoft.Billing/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope and
     *     '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group scope. For
     *     subscription, billing account, department, enrollment account and management group, you can also add billing
     *     period to the scope using '/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'. For e.g. to
     *     specify billing period at department scope use
     *     '/providers/Microsoft.Billing/departments/{departmentId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'.
     *     Also, Modern Commerce Account scopes are '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}'
     *     for billingAccount scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param expand May be used to expand the properties/additionalInfo or properties/meterDetails within a list of
     *     usage details. By default, these fields are not included when listing usage details.
     * @param filter May be used to filter usageDetails by properties/resourceGroup, properties/resourceName,
     *     properties/resourceId, properties/chargeType, properties/reservationId, properties/publisherType or tags. The
     *     filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     *     Tag filter is a key value pair string where key and value is separated by a colon (:). PublisherType Filter
     *     accepts two values azure and marketplace and it is currently supported for Web Direct Offer Type.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @param metric Allows to select different type of cost/usage records.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing usage details.
     */
    PagedIterable<UsageDetail> list(
        String scope, String expand, String filter, String skiptoken, Integer top, Metrictype metric, Context context);
}
