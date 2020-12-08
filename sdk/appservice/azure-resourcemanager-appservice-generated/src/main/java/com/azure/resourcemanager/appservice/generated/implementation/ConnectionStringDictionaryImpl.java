// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.ConnectionStringDictionaryInner;
import com.azure.resourcemanager.appservice.generated.models.ConnStringValueTypePair;
import com.azure.resourcemanager.appservice.generated.models.ConnectionStringDictionary;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import java.util.Collections;
import java.util.Map;

public final class ConnectionStringDictionaryImpl implements ConnectionStringDictionary {
    private ConnectionStringDictionaryInner innerObject;

    private final WebSiteManager serviceManager;

    public ConnectionStringDictionaryImpl(ConnectionStringDictionaryInner innerObject, WebSiteManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Map<String, ConnStringValueTypePair> properties() {
        Map<String, ConnStringValueTypePair> inner = this.innerModel().properties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ConnectionStringDictionaryInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
