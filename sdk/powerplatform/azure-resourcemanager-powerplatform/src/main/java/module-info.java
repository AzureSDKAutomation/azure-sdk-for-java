// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.powerplatform {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.powerplatform;
    exports com.azure.resourcemanager.powerplatform.fluent;
    exports com.azure.resourcemanager.powerplatform.fluent.models;
    exports com.azure.resourcemanager.powerplatform.models;

    opens com.azure.resourcemanager.powerplatform.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.powerplatform.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
