/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_08_01.implementation;

import com.microsoft.azure.management.resources.v2019_08_01.WhatIfOperationResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.resources.v2019_08_01.WhatIfChange;
import com.microsoft.azure.management.resources.v2019_08_01.ErrorResponse;

class WhatIfOperationResultImpl extends WrapperImpl<WhatIfOperationResultInner> implements WhatIfOperationResult {
    private final ResourcesManager manager;
    WhatIfOperationResultImpl(WhatIfOperationResultInner inner, ResourcesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    public List<WhatIfChange> changes() {
        return this.inner().changes();
    }

    @Override
    public String correlationId() {
        return this.inner().correlationId();
    }

    @Override
    public ErrorResponse error() {
        return this.inner().error();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

}
