// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.fluent.ConfigurationsClient;
import com.azure.resourcemanager.hdinsight.fluent.models.ClusterConfigurationsInner;
import com.azure.resourcemanager.hdinsight.models.ClusterConfigurations;
import com.azure.resourcemanager.hdinsight.models.Configurations;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collections;
import java.util.Map;

public final class ConfigurationsImpl implements Configurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConfigurationsImpl.class);

    private final ConfigurationsClient innerClient;

    private final HDInsightManager serviceManager;

    public ConfigurationsImpl(ConfigurationsClient innerClient, HDInsightManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ClusterConfigurations list(String resourceGroupName, String clusterName) {
        ClusterConfigurationsInner inner = this.serviceClient().list(resourceGroupName, clusterName);
        if (inner != null) {
            return new ClusterConfigurationsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ClusterConfigurations> listWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        Response<ClusterConfigurationsInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterConfigurationsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void update(
        String resourceGroupName, String clusterName, String configurationName, Map<String, String> parameters) {
        this.serviceClient().update(resourceGroupName, clusterName, configurationName, parameters);
    }

    public void update(
        String resourceGroupName,
        String clusterName,
        String configurationName,
        Map<String, String> parameters,
        Context context) {
        this.serviceClient().update(resourceGroupName, clusterName, configurationName, parameters, context);
    }

    public Map<String, String> get(String resourceGroupName, String clusterName, String configurationName) {
        Map<String, String> inner = this.serviceClient().get(resourceGroupName, clusterName, configurationName);
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Response<Map<String, String>> getWithResponse(
        String resourceGroupName, String clusterName, String configurationName, Context context) {
        return this.serviceClient().getWithResponse(resourceGroupName, clusterName, configurationName, context);
    }

    private ConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }
}