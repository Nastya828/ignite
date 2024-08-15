/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.managers.systemview.walker;

import org.apache.ignite.cache.CacheAtomicityMode;
import org.apache.ignite.cache.CacheMode;
import org.apache.ignite.cache.CacheRebalanceMode;
import org.apache.ignite.cache.CacheWriteSynchronizationMode;
import org.apache.ignite.cache.PartitionLossPolicy;
import org.apache.ignite.internal.processors.cache.CacheType;
import org.apache.ignite.spi.systemview.view.CacheView;
import org.apache.ignite.spi.systemview.view.SystemViewRowAttributeWalker;

/**
 * Generated by {@code org.apache.ignite.codegen.SystemViewRowAttributeWalkerGenerator}.
 * {@link CacheView} attributes walker.
 * 
 * @see CacheView
 */
public class CacheViewWalker implements SystemViewRowAttributeWalker<CacheView> {
    /** {@inheritDoc} */
    @Override public void visitAll(AttributeVisitor v) {
        v.accept(0, "cacheName", String.class);
        v.accept(1, "cacheId", int.class);
        v.accept(2, "cacheType", CacheType.class);
        v.accept(3, "cacheMode", CacheMode.class);
        v.accept(4, "atomicityMode", CacheAtomicityMode.class);
        v.accept(5, "cacheGroupName", String.class);
        v.accept(6, "affinity", String.class);
        v.accept(7, "affinityMapper", String.class);
        v.accept(8, "backups", int.class);
        v.accept(9, "cacheGroupId", int.class);
        v.accept(10, "cacheLoaderFactory", String.class);
        v.accept(11, "cacheStoreFactory", String.class);
        v.accept(12, "cacheWriterFactory", String.class);
        v.accept(13, "conflictResolver", String.class);
        v.accept(14, "dataRegionName", String.class);
        v.accept(15, "defaultLockTimeout", long.class);
        v.accept(16, "evictionFilter", String.class);
        v.accept(17, "evictionPolicyFactory", String.class);
        v.accept(18, "expiryPolicyFactory", String.class);
        v.accept(19, "hasExpiringEntries", String.class);
        v.accept(20, "interceptor", String.class);
        v.accept(21, "isCopyOnRead", boolean.class);
        v.accept(22, "isEagerTtl", boolean.class);
        v.accept(23, "isEncryptionEnabled", boolean.class);
        v.accept(24, "isEventsDisabled", boolean.class);
        v.accept(25, "isInvalidate", boolean.class);
        v.accept(26, "isLoadPreviousValue", boolean.class);
        v.accept(27, "isManagementEnabled", boolean.class);
        v.accept(28, "isNearCacheEnabled", boolean.class);
        v.accept(29, "isOnheapCacheEnabled", boolean.class);
        v.accept(30, "isReadFromBackup", boolean.class);
        v.accept(31, "isReadThrough", boolean.class);
        v.accept(32, "isSqlEscapeAll", boolean.class);
        v.accept(33, "isSqlOnheapCacheEnabled", boolean.class);
        v.accept(34, "isStatisticsEnabled", boolean.class);
        v.accept(35, "isStoreKeepBinary", boolean.class);
        v.accept(36, "isWriteBehindEnabled", boolean.class);
        v.accept(37, "isWriteThrough", boolean.class);
        v.accept(38, "maxConcurrentAsyncOperations", int.class);
        v.accept(39, "maxQueryIteratorsCount", int.class);
        v.accept(40, "nearCacheEvictionPolicyFactory", String.class);
        v.accept(41, "nearCacheStartSize", int.class);
        v.accept(42, "nodeFilter", String.class);
        v.accept(43, "partitionLossPolicy", PartitionLossPolicy.class);
        v.accept(44, "queryDetailMetricsSize", int.class);
        v.accept(45, "queryParallelism", int.class);
        v.accept(46, "rebalanceBatchSize", int.class);
        v.accept(47, "rebalanceBatchesPrefetchCount", long.class);
        v.accept(48, "rebalanceDelay", long.class);
        v.accept(49, "rebalanceMode", CacheRebalanceMode.class);
        v.accept(50, "rebalanceOrder", int.class);
        v.accept(51, "rebalanceThrottle", long.class);
        v.accept(52, "rebalanceTimeout", long.class);
        v.accept(53, "sqlIndexMaxInlineSize", int.class);
        v.accept(54, "sqlOnheapCacheMaxSize", int.class);
        v.accept(55, "sqlSchema", String.class);
        v.accept(56, "topologyValidator", String.class);
        v.accept(57, "writeBehindBatchSize", int.class);
        v.accept(58, "writeBehindCoalescing", boolean.class);
        v.accept(59, "writeBehindFlushFrequency", long.class);
        v.accept(60, "writeBehindFlushSize", int.class);
        v.accept(61, "writeBehindFlushThreadCount", int.class);
        v.accept(62, "writeSynchronizationMode", CacheWriteSynchronizationMode.class);
    }

