
public class Factory implements FactoryState{
	private FactoryState factoryCreate;
	private FactoryState factoryDelivery;
	private FactoryState factoryPaused;
	private FactoryState factoryUnpaused;

	private FactoryState state;

	public Factory(){
		this.factoryCreate    = new Create(this);
		this.factoryDelivery  = new Delivery(this);	
		this.factoryPaused    = new Paused(this);
		this.factoryUnpaused  = new Unpaused(this);

		this.state = factoryCreate;
	}

	// public void setFactoryState(FactoryState state){
	// 	this.state = state;
	// }

	public void setState(FactoryState state){
		this.state = state;
	}
	
	@Override
	public void create(){
		this.state.create();
	}

	@Override
	public void delivery(){
		this.state.delivery();
	}

	@Override
	public void paused(){
		this.state.paused();
	}
	@Override
	public void unpaused(){
		state.unpaused();
	}

	//  get , set factoryCreate
	public FactoryState getFactoryCreate(){
		return this.factoryCreate;	
	}
	public void setFactoryCreate(FactoryState factoryCreate){
		this.factoryCreate = factoryCreate;
	}
	// end get ,set factoryCreate


	//  get , set factoryDelivery
	public FactoryState getFactoryDelivery(){
		return this.factoryDelivery;	
	}
	public void setFactoryDelivery(FactoryState factoryDelivery){
		this.factoryDelivery = factoryDelivery;
	}
	// end get ,set factoryDelivery


	//  get , set factoryPaused
	public FactoryState getFactoryPaused(){
		return this.factoryPaused;	
	}
	public void setFactoryPaused(FactoryState factoryPaused){
		this.factoryPaused = factoryPaused;
	}
	// end factoryPaused

	// get , set factoryUnpaused
	public FactoryState getFactoryUnpaused(){
		return this.factoryUnpaused;
	}
	public void setFactoryUnpaused(FactoryState factoryUnpaused){
		this.factoryUnpaused = factoryUnpaused;
	}
	// end factoryUnpaused


	public FactoryState getState(){
		return state;
	}


}