package moe.nightfall.nova.ai;

public interface CTaskBuilder extends LTaskBuilder {

	public CTaskBuilder and(Condition condition);

	public CTaskBuilder or(Condition condition);
}
