package org.voovan.network.messagesplitter;

import org.voovan.network.IoSession;
import org.voovan.network.MessageSplitter;

/**
 * 按定长对消息分割
 * 		超过指定长度也会分割
 * @author helyho
 *
 * Voovan Framework.
 * WebSite: https://github.com/helyho/Voovan
 * Licence: Apache v2 License
 */
public class BufferLengthSplitter implements MessageSplitter {
	private int bufferLength;
	
	public BufferLengthSplitter(int bufferLength){
		this.bufferLength = bufferLength;
	}

	@Override
	public int canSplite(IoSession session, byte[] buffer) {
		if(buffer.length>=bufferLength){
			return bufferLength;
		}else{
			return -1;
		}
	}
	
}
