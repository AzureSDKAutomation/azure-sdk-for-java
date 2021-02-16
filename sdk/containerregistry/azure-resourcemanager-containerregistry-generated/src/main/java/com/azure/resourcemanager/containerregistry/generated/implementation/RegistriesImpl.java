// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager;
import com.azure.resourcemanager.containerregistry.generated.fluent.RegistriesClient;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.GenerateCredentialsResultInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RegistryInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RegistryListCredentialsResultInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RegistryNameStatusInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RegistryUsageListResultInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RunInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.SourceUploadDefinitionInner;
import com.azure.resourcemanager.containerregistry.generated.models.GenerateCredentialsParameters;
import com.azure.resourcemanager.containerregistry.generated.models.GenerateCredentialsResult;
import com.azure.resourcemanager.containerregistry.generated.models.ImportImageParameters;
import com.azure.resourcemanager.containerregistry.generated.models.PrivateLinkResource;
import com.azure.resourcemanager.containerregistry.generated.models.RegenerateCredentialParameters;
import com.azure.resourcemanager.containerregistry.generated.models.Registries;
import com.azure.resourcemanager.containerregistry.generated.models.Registry;
import com.azure.resourcemanager.containerregistry.generated.models.RegistryListCredentialsResult;
import com.azure.resourcemanager.containerregistry.generated.models.RegistryNameCheckRequest;
import com.azure.resourcemanager.containerregistry.generated.models.RegistryNameStatus;
import com.azure.resourcemanager.containerregistry.generated.models.RegistryUsageListResult;
import com.azure.resourcemanager.containerregistry.generated.models.Run;
import com.azure.resourcemanager.containerregistry.generated.models.RunRequest;
import com.azure.resourcemanager.containerregistry.generated.models.SourceUploadDefinition;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RegistriesImpl implements Registries {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegistriesImpl.class);

    private final RegistriesClient innerClient;

    private final ContainerRegistryManager serviceManager;

    public RegistriesImpl(RegistriesClient innerClient, ContainerRegistryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void importImage(String resourceGroupName, String registryName, ImportImageParameters parameters) {
        this.serviceClient().importImage(resourceGroupName, registryName, parameters);
    }

    public void importImage(
        String resourceGroupName, String registryName, ImportImageParameters parameters, Context context) {
        this.serviceClient().importImage(resourceGroupName, registryName, parameters, context);
    }

    public RegistryNameStatus checkNameAvailability(RegistryNameCheckRequest registryNameCheckRequest) {
        RegistryNameStatusInner inner = this.serviceClient().checkNameAvailability(registryNameCheckRequest);
        if (inner != null) {
            return new RegistryNameStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RegistryNameStatus> checkNameAvailabilityWithResponse(
        RegistryNameCheckRequest registryNameCheckRequest, Context context) {
        Response<RegistryNameStatusInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(registryNameCheckRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RegistryNameStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Registry getByResourceGroup(String resourceGroupName, String registryName) {
        RegistryInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, registryName);
        if (inner != null) {
            return new RegistryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Registry> getByResourceGroupWithResponse(
        String resourceGroupName, String registryName, Context context) {
        Response<RegistryInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, registryName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RegistryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String registryName) {
        this.serviceClient().delete(resourceGroupName, registryName);
    }

    public void delete(String resourceGroupName, String registryName, Context context) {
        this.serviceClient().delete(resourceGroupName, registryName, context);
    }

    public PagedIterable<Registry> listByResourceGroup(String resourceGroupName) {
        PagedIterable<RegistryInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new RegistryImpl(inner1, this.manager()));
    }

    public PagedIterable<Registry> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<RegistryInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new RegistryImpl(inner1, this.manager()));
    }

    public PagedIterable<Registry> list() {
        PagedIterable<RegistryInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new RegistryImpl(inner1, this.manager()));
    }

    public PagedIterable<Registry> list(Context context) {
        PagedIterable<RegistryInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new RegistryImpl(inner1, this.manager()));
    }

    public RegistryListCredentialsResult listCredentials(String resourceGroupName, String registryName) {
        RegistryListCredentialsResultInner inner =
            this.serviceClient().listCredentials(resourceGroupName, registryName);
        if (inner != null) {
            return new RegistryListCredentialsResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RegistryListCredentialsResult> listCredentialsWithResponse(
        String resourceGroupName, String registryName, Context context) {
        Response<RegistryListCredentialsResultInner> inner =
            this.serviceClient().listCredentialsWithResponse(resourceGroupName, registryName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RegistryListCredentialsResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RegistryListCredentialsResult regenerateCredential(
        String resourceGroupName, String registryName, RegenerateCredentialParameters regenerateCredentialParameters) {
        RegistryListCredentialsResultInner inner =
            this.serviceClient().regenerateCredential(resourceGroupName, registryName, regenerateCredentialParameters);
        if (inner != null) {
            return new RegistryListCredentialsResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RegistryListCredentialsResult> regenerateCredentialWithResponse(
        String resourceGroupName,
        String registryName,
        RegenerateCredentialParameters regenerateCredentialParameters,
        Context context) {
        Response<RegistryListCredentialsResultInner> inner =
            this
                .serviceClient()
                .regenerateCredentialWithResponse(
                    resourceGroupName, registryName, regenerateCredentialParameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RegistryListCredentialsResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RegistryUsageListResult listUsages(String resourceGroupName, String registryName) {
        RegistryUsageListResultInner inner = this.serviceClient().listUsages(resourceGroupName, registryName);
        if (inner != null) {
            return new RegistryUsageListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RegistryUsageListResult> listUsagesWithResponse(
        String resourceGroupName, String registryName, Context context) {
        Response<RegistryUsageListResultInner> inner =
            this.serviceClient().listUsagesWithResponse(resourceGroupName, registryName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RegistryUsageListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<PrivateLinkResource> listPrivateLinkResources(String resourceGroupName, String registryName) {
        PagedIterable<PrivateLinkResourceInner> inner =
            this.serviceClient().listPrivateLinkResources(resourceGroupName, registryName);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkResource> listPrivateLinkResources(
        String resourceGroupName, String registryName, Context context) {
        PagedIterable<PrivateLinkResourceInner> inner =
            this.serviceClient().listPrivateLinkResources(resourceGroupName, registryName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public GenerateCredentialsResult generateCredentials(
        String resourceGroupName, String registryName, GenerateCredentialsParameters generateCredentialsParameters) {
        GenerateCredentialsResultInner inner =
            this.serviceClient().generateCredentials(resourceGroupName, registryName, generateCredentialsParameters);
        if (inner != null) {
            return new GenerateCredentialsResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GenerateCredentialsResult generateCredentials(
        String resourceGroupName,
        String registryName,
        GenerateCredentialsParameters generateCredentialsParameters,
        Context context) {
        GenerateCredentialsResultInner inner =
            this
                .serviceClient()
                .generateCredentials(resourceGroupName, registryName, generateCredentialsParameters, context);
        if (inner != null) {
            return new GenerateCredentialsResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Run scheduleRun(String resourceGroupName, String registryName, RunRequest runRequest) {
        RunInner inner = this.serviceClient().scheduleRun(resourceGroupName, registryName, runRequest);
        if (inner != null) {
            return new RunImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Run scheduleRun(String resourceGroupName, String registryName, RunRequest runRequest, Context context) {
        RunInner inner = this.serviceClient().scheduleRun(resourceGroupName, registryName, runRequest, context);
        if (inner != null) {
            return new RunImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SourceUploadDefinition getBuildSourceUploadUrl(String resourceGroupName, String registryName) {
        SourceUploadDefinitionInner inner =
            this.serviceClient().getBuildSourceUploadUrl(resourceGroupName, registryName);
        if (inner != null) {
            return new SourceUploadDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SourceUploadDefinition> getBuildSourceUploadUrlWithResponse(
        String resourceGroupName, String registryName, Context context) {
        Response<SourceUploadDefinitionInner> inner =
            this.serviceClient().getBuildSourceUploadUrlWithResponse(resourceGroupName, registryName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SourceUploadDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Registry getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, registryName, Context.NONE).getValue();
    }

    public Response<Registry> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, registryName, context);
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
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        this.delete(resourceGroupName, registryName, Context.NONE);
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
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        this.delete(resourceGroupName, registryName, context);
    }

    private RegistriesClient serviceClient() {
        return this.innerClient;
    }

    private ContainerRegistryManager manager() {
        return this.serviceManager;
    }

    public RegistryImpl define(String name) {
        return new RegistryImpl(name, this.manager());
    }
}
