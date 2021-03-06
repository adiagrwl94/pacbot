/*******************************************************************************
 * Copyright 2018 T Mobile, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.tmobile.pacman.api.admin.domain;

/**
 * JobProperty Domain Class
 */
public class JobProperty {
	private S3Property s3;
	private LambdaProperty lambda;

	public S3Property getS3() {
		return s3;
	}

	public LambdaProperty getLambda() {
		return lambda;
	}

	public void setS3(S3Property s3) {
		this.s3 = s3;
	}

	public void setLambda(LambdaProperty lambda) {
		this.lambda = lambda;
	}
}
