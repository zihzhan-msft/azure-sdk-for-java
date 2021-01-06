// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UsersOutlookOrderby. */
public final class UsersOutlookOrderby extends ExpandableStringEnum<UsersOutlookOrderby> {
    /** Static value id for UsersOutlookOrderby. */
    public static final UsersOutlookOrderby ID = fromString("id");

    /** Static value id desc for UsersOutlookOrderby. */
    public static final UsersOutlookOrderby ID_DESC = fromString("id desc");

    /** Static value color for UsersOutlookOrderby. */
    public static final UsersOutlookOrderby COLOR = fromString("color");

    /** Static value color desc for UsersOutlookOrderby. */
    public static final UsersOutlookOrderby COLOR_DESC = fromString("color desc");

    /** Static value displayName for UsersOutlookOrderby. */
    public static final UsersOutlookOrderby DISPLAY_NAME = fromString("displayName");

    /** Static value displayName desc for UsersOutlookOrderby. */
    public static final UsersOutlookOrderby DISPLAY_NAME_DESC = fromString("displayName desc");

    /**
     * Creates or finds a UsersOutlookOrderby from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UsersOutlookOrderby.
     */
    @JsonCreator
    public static UsersOutlookOrderby fromString(String name) {
        return fromString(name, UsersOutlookOrderby.class);
    }

    /** @return known UsersOutlookOrderby values. */
    public static Collection<UsersOutlookOrderby> values() {
        return values(UsersOutlookOrderby.class);
    }
}