/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Collection of SecurityProviders.
 */
public class VirtualWanSecurityProvider {
    /**
     * Name of the security provider.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Url of the security provider.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Name of the security provider. Possible values include: 'External',
     * 'Native'.
     */
    @JsonProperty(value = "type")
    private VirtualWanSecurityProviderType type;

    /**
     * Get name of the security provider.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the security provider.
     *
     * @param name the name value to set
     * @return the VirtualWanSecurityProvider object itself.
     */
    public VirtualWanSecurityProvider withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get url of the security provider.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set url of the security provider.
     *
     * @param url the url value to set
     * @return the VirtualWanSecurityProvider object itself.
     */
    public VirtualWanSecurityProvider withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get name of the security provider. Possible values include: 'External', 'Native'.
     *
     * @return the type value
     */
    public VirtualWanSecurityProviderType type() {
        return this.type;
    }

    /**
     * Set name of the security provider. Possible values include: 'External', 'Native'.
     *
     * @param type the type value to set
     * @return the VirtualWanSecurityProvider object itself.
     */
    public VirtualWanSecurityProvider withType(VirtualWanSecurityProviderType type) {
        this.type = type;
        return this;
    }

}