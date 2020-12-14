// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.CdnManager;
import com.azure.resourcemanager.cdn.generated.fluent.ProfilesClient;
import com.azure.resourcemanager.cdn.generated.fluent.models.ProfileInner;
import com.azure.resourcemanager.cdn.generated.fluent.models.ResourceUsageInner;
import com.azure.resourcemanager.cdn.generated.fluent.models.SsoUriInner;
import com.azure.resourcemanager.cdn.generated.fluent.models.SupportedOptimizationTypesListResultInner;
import com.azure.resourcemanager.cdn.generated.models.Profile;
import com.azure.resourcemanager.cdn.generated.models.Profiles;
import com.azure.resourcemanager.cdn.generated.models.ResourceUsage;
import com.azure.resourcemanager.cdn.generated.models.SsoUri;
import com.azure.resourcemanager.cdn.generated.models.SupportedOptimizationTypesListResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProfilesImpl implements Profiles {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProfilesImpl.class);

    private final ProfilesClient innerClient;

    private final CdnManager serviceManager;

    public ProfilesImpl(ProfilesClient innerClient, CdnManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Profile> list() {
        PagedIterable<ProfileInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ProfileImpl(inner1, this.manager()));
    }

    public PagedIterable<Profile> list(Context context) {
        PagedIterable<ProfileInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ProfileImpl(inner1, this.manager()));
    }

    public PagedIterable<Profile> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ProfileInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new ProfileImpl(inner1, this.manager()));
    }

    public PagedIterable<Profile> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ProfileInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new ProfileImpl(inner1, this.manager()));
    }

    public Profile getByResourceGroup(String resourceGroupName, String profileName) {
        ProfileInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, profileName);
        if (inner != null) {
            return new ProfileImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Profile> getByResourceGroupWithResponse(
        String resourceGroupName, String profileName, Context context) {
        Response<ProfileInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, profileName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProfileImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String profileName) {
        this.serviceClient().delete(resourceGroupName, profileName);
    }

    public void delete(String resourceGroupName, String profileName, Context context) {
        this.serviceClient().delete(resourceGroupName, profileName, context);
    }

    public SsoUri generateSsoUri(String resourceGroupName, String profileName) {
        SsoUriInner inner = this.serviceClient().generateSsoUri(resourceGroupName, profileName);
        if (inner != null) {
            return new SsoUriImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SsoUri> generateSsoUriWithResponse(String resourceGroupName, String profileName, Context context) {
        Response<SsoUriInner> inner =
            this.serviceClient().generateSsoUriWithResponse(resourceGroupName, profileName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SsoUriImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SupportedOptimizationTypesListResult listSupportedOptimizationTypes(
        String resourceGroupName, String profileName) {
        SupportedOptimizationTypesListResultInner inner =
            this.serviceClient().listSupportedOptimizationTypes(resourceGroupName, profileName);
        if (inner != null) {
            return new SupportedOptimizationTypesListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SupportedOptimizationTypesListResult> listSupportedOptimizationTypesWithResponse(
        String resourceGroupName, String profileName, Context context) {
        Response<SupportedOptimizationTypesListResultInner> inner =
            this.serviceClient().listSupportedOptimizationTypesWithResponse(resourceGroupName, profileName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SupportedOptimizationTypesListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ResourceUsage> listResourceUsage(String resourceGroupName, String profileName) {
        PagedIterable<ResourceUsageInner> inner =
            this.serviceClient().listResourceUsage(resourceGroupName, profileName);
        return inner.mapPage(inner1 -> new ResourceUsageImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceUsage> listResourceUsage(
        String resourceGroupName, String profileName, Context context) {
        PagedIterable<ResourceUsageInner> inner =
            this.serviceClient().listResourceUsage(resourceGroupName, profileName, context);
        return inner.mapPage(inner1 -> new ResourceUsageImpl(inner1, this.manager()));
    }

    public Profile getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, profileName, Context.NONE).getValue();
    }

    public Response<Profile> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, profileName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        this.delete(resourceGroupName, profileName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        this.delete(resourceGroupName, profileName, context);
    }

    private ProfilesClient serviceClient() {
        return this.innerClient;
    }

    private CdnManager manager() {
        return this.serviceManager;
    }

    public ProfileImpl define(String name) {
        return new ProfileImpl(name, this.manager());
    }
}
