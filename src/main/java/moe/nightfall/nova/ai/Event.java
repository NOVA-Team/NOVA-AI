package moe.nightfall.nova.ai;

public class Event implements Condition {

	@Override
	public Boolean get(AI<?> ai) {
		return ai.isEventQueued(this);
	}

}
