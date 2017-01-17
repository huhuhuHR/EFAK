/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smartloli.kafka.eagle.service;

import org.smartloli.kafka.eagle.domain.ConsumerPageDomain;

/**
 * Kafka consumer data interface.
 * 
 * @author smartloli.
 *
 *         Created by Jan 17, 2017
 */
public interface ConsumerService {

	/** Get active topic graph data interface. */
	public String getActiveGraph();

	/** Storage offset in kafka or zookeeper interface. */
	public String getActiveTopic(String formatter);

	/**
	 * Judge consumer detail information storage offset in kafka or zookeeper
	 * interface.
	 */
	public String getConsumerDetail(String formatter, String group);

	/** Judge consumers storage offset in kafka or zookeeper interface. */
	public String getConsumer(String formatter, ConsumerPageDomain page);

	/** Get consumer size from kafka topic interface. */
	public int getConsumerCount(String formatter);
	
}
