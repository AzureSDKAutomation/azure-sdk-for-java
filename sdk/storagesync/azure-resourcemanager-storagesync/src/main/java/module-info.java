// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.storagesync {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.storagesync;
    exports com.azure.resourcemanager.storagesync.fluent;
    exports com.azure.resourcemanager.storagesync.fluent.models;
    exports com.azure.resourcemanager.storagesync.models;

    opens com.azure.resourcemanager.storagesync.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.storagesync.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
