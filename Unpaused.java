


public class Unpaused implements FactoryState{

	private final Factory factory;

	public Unpaused(Factory factory){
		this.factory = factory;
	}

	@Override
	public void create(){
		System.out.println("------- [State]: Unpaused -------");
		System.out.println("[Status]: Set [State]: Unpaused To [State]: Create");
		System.out.println("[Status]: Create something.");
		System.out.println("-------------------------------");
		factory.setState(factory.getFactoryCreate());
	}

	@Override
	public void delivery(){
		System.out.println("[State]: Unpaused");
		System.out.println("[Status]: Cannot delivery.");
		System.out.println("[Status]: Need to start with [State] : Create first");
		System.out.println("[Status]: then sent to [State]: Delivery.");
		System.out.println("-------------------------------");
		
	}	

	@Override
	public void paused(){
			
		System.out.println("[State]: Unpaused.");
		System.out.println("[Status]: Can paused in [State]: Create only.");
		System.out.println("-------------------------------");
	}

	@Override
	public void unpaused(){
		System.out.println("[State]: Unpaused.");
		System.out.println("Current [State]: Unpaused now.");
		System.out.println("-------------------------------");
		
	}
}