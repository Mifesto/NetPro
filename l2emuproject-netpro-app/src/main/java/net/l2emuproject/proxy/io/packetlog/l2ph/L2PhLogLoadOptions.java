/*
 * Copyright 2011-2015 L2EMU UNIQUE
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
package net.l2emuproject.proxy.io.packetlog.l2ph;

import net.l2emuproject.network.protocol.IProtocolVersion;

/**
 * Bundles all user-configurable log load options.
 * 
 * @author _dev_
 */
public class L2PhLogLoadOptions
{
	private final IProtocolVersion _protocol;
	private final long _tzOffset;
	
	/**
	 * Constructs this wrapper.
	 * 
	 * @param protocol protocol version
	 * @param tzOffset time zone offset, in milliseconds
	 */
	public L2PhLogLoadOptions(IProtocolVersion protocol, long tzOffset)
	{
		_protocol = protocol;
		_tzOffset = tzOffset;
	}
	
	/**
	 * Returns the associated network protocol version.
	 * 
	 * @return protocol version
	 */
	public IProtocolVersion getProtocol()
	{
		return _protocol;
	}
	
	/**
	 * Returns the time zone offset, in milliseconds.
	 * 
	 * @return time zone offset
	 */
	public long getTzOffset()
	{
		return _tzOffset;
	}
}
