package net.simplyrin.stringencrypt;

/**
 * Created by SimplyRin on 2018/04/09
 *
 *  Copyright 2018 SimplyRin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class StringDecrypt {

	private int[] integer;

	public StringDecrypt(int... integer) {
		this.integer = integer;
	}

	public String getDecryptText() {
		return decrypt(integer);
	}

	public static String getDecryptText(int... integer) {
		return decrypt(integer);
	}

	private static String decrypt(int... integer) {
		return new String(integer, 0, integer.length);
	}

}
