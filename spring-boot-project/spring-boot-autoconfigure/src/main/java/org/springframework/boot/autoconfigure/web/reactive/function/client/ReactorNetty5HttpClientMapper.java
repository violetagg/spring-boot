/*
 * Copyright 2012-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.autoconfigure.web.reactive.function.client;

import org.springframework.http.client.reactive.ReactorNetty5ClientHttpConnector;
import reactor.netty5.http.client.HttpClient;

/**
 * Mapper that allows for custom modification of a {@link HttpClient} before it is used as
 * the basis for a {@link ReactorNetty5ClientHttpConnector}.
 * This is based on {@link ReactorNettyHttpClientMapper}.
 *
 * @author Violeta Georgieva
 * @since 3.0.0
 */
@FunctionalInterface
public interface ReactorNetty5HttpClientMapper {

	/**
	 * Configure the given {@link HttpClient} and return the newly created instance.
	 * @param httpClient the client to configure
	 * @return the new client instance
	 */
	HttpClient configure(HttpClient httpClient);

}
