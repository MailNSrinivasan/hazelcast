/*
 * Copyright (c) 2008-2013, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.core;

import com.hazelcast.nio.serialization.DataSerializable;

import java.net.InetSocketAddress;
import java.util.Map;

/**
 * Cluster member interface. The default implementation
 * {@link com.hazelcast.instance.MemberImpl} violates the Java Serialization contract.
 * It should be serialized/deserialized by Hazelcast.
 *
 * @see Cluster
 * @see MembershipListener
 */
public interface Member extends DataSerializable, Endpoint {

    /**
     * Returns if this member is the local member.
     *
     * @return <tt>true<tt> if this member is the
     *         local member, <tt>false</tt> otherwise.
     */
    boolean localMember();

    /**
     * Returns the InetSocketAddress of this member.
     *
     * @return InetSocketAddress of this member
     *
     * @deprecated use {@link #getSocketAddress()} instead
     */
    @Deprecated
    InetSocketAddress getInetSocketAddress();

    /**
     * Returns the socket address of this member.
     *
     * @return socket address of this member
     */
    InetSocketAddress getSocketAddress();

    /**
     * Returns UUID of this member.
     *
     * @return UUID of this member.
     */
    public String getUuid();

    /**
     * Returns configured attributes for this member.<br/>
     * <b>This method might not be available on all native clients.</b>
     *
     * @return Attributes for this member.
     */
    Map<String, Object> getAttributes();

    /**
     * Returns the value of the specified key for this member or
     * null if value is undefined.
     *
     * @param key The key to lookup.
     * @return The value for this members key.
     */
    String getStringAttribute(String key);

    /**
     * Defines a key-value pair string attribute for this member available
     * to other cluster members.
     *
     * @param key The key for this property.
     * @param value The value corresponds to this attribute and this member.
     */
    void setStringAttribute(String key, String value);

    /**
     * Returns the value of the specified key for this member or
     * null if value is undefined.
     *
     * @param key The key to lookup.
     * @return The value for this members key.
     */
    Boolean getBooleanAttribute(String key);

    /**
     * Defines a key-value pair boolean attribute for this member available
     * to other cluster members.
     *
     * @param key The key for this property.
     * @param value The value corresponds to this attribute and this member.
     */
    void setBooleanAttribute(String key, boolean value);

    /**
     * Returns the value of the specified key for this member or
     * null if value is undefined.
     *
     * @param key The key to lookup.
     * @return The value for this members key.
     */
    Byte getByteAttribute(String key);

    /**
     * Defines a key-value pair byte attribute for this member available
     * to other cluster members.
     *
     * @param key The key for this property.
     * @param value The value corresponds to this attribute and this member.
     */
    void setByteAttribute(String key, byte value);

    /**
     * Returns the value of the specified key for this member or
     * null if value is undefined.
     *
     * @param key The key to lookup.
     * @return The value for this members key.
     */
    Short getShortAttribute(String key);

    /**
     * Defines a key-value pair short attribute for this member available
     * to other cluster members.
     *
     * @param key The key for this property.
     * @param value The value corresponds to this attribute and this member.
     */
    void setShortAttribute(String key, short value);

    /**
     * Returns the value of the specified key for this member or
     * null if value is undefined.
     *
     * @param key The key to lookup.
     * @return The value for this members key.
     */
    Integer getIntAttribute(String key);

    /**
     * Defines a key-value pair int attribute for this member available
     * to other cluster members.
     *
     * @param key The key for this property.
     * @param value The value corresponds to this attribute and this member.
     */
    void setIntAttribute(String key, int value);

    /**
     * Returns the value of the specified key for this member or
     * null if value is undefined.
     *
     * @param key The key to lookup.
     * @return The value for this members key.
     */
    Long getLongAttribute(String key);

    /**
     * Defines a key-value pair long attribute for this member available
     * to other cluster members.
     *
     * @param key The key for this property.
     * @param value The value corresponds to this attribute and this member.
     */
    void setLongAttribute(String key, long value);

    /**
     * Returns the value of the specified key for this member or
     * null if value is undefined.
     *
     * @param key The key to lookup.
     * @return The value for this members key.
     */
    Float getFloatAttribute(String key);

    /**
     * Defines a key-value pair float attribute for this member available
     * to other cluster members.
     *
     * @param key The key for this property.
     * @param value The value corresponds to this attribute and this member.
     */
    void setFloatAttribute(String key, float value);

    /**
     * Returns the value of the specified key for this member or
     * null if value is undefined.
     *
     * @param key The key to lookup.
     * @return The value for this members key.
     */
    Double getDoubleAttribute(String key);

    /**
     * Defines a key-value pair double attribute for this member available
     * to other cluster members.
     *
     * @param key The key for this property.
     * @param value The value corresponds to this attribute and this member.
     */
    void setDoubleAttribute(String key, double value);

    /**
     * Removes a key-value pair attribute for this member if given key was
     * previously assigned as an attribute.<br/>
     * If key wasn't assigned to a value this method does nothing.
     *
     * @param key The key to be deleted from the member attributes
     */
    void removeAttribute(String key);

}
