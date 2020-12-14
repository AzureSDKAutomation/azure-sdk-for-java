// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.VerificationIpFlowResultInner;
import com.azure.resourcemanager.network.generated.models.Access;
import com.azure.resourcemanager.network.generated.models.VerificationIpFlowResult;

public final class VerificationIpFlowResultImpl implements VerificationIpFlowResult {
    private VerificationIpFlowResultInner innerObject;

    private final NetworkManager serviceManager;

    public VerificationIpFlowResultImpl(VerificationIpFlowResultInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Access access() {
        return this.innerModel().access();
    }

    public String ruleName() {
        return this.innerModel().ruleName();
    }

    public VerificationIpFlowResultInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
