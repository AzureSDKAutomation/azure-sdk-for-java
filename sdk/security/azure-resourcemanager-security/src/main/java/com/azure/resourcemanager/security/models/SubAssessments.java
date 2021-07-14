// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SubAssessments. */
public interface SubAssessments {
    /**
     * Get security sub-assessments on all your scanned resources inside a subscription scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a subscription scope.
     */
    PagedIterable<SecuritySubAssessment> listAll(String scope);

    /**
     * Get security sub-assessments on all your scanned resources inside a subscription scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a subscription scope.
     */
    PagedIterable<SecuritySubAssessment> listAll(String scope, Context context);

    /**
     * Get security sub-assessments on all your scanned resources inside a scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a scope.
     */
    PagedIterable<SecuritySubAssessment> list(String scope, String assessmentName);

    /**
     * Get security sub-assessments on all your scanned resources inside a scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security sub-assessments on all your scanned resources inside a scope.
     */
    PagedIterable<SecuritySubAssessment> list(String scope, String assessmentName, Context context);

    /**
     * Get a security sub-assessment on your scanned resource.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param subAssessmentName The Sub-Assessment Key - Unique key for the sub-assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a security sub-assessment on your scanned resource.
     */
    SecuritySubAssessment get(String scope, String assessmentName, String subAssessmentName);

    /**
     * Get a security sub-assessment on your scanned resource.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param subAssessmentName The Sub-Assessment Key - Unique key for the sub-assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a security sub-assessment on your scanned resource.
     */
    Response<SecuritySubAssessment> getWithResponse(
        String scope, String assessmentName, String subAssessmentName, Context context);
}
