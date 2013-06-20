package pro.jrat.api.events;

import pro.jrat.api.RATObject;

public abstract class RATObjectEvent implements Event {

	private RATObject server;

	public RATObjectEvent(RATObject server) {
		this.server = server;
	}

	public RATObject getServer() {
		return server;
	}

	public void setSlave(RATObject server) {
		this.server = server;
	}

}