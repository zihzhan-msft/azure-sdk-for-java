// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.fluent.ScriptActionsClient;
import com.azure.resourcemanager.hdinsight.fluent.models.RuntimeScriptActionDetailInner;
import com.azure.resourcemanager.hdinsight.models.RuntimeScriptActionDetail;
import com.azure.resourcemanager.hdinsight.models.ScriptActions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ScriptActionsImpl implements ScriptActions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScriptActionsImpl.class);

    private final ScriptActionsClient innerClient;

    private final HDInsightManager serviceManager;

    public ScriptActionsImpl(ScriptActionsClient innerClient, HDInsightManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String clusterName, String scriptName) {
        this.serviceClient().delete(resourceGroupName, clusterName, scriptName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String clusterName, String scriptName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, clusterName, scriptName, context);
    }

    public PagedIterable<RuntimeScriptActionDetail> listByCluster(String resourceGroupName, String clusterName) {
        PagedIterable<RuntimeScriptActionDetailInner> inner =
            this.serviceClient().listByCluster(resourceGroupName, clusterName);
        return inner.mapPage(inner1 -> new RuntimeScriptActionDetailImpl(inner1, this.manager()));
    }

    public PagedIterable<RuntimeScriptActionDetail> listByCluster(
        String resourceGroupName, String clusterName, Context context) {
        PagedIterable<RuntimeScriptActionDetailInner> inner =
            this.serviceClient().listByCluster(resourceGroupName, clusterName, context);
        return inner.mapPage(inner1 -> new RuntimeScriptActionDetailImpl(inner1, this.manager()));
    }

    public RuntimeScriptActionDetail getExecutionDetail(
        String resourceGroupName, String clusterName, String scriptExecutionId) {
        RuntimeScriptActionDetailInner inner =
            this.serviceClient().getExecutionDetail(resourceGroupName, clusterName, scriptExecutionId);
        if (inner != null) {
            return new RuntimeScriptActionDetailImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RuntimeScriptActionDetail> getExecutionDetailWithResponse(
        String resourceGroupName, String clusterName, String scriptExecutionId, Context context) {
        Response<RuntimeScriptActionDetailInner> inner =
            this
                .serviceClient()
                .getExecutionDetailWithResponse(resourceGroupName, clusterName, scriptExecutionId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RuntimeScriptActionDetailImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ScriptActionsClient serviceClient() {
        return this.innerClient;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }
}