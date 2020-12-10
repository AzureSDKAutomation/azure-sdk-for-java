// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.BastionActiveSessionInner;
import com.azure.resourcemanager.network.generated.fluent.models.BastionSessionStateInner;
import com.azure.resourcemanager.network.generated.fluent.models.BastionShareableLinkInner;
import com.azure.resourcemanager.network.generated.fluent.models.DnsNameAvailabilityResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualWanSecurityProvidersInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnProfileResponseInner;
import com.azure.resourcemanager.network.generated.models.BastionShareableLinkListRequest;
import com.azure.resourcemanager.network.generated.models.SessionIds;
import com.azure.resourcemanager.network.generated.models.VirtualWanVpnProfileParameters;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public interface ResourceProvidersClient {
    /**
     * Creates a Bastion Shareable Links for all the VMs specified in the request.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param bslRequest Post request for all the Bastion Shareable Link endpoints.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for all the Bastion Shareable Link endpoints.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BastionShareableLinkInner> putBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest);

    /**
     * Creates a Bastion Shareable Links for all the VMs specified in the request.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param bslRequest Post request for all the Bastion Shareable Link endpoints.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for all the Bastion Shareable Link endpoints.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BastionShareableLinkInner> putBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest, Context context);

    /**
     * Deletes the Bastion Shareable Links for all the VMs specified in the request.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param bslRequest Post request for all the Bastion Shareable Link endpoints.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDeleteBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest);

    /**
     * Deletes the Bastion Shareable Links for all the VMs specified in the request.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param bslRequest Post request for all the Bastion Shareable Link endpoints.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDeleteBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest, Context context);

    /**
     * Deletes the Bastion Shareable Links for all the VMs specified in the request.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param bslRequest Post request for all the Bastion Shareable Link endpoints.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest);

    /**
     * Deletes the Bastion Shareable Links for all the VMs specified in the request.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param bslRequest Post request for all the Bastion Shareable Link endpoints.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest, Context context);

    /**
     * Return the Bastion Shareable Links for all the VMs specified in the request.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param bslRequest Post request for all the Bastion Shareable Link endpoints.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for all the Bastion Shareable Link endpoints.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BastionShareableLinkInner> getBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest);

    /**
     * Return the Bastion Shareable Links for all the VMs specified in the request.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param bslRequest Post request for all the Bastion Shareable Link endpoints.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for all the Bastion Shareable Link endpoints.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BastionShareableLinkInner> getBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest, Context context);

    /**
     * Returns the list of currently active sessions on the Bastion.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for GetActiveSessions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BastionActiveSessionInner> getActiveSessions(String resourceGroupName, String bastionHostname);

    /**
     * Returns the list of currently active sessions on the Bastion.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for GetActiveSessions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BastionActiveSessionInner> getActiveSessions(
        String resourceGroupName, String bastionHostname, Context context);

    /**
     * Returns the list of currently active sessions on the Bastion.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param sessionIds List of session IDs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for DisconnectActiveSessions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BastionSessionStateInner> disconnectActiveSessions(
        String resourceGroupName, String bastionHostname, SessionIds sessionIds);

    /**
     * Returns the list of currently active sessions on the Bastion.
     *
     * @param resourceGroupName The name of the resource group.
     * @param bastionHostname The name of the Bastion Host.
     * @param sessionIds List of session IDs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for DisconnectActiveSessions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BastionSessionStateInner> disconnectActiveSessions(
        String resourceGroupName, String bastionHostname, SessionIds sessionIds, Context context);

    /**
     * Checks whether a domain name in the cloudapp.azure.com zone is available for use.
     *
     * @param location The location of the domain name.
     * @param domainNameLabel The domain name to be verified. It must conform to the following regular expression:
     *     ^[a-z][a-z0-9-]{1,61}[a-z0-9]$.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the CheckDnsNameAvailability API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DnsNameAvailabilityResultInner checkDnsNameAvailability(String location, String domainNameLabel);

    /**
     * Checks whether a domain name in the cloudapp.azure.com zone is available for use.
     *
     * @param location The location of the domain name.
     * @param domainNameLabel The domain name to be verified. It must conform to the following regular expression:
     *     ^[a-z][a-z0-9-]{1,61}[a-z0-9]$.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the CheckDnsNameAvailability API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DnsNameAvailabilityResultInner> checkDnsNameAvailabilityWithResponse(
        String location, String domainNameLabel, Context context);

    /**
     * Gives the supported security providers for the virtual wan.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN for which supported security providers are needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of SecurityProviders.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualWanSecurityProvidersInner supportedSecurityProviders(String resourceGroupName, String virtualWanName);

    /**
     * Gives the supported security providers for the virtual wan.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN for which supported security providers are needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of SecurityProviders.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualWanSecurityProvidersInner> supportedSecurityProvidersWithResponse(
        String resourceGroupName, String virtualWanName, Context context);

    /**
     * Generates a unique VPN profile for P2S clients for VirtualWan and associated VpnServerConfiguration combination
     * in the specified resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param vpnClientParams Virtual Wan Vpn profile parameters Vpn profile generation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VpnProfileResponseInner>, VpnProfileResponseInner>
        beginGeneratevirtualwanvpnserverconfigurationvpnprofile(
            String resourceGroupName, String virtualWanName, VirtualWanVpnProfileParameters vpnClientParams);

    /**
     * Generates a unique VPN profile for P2S clients for VirtualWan and associated VpnServerConfiguration combination
     * in the specified resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param vpnClientParams Virtual Wan Vpn profile parameters Vpn profile generation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VpnProfileResponseInner>, VpnProfileResponseInner>
        beginGeneratevirtualwanvpnserverconfigurationvpnprofile(
            String resourceGroupName,
            String virtualWanName,
            VirtualWanVpnProfileParameters vpnClientParams,
            Context context);

    /**
     * Generates a unique VPN profile for P2S clients for VirtualWan and associated VpnServerConfiguration combination
     * in the specified resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param vpnClientParams Virtual Wan Vpn profile parameters Vpn profile generation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnProfileResponseInner generatevirtualwanvpnserverconfigurationvpnprofile(
        String resourceGroupName, String virtualWanName, VirtualWanVpnProfileParameters vpnClientParams);

    /**
     * Generates a unique VPN profile for P2S clients for VirtualWan and associated VpnServerConfiguration combination
     * in the specified resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param vpnClientParams Virtual Wan Vpn profile parameters Vpn profile generation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpn Profile Response for package generation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnProfileResponseInner generatevirtualwanvpnserverconfigurationvpnprofile(
        String resourceGroupName,
        String virtualWanName,
        VirtualWanVpnProfileParameters vpnClientParams,
        Context context);
}
