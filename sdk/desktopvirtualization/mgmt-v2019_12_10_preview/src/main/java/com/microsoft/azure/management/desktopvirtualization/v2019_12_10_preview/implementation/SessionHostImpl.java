/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation;

import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.SessionHost;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.SessionHostPatch;
import org.joda.time.DateTime;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.Status;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.UpdateState;
import rx.functions.Func1;

class SessionHostImpl extends CreatableUpdatableImpl<SessionHost, SessionHostInner, SessionHostImpl> implements SessionHost, SessionHost.Update {
    private final DesktopVirtualizationManager manager;
    private String resourceGroupName;
    private String hostPoolName;
    private String sessionHostName;
    private SessionHostPatch updateParameter;

    SessionHostImpl(String name, DesktopVirtualizationManager manager) {
        super(name, new SessionHostInner());
        this.manager = manager;
        // Set resource name
        this.sessionHostName = name;
        //
        this.updateParameter = new SessionHostPatch();
    }

    SessionHostImpl(SessionHostInner inner, DesktopVirtualizationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.sessionHostName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.hostPoolName = IdParsingUtils.getValueFromIdByName(inner.id(), "hostPools");
        this.sessionHostName = IdParsingUtils.getValueFromIdByName(inner.id(), "sessionHosts");
        //
        this.updateParameter = new SessionHostPatch();
    }

    @Override
    public DesktopVirtualizationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SessionHost> createResourceAsync() {
        SessionHostsInner client = this.manager().inner().sessionHosts();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<SessionHost> updateResourceAsync() {
        SessionHostsInner client = this.manager().inner().sessionHosts();
        return client.updateAsync(this.resourceGroupName, this.hostPoolName, this.sessionHostName, this.updateParameter)
            .map(new Func1<SessionHostInner, SessionHostInner>() {
               @Override
               public SessionHostInner call(SessionHostInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SessionHostInner> getInnerAsync() {
        SessionHostsInner client = this.manager().inner().sessionHosts();
        return client.getAsync(this.resourceGroupName, this.hostPoolName, this.sessionHostName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new SessionHostPatch();
    }

    @Override
    public String agentVersion() {
        return this.inner().agentVersion();
    }

    @Override
    public Boolean allowNewSession() {
        return this.inner().allowNewSession();
    }

    @Override
    public String assignedUser() {
        return this.inner().assignedUser();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime lastHeartBeat() {
        return this.inner().lastHeartBeat();
    }

    @Override
    public DateTime lastUpdateTime() {
        return this.inner().lastUpdateTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String osVersion() {
        return this.inner().osVersion();
    }

    @Override
    public Integer sessions() {
        return this.inner().sessions();
    }

    @Override
    public Status status() {
        return this.inner().status();
    }

    @Override
    public DateTime statusTimestamp() {
        return this.inner().statusTimestamp();
    }

    @Override
    public String sxSStackVersion() {
        return this.inner().sxSStackVersion();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String updateErrorMessage() {
        return this.inner().updateErrorMessage();
    }

    @Override
    public UpdateState updateState() {
        return this.inner().updateState();
    }

    @Override
    public String virtualMachineId() {
        return this.inner().virtualMachineId();
    }

    @Override
    public SessionHostImpl withAllowNewSession(Boolean allowNewSession) {
        this.updateParameter.withAllowNewSession(allowNewSession);
        return this;
    }

    @Override
    public SessionHostImpl withAssignedUser(String assignedUser) {
        this.updateParameter.withAssignedUser(assignedUser);
        return this;
    }

}