    /** {@inheritDoc} */
    @Override public void visitAll(CacheView row, AttributeWithValueVisitor v) {
        v.accept(0, "cacheName", String.class, row.cacheName());
        v.acceptInt(1, "cacheId", row.cacheId());
        v.accept(2, "cacheType", CacheType.class, row.cacheType());
        v.accept(3, "cacheMode", CacheMode.class, row.cacheMode());
        v.accept(4, "atomicityMode", CacheAtomicityMode.class, row.atomicityMode());
        v.accept(5, "cacheGroupName", String.class, row.cacheGroupName());
        v.accept(6, "affinity", String.class, row.affinity());
        v.accept(7, "affinityMapper", String.class, row.affinityMapper());
        v.acceptInt(8, "backups", row.backups());
        v.acceptInt(9, "cacheGroupId", row.cacheGroupId());
        v.accept(10, "cacheLoaderFactory", String.class, row.cacheLoaderFactory());
        v.accept(11, "cacheStoreFactory", String.class, row.cacheStoreFactory());
        v.accept(12, "cacheWriterFactory", String.class, row.cacheWriterFactory());
        v.accept(13, "conflictResolver", String.class, row.conflictResolver());
        v.accept(14, "dataRegionName", String.class, row.dataRegionName());
        v.acceptLong(15, "defaultLockTimeout", row.defaultLockTimeout());
        v.accept(16, "evictionFilter", String.class, row.evictionFilter());
        v.accept(17, "evictionPolicyFactory", String.class, row.evictionPolicyFactory());
        v.accept(18, "expiryPolicyFactory", String.class, row.expiryPolicyFactory());
        v.accept(19, "hasExpiringEntries", String.class, row.hasExpiringEntries());
        v.accept(20, "interceptor", String.class, row.interceptor());
        v.acceptBoolean(21, "isCopyOnRead", row.isCopyOnRead());
        v.acceptBoolean(22, "isEagerTtl", row.isEagerTtl());
        v.acceptBoolean(23, "isEncryptionEnabled", row.isEncryptionEnabled());
        v.acceptBoolean(24, "isEventsDisabled", row.isEventsDisabled());
        v.acceptBoolean(25, "isInvalidate", row.isInvalidate());
        v.acceptBoolean(26, "isLoadPreviousValue", row.isLoadPreviousValue());
        v.acceptBoolean(27, "isManagementEnabled", row.isManagementEnabled());
        v.acceptBoolean(28, "isNearCacheEnabled", row.isNearCacheEnabled());
        v.acceptBoolean(29, "isOnheapCacheEnabled", row.isOnheapCacheEnabled());
        v.acceptBoolean(30, "isReadFromBackup", row.isReadFromBackup());
        v.acceptBoolean(31, "isReadThrough", row.isReadThrough());
        v.acceptBoolean(32, "isSqlEscapeAll", row.isSqlEscapeAll());
        v.acceptBoolean(33, "isSqlOnheapCacheEnabled", row.isSqlOnheapCacheEnabled());
        v.acceptBoolean(34, "isStatisticsEnabled", row.isStatisticsEnabled());
        v.acceptBoolean(35, "isStoreKeepBinary", row.isStoreKeepBinary());
        v.acceptBoolean(36, "isWriteBehindEnabled", row.isWriteBehindEnabled());
        v.acceptBoolean(37, "isWriteThrough", row.isWriteThrough());
        v.acceptInt(38, "maxConcurrentAsyncOperations", row.maxConcurrentAsyncOperations());
        v.acceptInt(39, "maxQueryIteratorsCount", row.maxQueryIteratorsCount());
        v.accept(40, "nearCacheEvictionPolicyFactory", String.class, row.nearCacheEvictionPolicyFactory());
        v.acceptInt(41, "nearCacheStartSize", row.nearCacheStartSize());
        v.accept(42, "nodeFilter", String.class, row.nodeFilter());
        v.accept(43, "partitionLossPolicy", PartitionLossPolicy.class, row.partitionLossPolicy());
        v.acceptInt(44, "queryDetailMetricsSize", row.queryDetailMetricsSize());
        v.acceptInt(45, "queryParallelism", row.queryParallelism());
        v.acceptInt(46, "rebalanceBatchSize", row.rebalanceBatchSize());
        v.acceptLong(47, "rebalanceBatchesPrefetchCount", row.rebalanceBatchesPrefetchCount());
        v.acceptLong(48, "rebalanceDelay", row.rebalanceDelay());
        v.accept(49, "rebalanceMode", CacheRebalanceMode.class, row.rebalanceMode());
        v.acceptInt(50, "rebalanceOrder", row.rebalanceOrder());
        v.acceptLong(51, "rebalanceThrottle", row.rebalanceThrottle());
        v.acceptLong(52, "rebalanceTimeout", row.rebalanceTimeout());
        v.acceptInt(53, "sqlIndexMaxInlineSize", row.sqlIndexMaxInlineSize());
        v.acceptInt(54, "sqlOnheapCacheMaxSize", row.sqlOnheapCacheMaxSize());
        v.accept(55, "sqlSchema", String.class, row.sqlSchema());
        v.accept(56, "topologyValidator", String.class, row.topologyValidator());
        v.acceptInt(57, "writeBehindBatchSize", row.writeBehindBatchSize());
        v.acceptBoolean(58, "writeBehindCoalescing", row.writeBehindCoalescing());
        v.acceptLong(59, "writeBehindFlushFrequency", row.writeBehindFlushFrequency());
        v.acceptInt(60, "writeBehindFlushSize", row.writeBehindFlushSize());
        v.acceptInt(61, "writeBehindFlushThreadCount", row.writeBehindFlushThreadCount());
        v.accept(62, "writeSynchronizationMode", CacheWriteSynchronizationMode.class, row.writeSynchronizationMode());
    }

    /** {@inheritDoc} */
    @Override public int count() {
        return 63;
    }
}
