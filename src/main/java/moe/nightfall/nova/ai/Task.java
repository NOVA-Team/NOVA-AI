package moe.nightfall.nova.ai;


@FunctionalInterface
public interface Task {

	public void execute(AI<?> ai);
}
