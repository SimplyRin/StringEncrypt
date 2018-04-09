package example.net.simplyrin.stringencrypt.test;

import net.simplyrin.stringencrypt.StringDecrypt;
import net.simplyrin.stringencrypt.StringEncrypt;

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
public class Main {

	public static void main(String[] args) {
		System.out.println("テキストを Encrypt します: " + StringEncrypt.getEncryptText("String"));
		System.out.println("数値を Decrypt します: " + StringDecrypt.getDecryptText(83, 116, 114, 105, 110, 103));

		/**
		 * 出力結果:
		 *
		 * -> テキストを Encrypt します: , 83, 116, 114, 105, 110, 103
		 * -> 数値を Decrypt します: String
		 */
	}

}
