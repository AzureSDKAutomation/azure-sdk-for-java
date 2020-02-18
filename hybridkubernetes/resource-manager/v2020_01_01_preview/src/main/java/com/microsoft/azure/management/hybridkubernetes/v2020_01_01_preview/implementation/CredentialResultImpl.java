/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridkubernetes.v2020_01_01_preview.implementation;

import com.microsoft.azure.management.hybridkubernetes.v2020_01_01_preview.CredentialResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class CredentialResultImpl extends WrapperImpl<CredentialResultInner> implements CredentialResult {
    private final KubernetesManager manager;
    CredentialResultImpl(CredentialResultInner inner, KubernetesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public KubernetesManager manager() {
        return this.manager;
    }

    @Override
    public byte[] kubeconfig() {
        return this.inner().kubeconfig();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
