
public class Create implements FactoryState{

	private final Factory factory;

	public Create(Factory factory){
		this.factory = factory;
	}

	@Override
	public void create(){
		System.out.println("------- [State]: Create -------");
		System.out.println("creating something.");
		System.out.println("-------------------------------");
	}

	@Override
	public void delivery(){
		factory.setState(factory.getFactoryDelivery());
		System.out.println("------- [State]: Create -------");
		System.out.println("[Status] Sent Job to [State]: Delivery.");
		System.out.println("-------------------------------");
	}

	@Override
	public void paused(){
		factory.setState(factory.getFactoryPaused());		
		System.out.println("[State]: Create.");
		System.out.println("[Status] : paused.");
		System.out.println("-------------------------------");
	}

	@Override
	public void unpaused(){
		factory.setState(factory.getFactoryUnpaused());
		System.out.println("[State]: Create.");
		System.out.println("[Status] : unpaused.");
		System.out.println("-------------------------------");

	}
}