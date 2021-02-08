// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.monitor.generated {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.monitor.generated;
    exports com.azure.resourcemanager.monitor.generated.fluent;
    exports com.azure.resourcemanager.monitor.generated.fluent.models;
    exports com.azure.resourcemanager.monitor.generated.models;

    opens com.azure.resourcemanager.monitor.generated.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.monitor.generated.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}