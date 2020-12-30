// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.MySqlManager;
import com.azure.resourcemanager.mysql.fluent.ServerBasedPerformanceTiersClient;
import com.azure.resourcemanager.mysql.fluent.models.PerformanceTierPropertiesInner;
import com.azure.resourcemanager.mysql.models.PerformanceTierProperties;
import com.azure.resourcemanager.mysql.models.ServerBasedPerformanceTiers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServerBasedPerformanceTiersImpl implements ServerBasedPerformanceTiers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerBasedPerformanceTiersImpl.class);

    private final ServerBasedPerformanceTiersClient innerClient;

    private final MySqlManager serviceManager;

    public ServerBasedPerformanceTiersImpl(ServerBasedPerformanceTiersClient innerClient, MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PerformanceTierProperties> list(String resourceGroupName, String serverName) {
        PagedIterable<PerformanceTierPropertiesInner> inner = this.serviceClient().list(resourceGroupName, serverName);
        return inner.mapPage(inner1 -> new PerformanceTierPropertiesImpl(inner1, this.manager()));
    }

    public PagedIterable<PerformanceTierProperties> list(String resourceGroupName, String serverName, Context context) {
        PagedIterable<PerformanceTierPropertiesInner> inner =
            this.serviceClient().list(resourceGroupName, serverName, context);
        return inner.mapPage(inner1 -> new PerformanceTierPropertiesImpl(inner1, this.manager()));
    }

    private ServerBasedPerformanceTiersClient serviceClient() {
        return this.innerClient;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }
}