// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.ExtensionInstanceInner;
import com.azure.resourcemanager.kubernetesconfiguration.models.ConfigurationIdentity;
import com.azure.resourcemanager.kubernetesconfiguration.models.ExtensionInstance;
import com.azure.resourcemanager.kubernetesconfiguration.models.ExtensionStatus;
import com.azure.resourcemanager.kubernetesconfiguration.models.InstallStateType;
import com.azure.resourcemanager.kubernetesconfiguration.models.Scope;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ExtensionInstanceImpl implements ExtensionInstance {
    private ExtensionInstanceInner innerObject;

    private final com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager serviceManager;

    ExtensionInstanceImpl(
        ExtensionInstanceInner innerObject,
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager serviceManager) {
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

    public String extensionType() {
        return this.innerModel().extensionType();
    }

    public Boolean autoUpgradeMinorVersion() {
        return this.innerModel().autoUpgradeMinorVersion();
    }

    public String releaseTrain() {
        return this.innerModel().releaseTrain();
    }

    public String version() {
        return this.innerModel().version();
    }

    public Scope scope() {
        return this.innerModel().scope();
    }

    public Map<String, String> configurationSettings() {
        Map<String, String> inner = this.innerModel().configurationSettings();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Map<String, String> configurationProtectedSettings() {
        Map<String, String> inner = this.innerModel().configurationProtectedSettings();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public InstallStateType installState() {
        return this.innerModel().installState();
    }

    public List<ExtensionStatus> statuses() {
        List<ExtensionStatus> inner = this.innerModel().statuses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String creationTime() {
        return this.innerModel().creationTime();
    }

    public String lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public String lastStatusTime() {
        return this.innerModel().lastStatusTime();
    }

    public ManagementError errorInfo() {
        return this.innerModel().errorInfo();
    }

    public ConfigurationIdentity identity() {
        return this.innerModel().identity();
    }

    public ExtensionInstanceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager() {
        return this.serviceManager;
    }
}
