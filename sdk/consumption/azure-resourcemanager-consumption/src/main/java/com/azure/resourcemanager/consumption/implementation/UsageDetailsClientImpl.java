// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.UsageDetailsClient;
import com.azure.resourcemanager.consumption.fluent.models.UsageDetailInner;
import com.azure.resourcemanager.consumption.models.Metrictype;
import com.azure.resourcemanager.consumption.models.UsageDetailsListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in UsageDetailsClient. */
public final class UsageDetailsClientImpl implements UsageDetailsClient {
    private final ClientLogger logger = new ClientLogger(UsageDetailsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final UsageDetailsService service;

    /** The service client containing this operation class. */
    private final ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of UsageDetailsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    UsageDetailsClientImpl(ConsumptionManagementClientImpl client) {
        this.service =
            RestProxy.create(UsageDetailsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ConsumptionManagementClientUsageDetails to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ConsumptionManagemen")
    private interface UsageDetailsService {
        @Headers({"Content-Type: application/json"})
        @Get("/{scope}/providers/Microsoft.Consumption/usageDetails")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<UsageDetailsListResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam(value = "scope", encoded = true) String scope,
            @QueryParam("$expand") String expand,
            @QueryParam("$filter") String filter,
            @QueryParam("$skiptoken") String skiptoken,
            @QueryParam("$top") Integer top,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("metric") Metrictype metric,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<UsageDetailsListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists the usage details for the defined scope. Usage details are available via this API only for May 1, 2014 or
     * later.
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
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing usage details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageDetailInner>> listSinglePageAsync(
        String scope, String expand, String filter, String skiptoken, Integer top, Metrictype metric) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            scope,
                            expand,
                            filter,
                            skiptoken,
                            top,
                            this.client.getApiVersion(),
                            metric,
                            accept,
                            context))
            .<PagedResponse<UsageDetailInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists the usage details for the defined scope. Usage details are available via this API only for May 1, 2014 or
     * later.
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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing usage details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageDetailInner>> listSinglePageAsync(
        String scope, String expand, String filter, String skiptoken, Integer top, Metrictype metric, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                scope,
                expand,
                filter,
                skiptoken,
                top,
                this.client.getApiVersion(),
                metric,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Lists the usage details for the defined scope. Usage details are available via this API only for May 1, 2014 or
     * later.
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
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing usage details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<UsageDetailInner> listAsync(
        String scope, String expand, String filter, String skiptoken, Integer top, Metrictype metric) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, expand, filter, skiptoken, top, metric),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the usage details for the defined scope. Usage details are available via this API only for May 1, 2014 or
     * later.
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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing usage details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<UsageDetailInner> listAsync(String scope) {
        final String expand = null;
        final String filter = null;
        final String skiptoken = null;
        final Integer top = null;
        final Metrictype metric = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, expand, filter, skiptoken, top, metric),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the usage details for the defined scope. Usage details are available via this API only for May 1, 2014 or
     * later.
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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing usage details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<UsageDetailInner> listAsync(
        String scope, String expand, String filter, String skiptoken, Integer top, Metrictype metric, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, expand, filter, skiptoken, top, metric, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists the usage details for the defined scope. Usage details are available via this API only for May 1, 2014 or
     * later.
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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing usage details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageDetailInner> list(String scope) {
        final String expand = null;
        final String filter = null;
        final String skiptoken = null;
        final Integer top = null;
        final Metrictype metric = null;
        return new PagedIterable<>(listAsync(scope, expand, filter, skiptoken, top, metric));
    }

    /**
     * Lists the usage details for the defined scope. Usage details are available via this API only for May 1, 2014 or
     * later.
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
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing usage details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageDetailInner> list(
        String scope, String expand, String filter, String skiptoken, Integer top, Metrictype metric, Context context) {
        return new PagedIterable<>(listAsync(scope, expand, filter, skiptoken, top, metric, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing usage details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageDetailInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<UsageDetailInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing usage details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageDetailInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
