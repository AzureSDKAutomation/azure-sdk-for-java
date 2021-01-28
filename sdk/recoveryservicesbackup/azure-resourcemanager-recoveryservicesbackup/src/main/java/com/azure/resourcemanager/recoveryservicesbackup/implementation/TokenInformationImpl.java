// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.TokenInformationInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.TokenInformation;

public final class TokenInformationImpl implements TokenInformation {
    private TokenInformationInner innerObject;

    private final RecoveryServicesBackupManager serviceManager;

    TokenInformationImpl(TokenInformationInner innerObject, RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String token() {
        return this.innerModel().token();
    }

    public Long expiryTimeInUtcTicks() {
        return this.innerModel().expiryTimeInUtcTicks();
    }

    public String securityPin() {
        return this.innerModel().securityPin();
    }

    public TokenInformationInner innerModel() {
        return this.innerObject;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
