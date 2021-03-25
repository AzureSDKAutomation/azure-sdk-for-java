// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationFabricsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.FabricInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Fabric;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.FailoverProcessServerRequest;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RenewCertificateInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationFabrics;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ReplicationFabricsImpl implements ReplicationFabrics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationFabricsImpl.class);

    private final ReplicationFabricsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public ReplicationFabricsImpl(
        ReplicationFabricsClient innerClient,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Fabric> list(String resourceName, String resourceGroupName) {
        PagedIterable<FabricInner> inner = this.serviceClient().list(resourceName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new FabricImpl(inner1, this.manager()));
    }

    public PagedIterable<Fabric> list(String resourceName, String resourceGroupName, Context context) {
        PagedIterable<FabricInner> inner = this.serviceClient().list(resourceName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new FabricImpl(inner1, this.manager()));
    }

    public Fabric get(String resourceName, String resourceGroupName, String fabricName) {
        FabricInner inner = this.serviceClient().get(resourceName, resourceGroupName, fabricName);
        if (inner != null) {
            return new FabricImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Fabric> getWithResponse(
        String resourceName, String resourceGroupName, String fabricName, Context context) {
        Response<FabricInner> inner =
            this.serviceClient().getWithResponse(resourceName, resourceGroupName, fabricName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FabricImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void purge(String resourceName, String resourceGroupName, String fabricName) {
        this.serviceClient().purge(resourceName, resourceGroupName, fabricName);
    }

    public void purge(String resourceName, String resourceGroupName, String fabricName, Context context) {
        this.serviceClient().purge(resourceName, resourceGroupName, fabricName, context);
    }

    public Fabric checkConsistency(String resourceName, String resourceGroupName, String fabricName) {
        FabricInner inner = this.serviceClient().checkConsistency(resourceName, resourceGroupName, fabricName);
        if (inner != null) {
            return new FabricImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Fabric checkConsistency(String resourceName, String resourceGroupName, String fabricName, Context context) {
        FabricInner inner = this.serviceClient().checkConsistency(resourceName, resourceGroupName, fabricName, context);
        if (inner != null) {
            return new FabricImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void migrateToAad(String resourceName, String resourceGroupName, String fabricName) {
        this.serviceClient().migrateToAad(resourceName, resourceGroupName, fabricName);
    }

    public void migrateToAad(String resourceName, String resourceGroupName, String fabricName, Context context) {
        this.serviceClient().migrateToAad(resourceName, resourceGroupName, fabricName, context);
    }

    public Fabric reassociateGateway(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        FailoverProcessServerRequest failoverProcessServerRequest) {
        FabricInner inner =
            this
                .serviceClient()
                .reassociateGateway(resourceName, resourceGroupName, fabricName, failoverProcessServerRequest);
        if (inner != null) {
            return new FabricImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Fabric reassociateGateway(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        FailoverProcessServerRequest failoverProcessServerRequest,
        Context context) {
        FabricInner inner =
            this
                .serviceClient()
                .reassociateGateway(resourceName, resourceGroupName, fabricName, failoverProcessServerRequest, context);
        if (inner != null) {
            return new FabricImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceName, String resourceGroupName, String fabricName) {
        this.serviceClient().delete(resourceName, resourceGroupName, fabricName);
    }

    public void delete(String resourceName, String resourceGroupName, String fabricName, Context context) {
        this.serviceClient().delete(resourceName, resourceGroupName, fabricName, context);
    }

    public Fabric renewCertificate(
        String resourceName, String resourceGroupName, String fabricName, RenewCertificateInput renewCertificate) {
        FabricInner inner =
            this.serviceClient().renewCertificate(resourceName, resourceGroupName, fabricName, renewCertificate);
        if (inner != null) {
            return new FabricImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Fabric renewCertificate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        RenewCertificateInput renewCertificate,
        Context context) {
        FabricInner inner =
            this
                .serviceClient()
                .renewCertificate(resourceName, resourceGroupName, fabricName, renewCertificate, context);
        if (inner != null) {
            return new FabricImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Fabric getById(String id) {
        String resourceName = Utils.getValueFromIdByName(id, "vaults");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fabricName = Utils.getValueFromIdByName(id, "replicationFabrics");
        if (fabricName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationFabrics'.", id)));
        }
        return this.getWithResponse(resourceName, resourceGroupName, fabricName, Context.NONE).getValue();
    }

    public Response<Fabric> getByIdWithResponse(String id, Context context) {
        String resourceName = Utils.getValueFromIdByName(id, "vaults");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fabricName = Utils.getValueFromIdByName(id, "replicationFabrics");
        if (fabricName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationFabrics'.", id)));
        }
        return this.getWithResponse(resourceName, resourceGroupName, fabricName, context);
    }

    private ReplicationFabricsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    public FabricImpl define(String name) {
        return new FabricImpl(name, this.manager());
    }
}
