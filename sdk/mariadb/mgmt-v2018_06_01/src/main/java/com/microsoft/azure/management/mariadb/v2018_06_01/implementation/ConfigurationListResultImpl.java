/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01.implementation;

import com.microsoft.azure.management.mariadb.v2018_06_01.ConfigurationListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class ConfigurationListResultImpl extends WrapperImpl<ConfigurationListResultInner> implements ConfigurationListResult {
    private final MariaDBManager manager;
    ConfigurationListResultImpl(ConfigurationListResultInner inner, MariaDBManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MariaDBManager manager() {
        return this.manager;
    }

    @Override
    public List<ConfigurationInner> value() {
        return this.inner().value();
    }

}
