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

package org.apache.ignite.spi.metric;

/**
 * Histogram metric calculates counts of measurements that gets into each bounds interval.
 * Note, that {@link #value()} will return array length of {@code bounds.length + 1}.
 * Last element will contain count of measurements bigger than most right value of bounds.
 */
public interface HistogramMetric extends ObjectMetric<long[]> {
    /** @return Bounds of this histogram. */
    public long[] bounds();
}
