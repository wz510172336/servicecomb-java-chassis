/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.metrics.core.metric;

public class InstanceMetric {
  private final long waitInQueue;

  private final SystemMetric systemMetric;

  private final ConsumerInvocationMetric consumerMetric;

  private final ProducerInvocationMetric producerMetric;

  public long getWaitInQueue() {
    return waitInQueue;
  }

  public SystemMetric getSystemMetric() {
    return systemMetric;
  }

  public ConsumerInvocationMetric getConsumerMetric() {
    return consumerMetric;
  }

  public ProducerInvocationMetric getProducerMetric() {
    return producerMetric;
  }

  public InstanceMetric(long waitInQueue, SystemMetric systemMetric,
      ConsumerInvocationMetric consumerMetric,
      ProducerInvocationMetric producerMetric) {
    this.waitInQueue = waitInQueue;
    this.systemMetric = systemMetric;
    this.consumerMetric = consumerMetric;
    this.producerMetric = producerMetric;
  }
}
