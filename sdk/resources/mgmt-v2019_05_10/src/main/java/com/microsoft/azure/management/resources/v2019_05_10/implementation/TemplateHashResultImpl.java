/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_05_10.implementation;

import com.microsoft.azure.management.resources.v2019_05_10.TemplateHashResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class TemplateHashResultImpl extends WrapperImpl<TemplateHashResultInner> implements TemplateHashResult {
    private final ResourcesManager manager;
    TemplateHashResultImpl(TemplateHashResultInner inner, ResourcesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    public String minifiedTemplate() {
        return this.inner().minifiedTemplate();
    }

    @Override
    public String templateHash() {
        return this.inner().templateHash();
    }

}
