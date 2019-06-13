/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import com.microsoft.azure.management.network.v2019_04_01.ConnectionMonitorResult;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.network.v2019_04_01.ConnectionMonitorSource;
import com.microsoft.azure.management.network.v2019_04_01.ConnectionMonitorDestination;
import com.microsoft.azure.management.network.v2019_04_01.ProvisioningState;
import org.joda.time.DateTime;
import rx.functions.Func1;

class ConnectionMonitorResultImpl extends CreatableUpdatableImpl<ConnectionMonitorResult, ConnectionMonitorResultInner, ConnectionMonitorResultImpl> implements ConnectionMonitorResult, ConnectionMonitorResult.Definition, ConnectionMonitorResult.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String networkWatcherName;
    private String connectionMonitorName;
    private ConnectionMonitorInner createOrUpdateParameter;

    ConnectionMonitorResultImpl(String name, NetworkManager manager) {
        super(name, new ConnectionMonitorResultInner());
        this.manager = manager;
        // Set resource name
        this.connectionMonitorName = name;
        //
        this.createOrUpdateParameter = new ConnectionMonitorInner();
    }

    ConnectionMonitorResultImpl(ConnectionMonitorResultInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.connectionMonitorName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.networkWatcherName = IdParsingUtils.getValueFromIdByName(inner.id(), "networkWatchers");
        this.connectionMonitorName = IdParsingUtils.getValueFromIdByName(inner.id(), "connectionMonitors");
        //
        this.createOrUpdateParameter = new ConnectionMonitorInner();
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ConnectionMonitorResult> createResourceAsync() {
        ConnectionMonitorsInner client = this.manager().inner().connectionMonitors();
        return client.createOrUpdateAsync(this.resourceGroupName, this.networkWatcherName, this.connectionMonitorName, this.createOrUpdateParameter)
            .map(new Func1<ConnectionMonitorResultInner, ConnectionMonitorResultInner>() {
               @Override
               public ConnectionMonitorResultInner call(ConnectionMonitorResultInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ConnectionMonitorResult> updateResourceAsync() {
        ConnectionMonitorsInner client = this.manager().inner().connectionMonitors();
        return client.createOrUpdateAsync(this.resourceGroupName, this.networkWatcherName, this.connectionMonitorName, this.createOrUpdateParameter)
            .map(new Func1<ConnectionMonitorResultInner, ConnectionMonitorResultInner>() {
               @Override
               public ConnectionMonitorResultInner call(ConnectionMonitorResultInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ConnectionMonitorResultInner> getInnerAsync() {
        ConnectionMonitorsInner client = this.manager().inner().connectionMonitors();
        return client.getAsync(this.resourceGroupName, this.networkWatcherName, this.connectionMonitorName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new ConnectionMonitorInner();
    }

    @Override
    public Boolean autoStart() {
        return this.inner().autoStart();
    }

    @Override
    public ConnectionMonitorDestination destination() {
        return this.inner().destination();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public Integer monitoringIntervalInSeconds() {
        return this.inner().monitoringIntervalInSeconds();
    }

    @Override
    public String monitoringStatus() {
        return this.inner().monitoringStatus();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ConnectionMonitorSource source() {
        return this.inner().source();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ConnectionMonitorResultImpl withExistingNetworkWatcher(String resourceGroupName, String networkWatcherName) {
        this.resourceGroupName = resourceGroupName;
        this.networkWatcherName = networkWatcherName;
        return this;
    }

    @Override
    public ConnectionMonitorResultImpl withDestination(ConnectionMonitorDestination destination) {
        this.createOrUpdateParameter.withDestination(destination);
        return this;
    }

    @Override
    public ConnectionMonitorResultImpl withSource(ConnectionMonitorSource source) {
        this.createOrUpdateParameter.withSource(source);
        return this;
    }

    @Override
    public ConnectionMonitorResultImpl withAutoStart(Boolean autoStart) {
        this.createOrUpdateParameter.withAutoStart(autoStart);
        return this;
    }

    @Override
    public ConnectionMonitorResultImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public ConnectionMonitorResultImpl withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds) {
        this.createOrUpdateParameter.withMonitoringIntervalInSeconds(monitoringIntervalInSeconds);
        return this;
    }

    @Override
    public ConnectionMonitorResultImpl withTags(Map<String, String> tags) {
        this.createOrUpdateParameter.withTags(tags);
        return this;
    }

}
