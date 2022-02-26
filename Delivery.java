
public class Delivery implements FactoryState{

	private final Factory factory;

	public Delivery(Factory factory){
		this.factory = factory;
	}

	@Override
	public void create(){
		System.out.println("------- [State]: Delivery -------");
		System.out.println("Cannot Create in this [State]: Delivery.");
		System.out.println("---------------------------------");
		factory.setState(factory.getFactoryCreate());
	}

	@Override
	public void delivery(){
		System.out.println("delivery in 2 days.");
		System.out.println("-------------------------------");
	}

	@Override
	public void paused(){
		// factory.setFactoryState(factory.getFactoryPaused());		
		System.out.println("[State]: Delivery.");
		System.out.println("[Status]: Cannot paused.");
		System.out.println("-------------------------------");
	}

	@Override
	public void unpaused(){
		System.out.println("[State]: Delivery.");
		System.out.println("[Status] : Assume delivery finish.");
		System.out.println("[Status] : Wait for [State] : None.");
		System.out.println("-------------------------------");
		factory.setState(factory.getFactoryUnpaused());
	}
}