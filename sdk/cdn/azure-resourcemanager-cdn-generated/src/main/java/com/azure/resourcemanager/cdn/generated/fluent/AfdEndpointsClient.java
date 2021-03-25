// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.cdn.generated.fluent.models.AfdEndpointInner;
import com.azure.resourcemanager.cdn.generated.fluent.models.UsageInner;
import com.azure.resourcemanager.cdn.generated.fluent.models.ValidateCustomDomainOutputInner;
import com.azure.resourcemanager.cdn.generated.models.AfdEndpointUpdateParameters;
import com.azure.resourcemanager.cdn.generated.models.AfdPurgeParameters;
import com.azure.resourcemanager.cdn.generated.models.ValidateCustomDomainInput;

/** An instance of this class provides access to all the operations defined in AfdEndpointsClient. */
public interface AfdEndpointsClient {
    /**
     * Lists existing AzureFrontDoor endpoints.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list endpoints.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AfdEndpointInner> listByProfile(String resourceGroupName, String profileName);

    /**
     * Lists existing AzureFrontDoor endpoints.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list endpoints.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AfdEndpointInner> listByProfile(String resourceGroupName, String profileName, Context context);

    /**
     * Gets an existing AzureFrontDoor endpoint with the specified endpoint name under the specified subscription,
     * resource group and profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing AzureFrontDoor endpoint with the specified endpoint name under the specified subscription,
     *     resource group and profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AfdEndpointInner get(String resourceGroupName, String profileName, String endpointName);

    /**
     * Gets an existing AzureFrontDoor endpoint with the specified endpoint name under the specified subscription,
     * resource group and profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing AzureFrontDoor endpoint with the specified endpoint name under the specified subscription,
     *     resource group and profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AfdEndpointInner> getWithResponse(
        String resourceGroupName, String profileName, String endpointName, Context context);

    /**
     * Creates a new AzureFrontDoor endpoint with the specified endpoint name under the specified subscription, resource
     * group and profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param endpoint Endpoint properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN endpoint is the entity within a CDN profile containing configuration information such as origin,
     *     protocol, content caching and delivery behavior.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AfdEndpointInner>, AfdEndpointInner> beginCreate(
        String resourceGroupName, String profileName, String endpointName, AfdEndpointInner endpoint);

    /**
     * Creates a new AzureFrontDoor endpoint with the specified endpoint name under the specified subscription, resource
     * group and profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param endpoint Endpoint properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN endpoint is the entity within a CDN profile containing configuration information such as origin,
     *     protocol, content caching and delivery behavior.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AfdEndpointInner>, AfdEndpointInner> beginCreate(
        String resourceGroupName, String profileName, String endpointName, AfdEndpointInner endpoint, Context context);

    /**
     * Creates a new AzureFrontDoor endpoint with the specified endpoint name under the specified subscription, resource
     * group and profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param endpoint Endpoint properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN endpoint is the entity within a CDN profile containing configuration information such as origin,
     *     protocol, content caching and delivery behavior.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AfdEndpointInner create(
        String resourceGroupName, String profileName, String endpointName, AfdEndpointInner endpoint);

    /**
     * Creates a new AzureFrontDoor endpoint with the specified endpoint name under the specified subscription, resource
     * group and profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param endpoint Endpoint properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN endpoint is the entity within a CDN profile containing configuration information such as origin,
     *     protocol, content caching and delivery behavior.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AfdEndpointInner create(
        String resourceGroupName, String profileName, String endpointName, AfdEndpointInner endpoint, Context context);

    /**
     * Updates an existing AzureFrontDoor endpoint with the specified endpoint name under the specified subscription,
     * resource group and profile. Only tags can be updated after creating an endpoint. To update origins, use the
     * Update Origin operation. To update origin groups, use the Update Origin group operation. To update domains, use
     * the Update Custom Domain operation.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param endpointUpdateProperties Endpoint update properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN endpoint is the entity within a CDN profile containing configuration information such as origin,
     *     protocol, content caching and delivery behavior.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AfdEndpointInner>, AfdEndpointInner> beginUpdate(
        String resourceGroupName,
        String profileName,
        String endpointName,
        AfdEndpointUpdateParameters endpointUpdateProperties);

    /**
     * Updates an existing AzureFrontDoor endpoint with the specified endpoint name under the specified subscription,
     * resource group and profile. Only tags can be updated after creating an endpoint. To update origins, use the
     * Update Origin operation. To update origin groups, use the Update Origin group operation. To update domains, use
     * the Update Custom Domain operation.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param endpointUpdateProperties Endpoint update properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN endpoint is the entity within a CDN profile containing configuration information such as origin,
     *     protocol, content caching and delivery behavior.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AfdEndpointInner>, AfdEndpointInner> beginUpdate(
        String resourceGroupName,
        String profileName,
        String endpointName,
        AfdEndpointUpdateParameters endpointUpdateProperties,
        Context context);

    /**
     * Updates an existing AzureFrontDoor endpoint with the specified endpoint name under the specified subscription,
     * resource group and profile. Only tags can be updated after creating an endpoint. To update origins, use the
     * Update Origin operation. To update origin groups, use the Update Origin group operation. To update domains, use
     * the Update Custom Domain operation.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param endpointUpdateProperties Endpoint update properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN endpoint is the entity within a CDN profile containing configuration information such as origin,
     *     protocol, content caching and delivery behavior.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AfdEndpointInner update(
        String resourceGroupName,
        String profileName,
        String endpointName,
        AfdEndpointUpdateParameters endpointUpdateProperties);

    /**
     * Updates an existing AzureFrontDoor endpoint with the specified endpoint name under the specified subscription,
     * resource group and profile. Only tags can be updated after creating an endpoint. To update origins, use the
     * Update Origin operation. To update origin groups, use the Update Origin group operation. To update domains, use
     * the Update Custom Domain operation.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param endpointUpdateProperties Endpoint update properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cDN endpoint is the entity within a CDN profile containing configuration information such as origin,
     *     protocol, content caching and delivery behavior.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AfdEndpointInner update(
        String resourceGroupName,
        String profileName,
        String endpointName,
        AfdEndpointUpdateParameters endpointUpdateProperties,
        Context context);

    /**
     * Deletes an existing AzureFrontDoor endpoint with the specified endpoint name under the specified subscription,
     * resource group and profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String profileName, String endpointName);

    /**
     * Deletes an existing AzureFrontDoor endpoint with the specified endpoint name under the specified subscription,
     * resource group and profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String profileName, String endpointName, Context context);

    /**
     * Deletes an existing AzureFrontDoor endpoint with the specified endpoint name under the specified subscription,
     * resource group and profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String endpointName);

    /**
     * Deletes an existing AzureFrontDoor endpoint with the specified endpoint name under the specified subscription,
     * resource group and profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String endpointName, Context context);

    /**
     * Removes a content from AzureFrontDoor.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param contents The list of paths to the content and the list of linked domains to be purged. Path can be a full
     *     URL, e.g. '/pictures/city.png' which removes a single file, or a directory with a wildcard, e.g.
     *     '/pictures/*' which removes all folders and files in the directory.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginPurgeContent(
        String resourceGroupName, String profileName, String endpointName, AfdPurgeParameters contents);

    /**
     * Removes a content from AzureFrontDoor.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param contents The list of paths to the content and the list of linked domains to be purged. Path can be a full
     *     URL, e.g. '/pictures/city.png' which removes a single file, or a directory with a wildcard, e.g.
     *     '/pictures/*' which removes all folders and files in the directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginPurgeContent(
        String resourceGroupName,
        String profileName,
        String endpointName,
        AfdPurgeParameters contents,
        Context context);

    /**
     * Removes a content from AzureFrontDoor.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param contents The list of paths to the content and the list of linked domains to be purged. Path can be a full
     *     URL, e.g. '/pictures/city.png' which removes a single file, or a directory with a wildcard, e.g.
     *     '/pictures/*' which removes all folders and files in the directory.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void purgeContent(String resourceGroupName, String profileName, String endpointName, AfdPurgeParameters contents);

    /**
     * Removes a content from AzureFrontDoor.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param contents The list of paths to the content and the list of linked domains to be purged. Path can be a full
     *     URL, e.g. '/pictures/city.png' which removes a single file, or a directory with a wildcard, e.g.
     *     '/pictures/*' which removes all folders and files in the directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void purgeContent(
        String resourceGroupName,
        String profileName,
        String endpointName,
        AfdPurgeParameters contents,
        Context context);

    /**
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UsageInner> listResourceUsage(String resourceGroupName, String profileName, String endpointName);

    /**
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UsageInner> listResourceUsage(
        String resourceGroupName, String profileName, String endpointName, Context context);

    /**
     * Validates the custom domain mapping to ensure it maps to the correct CDN endpoint in DNS.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param customDomainProperties Custom domain to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of custom domain validation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ValidateCustomDomainOutputInner validateCustomDomain(
        String resourceGroupName,
        String profileName,
        String endpointName,
        ValidateCustomDomainInput customDomainProperties);

    /**
     * Validates the custom domain mapping to ensure it maps to the correct CDN endpoint in DNS.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param customDomainProperties Custom domain to be validated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of custom domain validation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ValidateCustomDomainOutputInner> validateCustomDomainWithResponse(
        String resourceGroupName,
        String profileName,
        String endpointName,
        ValidateCustomDomainInput customDomainProperties,
        Context context);
}
