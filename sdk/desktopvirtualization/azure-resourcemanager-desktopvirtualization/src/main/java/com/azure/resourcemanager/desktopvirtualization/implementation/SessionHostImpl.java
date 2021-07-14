// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.SessionHostInner;
import com.azure.resourcemanager.desktopvirtualization.models.ImageType;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHost;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostHealthCheckReport;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostUpdateStatus;
import com.azure.resourcemanager.desktopvirtualization.models.Status;
import com.azure.resourcemanager.desktopvirtualization.models.UpdateState;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class SessionHostImpl implements SessionHost {
    private SessionHostInner innerObject;

    private final com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager;

    SessionHostImpl(
        SessionHostInner innerObject,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String objectId() {
        return this.innerModel().objectId();
    }

    public OffsetDateTime lastHeartBeat() {
        return this.innerModel().lastHeartBeat();
    }

    public Integer sessions() {
        return this.innerModel().sessions();
    }

    public String agentVersion() {
        return this.innerModel().agentVersion();
    }

    public Boolean allowNewSession() {
        return this.innerModel().allowNewSession();
    }

    public String virtualMachineId() {
        return this.innerModel().virtualMachineId();
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public String assignedUser() {
        return this.innerModel().assignedUser();
    }

    public Status status() {
        return this.innerModel().status();
    }

    public OffsetDateTime statusTimestamp() {
        return this.innerModel().statusTimestamp();
    }

    public String osVersion() {
        return this.innerModel().osVersion();
    }

    public String sxSStackVersion() {
        return this.innerModel().sxSStackVersion();
    }

    public UpdateState updateState() {
        return this.innerModel().updateState();
    }

    public OffsetDateTime lastUpdateTime() {
        return this.innerModel().lastUpdateTime();
    }

    public String updateErrorMessage() {
        return this.innerModel().updateErrorMessage();
    }

    public List<SessionHostHealthCheckReport> sessionHostHealthCheckResults() {
        List<SessionHostHealthCheckReport> inner = this.innerModel().sessionHostHealthCheckResults();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime lastSessionHostUpdateTime() {
        return this.innerModel().lastSessionHostUpdateTime();
    }

    public OffsetDateTime sessionHostConfigurationLastUpdateTime() {
        return this.innerModel().sessionHostConfigurationLastUpdateTime();
    }

    public String imageResourceId() {
        return this.innerModel().imageResourceId();
    }

    public ImageType imageType() {
        return this.innerModel().imageType();
    }

    public SessionHostUpdateStatus updateStatus() {
        return this.innerModel().updateStatus();
    }

    public SessionHostInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }
}
