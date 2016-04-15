package com.devefx.gameserver.handler;

import com.devefx.serverengine.event.GameEvent;
import com.devefx.serverengine.handler.GameHandler;

public class AuthenticationHandler implements GameHandler {

	@Override
	public short getId() {
		return Handlers.AuthenticationHandlerId;
	}

	@Override
	public void process(GameEvent e) {
		
	}

}
