package net.simplyrin.stringencrypt;

/**
 * Created by SimplyRin on 2018/04/09
 *
 * Copyright (C) 2018 SimplyRin
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
