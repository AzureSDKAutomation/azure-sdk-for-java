// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.generated.fluent.ManagedClustersClient;
import com.azure.resourcemanager.containerservice.generated.fluent.models.CredentialResultsInner;
import com.azure.resourcemanager.containerservice.generated.fluent.models.ManagedClusterAccessProfileInner;
import com.azure.resourcemanager.containerservice.generated.fluent.models.ManagedClusterInner;
import com.azure.resourcemanager.containerservice.generated.fluent.models.ManagedClusterUpgradeProfileInner;
import com.azure.resourcemanager.containerservice.generated.fluent.models.OSOptionProfileInner;
import com.azure.resourcemanager.containerservice.generated.fluent.models.OutboundEnvironmentEndpointInner;
import com.azure.resourcemanager.containerservice.generated.fluent.models.RunCommandResultInner;
import com.azure.resourcemanager.containerservice.generated.models.CredentialResults;
import com.azure.resourcemanager.containerservice.generated.models.ManagedCluster;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterAadProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterAccessProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterServicePrincipalProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusterUpgradeProfile;
import com.azure.resourcemanager.containerservice.generated.models.ManagedClusters;
import com.azure.resourcemanager.containerservice.generated.models.OSOptionProfile;
import com.azure.resourcemanager.containerservice.generated.models.OutboundEnvironmentEndpoint;
import com.azure.resourcemanager.containerservice.generated.models.RunCommandRequest;
import com.azure.resourcemanager.containerservice.generated.models.RunCommandResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagedClustersImpl implements ManagedClusters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClustersImpl.class);

    private final ManagedClustersClient innerClient;

    private final com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager;

    public ManagedClustersImpl(
        ManagedClustersClient innerClient,
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OSOptionProfile getOSOptions(String location) {
        OSOptionProfileInner inner = this.serviceClient().getOSOptions(location);
        if (inner != null) {
            return new OSOptionProfileImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OSOptionProfile> getOSOptionsWithResponse(String location, String resourceType, Context context) {
        Response<OSOptionProfileInner> inner =
            this.serviceClient().getOSOptionsWithResponse(location, resourceType, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OSOptionProfileImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ManagedCluster> list() {
        PagedIterable<ManagedClusterInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ManagedClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedCluster> list(Context context) {
        PagedIterable<ManagedClusterInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ManagedClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedCluster> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ManagedClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ManagedClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedCluster> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ManagedClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ManagedClusterImpl(inner1, this.manager()));
    }

    public ManagedClusterUpgradeProfile getUpgradeProfile(String resourceGroupName, String resourceName) {
        ManagedClusterUpgradeProfileInner inner =
            this.serviceClient().getUpgradeProfile(resourceGroupName, resourceName);
        if (inner != null) {
            return new ManagedClusterUpgradeProfileImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagedClusterUpgradeProfile> getUpgradeProfileWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<ManagedClusterUpgradeProfileInner> inner =
            this.serviceClient().getUpgradeProfileWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedClusterUpgradeProfileImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedClusterAccessProfile getAccessProfile(
        String resourceGroupName, String resourceName, String roleName) {
        ManagedClusterAccessProfileInner inner =
            this.serviceClient().getAccessProfile(resourceGroupName, resourceName, roleName);
        if (inner != null) {
            return new ManagedClusterAccessProfileImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagedClusterAccessProfile> getAccessProfileWithResponse(
        String resourceGroupName, String resourceName, String roleName, Context context) {
        Response<ManagedClusterAccessProfileInner> inner =
            this.serviceClient().getAccessProfileWithResponse(resourceGroupName, resourceName, roleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedClusterAccessProfileImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CredentialResults listClusterAdminCredentials(String resourceGroupName, String resourceName) {
        CredentialResultsInner inner =
            this.serviceClient().listClusterAdminCredentials(resourceGroupName, resourceName);
        if (inner != null) {
            return new CredentialResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CredentialResults> listClusterAdminCredentialsWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<CredentialResultsInner> inner =
            this.serviceClient().listClusterAdminCredentialsWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CredentialResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CredentialResults listClusterUserCredentials(String resourceGroupName, String resourceName) {
        CredentialResultsInner inner = this.serviceClient().listClusterUserCredentials(resourceGroupName, resourceName);
        if (inner != null) {
            return new CredentialResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CredentialResults> listClusterUserCredentialsWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<CredentialResultsInner> inner =
            this.serviceClient().listClusterUserCredentialsWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CredentialResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CredentialResults listClusterMonitoringUserCredentials(String resourceGroupName, String resourceName) {
        CredentialResultsInner inner =
            this.serviceClient().listClusterMonitoringUserCredentials(resourceGroupName, resourceName);
        if (inner != null) {
            return new CredentialResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CredentialResults> listClusterMonitoringUserCredentialsWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<CredentialResultsInner> inner =
            this
                .serviceClient()
                .listClusterMonitoringUserCredentialsWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CredentialResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedCluster getByResourceGroup(String resourceGroupName, String resourceName) {
        ManagedClusterInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, resourceName);
        if (inner != null) {
            return new ManagedClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagedCluster> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<ManagedClusterInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedClusterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String resourceName) {
        this.serviceClient().delete(resourceGroupName, resourceName);
    }

    public void delete(String resourceGroupName, String resourceName, Context context) {
        this.serviceClient().delete(resourceGroupName, resourceName, context);
    }

    public void resetServicePrincipalProfile(
        String resourceGroupName, String resourceName, ManagedClusterServicePrincipalProfile parameters) {
        this.serviceClient().resetServicePrincipalProfile(resourceGroupName, resourceName, parameters);
    }

    public void resetServicePrincipalProfile(
        String resourceGroupName,
        String resourceName,
        ManagedClusterServicePrincipalProfile parameters,
        Context context) {
        this.serviceClient().resetServicePrincipalProfile(resourceGroupName, resourceName, parameters, context);
    }

    public void resetAadProfile(String resourceGroupName, String resourceName, ManagedClusterAadProfile parameters) {
        this.serviceClient().resetAadProfile(resourceGroupName, resourceName, parameters);
    }

    public void resetAadProfile(
        String resourceGroupName, String resourceName, ManagedClusterAadProfile parameters, Context context) {
        this.serviceClient().resetAadProfile(resourceGroupName, resourceName, parameters, context);
    }

    public void rotateClusterCertificates(String resourceGroupName, String resourceName) {
        this.serviceClient().rotateClusterCertificates(resourceGroupName, resourceName);
    }

    public void rotateClusterCertificates(String resourceGroupName, String resourceName, Context context) {
        this.serviceClient().rotateClusterCertificates(resourceGroupName, resourceName, context);
    }

    public void stop(String resourceGroupName, String resourceName) {
        this.serviceClient().stop(resourceGroupName, resourceName);
    }

    public void stop(String resourceGroupName, String resourceName, Context context) {
        this.serviceClient().stop(resourceGroupName, resourceName, context);
    }

    public void start(String resourceGroupName, String resourceName) {
        this.serviceClient().start(resourceGroupName, resourceName);
    }

    public void start(String resourceGroupName, String resourceName, Context context) {
        this.serviceClient().start(resourceGroupName, resourceName, context);
    }

    public RunCommandResult runCommand(
        String resourceGroupName, String resourceName, RunCommandRequest requestPayload) {
        RunCommandResultInner inner = this.serviceClient().runCommand(resourceGroupName, resourceName, requestPayload);
        if (inner != null) {
            return new RunCommandResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public RunCommandResult runCommand(
        String resourceGroupName, String resourceName, RunCommandRequest requestPayload, Context context) {
        RunCommandResultInner inner =
            this.serviceClient().runCommand(resourceGroupName, resourceName, requestPayload, context);
        if (inner != null) {
            return new RunCommandResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public RunCommandResult getCommandResult(String resourceGroupName, String resourceName, String commandId) {
        RunCommandResultInner inner = this.serviceClient().getCommandResult(resourceGroupName, resourceName, commandId);
        if (inner != null) {
            return new RunCommandResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RunCommandResult> getCommandResultWithResponse(
        String resourceGroupName, String resourceName, String commandId, Context context) {
        Response<RunCommandResultInner> inner =
            this.serviceClient().getCommandResultWithResponse(resourceGroupName, resourceName, commandId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RunCommandResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<OutboundEnvironmentEndpoint> listOutboundNetworkDependenciesEndpoints(
        String resourceGroupName, String resourceName) {
        PagedIterable<OutboundEnvironmentEndpointInner> inner =
            this.serviceClient().listOutboundNetworkDependenciesEndpoints(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new OutboundEnvironmentEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<OutboundEnvironmentEndpoint> listOutboundNetworkDependenciesEndpoints(
        String resourceGroupName, String resourceName, Context context) {
        PagedIterable<OutboundEnvironmentEndpointInner> inner =
            this.serviceClient().listOutboundNetworkDependenciesEndpoints(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new OutboundEnvironmentEndpointImpl(inner1, this.manager()));
    }

    public ManagedCluster getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "managedClusters");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    public Response<ManagedCluster> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "managedClusters");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
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
        String resourceName = Utils.getValueFromIdByName(id, "managedClusters");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        this.delete(resourceGroupName, resourceName, Context.NONE);
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
        String resourceName = Utils.getValueFromIdByName(id, "managedClusters");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        this.delete(resourceGroupName, resourceName, context);
    }

    private ManagedClustersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager() {
        return this.serviceManager;
    }

    public ManagedClusterImpl define(String name) {
        return new ManagedClusterImpl(name, this.manager());
    }
}
