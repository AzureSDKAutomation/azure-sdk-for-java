// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.ResponseInner;
import com.azure.resourcemanager.monitor.generated.models.ResultType;
import java.time.Duration;

/** An instance of this class provides access to all the operations defined in MetricsClient. */
public interface MetricsClient {
    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResponseInner list(String resourceUri);

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metricnames The names of the metrics (comma separated) to retrieve. Special case: If a metricname itself
     *     has a comma in it then use %2 to indicate it. Eg: 'Metric,Name1' should be **'Metric%2Name1'**.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data returned. Example: Metric contains
     *     metadata A, B and C. - Return all time series of C where A = a1 and B = b1 or b2 **$filter=A eq 'a1' and B eq
     *     'b1' or B eq 'b2' and C eq '*'** - Invalid variant: **$filter=A eq 'a1' and B eq 'b1' and C eq '*' or B =
     *     'b2'** This is invalid because the logical or operator cannot separate two different metadata names. - Return
     *     all time series where A = a1, B = b1 and C = c1: **$filter=A eq 'a1' and B eq 'b1' and C eq 'c1'** - Return
     *     all time series where A = a1 **$filter=A eq 'a1' and B eq '*' and C eq '*'**. Special case: When dimension
     *     name or dimension value uses round brackets. Eg: When dimension name is **dim (test) 1** Instead of using
     *     $filter= "dim (test) 1 eq '*' " use **$filter= "dim %2528test%2529 1 eq '*' "** When dimension name is **dim
     *     (test) 3** and dimension value is **dim3 (test) val** Instead of using $filter= "dim (test) 3 eq 'dim3 (test)
     *     val' " use **$filter= "dim %2528test%2529 3 eq 'dim3 %2528test%2529 val' "**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResponseInner> listWithResponse(
        String resourceUri,
        String timespan,
        Duration interval,
        String metricnames,
        String aggregation,
        Integer top,
        String orderby,
        String filter,
        ResultType resultType,
        String metricnamespace,
        Context context);
}
