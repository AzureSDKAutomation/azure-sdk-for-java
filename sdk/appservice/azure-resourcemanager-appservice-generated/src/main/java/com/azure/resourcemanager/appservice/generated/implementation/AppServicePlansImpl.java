// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.AppServicePlansClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServicePlanInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.CapabilityInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.CsmUsageQuotaInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.HybridConnectionInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.HybridConnectionKeyInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.HybridConnectionLimitsInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetGatewayInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetInfoInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetRouteInner;
import com.azure.resourcemanager.appservice.generated.models.AppServicePlan;
import com.azure.resourcemanager.appservice.generated.models.AppServicePlans;
import com.azure.resourcemanager.appservice.generated.models.Capability;
import com.azure.resourcemanager.appservice.generated.models.CsmUsageQuota;
import com.azure.resourcemanager.appservice.generated.models.HybridConnection;
import com.azure.resourcemanager.appservice.generated.models.HybridConnectionKey;
import com.azure.resourcemanager.appservice.generated.models.HybridConnectionLimits;
import com.azure.resourcemanager.appservice.generated.models.Site;
import com.azure.resourcemanager.appservice.generated.models.VnetGateway;
import com.azure.resourcemanager.appservice.generated.models.VnetInfo;
import com.azure.resourcemanager.appservice.generated.models.VnetRoute;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class AppServicePlansImpl implements AppServicePlans {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppServicePlansImpl.class);

    private final AppServicePlansClient innerClient;

    private final WebSiteManager serviceManager;

    public AppServicePlansImpl(AppServicePlansClient innerClient, WebSiteManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AppServicePlan> list() {
        PagedIterable<AppServicePlanInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new AppServicePlanImpl(inner1, this.manager()));
    }

    public PagedIterable<AppServicePlan> list(Boolean detailed, Context context) {
        PagedIterable<AppServicePlanInner> inner = this.serviceClient().list(detailed, context);
        return inner.mapPage(inner1 -> new AppServicePlanImpl(inner1, this.manager()));
    }

    public PagedIterable<AppServicePlan> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AppServicePlanInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new AppServicePlanImpl(inner1, this.manager()));
    }

    public PagedIterable<AppServicePlan> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AppServicePlanInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new AppServicePlanImpl(inner1, this.manager()));
    }

    public AppServicePlan getByResourceGroup(String resourceGroupName, String name) {
        AppServicePlanInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, name);
        if (inner != null) {
            return new AppServicePlanImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AppServicePlan> getByResourceGroupWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<AppServicePlanInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AppServicePlanImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String name) {
        this.serviceClient().delete(resourceGroupName, name);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String name, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, name, context);
    }

    public List<Capability> listCapabilities(String resourceGroupName, String name) {
        List<CapabilityInner> inner = this.serviceClient().listCapabilities(resourceGroupName, name);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new CapabilityImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<Capability>> listCapabilitiesWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<List<CapabilityInner>> inner =
            this.serviceClient().listCapabilitiesWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new CapabilityImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public HybridConnection getHybridConnection(
        String resourceGroupName, String name, String namespaceName, String relayName) {
        HybridConnectionInner inner =
            this.serviceClient().getHybridConnection(resourceGroupName, name, namespaceName, relayName);
        if (inner != null) {
            return new HybridConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<HybridConnection> getHybridConnectionWithResponse(
        String resourceGroupName, String name, String namespaceName, String relayName, Context context) {
        Response<HybridConnectionInner> inner =
            this
                .serviceClient()
                .getHybridConnectionWithResponse(resourceGroupName, name, namespaceName, relayName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new HybridConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteHybridConnection(String resourceGroupName, String name, String namespaceName, String relayName) {
        this.serviceClient().deleteHybridConnection(resourceGroupName, name, namespaceName, relayName);
    }

    public Response<Void> deleteHybridConnectionWithResponse(
        String resourceGroupName, String name, String namespaceName, String relayName, Context context) {
        return this
            .serviceClient()
            .deleteHybridConnectionWithResponse(resourceGroupName, name, namespaceName, relayName, context);
    }

    public HybridConnectionKey listHybridConnectionKeys(
        String resourceGroupName, String name, String namespaceName, String relayName) {
        HybridConnectionKeyInner inner =
            this.serviceClient().listHybridConnectionKeys(resourceGroupName, name, namespaceName, relayName);
        if (inner != null) {
            return new HybridConnectionKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<HybridConnectionKey> listHybridConnectionKeysWithResponse(
        String resourceGroupName, String name, String namespaceName, String relayName, Context context) {
        Response<HybridConnectionKeyInner> inner =
            this
                .serviceClient()
                .listHybridConnectionKeysWithResponse(resourceGroupName, name, namespaceName, relayName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new HybridConnectionKeyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<String> listWebAppsByHybridConnection(
        String resourceGroupName, String name, String namespaceName, String relayName) {
        return this.serviceClient().listWebAppsByHybridConnection(resourceGroupName, name, namespaceName, relayName);
    }

    public PagedIterable<String> listWebAppsByHybridConnection(
        String resourceGroupName, String name, String namespaceName, String relayName, Context context) {
        return this
            .serviceClient()
            .listWebAppsByHybridConnection(resourceGroupName, name, namespaceName, relayName, context);
    }

    public HybridConnectionLimits getHybridConnectionPlanLimit(String resourceGroupName, String name) {
        HybridConnectionLimitsInner inner = this.serviceClient().getHybridConnectionPlanLimit(resourceGroupName, name);
        if (inner != null) {
            return new HybridConnectionLimitsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<HybridConnectionLimits> getHybridConnectionPlanLimitWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<HybridConnectionLimitsInner> inner =
            this.serviceClient().getHybridConnectionPlanLimitWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new HybridConnectionLimitsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<HybridConnection> listHybridConnections(String resourceGroupName, String name) {
        PagedIterable<HybridConnectionInner> inner =
            this.serviceClient().listHybridConnections(resourceGroupName, name);
        return inner.mapPage(inner1 -> new HybridConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<HybridConnection> listHybridConnections(
        String resourceGroupName, String name, Context context) {
        PagedIterable<HybridConnectionInner> inner =
            this.serviceClient().listHybridConnections(resourceGroupName, name, context);
        return inner.mapPage(inner1 -> new HybridConnectionImpl(inner1, this.manager()));
    }

    public void restartWebApps(String resourceGroupName, String name) {
        this.serviceClient().restartWebApps(resourceGroupName, name);
    }

    public Response<Void> restartWebAppsWithResponse(
        String resourceGroupName, String name, Boolean softRestart, Context context) {
        return this.serviceClient().restartWebAppsWithResponse(resourceGroupName, name, softRestart, context);
    }

    public PagedIterable<Site> listWebApps(String resourceGroupName, String name) {
        PagedIterable<SiteInner> inner = this.serviceClient().listWebApps(resourceGroupName, name);
        return inner.mapPage(inner1 -> new SiteImpl(inner1, this.manager()));
    }

    public PagedIterable<Site> listWebApps(
        String resourceGroupName, String name, String skipToken, String filter, String top, Context context) {
        PagedIterable<SiteInner> inner =
            this.serviceClient().listWebApps(resourceGroupName, name, skipToken, filter, top, context);
        return inner.mapPage(inner1 -> new SiteImpl(inner1, this.manager()));
    }

    public Object getServerFarmSkus(String resourceGroupName, String name) {
        return this.serviceClient().getServerFarmSkus(resourceGroupName, name);
    }

    public Response<Object> getServerFarmSkusWithResponse(String resourceGroupName, String name, Context context) {
        return this.serviceClient().getServerFarmSkusWithResponse(resourceGroupName, name, context);
    }

    public PagedIterable<CsmUsageQuota> listUsages(String resourceGroupName, String name) {
        PagedIterable<CsmUsageQuotaInner> inner = this.serviceClient().listUsages(resourceGroupName, name);
        return inner.mapPage(inner1 -> new CsmUsageQuotaImpl(inner1, this.manager()));
    }

    public PagedIterable<CsmUsageQuota> listUsages(
        String resourceGroupName, String name, String filter, Context context) {
        PagedIterable<CsmUsageQuotaInner> inner =
            this.serviceClient().listUsages(resourceGroupName, name, filter, context);
        return inner.mapPage(inner1 -> new CsmUsageQuotaImpl(inner1, this.manager()));
    }

    public List<VnetInfo> listVnets(String resourceGroupName, String name) {
        List<VnetInfoInner> inner = this.serviceClient().listVnets(resourceGroupName, name);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VnetInfoImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<VnetInfo>> listVnetsWithResponse(String resourceGroupName, String name, Context context) {
        Response<List<VnetInfoInner>> inner =
            this.serviceClient().listVnetsWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new VnetInfoImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public VnetInfo getVnetFromServerFarm(String resourceGroupName, String name, String vnetName) {
        VnetInfoInner inner = this.serviceClient().getVnetFromServerFarm(resourceGroupName, name, vnetName);
        if (inner != null) {
            return new VnetInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VnetInfo> getVnetFromServerFarmWithResponse(
        String resourceGroupName, String name, String vnetName, Context context) {
        Response<VnetInfoInner> inner =
            this.serviceClient().getVnetFromServerFarmWithResponse(resourceGroupName, name, vnetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VnetInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VnetGateway getVnetGateway(String resourceGroupName, String name, String vnetName, String gatewayName) {
        VnetGatewayInner inner = this.serviceClient().getVnetGateway(resourceGroupName, name, vnetName, gatewayName);
        if (inner != null) {
            return new VnetGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VnetGateway> getVnetGatewayWithResponse(
        String resourceGroupName, String name, String vnetName, String gatewayName, Context context) {
        Response<VnetGatewayInner> inner =
            this.serviceClient().getVnetGatewayWithResponse(resourceGroupName, name, vnetName, gatewayName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VnetGatewayImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VnetGateway updateVnetGateway(
        String resourceGroupName,
        String name,
        String vnetName,
        String gatewayName,
        VnetGatewayInner connectionEnvelope) {
        VnetGatewayInner inner =
            this.serviceClient().updateVnetGateway(resourceGroupName, name, vnetName, gatewayName, connectionEnvelope);
        if (inner != null) {
            return new VnetGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VnetGateway> updateVnetGatewayWithResponse(
        String resourceGroupName,
        String name,
        String vnetName,
        String gatewayName,
        VnetGatewayInner connectionEnvelope,
        Context context) {
        Response<VnetGatewayInner> inner =
            this
                .serviceClient()
                .updateVnetGatewayWithResponse(
                    resourceGroupName, name, vnetName, gatewayName, connectionEnvelope, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VnetGatewayImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public List<VnetRoute> listRoutesForVnet(String resourceGroupName, String name, String vnetName) {
        List<VnetRouteInner> inner = this.serviceClient().listRoutesForVnet(resourceGroupName, name, vnetName);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VnetRouteImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<VnetRoute>> listRoutesForVnetWithResponse(
        String resourceGroupName, String name, String vnetName, Context context) {
        Response<List<VnetRouteInner>> inner =
            this.serviceClient().listRoutesForVnetWithResponse(resourceGroupName, name, vnetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new VnetRouteImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public List<VnetRoute> getRouteForVnet(String resourceGroupName, String name, String vnetName, String routeName) {
        List<VnetRouteInner> inner = this.serviceClient().getRouteForVnet(resourceGroupName, name, vnetName, routeName);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VnetRouteImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<VnetRoute>> getRouteForVnetWithResponse(
        String resourceGroupName, String name, String vnetName, String routeName, Context context) {
        Response<List<VnetRouteInner>> inner =
            this.serviceClient().getRouteForVnetWithResponse(resourceGroupName, name, vnetName, routeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new VnetRouteImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public void deleteVnetRoute(String resourceGroupName, String name, String vnetName, String routeName) {
        this.serviceClient().deleteVnetRoute(resourceGroupName, name, vnetName, routeName);
    }

    public Response<Void> deleteVnetRouteWithResponse(
        String resourceGroupName, String name, String vnetName, String routeName, Context context) {
        return this.serviceClient().deleteVnetRouteWithResponse(resourceGroupName, name, vnetName, routeName, context);
    }

    public void rebootWorker(String resourceGroupName, String name, String workerName) {
        this.serviceClient().rebootWorker(resourceGroupName, name, workerName);
    }

    public Response<Void> rebootWorkerWithResponse(
        String resourceGroupName, String name, String workerName, Context context) {
        return this.serviceClient().rebootWorkerWithResponse(resourceGroupName, name, workerName, context);
    }

    public AppServicePlan getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "serverfarms");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'serverfarms'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE).getValue();
    }

    public Response<AppServicePlan> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "serverfarms");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'serverfarms'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, name, context);
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
        String name = Utils.getValueFromIdByName(id, "serverfarms");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'serverfarms'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, name, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "serverfarms");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'serverfarms'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, name, context);
    }

    public void deleteVnetRouteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "serverfarms");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'serverfarms'.", id)));
        }
        String vnetName = Utils.getValueFromIdByName(id, "virtualNetworkConnections");
        if (vnetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualNetworkConnections'.",
                                id)));
        }
        String routeName = Utils.getValueFromIdByName(id, "routes");
        if (routeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routes'.", id)));
        }
        this.deleteVnetRouteWithResponse(resourceGroupName, name, vnetName, routeName, Context.NONE).getValue();
    }

    public Response<Void> deleteVnetRouteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "serverfarms");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'serverfarms'.", id)));
        }
        String vnetName = Utils.getValueFromIdByName(id, "virtualNetworkConnections");
        if (vnetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualNetworkConnections'.",
                                id)));
        }
        String routeName = Utils.getValueFromIdByName(id, "routes");
        if (routeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routes'.", id)));
        }
        return this.deleteVnetRouteWithResponse(resourceGroupName, name, vnetName, routeName, context);
    }

    private AppServicePlansClient serviceClient() {
        return this.innerClient;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }

    public AppServicePlanImpl define(String name) {
        return new AppServicePlanImpl(name, this.manager());
    }

    public VnetRouteImpl defineVnetRoute(String name) {
        return new VnetRouteImpl(name, this.manager());
    }
}