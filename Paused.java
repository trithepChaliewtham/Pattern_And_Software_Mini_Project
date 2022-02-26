
public class Paused implements FactoryState{

	private final Factory factory;

	public Paused(Factory factory){
		this.factory = factory;
	}

	@Override
	public void create(){
		System.out.println("------- [State]: Paused -------");
		System.out.println("Cannot Create in this [State]: Paused.");
		System.out.println("-------------------------------");
		// factory.setFactoryState(factory.getFactoryCreate());
	}

	@Override
	public void delivery(){
		System.out.println("[State]: Paused");
		System.out.println("Cannot continue working in this [State] : Paused.");
		System.out.println("-------------------------------");
	}
	@Override
	public void paused(){
		// factory.setState(factory.getFactoryPaused());		
		System.out.println("[State]: Paused.");
		System.out.println("[Status]: paused.");
		System.out.println("-------------------------------");
	}

	@Override
	public void unpaused(){
		System.out.println("[State]: Paused.");
		System.out.println("[State]: Unpaused.");
		System.out.println("-------------------------------");
		factory.setState(factory.getFactoryUnpaused());
	}
}